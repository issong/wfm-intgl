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
 * yngwie          2012. 10. 15.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

import java.io.Serializable;

import com.kt.oss.wmIntgl.common.constants.ScenarioType;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
public class IntglData implements Serializable {

	private static final long serialVersionUID = 7350972741294252153L;

	/**
	 * Sending System Name for example, NEOSS, ICIS
	 * 
	 */
	private String sender;

	/**
	 * receiving System Name
	 * 
	 */
	private String receiver;

	/**
	 * receiving System Address
	 * 
	 */
	private String route;

	/**
	 * Validation Scenario Type
	 * 
	 */
	private ScenarioType vsType;

	/**
	 * Custom defined additional Message
	 * 
	 */
	private String techMsgData;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public ScenarioType getVsType() {
		return vsType;
	}

	public void setVsType(ScenarioType vsType) {
		this.vsType = vsType;
	}

	public String getTechMsgData() {
		return techMsgData;
	}

	public void setTechMsgData(String techMsgData) {
		this.techMsgData = techMsgData;
	}

}
