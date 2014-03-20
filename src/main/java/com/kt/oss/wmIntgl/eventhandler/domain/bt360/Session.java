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

import java.io.Serializable;

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
public class Session implements Serializable {

	private String organisationId;
	private String userId;
	private String startDatetime;
	private String endDatetime;
	private String externalTaskId;
	private String lastAccess;
	private String lastOperation;
	private String clientId;
	private String clientData;
	private String applicationTypeId;
	private String externalDatabaseId;

	public String getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
	}

	public String getEndDatetime() {
		return endDatetime;
	}

	public void setEndDatetime(String endDatetime) {
		this.endDatetime = endDatetime;
	}

	public String getExternalTaskId() {
		return externalTaskId;
	}

	public void setExternalTaskId(String externalTaskId) {
		this.externalTaskId = externalTaskId;
	}

	public String getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
	}

	public String getLastOperation() {
		return lastOperation;
	}

	public void setLastOperation(String lastOperation) {
		this.lastOperation = lastOperation;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientData() {
		return clientData;
	}

	public void setClientData(String clientData) {
		this.clientData = clientData;
	}

	public String getApplicationTypeId() {
		return applicationTypeId;
	}

	public void setApplicationTypeId(String applicationTypeId) {
		this.applicationTypeId = applicationTypeId;
	}

	public String getExternalDatabaseId() {
		return externalDatabaseId;
	}

	public void setExternalDatabaseId(String externalDatabaseId) {
		this.externalDatabaseId = externalDatabaseId;
	}

}
