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
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
@Repository
public interface Scheduler2IntglProviderDao {

	String selectDispatchFlag(@Param("csctId") String csctId,
			@Param("envType") String envType);
}
