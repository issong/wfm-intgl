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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class IntglDataVo extends IntglData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -98618553377896221L;

	/**
	 * 
	 */
	private List<Object> sourceData;

	/**
	 * 
	 */
	private Date sourceDt;

	/**
	 * OfficeScode = csct_cd (csct_id)
	 */
	private String sourceId;

	/**
	 * 
	 */
	private List<Object> targetData;

	/**
	 * 전송실패건에 대한 재처리 여부 (default : false)
	 */
	private boolean reprocessRequired;

	private long eventId;

	private String appointmentRequestId;

	private String inputReferenceId;

    /**
     * VS1 전송시 360 에 저장된 예약건 재전송 여부 (default : false)
     */
    private boolean reprocessAppointmentOffer;

    public boolean isReprocessAppointmentOffer() {
        return reprocessAppointmentOffer;
    }

    public void setReprocessAppointmentOffer(boolean reprocessAppointmentOffer) {
        this.reprocessAppointmentOffer = reprocessAppointmentOffer;
    }

    public String getInputReferenceId() {
		return inputReferenceId;
	}

	public void setInputReferenceId(String inputReferenceId) {
		this.inputReferenceId = inputReferenceId;
	}

	public String getAppointmentRequestId() {
		return appointmentRequestId;
	}

	public void setAppointmentRequestId(String appointmentRequestId) {
		this.appointmentRequestId = appointmentRequestId;
	}

	public boolean isReprocessRequired() {
		return reprocessRequired;
	}

	public void setReprocessRequired(boolean reprocessRequired) {
		this.reprocessRequired = reprocessRequired;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public List<Object> getSourceData() {
		if (sourceData == null) {
			sourceData = new ArrayList<Object>();
		}
		return sourceData;
	}

	public Date getSourceDt() {
		return sourceDt;
	}

	public String getSourceId() {
		return sourceId;
	}

	public List<Object> getTargetData() {
		if (targetData == null) {
			targetData = new ArrayList<Object>();
		}
		return targetData;
	}

	public void setSourceData(List<Object> sourceData) {
		this.sourceData = sourceData;
	}

	public void setSourceDt(Date sourceDt) {
		this.sourceDt = sourceDt;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public void setTargetData(List<Object> targetData) {
		this.targetData = targetData;
	}

}
