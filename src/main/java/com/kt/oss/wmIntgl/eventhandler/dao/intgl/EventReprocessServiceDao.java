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
 * yngwie          2012. 11. 14.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.dao.intgl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventReprocessVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 14.
 * @see
 * 
 */
@Repository
public interface EventReprocessServiceDao {

	int writeEventReprocess(EventReprocessVo eventReprocessVo);

	List<EventReprocessVo> selectEventReprocessList(
			EventReprocessVo eventReprocessVo);

	EventReprocessVo selectEventReprocess(int eventId);

	int updateEventReprocessCount(int eventId);

	int updateEventReprocessStatus(EventReprocessVo eventReprocessVo);
}
