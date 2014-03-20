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
 * yngwie          2012. 11. 29.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl;

import java.sql.Timestamp;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 29.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class WMAppointmentOfferParamVo extends WMAppointmentOfferParam {

	private long eventId;
	private String reasonTypeName;
	private Timestamp sendDt;
	private Timestamp receiveDt;

	private int eventType;
	private String eventMsg;

	/**
	 * EventLogVo type eventId
	 */
	private long logEventId;
	private int logEventType;

	private String searchRequestId;
	private String searchReasonType;

	private String searchCsctId;
	private String searchAppointmentRequestId;
	private String searchInputReferenceId;

	public String getSearchInputReferenceId() {
		return searchInputReferenceId;
	}

	public void setSearchInputReferenceId(String searchInputReferenceId) {
		this.searchInputReferenceId = searchInputReferenceId;
	}

	public String getSearchAppointmentRequestId() {
		return searchAppointmentRequestId;
	}

	public void setSearchAppointmentRequestId(String searchAppointmentRequestId) {
		this.searchAppointmentRequestId = searchAppointmentRequestId;
	}

	public String getSearchCsctId() {
		return searchCsctId;
	}

	public void setSearchCsctId(String searchCsctId) {
		this.searchCsctId = searchCsctId;
	}

	public String getSearchReasonType() {
		return searchReasonType;
	}

	public void setSearchReasonType(String searchReasonType) {
		this.searchReasonType = searchReasonType;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getEventMsg() {
		return eventMsg;
	}

	public void setEventMsg(String eventMsg) {
		this.eventMsg = eventMsg;
	}

	public long getLogEventId() {
		return logEventId;
	}

	public void setLogEventId(long logEventId) {
		this.logEventId = logEventId;
	}

	public long getLogEventType() {
		return logEventType;
	}

	public void setLogEventType(int logEventType) {
		this.logEventType = logEventType;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getReasonTypeName() {
		return reasonTypeName;
	}

	public void setReasonTypeName(String reasonTypeName) {
		this.reasonTypeName = reasonTypeName;
	}

	public Timestamp getSendDt() {
		return sendDt;
	}

	public void setSendDt(Timestamp sendDt) {
		this.sendDt = sendDt;
	}

	public Timestamp getReceiveDt() {
		return receiveDt;
	}

	public void setReceiveDt(Timestamp receiveDt) {
		this.receiveDt = receiveDt;
	}

	public String getSearchRequestId() {
		return searchRequestId;
	}

	public void setSearchRequestId(String searchRequestId) {
		this.searchRequestId = searchRequestId;
	}

}
