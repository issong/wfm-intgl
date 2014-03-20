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
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jws.WebService;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;

import com._360scheduling.interfaces.ReceiveWorkbenchDataResult;
import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com.kt.oss.wmIntgl.common.base.webservice.BaseWebService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.facade.DataHandlerFacade;
import com.kt.oss.wmIntgl.datamapper.dao.intgl.DataMapperDao;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.service.WMAppointmentProviderService;
import com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.SchedulerServiceProvider;
import com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.helper.VoConvertHelper;
import com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.service.Scheduler2IntglProviderService;
import com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.service.XPathService;

/**
 * WebService from 360 System <br />
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 */
@Service
@WebService(targetNamespace = "http://SchedulerServiceProvider/", endpointInterface = "com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.SchedulerServiceProvider", portName = "ReceiverPort", serviceName = "ReceiverService")
public class SchedulerServiceProviderImpl extends BaseWebService implements
		SchedulerServiceProvider {

	@Autowired
	private DataHandlerFacade dataHandlerFacade;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Resource(name = "scheduleMarshaller")
	private Unmarshaller scheduleMarshaller;

	@Autowired
	private XPathService xPathService;

	@Autowired
	private WMAppointmentProviderService wmAppointmentProviderService;

	@Autowired
	private DataMapperDao dataMapperDao;

	@Autowired
	private Scheduler2IntglProviderService scheduler2IntglProviderService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kt.oss.wmIntgl.integration.scheduler2intgl.SchedulerServiceProvider
	 * #receiveStringData(java.lang.String)
	 */
	@Override
	public boolean ReceiveStringData(String strOutputXML) {
		boolean result = false;

		// new instance for DB log data
		EventLogVo vo = getEventLogVo("ReceiveStringData", strOutputXML, false);

		if (!isDispatchYn(vo.getEventSourceId(), getEnvType())) {
			return true;
		}

		StringBuilder eventMsg = new StringBuilder();

		ScenarioType scenarioType = null;

		DsScheduleData d = null;

		List<Object> sendBackList = null;

		StringBuilder detailMsg = new StringBuilder();

		try {
			checkClientIp();

			d = (DsScheduleData) scheduleMarshaller.unmarshal(new StreamSource(
					new StringReader(strOutputXML)));

			if (d != null) {

				scenarioType = getScenarioType(d);

				if (scenarioType == null) {
					eventMsg.append("Can't find scenario type");
					vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
					return result;
				}

//				if (scenarioType == ScenarioType.NONE) {
//					eventMsg.append("not defined scenario");
//					vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
//					return true;
//				}

				vo.setEventVsType(scenarioType);

				IntglDataVo intglVo = getIntglDataVo(vo, false);

				switch (scenarioType) {
                case NONE:
                    scenarioType = ScenarioType.VS2;
                    vo.setEventVsType(scenarioType);
                case VS2:
//				case VS7:
					intglVo.setVsType(scenarioType);

                    sendBackList = VoConvertHelper.arrangeDsScheduleData(d,
                            detailMsg);

					intglVo.getSourceData().add(d);

                    if(d.getShiftPatternOrActivityOrActivitySLA().size() > 0) {
                        dataHandlerFacade.trans360ToIntglSendData(intglVo);
                        vo.setEventStatus(EventStatus.SUCCES);
                    } else {
                        vo.setEventStatus(EventStatus.ERROR_ETC);
                    }
                    vo.setEventDataSize(d
                            .getShiftPatternOrActivityOrActivitySLA().size() - 1);

					eventMsg.append("Received Data size [")
							.append(vo.getEventDataSize()).append("]");

					result = true;
					break;

				case VS6A:

					// List<Object> list = d
					// .getShiftPatternOrActivityOrActivitySLA();
					//
					// String appointmentRequestId = "";
					//
					// List<WMAppointmentOfferParamVo> insertList = new
					// ArrayList<WMAppointmentOfferParamVo>();
					//
					// for (Object src : list) {
					// if (src instanceof DsScheduleData.AppointmentOffer) {
					// WMAppointmentOfferParamVo offer = VoConvertHelper
					// .convertWMAppointmentOfferParamVo(
					// (DsScheduleData.AppointmentOffer) src,
					// vo);
					//
					// insertList.add(offer);
					//
					// appointmentRequestId = offer
					// .getAppointmentRequestId();
					// }
					// }
					//
					// if (insertList.size() > 0) {
					// wmAppointmentProviderService
					// .insertBatchAppointmentOffer(insertList);
					// }

					vo.setEventStatus(EventStatus.SUCCES);
					vo.setEventDataSize(d
							.getShiftPatternOrActivityOrActivitySLA().size() - 1);

					// eventMsg.append("DB insert Data : appointmentRequestId [")
					// .append(appointmentRequestId).append("]");

					result = true;
					break;

				default:
					eventMsg.append("Can't find 360 data scenario type");
					vo.setEventStatus(EventStatus.ERROR_ETC);

					break;
				}

			} else {
				eventMsg.append("No Data received");
				vo.setEventStatus(EventStatus.ERROR_ETC);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			vo.setEventStatus(EventStatus.ERROR_ETC);
			vo.setEventDetailMsg(e.getMessage());
			eventMsg.append(e.getMessage());
		} finally {
			if (scenarioType != null /* && scenarioType != ScenarioType.NONE */) {
				// insert DB log
				vo.setEventMsg(StringUtils.abbreviate(eventMsg.toString(), 3200));

				eventHandlerFacade.writeEventLog(vo);
				eventHandlerFacade.writeEventDetailLog(vo);

				// if (scenarioType == ScenarioType.VS2) {
				// sendBackDsScheduleData(sendBackList, strOutputXML,
				// detailMsg);
				// }
			}
		}

		return result;
	}

	/*
	 * for VS7
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.
	 * SchedulerServiceProvider#ReceiveWorkbenchData(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public ReceiveWorkbenchDataResult ReceiveWorkbenchData(String strInputXML,
			String strLanguageId) {
		ReceiveWorkbenchDataResult result = new ReceiveWorkbenchDataResult();
		result.setAccepted(true);
		result.setRejectionReason("");

		// new instance for DB log data
		EventLogVo vo = getEventLogVo("ReceiveWorkbenchData", strInputXML,
				false);

		if (!isDispatchYn(vo.getEventSourceId(), getEnvType())) {
			return result;
		}

		List<Object> sendBackList7B = new ArrayList<Object>();
		List<Object> sendBackList7C = new ArrayList<Object>();

		StringBuilder _7bMsg = new StringBuilder();
		StringBuilder _7cMsg = new StringBuilder();

		StringBuilder eventMsg = new StringBuilder();

		ScenarioType scenarioType = null;

		try {
			checkClientIp();

			DsScheduleData d = (DsScheduleData) scheduleMarshaller
					.unmarshal(new StreamSource(new StringReader(strInputXML)));

			if (d != null) {

				scenarioType = getScenarioType(d);

				if (scenarioType == null) {
					eventMsg.append("Can't find scenario type");
					vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
					return null;
				}

				vo.setEventVsType(scenarioType);

				IntglDataVo intglVo = getIntglDataVo(vo, false);

				switch (scenarioType) {
				case VS7:
					intglVo.setVsType(scenarioType);

					VoConvertHelper.arrangeReceiveWorkbenchData(d,
							sendBackList7B, sendBackList7C, _7bMsg, _7cMsg);

					intglVo.getSourceData().add(d);

					vo.setEventDataSize(d
							.getShiftPatternOrActivityOrActivitySLA().size() - 1);

					eventMsg.append("Received Data size [")
							.append(vo.getEventDataSize()).append("]");

					if (d.getShiftPatternOrActivityOrActivitySLA().size() > 1) {
						dataHandlerFacade.trans360ToIntglSendData(intglVo);
					} else {
						eventMsg.append(", Activity Status Size [0]");
					}

					vo.setEventStatus(EventStatus.SUCCES);
					break;

				default:
					eventMsg.append("Can't find 360 data scenario type");
					vo.setEventStatus(EventStatus.ERROR_ETC);

					break;
				}

			} else {
				eventMsg.append("No Data received");
				vo.setEventStatus(EventStatus.ERROR_ETC);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			vo.setEventStatus(EventStatus.ERROR_ETC);
			vo.setEventDetailMsg(e.getMessage());
			eventMsg.append(e.getMessage());

			// set result data for fail
			result.setAccepted(false);
			result.setRejectionReason(e.getMessage());

		} finally {
			if (scenarioType != null /* && scenarioType != ScenarioType.NONE */) {
				// insert DB log
				vo.setEventMsg(StringUtils.abbreviate(eventMsg.toString(), 3200));

				eventHandlerFacade.writeEventLog(vo);
				eventHandlerFacade.writeEventDetailLog(vo);

				sendBackWorkbenchData(sendBackList7B, ScenarioType.VS7B,
						strInputXML, _7bMsg);

				sendBackWorkbenchData(sendBackList7C, ScenarioType.VS7C,
						strInputXML, _7cMsg);
			}
		}

		return result;
	}

	/**
	 * return 360 data scenario type <br />
	 * 
	 * @param d
	 * @return ScenarioType
	 */
	private ScenarioType getScenarioType(DsScheduleData d) {
		ScenarioType result = null;

		for (Object o : d.getShiftPatternOrActivityOrActivitySLA()) {
			if (o instanceof DsScheduleData.SuggestedDispatch) {
				result = ScenarioType.VS2;
				break;
			}

			if (o instanceof DsScheduleData.ActivityStatus) {
				result = ScenarioType.VS7;
				break;
			}

			if (o instanceof DsScheduleData.AppointmentOffer) {
				result = ScenarioType.VS6A;
				break;
			}

			if (o instanceof DsScheduleData.PlanDeletion) {
				result = ScenarioType.NONE;
				break;
			}
		}

		return result;

	}

	/**
	 * return new EventLogVo instance <br />
	 * 
	 * @param methodName
	 * @return
	 */
	private EventLogVo getEventLogVo(String methodName, String strInputXML,
			boolean reverse) {
		EventLogVo vo = new EventLogVo();

		long eventId = eventHandlerFacade.getEventId();

		vo.setEventId(eventId);

		if (reverse) { // for VS20
			vo.setEventSender(SystemType.Scheduling360.toString());
			vo.setEventReceiver(SystemType.Scheduling360.toString());
		} else {
			vo.setEventSender(SystemType.Scheduling360.toString());
			vo.setEventReceiver(SystemType.NeOSS.toString());
		}

		vo.setEventSourceId("no plan data");
		vo.setEventType(1);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventMethod(methodName);
		vo.setEventIp(getRemoteAddr());
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		vo.setEventDetailMsg(StringUtil.getFormattedXmlString(strInputXML));

		if (strInputXML != null && strInputXML.length() > 0) {
			String result = xPathService.getElementValue(strInputXML,
					"//dataset_id");
			if (result != null) {
				vo.setEventSourceId(result);

				if (!reverse) { // not VS20
					String csctId = selectCSCTId(result);
					if (csctId != null) {
						vo.setEventSourceId(csctId);
					}
				}
			}
		}

		return vo;
	}

	/**
	 * return new IntglDataVo instance <br />
	 * 
	 * @param vo
     * @param reverse
	 * @return
	 * @throws ConversionException
	 */
	private IntglDataVo getIntglDataVo(EventLogVo vo, boolean reverse)
			throws ConversionException {
		IntglDataVo intglVo = new IntglDataVo();

		intglVo.setEventId(vo.getEventId());
		if (reverse) {
			intglVo.setSender(SystemType.Scheduling360.toString());
			intglVo.setReceiver(SystemType.Scheduling360.toString());
		} else {
			intglVo.setSender(SystemType.Scheduling360.toString());
			intglVo.setReceiver(SystemType.NeOSS.toString());
		}
		intglVo.setSourceId(vo.getEventSourceId());
		intglVo.setSourceDt(Calendar.getInstance().getTime());

		intglVo.setInputReferenceId(StringUtil.getUUID());

		return intglVo;
	}

	/**
	 * short description about method <br />
	 * 
	 * @param csctId
	 * @return
	 */
	private boolean isDispatchYn(String csctId, String envType) {
		String yn = scheduler2IntglProviderService.selectDispatchFlag(csctId,
				envType);
		return (yn != null && yn.equals("Y")) ? true : false;
	}

	/**
	 * get csctId from officeScode <br />
	 * 
	 * @param officeScode
	 * @return
	 */
	private String selectCSCTId(String officeScode) {
		return dataMapperDao.selectCSCTId(StringUtils.trim(officeScode));
	}

	/**
	 * short description about method <br />
	 * 
	 * @param data
	 * @param strOutputXML
     * @param detailMsg
	 */
	@SuppressWarnings("unused")
	private void sendBackDsScheduleData(List<Object> data, String strOutputXML,
			StringBuilder detailMsg) {
		if (data.size() == 0) {
			return;
		}

		EventLogVo vo = getEventLogVo("sendBackDsScheduleData", strOutputXML,
				true);
		vo.setEventVsType(ScenarioType.VS20);

		IntglDataVo intglVo = null;

		String eventMsg = "";
		try {
			intglVo = getIntglDataVo(vo, true);
			intglVo.setVsType(ScenarioType.VS20);

			intglVo.setSourceData(data);

			vo.setEventStatus(EventStatus.SUCCES);
			eventMsg = "data size [" + data.size() + "]";

			vo.setEventDataSize(data.size());

		} catch (ConversionException ce) {
			logger.error(StringUtil.getStackTrace(ce));
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
			eventMsg = ce.getMessage();
		}

		vo.setEventDetailMsg(detailMsg.toString());
		vo.setEventMsg(eventMsg);

		eventHandlerFacade.writeEventLog(vo);
		eventHandlerFacade.writeEventDetailLog(vo);

		if (intglVo != null && vo.getEventStatus() == EventStatus.SUCCES) {
			try {
				dataHandlerFacade.transLegacyToIntglSendData(intglVo);
			} catch (JMSException e) {
				logger.error(StringUtil.getStackTrace(e));

				vo.setEventStatus(EventStatus.ERROR_JMS);
				vo.setEventMsg(StringUtil.getStackTrace(e));
				eventHandlerFacade.updateEventLog(vo);
			}
		}
	}

	/**
	 * short description about method <br />
	 * 
	 * @param data
	 * @param strOutputXML
	 * @param detailMsg
	 */
	private void sendBackWorkbenchData(List<Object> data, ScenarioType sType,
			String strOutputXML, StringBuilder detailMsg) {
		if (data.size() == 0) {
			return;
		}

		EventLogVo vo = getEventLogVo("sendBackWorkbenchData", strOutputXML,
				true);
		vo.setEventVsType(sType);

		IntglDataVo intglVo = null;

		String eventMsg = "";
		try {
			intglVo = getIntglDataVo(vo, true);
			intglVo.setVsType(sType);

			intglVo.setSourceData(data);

			vo.setEventStatus(EventStatus.SUCCES);
			eventMsg = "data size [" + data.size() + "]";

			vo.setEventDataSize(data.size());

		} catch (ConversionException ce) {
			logger.error(StringUtil.getStackTrace(ce));
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
			eventMsg = ce.getMessage();
		}

		vo.setEventDetailMsg(detailMsg.toString());
		vo.setEventMsg(eventMsg);

		eventHandlerFacade.writeEventLog(vo);
		eventHandlerFacade.writeEventDetailLog(vo);

		if (intglVo != null && vo.getEventStatus() == EventStatus.SUCCES) {
			try {
				dataHandlerFacade.transLegacyToIntglSendData(intglVo);
			} catch (JMSException e) {
				logger.error(StringUtil.getStackTrace(e));

				vo.setEventStatus(EventStatus.ERROR_JMS);
				vo.setEventMsg(StringUtil.getStackTrace(e));
				eventHandlerFacade.updateEventLog(vo);
			}
		}

	}

}
