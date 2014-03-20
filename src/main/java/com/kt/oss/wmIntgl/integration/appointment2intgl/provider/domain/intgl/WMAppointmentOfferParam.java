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
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl;

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
 * @date 2012. 11. 20.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMAppointmentOfferParam")
public class WMAppointmentOfferParam implements Serializable {

	private static final long serialVersionUID = 2662209877317807468L;
	private String appointmentRequestId;
	private String offerId;
	private String offerStartDt;
	private String offerEndDt;
	private String offerValue;
	private String available;
	private String reasonType;
	private String slotId;
	private String planId;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public String getReasonType() {
		return reasonType;
	}

	public void setReasonType(String reasonType) {
		this.reasonType = reasonType;
	}

	public String getAppointmentRequestId() {
		return appointmentRequestId;
	}

	public void setAppointmentRequestId(String appointmentRequestId) {
		this.appointmentRequestId = appointmentRequestId;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getOfferStartDt() {
		return offerStartDt;
	}

	public void setOfferStartDt(String offerStartDt) {
		this.offerStartDt = offerStartDt;
	}

	public String getOfferEndDt() {
		return offerEndDt;
	}

	public void setOfferEndDt(String offerEndDt) {
		this.offerEndDt = offerEndDt;
	}

	public String getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(String offerValue) {
		this.offerValue = offerValue;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAppointmentOfferParam [appointmentRequestId=");
		builder.append(appointmentRequestId);
		builder.append("\r\n, offerId=");
		builder.append(offerId);
		builder.append("\r\n, offerStartDt=");
		builder.append(offerStartDt);
		builder.append("\r\n, offerEndDt=");
		builder.append(offerEndDt);
		builder.append("\r\n, offerValue=");
		builder.append(offerValue);
		builder.append("\r\n, available=");
		builder.append(available);
		builder.append("\r\n, reasonType=");
		builder.append(reasonType);
		builder.append("\r\n, slotId=");
		builder.append(slotId);
		builder.append("\r\n, planId=");
		builder.append(planId);
		builder.append("]");
		return builder.toString();
	}

}
