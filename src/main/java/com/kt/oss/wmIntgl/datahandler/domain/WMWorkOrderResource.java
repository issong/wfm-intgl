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
 * yngwie          2012. 10. 19.      First Draft.
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
 * @date 2012. 10. 19.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMWorkOrderResource")
public class WMWorkOrderResource implements Serializable {

	private String workType;
	private String officeScode;
	private String workOdrNum;
	private String odrNum;
	private String ttId;
	private String workerId;
	private String workProgState;
	private String workProcState;
	private String bt360AddWorkProgState;

	private XMLGregorianCalendar bt360WorkStartDt;
	private XMLGregorianCalendar bt360WorkEndDt;
	private int bt360FixedOdrYn;
	private XMLGregorianCalendar bt360FixedVisitDt;
	private Double bt360CommitValue;
	private XMLGregorianCalendar bt360DatetimeStatus;
	private XMLGregorianCalendar ilDateTimeStamp;
	private String csctID;
	private String bt360PlanId;

	public String getBt360PlanId() {
		return bt360PlanId;
	}

	public void setBt360PlanId(String bt360PlanId) {
		this.bt360PlanId = bt360PlanId;
	}

	public XMLGregorianCalendar getBt360WorkStartDt() {
		return bt360WorkStartDt;
	}

	public void setBt360WorkStartDt(XMLGregorianCalendar bt360WorkStartDt) {
		this.bt360WorkStartDt = bt360WorkStartDt;
	}

	public XMLGregorianCalendar getBt360WorkEndDt() {
		return bt360WorkEndDt;
	}

	public void setBt360WorkEndDt(XMLGregorianCalendar bt360WorkEndDt) {
		this.bt360WorkEndDt = bt360WorkEndDt;
	}

	public String getCsctID() {
		return csctID;
	}

	public void setCsctID(String csctID) {
		this.csctID = csctID;
	}

	public XMLGregorianCalendar getBt360DatetimeStatus() {
		return bt360DatetimeStatus;
	}

	public void setBt360DatetimeStatus(XMLGregorianCalendar bt360DatetimeStatus) {
		this.bt360DatetimeStatus = bt360DatetimeStatus;
	}

	public XMLGregorianCalendar getIlDateTimeStamp() {
		return ilDateTimeStamp;
	}

	public void setIlDateTimeStamp(XMLGregorianCalendar ilDateTimeStamp) {
		this.ilDateTimeStamp = ilDateTimeStamp;
	}

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
	}

	public String getBt360AddWorkProgState() {
		return bt360AddWorkProgState;
	}

	public void setBt360AddWorkProgState(String bt360AddWorkProgState) {
		this.bt360AddWorkProgState = bt360AddWorkProgState;
	}

	public int getBt360FixedOdrYn() {
		return bt360FixedOdrYn;
	}

	public void setBt360FixedOdrYn(int bt360FixedOdrYn) {
		this.bt360FixedOdrYn = bt360FixedOdrYn;
	}

	public String getWorkProcState() {
		return workProcState;
	}

	public void setWorkProcState(String workProcState) {
		this.workProcState = workProcState;
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

	public XMLGregorianCalendar getBt360FixedVisitDt() {
		return bt360FixedVisitDt;
	}

	public void setBt360FixedVisitDt(XMLGregorianCalendar bt360FixedVisitDt) {
		this.bt360FixedVisitDt = bt360FixedVisitDt;
	}

	public Double getBt360CommitValue() {
		return bt360CommitValue;
	}

	public void setBt360CommitValue(Double bt360CommitValue) {
		this.bt360CommitValue = bt360CommitValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMWorkOrderResource [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("\r\n, workOdrNum=");
		builder.append(workOdrNum);
		builder.append("\r\n, odrNum=");
		builder.append(odrNum);
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
		builder.append("\r\n, bt360WorkStartDt=");
		builder.append(bt360WorkStartDt);
		builder.append("\r\n, bt360WorkEndDt=");
		builder.append(bt360WorkEndDt);
		builder.append("\r\n, bt360FixedOdrYn=");
		builder.append(bt360FixedOdrYn);
		builder.append("\r\n, bt360FixedVisitDt=");
		builder.append(bt360FixedVisitDt);
		builder.append("\r\n, bt360CommitValue=");
		builder.append(bt360CommitValue);
		builder.append("\r\n, bt360DatetimeStatus=");
		builder.append(bt360DatetimeStatus);
		builder.append("\r\n, ilDateTimeStamp=");
		builder.append(ilDateTimeStamp);
		builder.append("\r\n, csctID=");
		builder.append(csctID);
		builder.append("\r\n, bt360PlanId=");
		builder.append(bt360PlanId);
		builder.append("]");
		return builder.toString();
	}

}
