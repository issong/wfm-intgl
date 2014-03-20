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
 * yngwie          2012. 11. 30.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 30.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMAppointmentOfferResponse")
public class WMAppointmentOfferResponse implements Serializable {

	private static final long serialVersionUID = 2270248849447517754L;

	/**
	 * 0 : fail, 1 : success
	 */
	private int resultCode;

	/**
	 * process result message
	 */
	private String resultMsg;

	private List<WMAppointmentOfferParam> wmAppointmentOfferParams;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public List<WMAppointmentOfferParam> getWmAppointmentOfferParams() {
		if (wmAppointmentOfferParams == null) {
			wmAppointmentOfferParams = new ArrayList<WMAppointmentOfferParam>();
		}
		return wmAppointmentOfferParams;
	}

	public void setWmAppointmentOfferParams(
			List<WMAppointmentOfferParam> wmAppointmentOfferParams) {
		this.wmAppointmentOfferParams = wmAppointmentOfferParams;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAppointmentOfferResponse [resultCode=");
		builder.append(resultCode);
		builder.append("\r\n, resultMsg=");
		builder.append(resultMsg);
		builder.append("\r\n, wmAppointmentOfferParams=");
		builder.append(wmAppointmentOfferParams);
		builder.append("]");
		return builder.toString();
	}
}
