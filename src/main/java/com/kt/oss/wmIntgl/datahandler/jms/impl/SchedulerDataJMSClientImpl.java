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
package com.kt.oss.wmIntgl.datahandler.jms.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.transaction.annotation.Transactional;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.jms.SchedulerDataJMSClient;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

/**
 * send 360 Data to Queue <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
public class SchedulerDataJMSClientImpl extends JmsGatewaySupport implements
		SchedulerDataJMSClient {

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Transactional
	@Override
	public void sendData(final IntglDataVo vo) throws JMSException {
		try {
			getJmsTemplate().send(new MessageCreator() {
				@Override
				public Message createMessage(Session session)
						throws JMSException {
					ObjectMessage message = session.createObjectMessage();

					message.setObject(vo);
					return message;
				}
			});
			insertLog(vo, EventStatus.SUCCES);
		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
			insertLog(vo, EventStatus.ERROR_JMS);
			throw new JMSException(StringUtil.getStackTrace(e));
		}
	}

	/**
	 * insert into TB_WM_EVENTLOG <br />
	 * 
	 * 
	 * @param intglVo
	 */
	/**
	 * insert into TB_WM_EVENTLOG <br />
	 * 
	 * 
	 * @param intglVo
	 */
	private void insertLog(final IntglDataVo intglVo, EventStatus eventStatus) {
		EventLogVo vo = new EventLogVo();

		vo.setEventId(intglVo.getEventId());
		vo.setEventSender(intglVo.getSender());
		vo.setEventReceiver(intglVo.getReceiver());
		vo.setEventVsType(intglVo.getVsType());
		vo.setEventSourceId(intglVo.getSourceId());
		vo.setEventType(2);
		vo.setEventStatus(eventStatus);
		vo.setEventClass(getClass().getSimpleName());
		vo.setEventMethod("sendData");
		vo.setEventHostName(NetUtil.getLocalName());
		vo.setEventHostIp(NetUtil.getLocalAddr());

		eventHandlerFacade.writeEventLog(vo);
	}
}
