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
 * yngwie          2012. 11. 8.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.intgl2scheduler.dao;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 8.
 * @see
 * 
 */
@Repository
public interface Intgl2SchedulerDao {

	WMMapping360IoVo select360IoServerIp(WMMapping360IoVo param);
}
