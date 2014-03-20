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
package com.kt.oss.wmIntgl.eventhandler.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.ApplicationInstanceTask;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.ApplicationInstanceTaskVo;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.SessionVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventBoardVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventReprocessVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventStatusVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.OllehMapLogVo;
import com.kt.oss.wmIntgl.eventhandler.service.Event360Service;
import com.kt.oss.wmIntgl.eventhandler.service.EventLogService;
import com.kt.oss.wmIntgl.eventhandler.service.EventReprocessService;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Component
public class EventHandlerFacade {
	@Autowired
	private Event360Service event360Service;

	@Autowired
	private EventLogService eventLogService;

	@Autowired
	private EventReprocessService eventReprocessService;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return int
	 */
	public int writeEventLog(EventLogVo vo) {
		return eventLogService.writeEventLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int updateEventLog(EventLogVo vo) {
		return eventLogService.updateEventLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return int
	 */
	public int writeEventDetailLog(EventLogVo vo) {
		return eventLogService.writeEventDetailLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int writeOllehMapLog(OllehMapLogVo vo) {
		return eventLogService.writeOllehMapLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int updateOllehMapLog(OllehMapLogVo vo) {
		return eventLogService.updateOllehMapLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	public long getEventId() {
		return eventLogService.getEventId();
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventLogVo> getEventLogDate(EventLogVo vo) {
		return eventLogService.getEventLogDate(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventLogVo> getEventLogList(EventLogVo vo) {
		return eventLogService.getEventLogList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public EventLogVo getEventLogDetail(EventLogVo vo) {
		return eventLogService.getEventLogDetail(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventStatusVo> getEventStatusList(EventStatusVo vo) {
		return eventLogService.getEventStatusList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	public long getOllehMapEventId() {
		return eventLogService.getOllehMapEventId();
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<OllehMapLogVo> getOllehMapLogList(OllehMapLogVo vo) {
		return eventLogService.getOllehMapLogList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public OllehMapLogVo getOllehMapLogDetail(OllehMapLogVo vo) {
		return eventLogService.getOllehMapLogDetail(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventId
	 * @return
	 */
	public EventStatus runEventReprocess(int eventId) {
		return eventReprocessService.runEventReprocess(eventId);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	public boolean writeEventReprocess(IntglDataVo intglVo) {
		return eventReprocessService.writeEventReprocess(intglVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventReprocessListVo
	 * @return
	 */
	public List<EventReprocessVo> getEventReprocessList(
			EventReprocessVo eventReprocessListVo) {
		return eventReprocessService
				.getEventReprocessList(eventReprocessListVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public List<ApplicationInstanceTaskVo> selectApplicationInstanceTask(
			ApplicationInstanceTask vo) {
		return event360Service.selectApplicationInstanceTask(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventBoardVo> getEventBoardSumList(EventBoardVo vo) {
		return eventLogService.getEventBoardSumList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventBoardVo> getEventBoardCountList(EventBoardVo vo) {
		return eventLogService.getEventBoardCountList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param vo
	 * @return
	 */
	public List<EventBoardVo> getCsctList(EventBoardVo vo) {
		return eventLogService.getCsctList(vo);
	}

	public List<EventLogVo> getCsctBatchStatus(EventLogVo vo) {
		return eventLogService.getCsctBatchStatus(vo);
	}

	public List<SessionVo> selectSession(SessionVo vo) {
		return event360Service.selectSession(vo);
	}
}
