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
package com.kt.oss.wmIntgl.eventhandler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.eventhandler.dao.intgl.EventLogServiceDao;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventBoardVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventStatusVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.OllehMapLogVo;

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
@Service
public class EventLogService {

	@Autowired
	private EventLogServiceDao eventLogServiceDao;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return int
	 */
	public int writeEventLog(EventLogVo vo) {
		return eventLogServiceDao.writeEventLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int updateEventLog(EventLogVo vo) {
		return eventLogServiceDao.updateEventLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return int
	 */
	public int writeEventDetailLog(EventLogVo vo) {
		return eventLogServiceDao.writeEventDetailLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int writeOllehMapLog(OllehMapLogVo vo) {
		return eventLogServiceDao.writeOllehMapLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public int updateOllehMapLog(OllehMapLogVo vo) {
		return eventLogServiceDao.updateOllehMapLog(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	public long getEventId() {
		return eventLogServiceDao.getEventId();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	public long getOllehMapEventId() {
		return eventLogServiceDao.getOllehMapEventId();
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventLogVo> getEventLogDate(EventLogVo vo) {
		return eventLogServiceDao.getEventLogDate(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventLogVo> getEventLogList(EventLogVo vo) {
		return eventLogServiceDao.getEventLogList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public EventLogVo getEventLogDetail(EventLogVo vo) {
		return eventLogServiceDao.getEventLogDetail(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventStatusVo> getEventStatusList(EventStatusVo vo) {
		return eventLogServiceDao.getEventStatusList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<OllehMapLogVo> getOllehMapLogList(OllehMapLogVo vo) {
		return eventLogServiceDao.getOllehMapLogList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public OllehMapLogVo getOllehMapLogDetail(OllehMapLogVo vo) {
		return eventLogServiceDao.getOllehMapLogDetail(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventBoardVo> getEventBoardSumList(EventBoardVo vo) {
		return eventLogServiceDao.getEventBoardSumList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventBoardVo> getEventBoardCountList(EventBoardVo vo) {
		return eventLogServiceDao.getEventBoardCountList(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * @param param
	 * @return
	 */
	public List<EventBoardVo> getCsctList(EventBoardVo vo) {
		return eventLogServiceDao.getCsctList(vo);
	}
	
	public List<EventLogVo> getCsctBatchStatus(EventLogVo vo) {
		return eventLogServiceDao.getCsctBatchStatus(vo);
	}
}
