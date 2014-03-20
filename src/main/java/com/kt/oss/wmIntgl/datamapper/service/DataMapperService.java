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
package com.kt.oss.wmIntgl.datamapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._360scheduling.schema.dsmodelling.DsModelling;
import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.rules.RuleEngine;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 */
@Service
public class DataMapperService {

	@Autowired
	private EventHandlerFacade eventHandlerFacade;
	@Autowired
	private RuleEngine engine;

	public void generateData(IntglDataVo intglVo) throws Exception {
		// 매핑 전에 로그 기록
		EventLogVo beforeVo = getEventLogVo(intglVo, 4, "generateData");
		beforeVo.setEventStatus(EventStatus.SUCCES);
		beforeVo.setEventDataSize(getSize(intglVo.getSourceData()));
		beforeVo.setEventMsg("source data size [" + beforeVo.getEventDataSize()
				+ "]");
		eventHandlerFacade.writeEventLog(beforeVo);

		EventStatus eventStatus = EventStatus.NONE;
		String eventMsg = null;
		int eventDataSize = 0;
		try {
			// 매핑 수행
			engine.generateData(intglVo);

			eventStatus = EventStatus.SUCCES;
			eventDataSize = getSize(intglVo.getTargetData());
			eventMsg = "target data size [" + eventDataSize + "]";
		} catch (Exception e) {
			eventStatus = EventStatus.ERROR_MAPPING;
			eventMsg = e.getMessage();
			throw e;
		} finally {
			// 매핑 후에 로그 기록 (정상:0, 오류:3)
			EventLogVo afterVo = getEventLogVo(intglVo, 5, "generateData");
			afterVo.setEventDataSize(eventDataSize);
			afterVo.setEventStatus(eventStatus);
			afterVo.setEventMsg(eventMsg);
			eventHandlerFacade.writeEventLog(afterVo);
		}
	}

	/**
	 * 소스 및 타겟 건수 조회
	 * 
	 * @param listObject
	 * @return
	 */
	private int getSize(List<Object> listObject) {
		int size = -1;
		try {
			if (listObject.get(0) instanceof DsScheduleData) {
				DsScheduleData d = (DsScheduleData) listObject.get(0);
				size = d.getShiftPatternOrActivityOrActivitySLA().size();
			} else if (listObject.get(0) instanceof DsModelling) {
				DsModelling d = (DsModelling) listObject.get(0);
				size = d.getRamUpdateOrRAMResourceOrRAMResourceDivision()
						.size();
			} else {
				size = listObject.size();
			}
		} catch (Exception e) {
			size = -1;
		}
		return size;
	}

	/**
	 * eventType : 4: 데이터변환 시작, 5: 데이터변환 종료
	 * 
	 * return new EventLogVo instance <br />
	 * 
	 * @param sourceId
	 * @param type
	 * @param methodName
	 * 
	 * @return
	 */
	private EventLogVo getEventLogVo(IntglDataVo intglVo, int eventType,
			String methodName) {
		EventLogVo vo = new EventLogVo();
		vo.setEventId(intglVo.getEventId());
		vo.setEventSender(intglVo.getSender());
		vo.setEventReceiver(intglVo.getReceiver());
		vo.setEventVsType(intglVo.getVsType());
		vo.setEventSourceId(intglVo.getSourceId());
		vo.setEventType(eventType);
		vo.setEventClass(this.getClass().getSimpleName());
		// vo.setEventMethod(new
		// Throwable().getStackTrace()[1].getMethodName());
		vo.setEventMethod(methodName);
		vo.setEventIp(null);
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		return vo;
	}
}
