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
 * yngwie          2012. 11. 14.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.domain.intgl;

import java.io.Serializable;
import java.util.Date;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 14.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class EventReprocess implements Serializable {
	private int reprocessCnt;
	private Integer reprocessStatus;
	private Object reprocessData;
	private byte[] reprocessDataBytes;
	private Date lastReprocessDt;
	private String lastReprocessDtStr;

	private long eventId;
	private String eventIdStr;
	private String eventSender;
	private String eventReceiver;
	private ScenarioType eventVsType;
	private String eventVsTypeStr;
	private String eventSourceId;
	private int eventType;
	private String eventTypeStr;
	private String eventClass;
	private String eventMethod;
	// private EventStatus eventStatus;
	private String eventStatusStr;
	private String eventRoute;
	private String eventMsg;
	private Date eventDt;
	private String eventDtStr;
	private String eventIp;
	private String eventHostIp;
	private String eventHostName;

	public byte[] getReprocessDataBytes() {
		return reprocessDataBytes;
	}

	public void setReprocessDataBytes(byte[] reprocessDataBytes) {
		this.reprocessDataBytes = reprocessDataBytes;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public int getReprocessCnt() {
		return reprocessCnt;
	}

	public void setReprocessCnt(int reprocessCnt) {
		this.reprocessCnt = reprocessCnt;
	}

	public Integer getReprocessStatus() {
		return reprocessStatus;
	}

	public void setReprocessStatus(Integer reprocessStatus) {
		this.reprocessStatus = reprocessStatus;
	}

	public Object getReprocessData() {
		return reprocessData;
	}

	public void setReprocessData(Object reprocessData) {
		this.reprocessData = reprocessData;
	}

	public Date getLastReprocessDt() {
		return lastReprocessDt;
	}

	public void setLastReprocessDt(Date lastReprocessDt) {
		this.lastReprocessDt = lastReprocessDt;
	}

	public String getLastReprocessDtStr() {
		return lastReprocessDtStr;
	}

	public void setLastReprocessDtStr(String lastReprocessDtStr) {
		this.lastReprocessDtStr = lastReprocessDtStr;
	}

	public String getEventIdStr() {
		return eventIdStr;
	}

	public void setEventIdStr(String eventIdStr) {
		this.eventIdStr = eventIdStr;
	}

	public String getEventSender() {
		return eventSender;
	}

	public void setEventSender(String eventSender) {
		this.eventSender = eventSender;
	}

	public String getEventReceiver() {
		return eventReceiver;
	}

	public void setEventReceiver(String eventReceiver) {
		this.eventReceiver = eventReceiver;
	}

	public ScenarioType getEventVsType() {
		return eventVsType;
	}

	public void setEventVsType(ScenarioType eventVsType) {
		this.eventVsType = eventVsType;
	}

	public String getEventVsTypeStr() {
		return eventVsTypeStr;
	}

	public void setEventVsTypeStr(String eventVsTypeStr) {
		this.eventVsTypeStr = eventVsTypeStr;
	}

	public String getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(String eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getEventTypeStr() {
		return eventTypeStr;
	}

	public void setEventTypeStr(String eventTypeStr) {
		this.eventTypeStr = eventTypeStr;
	}

	public String getEventClass() {
		return eventClass;
	}

	public void setEventClass(String eventClass) {
		this.eventClass = eventClass;
	}

	public String getEventMethod() {
		return eventMethod;
	}

	public void setEventMethod(String eventMethod) {
		this.eventMethod = eventMethod;
	}

	// public EventStatus getEventStatus() {
	// return eventStatus;
	// }
	//
	// public void setEventStatus(EventStatus eventStatus) {
	// this.eventStatus = eventStatus;
	// }

	public String getEventStatusStr() {
		return eventStatusStr;
	}

	public void setEventStatusStr(String eventStatusStr) {
		this.eventStatusStr = eventStatusStr;
	}

	public String getEventRoute() {
		return eventRoute;
	}

	public void setEventRoute(String eventRoute) {
		this.eventRoute = eventRoute;
	}

	public String getEventMsg() {
		return eventMsg;
	}

	public void setEventMsg(String eventMsg) {
		this.eventMsg = eventMsg;
	}

	public Date getEventDt() {
		return eventDt;
	}

	public void setEventDt(Date eventDt) {
		this.eventDt = eventDt;
	}

	public String getEventDtStr() {
		return eventDtStr;
	}

	public void setEventDtStr(String eventDtStr) {
		this.eventDtStr = eventDtStr;
	}

	public String getEventIp() {
		return eventIp;
	}

	public void setEventIp(String eventIp) {
		this.eventIp = eventIp;
	}

	public String getEventHostIp() {
		return eventHostIp;
	}

	public void setEventHostIp(String eventHostIp) {
		this.eventHostIp = eventHostIp;
	}

	public String getEventHostName() {
		return eventHostName;
	}

	public void setEventHostName(String eventHostName) {
		this.eventHostName = eventHostName;
	}

}
