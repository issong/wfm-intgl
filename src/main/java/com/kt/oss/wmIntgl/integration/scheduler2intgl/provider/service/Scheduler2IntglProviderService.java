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
 * yngwie          2013. 1. 2.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.dao.Scheduler2IntglProviderDao;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 2.
 * @see
 * 
 */
@Service
public class Scheduler2IntglProviderService extends BaseService {

	@Autowired
	private Scheduler2IntglProviderDao scheduler2IntglProviderDao;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param csctId
	 * @return
	 */
	public String selectDispatchFlag(String csctId, String envType) {
		return scheduler2IntglProviderDao.selectDispatchFlag(csctId, envType);
	}

}
