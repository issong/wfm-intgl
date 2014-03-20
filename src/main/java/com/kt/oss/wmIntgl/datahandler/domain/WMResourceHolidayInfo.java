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
 * yngwie          2013. 1. 2.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 2.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMResourceHolidayInfo")
public class WMResourceHolidayInfo implements Serializable {

	private static final long serialVersionUID = 4977860582033789474L;
	private String workerId;
	private String eventDate;
	private String HolidayTcode;
	private String HolidayAcode;

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getHolidayTcode() {
		return HolidayTcode;
	}

	public void setHolidayTcode(String holidayTcode) {
		HolidayTcode = holidayTcode;
	}

	public String getHolidayAcode() {
		return HolidayAcode;
	}

	public void setHolidayAcode(String holidayAcode) {
		HolidayAcode = holidayAcode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMResourceHolidayInfo [workerId=");
		builder.append(workerId);
		builder.append(",\r\n eventDate=");
		builder.append(eventDate);
		builder.append(",\r\n HolidayTcode=");
		builder.append(HolidayTcode);
		builder.append(",\r\n HolidayAcode=");
		builder.append(HolidayAcode);
		builder.append("]");
		return builder.toString();
	}

}
