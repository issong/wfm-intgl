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

import com.kt.oss.wmIntgl.eventhandler.dao.bt360.Event360ServiceDao;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.ApplicationInstanceTask;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.ApplicationInstanceTaskVo;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.SessionVo;

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
public class Event360Service {

	@Autowired
	private Event360ServiceDao event360ServiceDao;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public List<ApplicationInstanceTaskVo> selectApplicationInstanceTask(
			ApplicationInstanceTask vo) {
		return event360ServiceDao.selectApplicationInstanceTask(vo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param vo
	 * @return
	 */
	public List<SessionVo> selectSession(SessionVo vo) {
		return event360ServiceDao.selectSession(vo);
	}
}
