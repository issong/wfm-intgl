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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMAppointmentOffer")
public class WMAppointmentOffer implements Serializable {

	private static final long serialVersionUID = -8293549457067937235L;
	private String appointmentRequestId;
	private int offerId;
	private XMLGregorianCalendar offerStartDt;
	private XMLGregorianCalendar offerEndDt;
	private double offerValue;
	private boolean available;
	private String reasonType;

	private String slotId;

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

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public XMLGregorianCalendar getOfferStartDt() {
		return offerStartDt;
	}

	public void setOfferStartDt(XMLGregorianCalendar offerStartDt) {
		this.offerStartDt = offerStartDt;
	}

	public XMLGregorianCalendar getOfferEndDt() {
		return offerEndDt;
	}

	public void setOfferEndDt(XMLGregorianCalendar offerEndDt) {
		this.offerEndDt = offerEndDt;
	}

	public double getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(double offerValue) {
		this.offerValue = offerValue;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAppointmentOffer [appointmentRequestId=");
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
		builder.append("]");
		return builder.toString();
	}

}
