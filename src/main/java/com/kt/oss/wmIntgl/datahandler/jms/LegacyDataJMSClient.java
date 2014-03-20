package com.kt.oss.wmIntgl.datahandler.jms;

import javax.jms.JMSException;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 16.
 * @see
 * 
 */
public interface LegacyDataJMSClient {

	void sendData(final IntglDataVo vo) throws JMSException;
}
