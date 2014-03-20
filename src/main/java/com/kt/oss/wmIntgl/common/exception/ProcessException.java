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
 * yngwie          2012. 11. 15.      First Draft.
 */
package com.kt.oss.wmIntgl.common.exception;


/**
 * during send data to webservice Exception <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 15.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class ProcessException extends BaseException {
	public ProcessException(String message) {
		super(message);
	}

	public ProcessException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
