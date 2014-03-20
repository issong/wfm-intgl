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
 * yngwie          2013. 2. 12.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.domain.bt360;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 2. 12.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class SessionVo extends Session {

	private String searchUserId;

	private boolean onlyLoggedUser;

	public boolean isOnlyLoggedUser() {
		return onlyLoggedUser;
	}

	public void setOnlyLoggedUser(boolean onlyLoggedUser) {
		this.onlyLoggedUser = onlyLoggedUser;
	}

	public String getSearchUserId() {
		return searchUserId;
	}

	public void setSearchUserId(String searchUserId) {
		this.searchUserId = searchUserId;
	}

}
