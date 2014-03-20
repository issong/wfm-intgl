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
package com.kt.oss.wmIntgl.datahandler.facade;

import java.util.concurrent.Future;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.service.LegacyDataHandlerService;
import com.kt.oss.wmIntgl.datahandler.service.SchedulerDataHandlerService;

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
public class DataHandlerFacade {
	@Autowired
	private LegacyDataHandlerService legacyDataHandlerService;
	@Autowired
	private SchedulerDataHandlerService schedulerDataHandlerService;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws JMSException
	 */
	public void trans360ToIntglSendData(IntglDataVo intglVo)
			throws JMSException {

		schedulerDataHandlerService.trans360ToIntglSendData(intglVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	public EventStatus transIntglToLegacySendData(IntglDataVo intglVo)
			throws Exception {

		Future<EventStatus> result = legacyDataHandlerService
				.transIntglToLegacySendData(intglVo);

		return result.get();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	public EventStatus transIntglToLegacySendDataSync(IntglDataVo intglVo) {

		return legacyDataHandlerService.transIntglToLegacySendDataSync(intglVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws JMSException
	 */
	public void transLegacyToIntglSendData(IntglDataVo intglVo)
			throws JMSException {
		legacyDataHandlerService.transLegacyToIntglSendData(intglVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws Exception
	 */
	public EventStatus transIntglTo360SendData(IntglDataVo intglVo)
			throws Exception {
		Future<EventStatus> result = schedulerDataHandlerService
				.transIntglTo360SendData(intglVo);

		return result.get();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws Exception
	 */
	public EventStatus transIntglTo360SendDataSync(IntglDataVo intglVo)
			throws Exception {
		return schedulerDataHandlerService.transIntglTo360SendDataSync(intglVo);
	}

}
