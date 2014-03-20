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
 * yngwie          2012. 11. 20.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.webservice.BaseWebService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.exception.ClientException;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.facade.DataHandlerFacade;
import com.kt.oss.wmIntgl.datamapper.dao.intgl.DataMapperDao;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.WMAppointmentServiceProvider;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.dao.bt360.WMAppointment360Dao;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMVisitScheduleResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentCancelParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParamVo;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOrderParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMMappingReasonTypeVo;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.helper.VoConvertHelper;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.service.WMAppointmentProviderService;

/**
 * short description about class <br />
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 20.
 * @see
 */
@Service
@WebService(endpointInterface = "com.kt.oss.wmIntgl.integration.appointment2intgl.provider.WMAppointmentServiceProvider")
public class WMAppointmentServiceProviderImpl extends BaseWebService implements
		WMAppointmentServiceProvider {

	@Autowired
	private DataHandlerFacade dataHandlerFacade;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private WMAppointmentProviderService wmAppointmentProviderService;

	@Autowired
	private DataMapperDao dataMapperDao;

	@Autowired
	private WMAppointment360Dao wMAppointment360Dao;

	@Value("${appointmentservice.pollinginterval}")
	private int pollingInterval;

	@Value("${appointmentservice.termmillisecond}")
	private int termmillisecond;

	private Map<String, String> reasonTypeMap;

	/*
	 * for VS6
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.icis2intgl.provider.
	 * WMAppointmentServiceProvider#makeAppointment(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public WMAppointmentOfferResponse makeAppointment(
			String appointmentRequestId, String sourceDt,
			WMAppointmentOrderParam param) {

		WMAppointmentOfferResponse result = new WMAppointmentOfferResponse();

		boolean isValidClientIp = true;

		ScenarioType sType = ScenarioType.VS6;

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(null, sType, "makeAppointment");

		String eventMsg = "";
		StringBuilder detailMsg = new StringBuilder();

		IntglDataVo intglVo = null;

		String csctId = null;

		try {
			if (!checkAppointmentRequestId(appointmentRequestId)) {
				throw new ConversionException(
						"appointmentRequestId must be at least 2 characters ["
								+ appointmentRequestId + "]");
			}

			if (param != null) {
				checkClientIp();

				csctId = selectCSCTId(param.getOfficeScode());
				vo.setEventSourceId(csctId);

				List<Object> dest = new ArrayList<Object>();
				intglVo = getIntglDataVo(appointmentRequestId, csctId, sType,
						sourceDt, vo.getEventId());

				detailMsg.append(param);
				dest.add(VoConvertHelper.convertWMAppointmentOrder(param));

				intglVo.setSourceData(dest);

				vo.setEventStatus(EventStatus.SUCCES);
				eventMsg = "receive data size [1], appointmentRequestId ["
						+ appointmentRequestId + "], inputreferenceId ["
						+ intglVo.getInputReferenceId() + "]";

				vo.setEventDataSize(1);

			} else {
				vo.setEventStatus(EventStatus.ERROR_ETC);
				eventMsg = "receive data size [0]";
				vo.setEventDataSize(0);
			}
		} catch (ConversionException ce) {
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
			eventMsg = ce.getMessage();
		} catch (Exception e) {
			vo.setEventStatus(EventStatus.ERROR_ETC);
			eventMsg = StringUtils
					.abbreviate(StringUtil.getStackTrace(e), 3200);

			if (e instanceof ClientException) {
				isValidClientIp = false;
			}

		} finally {
			vo.setEventDetailMsg(detailMsg.toString());
			vo.setEventMsg(eventMsg);

			// insert DB log
			eventHandlerFacade.writeEventLog(vo);
			eventHandlerFacade.writeEventDetailLog(vo);
		}

		if (intglVo != null && vo.getEventStatus() == EventStatus.SUCCES) {

			detailMsg.setLength(0);

			try {
				// wmAppointmentProviderService
				// .deleteAppointmentOffer(appointmentRequestId);

				EventStatus status = dataHandlerFacade
						.transIntglTo360SendDataSync(intglVo);

				// bypass queue
				// EventStatus status =
				// dataHandlerFacade.transIntglTo360SendData(intglVo);

				List<WMAppointmentOfferParam> list = null;

				switch (status) {
				case SUCCES:

					for (int i = 0; i < pollingInterval; i++) {
						try {
							Thread.sleep(termmillisecond);
						} catch (InterruptedException e) {
						}

						WMAppointmentOfferParamVo appVo = new WMAppointmentOfferParamVo();
						appVo.setSearchAppointmentRequestId(appointmentRequestId);
						appVo.setSearchCsctId(csctId);
						appVo.setSearchInputReferenceId(intglVo
								.getInputReferenceId());

						list = wMAppointment360Dao
								.selectWMAppointmentOffer(appVo);

						// list = wmAppointmentProviderService
						// .selectWMAppointmentOffer(appointmentRequestId);

						if (list != null && list.size() > 0) {
							if (reasonTypeMap == null) {
								setReasonTypeMap();
							}

							VoConvertHelper
									.mappingWMAppointmentOfferParamReasonType(
											list, reasonTypeMap);
							break;
						}
					}
					break;

				default:
					break;
				}

				boolean updated = false;

				if (list != null && list.size() > 0) {
					updated = true;

					for (WMAppointmentOfferParam offer : list) {
						VoConvertHelper.mappingWMAppointmentOfferParamVoSlotId(
								param, offer);
					}

					// wmAppointmentProviderService
					// .updateBatchAppointmentOffer(list);
				}

				if (updated) {
					result.setResultCode(1);
					result.setResultMsg("success, data size [" + list.size()
							+ "]");
					result.setWmAppointmentOfferParams(list);

					vo.setEventStatus(EventStatus.SUCCES);
					vo.setEventDataSize(list.size());
					detailMsg.append(result);
				} else {
					result.setResultCode(0);
					result.setResultMsg("360 Scheduler 연동문제로 인한 재조회 요망");

					vo.setEventStatus(EventStatus.ERROR_ETC);
					vo.setEventDataSize(0);
				}

				vo.setEventMsg(result.getResultMsg()
						+ ", appointmentRequestId [" + appointmentRequestId
						+ "], inputreferenceId ["
						+ intglVo.getInputReferenceId() + "]");

			} catch (Exception e) {
				logger.error(StringUtil.getStackTrace(e));
				eventMsg = StringUtil.getStackTrace(e);

				vo.setEventStatus(EventStatus.ERROR_ETC);
				vo.setEventMsg(eventMsg);

				detailMsg.append(eventMsg);

				result.setResultCode(0);
				result.setResultMsg("I/L Server 내부에러 발생");
			}
		} else {
			result.setResultCode(0);
			result.setResultMsg(vo.getEventMsg());
		}

		if (isValidClientIp) {
			vo.setEventType(7);
			vo.setEventSender(SystemType.Scheduling360.toString());
			vo.setEventReceiver(SystemType.ICIS.toString());
			vo.setEventDetailMsg(detailMsg.toString());

			// insert DB log
			eventHandlerFacade.writeEventLog(vo);
			eventHandlerFacade.writeEventDetailLog(vo);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMAppointmentServiceProvider#cancelAppointment(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public WMAppointmentOfferResponse cancelAppointment(
			String appointmentRequestId, String sourceDt,
			WMAppointmentCancelParam param) {

		return processData(appointmentRequestId, sourceDt, param,
				ScenarioType.VS6B, "cancelAppointment");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMAppointmentServiceProvider#confirmAppointment(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public WMAppointmentOfferResponse confirmAppointment(
			String appointmentRequestId, String sourceDt,
			WMAppointmentOrderParam param) {

		return processData(appointmentRequestId, sourceDt, param,
				ScenarioType.VS6C, "confirmAppointment");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.appointment2intgl.provider.
	 * WMAppointmentServiceProvider#cancelTask(java.lang.String,
	 * java.lang.String,
	 * com.kt.oss.wmIntgl.integration.appointment2intgl.provider
	 * .domain.WMAppointmentCancelParam)
	 */
	@Override
	public WMAppointmentOfferResponse cancelTask(String odrNum,
			String sourceDt, WMAppointmentCancelParam param) {

		return processData(odrNum, sourceDt, param, ScenarioType.VS6D,
				"cancelTask");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.appointment2intgl.provider.
	 * WMAppointmentServiceProvider#searchVisitSchedule(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public WMVisitScheduleResponse searchVisitSchedule(String odrNum,
			String sourceDt) {

		WMVisitScheduleResponse result = new WMVisitScheduleResponse();
		result.setOdrNum(odrNum);
		result.setResultCode(0);
		result.setResultMsg("fail");

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(null, ScenarioType.VS6E,
				"searchVisitSchedule");

		String eventMsg = "";
		StringBuilder detailMsg = new StringBuilder();

		try {
			checkClientIp();
			vo.setEventSourceId("ICIS");

			WMVisitScheduleResponse data = wmAppointmentProviderService
					.selectAllocation(odrNum);

			if (data != null) {
				vo.setEventDataSize(1);

				result.setResultCode(1);
				result.setResultMsg("success");
				result.setStartDt(data.getStartDt());
				result.setEndDt(data.getEndDt());
				eventMsg = "receive data size [1], result data size [1], odrNum ["
						+ odrNum + "]";
			} else {
				vo.setEventDataSize(0);
				eventMsg = "receive data size [1], result data size [0], odrNum ["
						+ odrNum + "]";
			}

			vo.setEventStatus(EventStatus.SUCCES);

		} catch (ClientException ce) {
			vo.setEventStatus(EventStatus.ERROR_ETC);
			eventMsg = StringUtils.abbreviate(StringUtil.getStackTrace(ce),
					3200);

			result.setResultCode(0);
			result.setResultMsg("접속이 허용되지 않은 IP");
		} catch (Exception e) {
			vo.setEventStatus(EventStatus.ERROR_ETC);
			eventMsg = StringUtils
					.abbreviate(StringUtil.getStackTrace(e), 3200);

			result.setResultCode(0);
			result.setResultMsg("I/L Server 내부에러 발생");
		} finally {
			vo.setEventDetailMsg(detailMsg.toString());
			vo.setEventMsg(eventMsg);

			// insert DB log
			eventHandlerFacade.writeEventLog(vo);
			eventHandlerFacade.writeEventDetailLog(vo);
		}

		return result;
	}

	/**
	 * ICIS 에서 수신된 데이터 처리 <br />
	 * 
	 * @param appointmentRequestId
	 * @param sourceDt
	 * @param param
	 * @param sType
	 * @param methodName
	 * @return
	 */
	private WMAppointmentOfferResponse processData(String appointmentRequestId,
			String sourceDt, Object param, ScenarioType sType, String methodName) {

		WMAppointmentOfferResponse result = new WMAppointmentOfferResponse();

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(null, sType, methodName);

		String eventMsg = "";
		StringBuilder detailMsg = new StringBuilder();

		IntglDataVo intglVo = null;

		String changeRequestId = changeAppointmentRequestId(appointmentRequestId);

		try {
			if (param != null) {

				intglVo = getIntglDataVo(changeRequestId, null, sType,
						sourceDt, vo.getEventId());

				switch (sType) {
				case VS6B:
				case VS6D:
					WMAppointmentCancelParam cancelParam = (WMAppointmentCancelParam) param;
					detailMsg.append(cancelParam);

					vo.setEventSourceId(selectCSCTId(cancelParam
							.getOfficeScode()));
					intglVo.getSourceData().add(
							VoConvertHelper
									.convertWMAppointmentCancel(cancelParam));
					break;

				case VS6C:
					WMAppointmentOrderParam orderParam = (WMAppointmentOrderParam) param;
					detailMsg.append(orderParam);

					vo.setEventSourceId(selectCSCTId(orderParam
							.getOfficeScode()));
					intglVo.getSourceData().add(
							VoConvertHelper
									.convertWMAppointmentOrder(orderParam));
					break;

				default:
					break;
				}

				intglVo.setSourceId(vo.getEventSourceId());

				checkClientIp();

				vo.setEventStatus(EventStatus.SUCCES);
				eventMsg = "receive data size [1]";

				vo.setEventDataSize(1);

				result.setResultCode(1);
				result.setResultMsg("success");
			} else {
				vo.setEventStatus(EventStatus.ERROR_ETC);
				eventMsg = "receive data size [0]";
				vo.setEventDataSize(0);

				result.setResultCode(0);
				result.setResultMsg("No order received");
			}

		} catch (ConversionException ce) {
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
			eventMsg = ce.getMessage();

			result.setResultCode(0);
			result.setResultMsg(eventMsg);
		} catch (Exception e) {
			vo.setEventStatus(EventStatus.ERROR_ETC);
			eventMsg = StringUtils
					.abbreviate(StringUtil.getStackTrace(e), 3200);

			result.setResultCode(0);
			result.setResultMsg("I/L Server 내부에러 발생");
		} finally {
			vo.setEventDetailMsg(detailMsg.toString());

			if (changeRequestId.equals(appointmentRequestId)) {
				vo.setEventMsg(eventMsg + ", appointmentRequestId ["
						+ appointmentRequestId + "]");
			} else {
				vo.setEventMsg(eventMsg + ", original appointmentRequestId ["
						+ appointmentRequestId + "], appointmentRequestId ["
						+ changeRequestId + "], ");
			}

			// insert DB log
			eventHandlerFacade.writeEventLog(vo);
			eventHandlerFacade.writeEventDetailLog(vo);

			if (intglVo != null && vo.getEventStatus() == EventStatus.SUCCES) {
				try {
					EventStatus status = dataHandlerFacade
							.transIntglTo360SendDataSync(intglVo);

					switch (status) {
					case SUCCES:
						result.setResultCode(1);
						result.setResultMsg("success");
						break;
					default:
						break;
					}
				} catch (Exception e) {
					logger.error(StringUtil.getStackTrace(e));
				}
			}
		}

		return result;
	}

	/**
	 * return new EventLogVo instance <br />
	 * 
	 * @param sourceId
	 * @param type
	 * @param methodName
	 * @return
	 */
	private EventLogVo getEventLogVo(String sourceId, ScenarioType type,
			String methodName) {
		EventLogVo vo = new EventLogVo();

		long eventId = eventHandlerFacade.getEventId();

		vo.setEventId(eventId);
		vo.setEventSender(SystemType.ICIS.toString());
		vo.setEventReceiver(SystemType.Scheduling360.toString());
		vo.setEventVsType(type);
		vo.setEventSourceId(sourceId);
		vo.setEventType(1);
		vo.setEventStatus(EventStatus.NONE);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventMethod(methodName);
		vo.setEventIp(getRemoteAddr());
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		return vo;
	}

	/**
	 * return new IntglDataVo instance <br />
	 * 
	 * @param appointmentRequestId
	 * @param officeScode
	 * @param type
	 * @param sourceDt
	 * @param eventId
	 * @return
	 * @throws ConversionException
	 */
	private IntglDataVo getIntglDataVo(String appointmentRequestId,
			String officeScode, ScenarioType type, String sourceDt, long eventId)
			throws ConversionException {

		IntglDataVo intglVo = new IntglDataVo();

		intglVo.setEventId(eventId);
		intglVo.setSender(SystemType.ICIS.toString());
		intglVo.setReceiver(SystemType.Scheduling360.toString());
		intglVo.setVsType(type);
		intglVo.setAppointmentRequestId(appointmentRequestId);
		intglVo.setSourceId(officeScode);
		intglVo.setSourceDt(ConversionUtil.getStringToDate(sourceDt));

		intglVo.setInputReferenceId(StringUtil.getUUID());

		return intglVo;
	}

	private String changeAppointmentRequestId(String appointmentRequestId) {
		String result = appointmentRequestId;
		if (!checkAppointmentRequestId(appointmentRequestId)) {
			result = "NONE";
		}

		return result;
	}

	private boolean checkAppointmentRequestId(String appointmentRequestId) {
		return appointmentRequestId == null ? false : StringUtils
				.length(appointmentRequestId) < 2 ? false : true;
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
	 * 
	 * @return
	 */
	private void setReasonTypeMap() {

		List<WMMappingReasonTypeVo> list = wmAppointmentProviderService
				.selectWMMappingReasonType();

		if (list != null && list.size() > 0) {
			reasonTypeMap = new HashMap<String, String>();

			for (WMMappingReasonTypeVo vo : list) {
				reasonTypeMap.put(vo.getReasonTypeId(), vo.getDescription());
			}
		}
	}
}
