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
package com.kt.oss.wmIntgl.integration.intgl2neosswm.client.domain;

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
@XmlRootElement(name = "wMWorkOrderResourceParam")
public class WMWorkOrderResourceParam implements Serializable {
	private String workType;
	private String officeScode;
	private String workOdrNum;
	private String ttId;
	private String workerId;
	private String workProgState;
	private String workProcState;
	private String bt360AddWorkProgState;

	private String workStateDt;
	private String bt360VisitDt;
	private String bt360FixedOdrYn;
	private String bt360FixedVisitDt;
	private String bt360CommitValue;

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

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
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

	public String getBt360VisitDt() {
		return bt360VisitDt;
	}

	public void setBt360VisitDt(String bt360VisitDt) {
		this.bt360VisitDt = bt360VisitDt;
	}

	public String getBt360FixedOdrYn() {
		return bt360FixedOdrYn;
	}

	public void setBt360FixedOdrYn(String bt360FixedOdrYn) {
		this.bt360FixedOdrYn = bt360FixedOdrYn;
	}

	public String getBt360FixedVisitDt() {
		return bt360FixedVisitDt;
	}

	public void setBt360FixedVisitDt(String bt360FixedVisitDt) {
		this.bt360FixedVisitDt = bt360FixedVisitDt;
	}

	public String getBt360CommitValue() {
		return bt360CommitValue;
	}

	public void setBt360CommitValue(String bt360CommitValue) {
		this.bt360CommitValue = bt360CommitValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WMWorkOrderResourceParam [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("\r\n, workOdrNum=");
		builder.append(workOdrNum);
		builder.append("\r\n, ttId=");
		builder.append(ttId);
		builder.append("\r\n, workerId=");
		builder.append(workerId);
		builder.append("\r\n, workProgState=");
		builder.append(workProgState);
		builder.append("\r\n, workProcState=");
		builder.append(workProcState);
		builder.append("\r\n, bt360AddWorkProgState=");
		builder.append(bt360AddWorkProgState);
		builder.append("\r\n, workStateDt=");
		builder.append(workStateDt);
		builder.append("\r\n, bt360VisitDt=");
		builder.append(bt360VisitDt);
		builder.append("\r\n, bt360FixedOdrYn=");
		builder.append(bt360FixedOdrYn);
		builder.append("\r\n, bt360FixedVisitDt=");
		builder.append(bt360FixedVisitDt);
		builder.append("\r\n, bt360CommitValue=");
		builder.append(bt360CommitValue);
		builder.append("]");
		return builder.toString();
	}

}
