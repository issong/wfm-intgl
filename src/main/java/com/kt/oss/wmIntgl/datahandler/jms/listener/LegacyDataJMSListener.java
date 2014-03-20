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
package com.kt.oss.wmIntgl.datahandler.jms.listener;

import org.springframework.beans.factory.annotation.Autowired;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.service.SchedulerDataHandlerService;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

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
public class LegacyDataJMSListener {

	@Autowired
	private SchedulerDataHandlerService schedulerDataHandlerService;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	/**
	 * extract data from queue to SchedulerDataHandlerService <br />
	 * 
	 * 
	 * @param intglVo
	 * @throws Exception
	 */
	public void receiveData(IntglDataVo intglVo) {
		insertLog(intglVo);
		schedulerDataHandlerService.transIntglTo360SendData(intglVo);
	}

	/**
	 * insert into TB_WM_EVENTLOG <br />
	 * 
	 * 
	 * @param intglVo
	 */
	private void insertLog(final IntglDataVo intglVo) {
		EventLogVo vo = new EventLogVo();

		vo.setEventId(intglVo.getEventId());
		vo.setEventSender(intglVo.getSender());
		vo.setEventReceiver(intglVo.getReceiver());
		vo.setEventVsType(intglVo.getVsType());
		vo.setEventSourceId(intglVo.getSourceId());
		vo.setEventType(3);
		vo.setEventStatus(EventStatus.SUCCES);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventMethod("receiveData");
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		eventHandlerFacade.writeEventLog(vo);
	}
}
