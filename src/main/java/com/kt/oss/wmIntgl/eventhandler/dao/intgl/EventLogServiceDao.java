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
package com.kt.oss.wmIntgl.eventhandler.dao.intgl;

import java.util.List;

import org.springframework.stereotype.Repository;

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
@Repository
public interface EventLogServiceDao {

	int writeEventLog(EventLogVo vo);

	int updateEventLog(EventLogVo vo);

	int writeEventDetailLog(EventLogVo vo);

	int writeOllehMapLog(OllehMapLogVo vo);

	int updateOllehMapLog(OllehMapLogVo vo);

	long getEventId();

	long getOllehMapEventId();

	List<EventLogVo> getEventLogDate(EventLogVo vo);

	List<EventLogVo> getEventLogList(EventLogVo vo);

	EventLogVo getEventLogDetail(EventLogVo vo);

	List<EventStatusVo> getEventStatusList(EventStatusVo vo);

	List<OllehMapLogVo> getOllehMapLogList(OllehMapLogVo vo);

	OllehMapLogVo getOllehMapLogDetail(OllehMapLogVo vo);

	List<EventBoardVo> getEventBoardSumList(EventBoardVo vo);

	List<EventBoardVo> getEventBoardCountList(EventBoardVo vo);

	List<EventBoardVo> getCsctList(EventBoardVo vo);

	List<EventLogVo> getCsctBatchStatus(EventLogVo vo);
}
