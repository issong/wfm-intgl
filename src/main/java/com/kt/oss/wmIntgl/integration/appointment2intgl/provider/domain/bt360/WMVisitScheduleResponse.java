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
 * yngwie          2013. 1. 31.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360;

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
 * @date 2013. 1. 31.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMVisitScheduleResponse")
public class WMVisitScheduleResponse implements Serializable {

	private static final long serialVersionUID = -3803196838941023892L;

	private int resultCode;
	private String resultMsg;
	private String odrNum;
	private String startDt;
	private String endDt;

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

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
	}

	public String getStartDt() {
		return startDt;
	}

	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMVisitScheduleResponse [resultCode=");
		builder.append(resultCode);
		builder.append("\r\n, resultMsg=");
		builder.append(resultMsg);
		builder.append("\r\n, odrNum=");
		builder.append(odrNum);
		builder.append("\r\n, startDt=");
		builder.append(startDt);
		builder.append("\r\n, endDt=");
		builder.append(endDt);
		builder.append("]");
		return builder.toString();
	}

}
