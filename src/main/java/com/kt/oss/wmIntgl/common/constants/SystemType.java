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
 * yngwie          2012. 10. 29.      First Draft.
 */
package com.kt.oss.wmIntgl.common.constants;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 29.
 * @see
 * 
 */
public enum SystemType {

	NeOSS("NeOSS") // NeOSS
	, ICIS("ICIS") // ICIS
	, Scheduling360("360") // 360 Scheduling
	, INTGL("INTGL") // Integreation Layer
	;

	/**
	 * @param text
	 */
	private SystemType(final String s) {
		this.stringValue = s;
	}

	private final String stringValue;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return stringValue;
	}
}
