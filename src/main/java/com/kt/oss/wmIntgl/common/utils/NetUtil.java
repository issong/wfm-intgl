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
 * yngwie          2012. 11. 9.      First Draft.
 */
package com.kt.oss.wmIntgl.common.utils;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 9.
 * @see
 * 
 */
public class NetUtil {

	private static String address;
	private static String name;

	private static String svrName;

	public static String getSvrName() {
		return svrName;
	}

	public static void setSvrName(String svrName) {
		NetUtil.svrName = svrName;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		NetUtil.address = address;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		NetUtil.name = name;
	}

	/**
	 * get localhost address <br />
	 * 
	 * 
	 * @return
	 */
	public static String getLocalAddr() {
		return address;
	}

	/**
	 * get localhost name <br />
	 * 
	 * 
	 * @return
	 */
	public static String getLocalName() {
		return name + "[" + svrName + "]";
	}
}
