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
 * yngwie          2012. 10. 24.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.neosswm2intgl.domain;

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
 * @date 2012. 10. 24.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMWorkOrderStatusParam")
public class WMWorkOrderStatusParam implements Serializable {
	private String workType;
	private String officeScode;
	private String workOdrNum;
	private String odrNum;
	private String ttId;
	private String workProgState;
	private String workProcState;
	private String bt360AddWorkProgState;
	private String workStateDt;
	private String duration;
	private String highlight;
	private String reason;
	private String reasonValue;
	private String bt360FixedOdrYn;
	private String bt360FixedWorkerId;
	private String bt360FixedVisitDt;

	private String bt360LogOnOffState;
	private String bt360LogOnOffDt;
	private String bt360LogOnOffWorkerId;
	private String bt360CommitValue;

	public String getBt360CommitValue() {
		return bt360CommitValue;
	}

	public void setBt360CommitValue(String bt360CommitValue) {
		this.bt360CommitValue = bt360CommitValue;
	}

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getOfficeScode() {
		return officeScode;
	}

	public void setOfficeScode(String officeScode) {
		this.officeScode = officeScode;
	}

	public String getWorkOdrNum() {
		return workOdrNum;
	}

	public void setWorkOdrNum(String workOdrNum) {
		this.workOdrNum = workOdrNum;
	}

	public String getTtId() {
		return ttId;
	}

	public void setTtId(String ttId) {
		this.ttId = ttId;
	}

	public String getWorkProgState() {
		return workProgState;
	}

	public void setWorkProgState(String workProgState) {
		this.workProgState = workProgState;
	}

	public String getWorkProcState() {
		return workProcState;
	}

	public void setWorkProcState(String workProcState) {
		this.workProcState = workProcState;
	}

	public String getBt360AddWorkProgState() {
		return bt360AddWorkProgState;
	}

	public void setBt360AddWorkProgState(String bt360AddWorkProgState) {
		this.bt360AddWorkProgState = bt360AddWorkProgState;
	}

	public String getWorkStateDt() {
		return workStateDt;
	}

	public void setWorkStateDt(String workStateDt) {
		this.workStateDt = workStateDt;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getHighlight() {
		return highlight;
	}

	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonValue() {
		return reasonValue;
	}

	public void setReasonValue(String reasonValue) {
		this.reasonValue = reasonValue;
	}

	public String getBt360FixedOdrYn() {
		return bt360FixedOdrYn;
	}

	public void setBt360FixedOdrYn(String bt360FixedOdrYn) {
		this.bt360FixedOdrYn = bt360FixedOdrYn;
	}

	public String getBt360FixedWorkerId() {
		return bt360FixedWorkerId;
	}

	public void setBt360FixedWorkerId(String bt360FixedWorkerId) {
		this.bt360FixedWorkerId = bt360FixedWorkerId;
	}

	public String getBt360FixedVisitDt() {
		return bt360FixedVisitDt;
	}

	public void setBt360FixedVisitDt(String bt360FixedVisitDt) {
		this.bt360FixedVisitDt = bt360FixedVisitDt;
	}

	public String getBt360LogOnOffState() {
		return bt360LogOnOffState;
	}

	public void setBt360LogOnOffState(String bt360LogOnOffState) {
		this.bt360LogOnOffState = bt360LogOnOffState;
	}

	public String getBt360LogOnOffDt() {
		return bt360LogOnOffDt;
	}

	public void setBt360LogOnOffDt(String bt360LogOnOffDt) {
		this.bt360LogOnOffDt = bt360LogOnOffDt;
	}

	public String getBt360LogOnOffWorkerId() {
		return bt360LogOnOffWorkerId;
	}

	public void setBt360LogOnOffWorkerId(String bt360LogOnOffWorkerId) {
		this.bt360LogOnOffWorkerId = bt360LogOnOffWorkerId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMWorkOrderStatusParam [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("\r\n, workOdrNum=");
		builder.append(workOdrNum);
		builder.append("\r\n, odrNum=");
		builder.append(odrNum);
		builder.append("\r\n, ttId=");
		builder.append(ttId);
		builder.append("\r\n, workProgState=");
		builder.append(workProgState);
		builder.append("\r\n, workProcState=");
		builder.append(workProcState);
		builder.append("\r\n, bt360AddWorkProgState=");
		builder.append(bt360AddWorkProgState);
		builder.append("\r\n, workStateDt=");
		builder.append(workStateDt);
		builder.append("\r\n, duration=");
		builder.append(duration);
		builder.append("\r\n, highlight=");
		builder.append(highlight);
		builder.append("\r\n, reason=");
		builder.append(reason);
		builder.append("\r\n, reasonValue=");
		builder.append(reasonValue);
		builder.append("\r\n, bt360FixedOdrYn=");
		builder.append(bt360FixedOdrYn);
		builder.append("\r\n, bt360FixedWorkerId=");
		builder.append(bt360FixedWorkerId);
		builder.append("\r\n, bt360FixedVisitDt=");
		builder.append(bt360FixedVisitDt);
		builder.append("\r\n, bt360LogOnOffState=");
		builder.append(bt360LogOnOffState);
		builder.append("\r\n, bt360LogOnOffDt=");
		builder.append(bt360LogOnOffDt);
		builder.append("\r\n, bt360LogOnOffWorkerId=");
		builder.append(bt360LogOnOffWorkerId);
		builder.append("\r\n, bt360CommitValue=");
		builder.append(bt360CommitValue);
		builder.append("]");
		return builder.toString();
	}

}
