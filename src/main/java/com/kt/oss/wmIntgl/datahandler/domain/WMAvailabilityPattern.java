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
 * yngwie          2012. 11. 20.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 20.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMAvailabilityPattern")
public class WMAvailabilityPattern implements Serializable {
	private String slotId;
	private XMLGregorianCalendar periodStartDt;
	private XMLGregorianCalendar periodEndDt;
	private String dayPattern;
	private String openTime;
	private String closeTime;

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public XMLGregorianCalendar getPeriodStartDt() {
		return periodStartDt;
	}

	public void setPeriodStartDt(XMLGregorianCalendar periodStartDt) {
		this.periodStartDt = periodStartDt;
	}

	public XMLGregorianCalendar getPeriodEndDt() {
		return periodEndDt;
	}

	public void setPeriodEndDt(XMLGregorianCalendar periodEndDt) {
		this.periodEndDt = periodEndDt;
	}

	public String getDayPattern() {
		return dayPattern;
	}

	public void setDayPattern(String dayPattern) {
		this.dayPattern = dayPattern;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAvailabilityPattern [slotId=");
		builder.append(slotId);
		builder.append("\r\n, periodStartDt=");
		builder.append(periodStartDt);
		builder.append("\r\n, periodEndDt=");
		builder.append(periodEndDt);
		builder.append("\r\n, dayPattern=");
		builder.append(dayPattern);
		builder.append("\r\n, openTime=");
		builder.append(openTime);
		builder.append("\r\n, closeTime=");
		builder.append(closeTime);
		builder.append("]");
		return builder.toString();
	}

}
