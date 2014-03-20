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

import java.io.Serializable;

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
public class ApplicationInstanceTask implements Serializable {

	private String applicationInstanceId;
	private String organisationId;
	private String externalTaskId;
	private String manuallyAssigned;
	private String externalDatabaseId;
	private String applicationTypeId;

	public String getApplicationInstanceId() {
		return applicationInstanceId;
	}

	public void setApplicationInstanceId(String applicationInstanceId) {
		this.applicationInstanceId = applicationInstanceId;
	}

	public String getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}

	public String getExternalTaskId() {
		return externalTaskId;
	}

	public void setExternalTaskId(String externalTaskId) {
		this.externalTaskId = externalTaskId;
	}

	public String getManuallyAssigned() {
		return manuallyAssigned;
	}

	public void setManuallyAssigned(String manuallyAssigned) {
		this.manuallyAssigned = manuallyAssigned;
	}

	public String getExternalDatabaseId() {
		return externalDatabaseId;
	}

	public void setExternalDatabaseId(String externalDatabaseId) {
		this.externalDatabaseId = externalDatabaseId;
	}

	public String getApplicationTypeId() {
		return applicationTypeId;
	}

	public void setApplicationTypeId(String applicationTypeId) {
		this.applicationTypeId = applicationTypeId;
	}

}
