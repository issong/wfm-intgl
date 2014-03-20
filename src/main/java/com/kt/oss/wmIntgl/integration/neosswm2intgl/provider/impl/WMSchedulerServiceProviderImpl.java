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
package com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.webservice.BaseWebService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.facade.DataHandlerFacade;
import com.kt.oss.wmIntgl.datamapper.facade.DataMapperFacade;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.InputReferenceDataVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMConfirmResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMCustomExceptionParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDeleteResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDivisionInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceHolidayInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.helper.VoConvertHelper;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.WMSchedulerServiceProvider;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.service.Neosswm2IntglService;

/**
 * WebService from Legacy System <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Service
@WebService(endpointInterface = "com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.WMSchedulerServiceProvider")
public class WMSchedulerServiceProviderImpl extends BaseWebService implements
		WMSchedulerServiceProvider {

	@Autowired
	private DataHandlerFacade dataHandlerFacade;
	
	@Autowired
	private DataMapperFacade dataMapperFacade;
	
	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private Neosswm2IntglService neosswm2IntglService;

	@Value("${pendingsenario.enabled}")
	private boolean pendingEnabled;
	
	@Override
	public String getCoord(String address) {
		String result;
		
		try {
			Map<String, Double> coord = dataMapperFacade.getCoord(address);
			
			if (coord == null){
				result = "요청하신 주소에 대한 위/경도 좌표가 존재하지 않습니다.";
			}else{
				result = "addr=" + address + ", X=" + coord.get("X") + ", Y=" + coord.get("Y");
			}
		} catch (Exception e) {
			result = "위/경도 좌표 조회 중 예기치 않은 오류가 발생하였습니다.";
		}
		
		return result;
	}
	
	/*
	 * for VS1
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#initialLoadData(java.util.Date,
	 * com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderListVo)
	 */
	@Override
	public int initialLoadData(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS1,
				"initialLoadData");
	}

	/*
	 * for VS3
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#taskStatusUpdate(java.util.Date,
	 * com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderStatus)
	 */
	@Override
	public int updateTaskStatus(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data) {

		ScenarioType sType = ScenarioType.VS3;

		if (data != null && data.size() > 0) {
			WMWorkOrderStatusParam tmp = data.get(0);

			if (tmp.getWorkProgState() != null
					&& "RF".indexOf(tmp.getWorkProgState().trim()) != -1) {
				sType = ScenarioType.VS4;
			}
		}

		return processData(sourceId, sourceDt, data, sType, "updateTaskStatus");
	}

	/*
	 * for VS3A
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#updateTaskStatusForVS2(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int updateTaskStatusForVS2(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS3A,
				"updateTaskStatusForVS2");
	}

	/*
	 * for VS5
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#addNewTask(java.lang.String, java.lang.String,
	 * java.util.List)
	 */
	@Override
	public int addNewTask(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS5,
				"addNewTask");
	}

	/*
	 * for VS10
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#modifyTask(java.lang.String, java.lang.String,
	 * java.util.List)
	 */
	@Override
	public int modifyTask(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS10,
				"modifyTask");
	}

	/*
	 * for VS8
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#cancelTask(java.lang.String, java.lang.String,
	 * java.util.List)
	 */
	@Override
	public int cancelTask(String sourceId, String sourceDt,
			List<WMWorkOrderKeyParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS8,
				"cancelTask");
	}

	/*
	 * for VS7A
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#changeAuthorize(java.lang.String,
	 * java.lang.String,
	 * com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam
	 * )
	 */
	@Override
	public int changeAuthorize(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS7A,
				"changeAuthorize");
	}

	/*
	 * for VS14
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#changeResourceInfo(java.lang.String,
	 * java.lang.String,
	 * com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceInfoParam)
	 */
	@Override
	public int changeResourceInfo(String sourceId, String sourceDt,
			WMResourceInfoParam data) {

		List<WMResourceInfoParam> newData = new ArrayList<WMResourceInfoParam>();
		newData.add(data);

		return processData(sourceId, sourceDt, newData, ScenarioType.VS14,
				"changeResourceInfo");
	}

	/*
	 * for VS14A
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#deleteResourceInfo(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int deleteResourceInfo(String sourceId, String sourceDt,
			List<WMDeleteResourceInfoParam> data) {

		int result14A = processData(sourceId, sourceDt, data,
				ScenarioType.VS14A, "deleteResourceInfo");

		int result15A = processData(sourceId, sourceDt, data,
				ScenarioType.VS15A, "deleteResourceInfo");

		return result14A & result15A;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#changeTaskDuration(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int changeTaskDuration(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#raiseCustomException(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int raiseCustomException(String sourceId, String sourceDt,
			List<WMCustomExceptionParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS90,
				"raiseCustomException");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#removeCustomException(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int removeCustomException(String sourceId, String sourceDt,
			List<WMCustomExceptionParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS91,
				"removeCustomException");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#confirmResourceInfo(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int confirmResourceInfo(String sourceId, String sourceDt,
			List<WMConfirmResourceInfoParam> data) {
		return processData(sourceId, sourceDt, data, ScenarioType.VS14B,
				"confirmResourceInfo");
	}

	/*
	 * for VS12
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#heartbeat(java.lang.String, java.lang.String)
	 */
	@Override
	public int heartbeat(String sourceId, String sourceDt) {

		return processData(sourceId, sourceDt, null, ScenarioType.VS12,
				"heartbeat");
	}

	/*
	 * for VS14C
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#resourceHolidayInfo(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int resourceHolidayInfo(String sourceId, String sourceDt,
			List<WMResourceHolidayInfoParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS14C,
				"resourceHolidayInfo");
	}

	/*
	 * for VSV14D
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#createResourceInfo(java.lang.String,
	 * java.lang.String,
	 * com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceInfoParam)
	 */
	@Override
	public int createResourceInfo(String sourceId, String sourceDt,
			WMResourceInfoParam data) {

		List<WMResourceInfoParam> newData = new ArrayList<WMResourceInfoParam>();
		newData.add(data);
		
		int result14d = processData(sourceId, sourceDt, newData, ScenarioType.VS14D,
				"createResourceInfo");
		
		int result15d = processData(sourceId, sourceDt, newData, ScenarioType.VS15D, 
				"createResourceInfo");
		
		return result14d & result15d;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#createDivisonInfo(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int createDivisonInfo(String sourceId, String sourceDt,
			List<WMDivisionInfoParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS16,
				"createDivisonInfo");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.
	 * WMSchedulerServiceProvider#deleteDivisonInfo(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public int deleteDivisonInfo(String sourceId, String sourceDt,
			List<WMDivisionInfoParam> data) {

		return processData(sourceId, sourceDt, data, ScenarioType.VS16A,
				"deleteDivisonInfo");
	}

	/**
	 * NeOSS 에서 수신된 데이터 처리 <br />
	 * 
	 * 
	 * @param sourceId
	 * @param sourceDt
	 * @param data
	 * @param sType
	 * @param methodName
	 * @return
	 */
	private int processData(String sourceId, String sourceDt, List<?> data,
			ScenarioType sType, String methodName) {
		int result = 1;

		if (pendingEnabled) {
			if (sType == ScenarioType.VS3 || sType == ScenarioType.VS5
					|| sType == ScenarioType.VS8 || sType == ScenarioType.VS10) {
				// VS1 처리중인지 확인
				String isYn = neosswm2IntglService
						.selectMapping360IoForVs1(sourceId);

				if (StringUtils.equals(isYn, "Y")) {
					// 시나리오별 테이블에 데이터를 저장하고 리턴
					neosswm2IntglService.insertNeossSourceData(sourceId,
							sourceDt, data, sType);

					return result;
				}
			}

			if (sType == ScenarioType.VS1) {
				updateVS1ProccesStatus(sourceId);
			}
		}

		// new instance for DB log data
		EventLogVo vo = getEventLogVo(sourceId, sType, methodName);

		String eventMsg = "";
		StringBuilder detailMsg = new StringBuilder();

		IntglDataVo intglVo = null;

		try {
			if (data != null && data.size() > 0) {

				checkClientIp();

				List<Object> dest = new ArrayList<Object>();
				intglVo = getIntglDataVo(sourceId, sType, sourceDt,
						vo.getEventId());

				XMLGregorianCalendar gcTime = ConversionUtil
						.getStringToXMLGregorianCalendar(sourceDt);

				for (int i = 0; i < data.size(); i++) {
					Object order = data.get(i);
					detailMsg.append(order);
					detailMsg.append("\r\n");

					if (order instanceof WMWorkOrderParam) {
						// for VS1, VS5, VS10
						dest.add(VoConvertHelper.convertWMWorkOrder(
								(WMWorkOrderParam) order, gcTime));

					} else if (order instanceof WMWorkOrderStatusParam) {
						// for VS3, VS3A, VS7A
						dest.add(VoConvertHelper
								.convertWMWorkOrderStatus((WMWorkOrderStatusParam) order));

					} else if (order instanceof WMWorkOrderKeyParam) {
						// for VS8
						dest.add(VoConvertHelper
								.convertWMWorkOrderkey((WMWorkOrderKeyParam) order));

					} else if (order instanceof WMResourceInfoParam) {
						// for VS14, VS14D, VS15D
						dest.add(VoConvertHelper.convertWMResourceInfo(
								(WMResourceInfoParam) order, sType));

					} else if (order instanceof WMDeleteResourceInfoParam) {
						// for VS14A, 15A
						dest.add(VoConvertHelper.convertWMDeleteResourceInfo(
								(WMDeleteResourceInfoParam) order, sType));

					} else if (order instanceof WMCustomExceptionParam) {
						// for VS90, VS91
						dest.add(VoConvertHelper
								.convertWMCustomException((WMCustomExceptionParam) order));
					} else if (order instanceof WMConfirmResourceInfoParam) {
						// for VS14B
						dest.add(VoConvertHelper
								.convertWMConfirmResourceInfo((WMConfirmResourceInfoParam) order));

					} else if (order instanceof WMResourceHolidayInfoParam) {
						// for VS14C
						dest.add(VoConvertHelper
								.convertWMResourceHolidayInfo((WMResourceHolidayInfoParam) order));

					} else if (order instanceof WMDivisionInfoParam) {
						// for VS16, VS16A
						dest.add(VoConvertHelper
								.convertWMDivisionInfo((WMDivisionInfoParam) order));

					} else {

					}
				}

				intglVo.setSourceData(dest);

				vo.setEventStatus(EventStatus.SUCCES);
				eventMsg = "receive data size [" + data.size() + "]";

				vo.setEventDataSize(data.size());

			} else {

				if (vo.getEventVsType() == ScenarioType.VS12
						&& sourceId != null) {

					checkClientIp();

					intglVo = getIntglDataVo(sourceId, sType, sourceDt,
							vo.getEventId());
					// heartbeat
					detailMsg.append("sourceId=").append(sourceId)
							.append(", dateTime=").append(sourceDt);

					InputReferenceDataVo ir = new InputReferenceDataVo();
					ir.setIrTime(sourceDt);

					neosswm2IntglService.updateInputreference(ir);

					vo.setEventStatus(EventStatus.SUCCES);
					eventMsg = "heartbeat receive success, sourceDt="
							+ sourceDt;
					vo.setEventDataSize(1);

				} else {
					// error
					result = -1;
					vo.setEventStatus(EventStatus.ERROR_ETC);
					eventMsg = "receive data size ["
							+ (data == null ? -1 : data.size()) + "]";
					vo.setEventDataSize(data == null ? -1 : data.size());
					vo.setEventDetailMsg(detailMsg.toString());
				}

			}
		} catch (ConversionException ce) {
			result = -1;
			vo.setEventStatus(EventStatus.ERROR_TYPECHECK);
			eventMsg = ce.getMessage();
		} catch (Exception e) {
			result = -1;
			vo.setEventStatus(EventStatus.ERROR_ETC);
			eventMsg = e.getMessage();

			detailMsg.append("\r\n\r\n");
			detailMsg.append(StringUtil.getStackTrace(e));
		} finally {
			vo.setEventDetailMsg(detailMsg.toString());
			vo.setEventMsg(eventMsg);

			// insert DB log
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

		return result;
	}

	/**
	 * return new EventLogVo instance <br />
	 * 
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
		vo.setEventSender(SystemType.NeOSS.toString());
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
	 * 
	 * @param sourceId
	 * @param type
	 * @param sourceDt
     * @param eventId
	 * @return
	 * @throws ConversionException
	 */
	private IntglDataVo getIntglDataVo(String sourceId, ScenarioType type,
			String sourceDt, long eventId) throws ConversionException {
		IntglDataVo intglVo = new IntglDataVo();

		intglVo.setEventId(eventId);
		intglVo.setSender(SystemType.NeOSS.toString());
		intglVo.setReceiver(SystemType.Scheduling360.toString());
		intglVo.setVsType(type);
		intglVo.setSourceId(sourceId);
		intglVo.setSourceDt(ConversionUtil.getStringToDate(sourceDt));

		intglVo.setInputReferenceId(StringUtil.getUUID());

		return intglVo;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param csctCd
	 * @return
	 */
	private int updateVS1ProccesStatus(String csctCd) {
		WMMapping360IoVo vo = new WMMapping360IoVo();
		vo.setCsctId(csctCd);
		vo.setVs1ProcStatus("Y");

		neosswm2IntglService.deleteNeossSourceData(csctCd);

		return neosswm2IntglService.updateMapping360IoForVs1(vo);
	}
}
