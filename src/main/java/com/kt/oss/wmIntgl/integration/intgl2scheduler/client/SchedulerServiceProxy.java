/**
 * Copyright (c) 2012 KT Corp, Inc.
 * All right reserved.
 *
 * This software is the confidential and proprietary information of KT
 * Corp, Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with KT Corp.
 *
 * Revision History
 * Author              Date             Description
 * ------------------   --------------    ------------------
 * yngwie          2012. 10. 15.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.intgl2scheduler.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com._360scheduling.interfaces.ReceiveWorkbenchDataResult;
import com._360scheduling.interfaces.Services;
import com._360scheduling.interfaces.ServicesSoap;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.exception.ProcessException;
import com.kt.oss.wmIntgl.common.utils.HttpClientUtil;
import com.kt.oss.wmIntgl.common.utils.HttpClientUtil.ClientType;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.service.Intgl2SchedulerService;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.service.Neosswm2IntglService;

/**
 * Call 360 WebService <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Service
public class SchedulerServiceProxy extends BaseService {

	@Value("${scheduler.url.webservice}")
	private String webserviceURL;

	@Value("${mapping360io.defaultIP}")
	private String default360Ip;

	@Value("${system.envtype}")
	private String envType;

	@Value("${notification.host}")
	private String host;

	@Value("${notification.port}")
	private String port;

	@Value("${notification.url}")
	private String url;

	@Value("${pendingsenario.enabled}")
	private boolean pendingEnabled;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private Intgl2SchedulerService intgl2SchedulerService;

	@Autowired
	private Neosswm2IntglService neosswm2IntglService;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param serverIp
	 * @return
	 * @throws MalformedURLException
	 */
	private ServicesSoap getServicePort(String serverIp)
			throws MalformedURLException {

		String eventRoute = getWebServiceURL(serverIp);

		logger.debug("eventRoute=" + eventRoute);

		URL wsdlURL = null;
		try {
			wsdlURL = new URL(eventRoute);
		} catch (MalformedURLException e) {
			logger.warn(StringUtil.getStackTrace(e));
			// throw e;
		}

		Services ss = new Services(wsdlURL);
		ServicesSoap port = ss.getServicesSoap12();

		return port;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param serverIp
	 * @return
	 */
	private String getWebServiceURL(String serverIp) {
		// String serviceURL = webserviceURL;
		// serviceURL = serviceURL.replaceAll("//([0-9.]*)/", "//" + serverIp
		// + "/");
		return StringUtils.replaceOnce(webserviceURL, "{0}",
				serverIp != null ? serverIp : default360Ip);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param strInputXML
	 * @param nDataType
	 * @param intglVo
	 * @return
	 */
	public EventStatus sendStringDataTo360Sync(String strInputXML,
			int nDataType, IntglDataVo intglVo, int dataSize) {

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(intglVo, "sendStringDataTo360Sync");
		vo.setEventMethod("sendStringDataTo360Sync");
		vo.setEventDataSize(dataSize);

		StringBuilder sb = new StringBuilder();
		sb.append(strInputXML);

		try {
			String targetIp = get360IoServerIp(intglVo.getSourceId());
			vo.setEventRoute(targetIp);
			vo.setEventStatus(EventStatus.ERROR_ETC);

			sendData(strInputXML, nDataType, intglVo, vo, targetIp);

		} catch (ProcessException pe) {
			sendDataStandByServer(vo, intglVo, strInputXML, nDataType, null);

		} catch (Exception e) {
			String errMsg = StringUtil.getStackTrace(e);

			logger.error(errMsg);

			// target 전송 오류
			vo.setEventStatus(EventStatus.ERROR_TARGET_SEND);

			vo.setEventMsg(vo.getEventMsg() + "\r\n\r\n"
					+ StringUtils.abbreviate(e.getMessage(), 3200));

			sb.append("\r\n\r\n");
			sb.append(errMsg);

			sendDataStandByServer(vo, intglVo, strInputXML, nDataType, sb);

		} finally {
			vo.setEventDetailMsg(sb.toString());

            if(intglVo.isReprocessAppointmentOffer()) {
                vo.setEventType(0);
            }

			if (!intglVo.isReprocessRequired()) {
				eventHandlerFacade.writeEventLog(vo);
				eventHandlerFacade.writeEventDetailLog(vo);
			} else {
				vo.setEventType(6);
				eventHandlerFacade.updateEventLog(vo);
			}

			if (pendingEnabled) {
				if (intglVo.getVsType() == ScenarioType.VS1
				// && vo.getEventStatus() != EventStatus.ERROR_TARGET_SEND
				) {
					updateVS1ProccesStatus(intglVo.getSourceId());

					requestVS1ProcessEvent(intglVo.getSourceId());
				}
			}
		}

		return vo.getEventStatus();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @param intglVo
	 * @param strInputXML
	 * @param nDataType
	 * @param sb
	 */
	private void sendDataStandByServer(EventLogVo vo, IntglDataVo intglVo,
			String strInputXML, int nDataType, StringBuilder sb) {
		// try {
		// // EventStatus.ERROR_TARGET_SEND 발생시 Standby Server 로 전송한다.
		// String targetIp = get360IoServerIp("000000");
		// vo.setEventRoute(targetIp);
		// sendData(strInputXML, nDataType, intglVo, vo, targetIp);
		// } catch (Exception se) {
		// // target 전송 오류
		// vo.setEventStatus(EventStatus.ERROR_TARGET_SEND);
		//
		// String errmsg = StringUtil.getStackTrace(se);
		//
		// // event message 는 간단한 에러메세지로 append
		// vo.setEventMsg(vo.getEventMsg() + "\r\n\r\n"
		// + StringUtils.abbreviate(se.getMessage(), 3200));
		//
		// if (sb != null) {
		// sb.append("\r\n\r\n");
		// sb.append(errmsg);
		// }
		//
		// }

		// 재처리
		if (!intglVo.isReprocessRequired()) {
			eventHandlerFacade.writeEventReprocess(intglVo);
		}
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param strInputXML
	 * @param nDataType
	 * @param intglVo
	 * @param vo
	 * @param targetIp
	 * @throws Exception
	 */
	private void sendData(String strInputXML, int nDataType,
			IntglDataVo intglVo, EventLogVo vo, String targetIp)
			throws Exception {
		int result = 0;
		ReceiveWorkbenchDataResult rslt = null;

		switch (intglVo.getVsType()) {
		case VS7A:
			String strLanguageId = "java";
			rslt = getServicePort(targetIp).receiveWorkbenchData(strInputXML,
					strLanguageId);
			if (rslt != null && rslt.isAccepted()) {
				// 성공
				vo.setEventStatus(EventStatus.SUCCES);
			} else {
				// target 처리 실패
				vo.setEventStatus(EventStatus.ERROR_TARGET_PROCESS);
				vo.setEventMsg(vo.getEventMsg()
						+ "\r\n\r\n"
						+ "sendStringDataTo360Sync result ["
						+ (rslt == null ? "result is null"
								: ("RejectionReason=" + ", InputInternalId="
										+ rslt.getRejectionReason()
										+ ", InputInternalId=" + rslt
										.getInputInternalId())) + "]");
			}
			break;

		default:
			//result = getServicePort(targetIp).sendStringDataTo360Sync(
			//		strInputXML, nDataType);

			vo.setEventMsg(vo.getEventMsg() + "\r\n\r\n"
					+ "sendStringDataTo360Sync result [" + result + "]");

			switch (intglVo.getVsType()) {
			case VS14:
			case VS14A:
			case VS14B:
			case VS14C:
			case VS14D:
			case VS15A:
            case VS15D:
            case VS16:
			case VS16A:
				if (result < 0) { // fail
					// target 처리 실패
					vo.setEventStatus(EventStatus.ERROR_TARGET_PROCESS);
					throw new ProcessException("[" + intglVo.getVsType()
							+ "] Target process error! result [" + result + "]");
				} else {
					// 성공
					vo.setEventStatus(EventStatus.SUCCES);
				}
				break;

			default:
				if (result < 1) { // fail
					// target 처리 실패
					vo.setEventStatus(EventStatus.ERROR_TARGET_PROCESS);
					throw new ProcessException("[" + intglVo.getVsType()
							+ "] Target process error! result [" + result + "]");
				} else {
					// 성공
					vo.setEventStatus(EventStatus.SUCCES);
				}
				break;
			}

			break;
		}
	}

	/**
	 * return new EventLogVo instance <br />
	 * 
	 * 
	 * @param intglVo
	 * @param methodName
	 * @return
	 */
	private EventLogVo getEventLogVo(IntglDataVo intglVo, String methodName) {
		EventLogVo vo = new EventLogVo();

		vo.setEventId(intglVo.getEventId());
		vo.setEventSender(intglVo.getSender());
		vo.setEventReceiver(SystemType.Scheduling360.toString());
		vo.setEventVsType(intglVo.getVsType());
		vo.setEventSourceId(intglVo.getSourceId());
		vo.setEventType(6);
		vo.setEventStatus(EventStatus.SUCCES);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventMethod(methodName);
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		return vo;
	}

	/**
	 * get 360 I/O Server IP using csct cd <br />
	 * 
	 * 
	 * @param sourceId
	 * @return
	 */
	private String get360IoServerIp(String sourceId) {
		String serverIp = default360Ip;

		WMMapping360IoVo param = new WMMapping360IoVo();
		param.setSearchCsctCd(sourceId);
		param.setSearchEnvType(envType);

		WMMapping360IoVo result = intgl2SchedulerService
				.select360IoServerIp(param);

		if (result != null && result.getThreeSixtyIOServerIp() != null) {
			serverIp = result.getThreeSixtyIOServerIp();
		}

		return serverIp;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param csctId
	 * @return
	 */
	public int updateVS1ProccesStatus(String csctId) {
		WMMapping360IoVo vo = new WMMapping360IoVo();
		vo.setCsctId(csctId);
		vo.setVs1ProcStatus("N");
		vo.setVs1LastProcDt(new Timestamp(new GregorianCalendar()
				.getTimeInMillis()));

		return neosswm2IntglService.updateMapping360IoForVs1(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param csctId
	 */
	public void requestVS1ProcessEvent(String csctId) {
		try {
			String url = "http://" + this.host + ":" + this.port + this.url;

			HttpClientUtil httpclient = new HttpClientUtil();
			Map<String, String> params = new HashMap<String, String>();
			params.put("csctId", csctId);

			httpclient.service(url, null, params, ClientType.HttpClient_GET);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}
}
