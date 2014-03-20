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
 * @date 2012. 11. 20.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMCustomExceptionParam")
public class WMCustomExceptionParam implements Serializable {

	private static final long serialVersionUID = -9070261259941262649L;

	private String bt360ExceptionType;
	private String workType;
	private String officeScode;
	private String workOdrNum;
	private String odrNum;
	private String ttId;
	private String workerId;
	private String bt360Label;
	private String bt360Value;
	private String useStatusChange;
	private String workProgState;
	private String workProcState;
	private String bt360AddWorkProgState;

	public String getBt360Label() {
		return bt360Label;
	}

	public void setBt360Label(String bt360Label) {
		this.bt360Label = bt360Label;
	}

	public String getBt360Value() {
		return bt360Value;
	}

	public void setBt360Value(String bt360Value) {
		this.bt360Value = bt360Value;
	}

	public String getBt360ExceptionType() {
		return bt360ExceptionType;
	}

	public void setBt360ExceptionType(String bt360ExceptionType) {
		this.bt360ExceptionType = bt360ExceptionType;
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

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
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

	public String getUseStatusChange() {
		return useStatusChange;
	}

	public void setUseStatusChange(String useStatusChange) {
		this.useStatusChange = useStatusChange;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMCustomExceptionParam [bt360ExceptionType=");
		builder.append(bt360ExceptionType);
		builder.append("\r\n, workType=");
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
		builder.append("\r\n, bt360Label=");
		builder.append(bt360Label);
		builder.append("\r\n, bt360Value=");
		builder.append(bt360Value);
		builder.append("\r\n, useStatusChange=");
		builder.append(useStatusChange);
		builder.append("\r\n, workProgState=");
		builder.append(workProgState);
		builder.append("\r\n, workProcState=");
		builder.append(workProcState);
		builder.append("\r\n, bt360AddWorkProgState=");
		builder.append(bt360AddWorkProgState);
		builder.append("]");
		return builder.toString();
	}

}
