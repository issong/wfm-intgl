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
package com.kt.oss.wmIntgl.integration.intgl2scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.dao.Intgl2SchedulerDao;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;

/**
 * Integration Layer Service <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 8.
 * @see
 * 
 */
@Service
public class Intgl2SchedulerService extends BaseService {

	@Autowired
	private Intgl2SchedulerDao intgl2SchedulerDao;

	@Cacheable(cacheName = "mapping360IpCache")
	public WMMapping360IoVo select360IoServerIp(WMMapping360IoVo param) {
		return intgl2SchedulerDao.select360IoServerIp(param);
	}

	@TriggersRemove(cacheName = { "mapping360IpCache" }, removeAll = true)
	public void clearCache() {
	}

}
