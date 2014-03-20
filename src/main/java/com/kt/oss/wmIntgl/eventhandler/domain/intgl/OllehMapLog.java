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
 * yngwie          2012. 11. 12.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.domain.intgl;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 12.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class OllehMapLog implements Serializable {
	private String eventAddr;
	private double eventLatitude;
	private double eventLongitude;
	private String eventResult;
	private Timestamp eventStartDt;
	private Timestamp eventEndDt;
	private String eventStartDtStr;
	private String eventEndDtStr;
	private String eventCsctCd;
	private String eventOfficeCd;
	private long eventId;
	private String eventIdStr;
	private String eventResultSource;
	private String eventMsg;

	private long seq;

	private String eventHostIp;

	public String getEventHostIp() {
		return eventHostIp;
	}

	public void setEventHostIp(String eventHostIp) {
		this.eventHostIp = eventHostIp;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getEventMsg() {
		return eventMsg;
	}

	public void setEventMsg(String eventMsg) {
		this.eventMsg = eventMsg;
	}

	public String getEventResultSource() {
		return eventResultSource;
	}

	public void setEventResultSource(String eventResultSource) {
		this.eventResultSource = eventResultSource;
	}

	public String getEventOfficeCd() {
		return eventOfficeCd;
	}

	public void setEventOfficeCd(String eventOfficeCd) {
		this.eventOfficeCd = eventOfficeCd;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getEventCsctCd() {
		return eventCsctCd;
	}

	public void setEventCsctCd(String eventCsctCd) {
		this.eventCsctCd = eventCsctCd;
	}

	public String getEventAddr() {
		return eventAddr;
	}

	public void setEventAddr(String eventAddr) {
		this.eventAddr = eventAddr;
	}

	public double getEventLatitude() {
		return eventLatitude;
	}

	public void setEventLatitude(double eventLatitude) {
		this.eventLatitude = eventLatitude;
	}

	public double getEventLongitude() {
		return eventLongitude;
	}

	public void setEventLongitude(double eventLongitude) {
		this.eventLongitude = eventLongitude;
	}

	public String getEventResult() {
		return eventResult;
	}

	public void setEventResult(String eventResult) {
		this.eventResult = eventResult;
	}

	public Timestamp getEventStartDt() {
		return eventStartDt;
	}

	public void setEventStartDt(Timestamp eventStartDt) {
		this.eventStartDt = eventStartDt;
	}

	public Timestamp getEventEndDt() {
		return eventEndDt;
	}

	public void setEventEndDt(Timestamp eventEndDt) {
		this.eventEndDt = eventEndDt;
	}

	public String getEventStartDtStr() {
		return eventStartDtStr;
	}

	public void setEventStartDtStr(String eventStartDtStr) {
		this.eventStartDtStr = eventStartDtStr;
	}

	public String getEventEndDtStr() {
		return eventEndDtStr;
	}

	public void setEventEndDtStr(String eventEndDtStr) {
		this.eventEndDtStr = eventEndDtStr;
	}

	public String getEventIdStr() {
		return eventIdStr;
	}

	public void setEventIdStr(String eventIdStr) {
		this.eventIdStr = eventIdStr;
	}

}
