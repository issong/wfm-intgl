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
package com.kt.oss.wmIntgl.integration.intgl2neosswm.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.tempuri.ArrayOfReceive360ManualAllocationInputParam;
import org.tempuri.ArrayOfReceive360WorkOrderInputParam;
import org.tempuri.Receive360Result;
import org.tempuri.Receive360ResultSoap;
import org.tempuri.Receive360WorkOrderResult;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.intgl2neosswm.helper.VoConvertHelper;

/**
 * Call Legacy WebService <br />
 * 
 * 
 * FROM NEOSS VS 연동 리턴값 정리
 * 
 * -999: 해당 VS 호출 미 대상 오더이다. -99: EXCEPTION 발생 0이상 큰 정수(0 또는 1): 해당 VS 호출 대상 오더,
 * 그리고 360 IL 성공 리턴 값 0미만 정수(-1): 해당 VS 호출 대상 오더, 그러나 360 IL 실패 리턴 값
 * 
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Service
public class WMServiceProxy extends BaseService {

	private static final QName SERVICE_NAME = new QName("http://tempuri.org/",
			"Receive360Result");

	@Value("${neoss.url.webservice}")
	private String webserviceURL;

	private URL wsdlURL;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	/**
	 * @return
	 */
	private Receive360ResultSoap getServicePort() {
		if (wsdlURL == null) {
			try {
				wsdlURL = new URL(webserviceURL);
			} catch (MalformedURLException e) {
				logger.error(e.getMessage());
			}
		}

		Receive360Result ss = new Receive360Result(wsdlURL, SERVICE_NAME);

		Receive360ResultSoap port = ss.getReceive360ResultSoap();

		return port;
	}

	/**
	 * for VS2
	 * 
	 * send data to NEOSS <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	public EventStatus receive360WorkOrder(IntglDataVo intglVo) {
		int result = 0;

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(intglVo, "receive360WorkOrder");

		StringBuilder eventMsg = new StringBuilder();
		StringBuilder detailMsg = new StringBuilder();

		try {
			ArrayOfReceive360WorkOrderInputParam src = VoConvertHelper
					.convertForVS2(intglVo, detailMsg);
			// detailMsg.append(VoConvertHelper
			// .getMarshalArrayOfReceive360WorkOrderInputParam(src));

            int size = src.getReceive360WorkOrderInputParam() == null ? -1 : src.getReceive360WorkOrderInputParam().size();

			vo.setEventDataSize(size);

			eventMsg.append("received data size [")
					.append(vo.getEventDataSize()).append("]");

            if(size > 0) {
                Receive360WorkOrderResult res = getServicePort()
                        .receive360WorkOrder(src);

                result = res.getResult();
                eventMsg.append("result [" + result + "]");
            }

			vo.setEventStatus(result < 0 ? EventStatus.ERROR_TARGET_PROCESS
					: EventStatus.SUCCES);

		} catch (ConversionException ce) {

			logger.info(ce.getMessage());
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);

		} catch (Exception e) {
			vo.setEventStatus(EventStatus.ERROR_TARGET_SEND);

			String errMsg = StringUtil.getStackTrace(e);
			eventMsg.append(e.getMessage());

			logger.error(errMsg);

			detailMsg.append("\r\n\r\n");
			detailMsg.append(errMsg);

			eventHandlerFacade.writeEventReprocess(intglVo);

		} finally {
			vo.setEventDetailMsg(detailMsg.toString());
			vo.setEventMsg(eventMsg.toString());

			// insert DB log
			if (!intglVo.isReprocessRequired()) {
				eventHandlerFacade.writeEventLog(vo);
				eventHandlerFacade.writeEventDetailLog(vo);
			}
		}

		return vo.getEventStatus();
	}

	/**
	 * for VS7
	 * 
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	public EventStatus receive360WorkOrderStatus(IntglDataVo intglVo) {
		int result = 0;

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(intglVo, "receive360WorkOrderStatus");

		StringBuilder eventMsg = new StringBuilder();
		StringBuilder detailMsg = new StringBuilder();

		try {
			ArrayOfReceive360ManualAllocationInputParam src = VoConvertHelper
					.convertForVS7(intglVo, detailMsg);
			// detailMsg
			// .append(VoConvertHelper
			// .getMarshalArrayOfReceive360ManualAllocationInputParam(src));

			vo.setEventDataSize(src.getReceive360ManualAllocationInputParam()
					.size());

			eventMsg.append("received data size [")
					.append(vo.getEventDataSize()).append("]");

			Receive360WorkOrderResult res = getServicePort()
					.receive360ManualAllocation(src);

			result = res.getResult();
			eventMsg.append("result [" + result + "]");

			vo.setEventStatus(result < 0 ? EventStatus.ERROR_TARGET_PROCESS
					: EventStatus.SUCCES);
		} catch (ConversionException ce) {

			logger.info(ce.getMessage());
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);

		} catch (Exception e) {
			vo.setEventStatus(EventStatus.ERROR_TARGET_SEND);

			String errMsg = StringUtil.getStackTrace(e);
			eventMsg.append(e.getMessage());

			logger.error(errMsg);

			detailMsg.append("\r\n\r\n");
			detailMsg.append(errMsg);

			if (!intglVo.isReprocessRequired()) {
				eventHandlerFacade.writeEventReprocess(intglVo);
			}
		} finally {
			vo.setEventDetailMsg(detailMsg.toString());
			vo.setEventMsg(eventMsg.toString());

			// insert DB log
			if (!intglVo.isReprocessRequired()) {
				eventHandlerFacade.writeEventLog(vo);
				eventHandlerFacade.writeEventDetailLog(vo);
			}
		}

		return vo.getEventStatus();
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
		vo.setEventReceiver(SystemType.NeOSS.toString());
		vo.setEventVsType(intglVo.getVsType());
		vo.setEventSourceId(intglVo.getSourceId());
		vo.setEventType(6);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventStatus(EventStatus.SUCCES);
		vo.setEventMethod(methodName);
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		return vo;
	}

}
