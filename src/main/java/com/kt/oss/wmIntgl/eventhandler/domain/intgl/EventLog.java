package com.kt.oss.wmIntgl.eventhandler.domain.intgl;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.kt.oss.wmIntgl.common.constants.EventStatus;
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
@SuppressWarnings("serial")
public class EventLog implements Serializable {

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
	private EventStatus eventStatus;
	private String eventStatusStr;
	private String eventRoute;
	private String eventMsg;
	private Date eventDt;
	private String eventDtStr;
	private String eventIp;
	private String eventHostIp;
	private String eventHostName;

	private int eventStatusType;
	private int eventDataSize;

	public int getEventDataSize() {
		return eventDataSize;
	}

	public void setEventDataSize(int eventDataSize) {
		this.eventDataSize = eventDataSize;
	}

	public int getEventStatusType() {
		if (eventStatus != null) {
			return eventStatus.getType();
		} else {
			return 0;
		}
	}

	public void setEventStatusType(int eventStatusType) {
		this.eventStatusType = eventStatusType;
	}

	public String getEventHostName() {
		return eventHostName;
	}

	public void setEventHostName(String eventHostName) {
		if (eventHostName != null && StringUtils.length(eventHostName) > 20) {
			eventHostName = StringUtils.substring(eventHostName, 0, 20);
		}
		this.eventHostName = eventHostName;
	}

	public String getEventHostIp() {
		return eventHostIp;
	}

	public void setEventHostIp(String eventHostIp) {
		this.eventHostIp = eventHostIp;
	}

	public String getEventIp() {
		return eventIp;
	}

	public void setEventIp(String eventIp) {
		this.eventIp = eventIp;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
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

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
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

	public EventStatus getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getEventRoute() {
		return eventRoute;
	}

	public void setEventRoute(String eventRoute) {
		this.eventRoute = eventRoute;
	}

	public String getEventMsg() {
		if (eventMsg == null) {
			eventMsg = "";
		}
		return StringUtils.abbreviate(
				StringUtils.removeStart(eventMsg, "\r\n\r\n"), 3000);
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

	public String getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(String eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	public String getEventVsTypeStr() {
		return eventVsTypeStr;
	}

	public void setEventVsTypeStr(String eventVsTypeStr) {
		this.eventVsTypeStr = eventVsTypeStr;
	}

	public String getEventDtStr() {
		return eventDtStr;
	}

	public void setEventDtStr(String eventDtStr) {
		this.eventDtStr = eventDtStr;
	}

	public String getEventStatusStr() {
		return eventStatusStr;
	}

	public void setEventStatusStr(String eventStatusStr) {
		this.eventStatusStr = eventStatusStr;
	}

	public String getEventTypeStr() {
		return eventTypeStr;
	}

	public void setEventTypeStr(String eventTypeStr) {
		this.eventTypeStr = eventTypeStr;
	}

	public String getEventIdStr() {
		return eventIdStr;
	}

	public void setEventIdStr(String eventIdStr) {
		this.eventIdStr = eventIdStr;
	}

}
