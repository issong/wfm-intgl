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
public class EventReprocessVo extends EventReprocess {

	// EventLogVo eventLogVo = null;

	public EventReprocessVo() {
		super();
		// eventLogVo = new EventLogVo();
	}

	private int searchReprocessStatus;
	private String searchFromDt;
	private String searchToDt;
	private String searchPage; // extjs mapping
	private String searchStart; // extjs mapping
	private String searchLimit; // extjs mapping
	private int pageNum; // extjs mapping
	private int totalPage; // extjs mapping

	private int eventStatus;

	public int getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(int eventStatus) {
		this.eventStatus = eventStatus;
	}

	public int getSearchReprocessStatus() {
		return searchReprocessStatus;
	}

	public void setSearchReprocessStatus(int searchReprocessStatus) {
		this.searchReprocessStatus = searchReprocessStatus;
	}

	public String getSearchFromDt() {
		return searchFromDt;
	}

	public void setSearchFromDt(String searchFromDt) {
		this.searchFromDt = searchFromDt;
	}

	public String getSearchToDt() {
		return searchToDt;
	}

	public void setSearchToDt(String searchToDt) {
		this.searchToDt = searchToDt;
	}

	public String getSearchPage() {
		return searchPage;
	}

	public void setSearchPage(String searchPage) {
		this.searchPage = searchPage;
	}

	public String getSearchStart() {
		return searchStart;
	}

	public void setSearchStart(String searchStart) {
		this.searchStart = searchStart;
	}

	public String getSearchLimit() {
		return searchLimit;
	}

	public void setSearchLimit(String searchLimit) {
		this.searchLimit = searchLimit;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	// public String getEventHostName() {
	// return eventLogVo.getEventHostName();
	// }
	//
	// public void setEventHostName(String eventHostName) {
	// eventLogVo.setEventHostName(eventHostName);
	// }
	//
	// public String getEventHostIp() {
	// return eventLogVo.getEventHostIp();
	// }
	//
	// public void setEventHostIp(String eventHostIp) {
	// eventLogVo.setEventHostIp(eventHostIp);
	// }
	//
	// public String getEventIp() {
	// return eventLogVo.getEventIp();
	// }
	//
	// public void setEventIp(String eventIp) {
	// eventLogVo.setEventIp(eventIp);
	// }
	//
	// public long getEventId() {
	// return eventLogVo.getEventId();
	// }
	//
	// public void setEventId(long eventId) {
	// eventLogVo.setEventId(eventId);
	// }
	//
	// public String getEventSender() {
	// return eventLogVo.getEventSender();
	// }
	//
	// public void setEventSender(String eventSender) {
	// eventLogVo.setEventSender(eventSender);
	// }
	//
	// public String getEventReceiver() {
	// return eventLogVo.getEventReceiver();
	// }
	//
	// public void setEventReceiver(String eventReceiver) {
	// eventLogVo.setEventReceiver(eventReceiver);
	// }
	//
	// public ScenarioType getEventVsType() {
	// return eventLogVo.getEventVsType();
	// }
	//
	// public void setEventVsType(ScenarioType eventVsType) {
	// eventLogVo.setEventVsType(eventVsType);
	// }
	//
	// public int getEventType() {
	// return eventLogVo.getEventType();
	// }
	//
	// public void setEventType(int eventType) {
	// eventLogVo.setEventType(eventType);
	// }
	//
	// public String getEventClass() {
	// return eventLogVo.getEventClass();
	// }
	//
	// public void setEventClass(String eventClass) {
	// eventLogVo.setEventClass(eventClass);
	// }
	//
	// public String getEventMethod() {
	// return eventLogVo.getEventMethod();
	// }
	//
	// public void setEventMethod(String eventMethod) {
	// eventLogVo.setEventMethod(eventMethod);
	// }
	//
	// public String getEventRoute() {
	// return eventLogVo.getEventRoute();
	// }
	//
	// public void setEventRoute(String eventRoute) {
	// eventLogVo.setEventRoute(eventRoute);
	// }
	//
	// public String getEventMsg() {
	// if (eventLogVo.getEventMsg() == null) {
	// eventLogVo.setEventMsg("");
	// }
	// return eventLogVo.getEventMsg();
	// }
	//
	// public void setEventMsg(String eventMsg) {
	// eventLogVo.setEventMsg(eventMsg);
	// }
	//
	// public Date getEventDt() {
	// return eventLogVo.getEventDt();
	// }
	//
	// public void setEventDt(Date eventDt) {
	// eventLogVo.setEventDt(eventDt);
	// }
	//
	// public String getEventSourceId() {
	// return eventLogVo.getEventSourceId();
	// }
	//
	// public void setEventSourceId(String eventSourceId) {
	// eventLogVo.setEventSourceId(eventSourceId);
	// }
	//
	// public String getEventVsTypeStr() {
	// return eventLogVo.getEventVsTypeStr();
	// }
	//
	// public void setEventVsTypeStr(String eventVsTypeStr) {
	// eventLogVo.setEventVsTypeStr(eventVsTypeStr);
	// }
	//
	// public String getEventDtStr() {
	// return eventLogVo.getEventDtStr();
	// }
	//
	// public void setEventDtStr(String eventDtStr) {
	// eventLogVo.setEventDtStr(eventDtStr);
	// }
	//
	// public String getEventStatusStr() {
	// return eventLogVo.getEventStatusStr();
	// }
	//
	// public void setEventStatusStr(String eventStatusStr) {
	// eventLogVo.setEventStatusStr(eventStatusStr);
	// }
	//
	// public String getSearchPage() {
	// return eventLogVo.getSearchPage();
	// }
	//
	// public void setSearchPage(String searchPage) {
	// eventLogVo.setSearchPage(searchPage);
	// }
	//
	// public String getSearchStart() {
	// return eventLogVo.getSearchStart();
	// }
	//
	// public void setSearchStart(String searchStart) {
	// eventLogVo.setSearchStart(searchStart);
	// }
	//
	// public String getSearchLimit() {
	// return eventLogVo.getSearchLimit();
	// }
	//
	// public void setSearchLimit(String searchLimit) {
	// eventLogVo.setSearchLimit(searchLimit);
	// }
	//
	// public int getPageNum() {
	// return eventLogVo.getPageNum();
	// }
	//
	// public void setPageNum(int pageNum) {
	// eventLogVo.setPageNum(pageNum);
	// }
	//
	// public int getTotalPage() {
	// return eventLogVo.getTotalPage();
	// }
	//
	// public void setTotalPage(int totalPage) {
	// eventLogVo.setTotalPage(totalPage);
	// }
}
