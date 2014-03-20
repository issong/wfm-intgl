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
 * yngwie          2013. 1. 28.      First Draft.
 */
package com.kt.oss.wmIntgl.common.base.webservice;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kt.oss.wmIntgl.common.base.dao.BaseWebserviceDao;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 28.
 * @see
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring/context/context-aspect.xml",
		"classpath:spring/context/context-common.xml",
		"classpath:spring/context/context-datasource.xml",
		"classpath:spring/context/context-ehcache.xml",
		"classpath:spring/context/context-interceptor.xml",
		"classpath:spring/context/context-jms-legacy.xml",
		"classpath:spring/context/context-jms-scheduler.xml",
		"classpath:spring/context/context-mail.xml",
		"classpath:spring/context/context-mybatis.xml",
		"classpath:spring/context/context-properties.xml",
		"classpath:spring/context/context-servlet.xml",
		"classpath:spring/context/context-transaction.xml",
		"classpath:spring/context/context-webservice.xml" })
public class BaseWebServiceTest {

	@Autowired
	private BaseWebserviceDao baseWebserviceDao;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("logging.directory", "C:/BitOss/Temp/Log");
		System.setProperty("wfm.server.type", "local");
		System.setProperty("server", "local-PC");
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<String> result = baseWebserviceDao.selectAcceptedClientIp("D");
		System.err.println("1=" + result);

		result = baseWebserviceDao.selectAcceptedClientIp("D");
		System.err.println("2=" + result);

		// try {
		// Thread.sleep(1000 * 40);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		result = baseWebserviceDao.selectAcceptedClientIp("T");
		System.err.println("3=" + result);

		result = baseWebserviceDao.selectAcceptedClientIp("D");
		System.err.println("4=" + result);
	}

}
