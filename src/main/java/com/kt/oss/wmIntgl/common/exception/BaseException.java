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
 * yngwie          2012. 10. 24.      First Draft.
 */
package com.kt.oss.wmIntgl.common.exception;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 24.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class BaseException extends Exception {

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}
}
