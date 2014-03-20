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
 * yngwie          2013. 1. 10.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.domain.bt360;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 10.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class ApplicationInstanceTaskVo extends ApplicationInstanceTask {

	private String searchApplicationInstanceId;
	private String searchExternalTaskId;
	private String searchApplicationTypeId;

	public String getSearchApplicationInstanceId() {
		return searchApplicationInstanceId;
	}

	public void setSearchApplicationInstanceId(
			String searchApplicationInstanceId) {
		this.searchApplicationInstanceId = searchApplicationInstanceId;
	}

	public String getSearchExternalTaskId() {
		return searchExternalTaskId;
	}

	public void setSearchExternalTaskId(String searchExternalTaskId) {
		this.searchExternalTaskId = searchExternalTaskId;
	}

	public String getSearchApplicationTypeId() {
		return searchApplicationTypeId;
	}

	public void setSearchApplicationTypeId(String searchApplicationTypeId) {
		this.searchApplicationTypeId = searchApplicationTypeId;
	}

}
