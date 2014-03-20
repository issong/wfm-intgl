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
package com.kt.oss.wmIntgl.datahandler.jms.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;

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
public class LegacyDataConverter implements MessageConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.jms.support.converter.MessageConverter#toMessage(
	 * java.lang.Object, javax.jms.Session)
	 */
	@Override
	public Message toMessage(Object object, Session session)
			throws JMSException, MessageConversionException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.jms.support.converter.MessageConverter#fromMessage
	 * (javax.jms.Message)
	 */
	@Override
	public Object fromMessage(Message message) throws JMSException,
			MessageConversionException {

		ObjectMessage objectMessage = (ObjectMessage) message;

		IntglDataVo data = (IntglDataVo) objectMessage.getObject();

		return data;
	}

}
