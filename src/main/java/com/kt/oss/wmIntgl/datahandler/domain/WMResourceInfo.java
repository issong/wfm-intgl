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
 * yngwie          2012. 11. 6.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

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
 * @date 2012. 11. 6.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMResourceInfo")
public class WMResourceInfo implements Serializable {

	private String officeScodes;
	private String workerId;
	private String startOfficeScode;
	private String endOfficeScode;
	private String workerSurName;
	private String workerFirstName;
	private String companyTypeCode;
	private String description;
	private String contactDetails;
	private String grade;

	private List<WMWorkTeam> wMWorkTeams;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public List<WMWorkTeam> getwMWorkTeams() {
		if (wMWorkTeams == null) {
			wMWorkTeams = new ArrayList<WMWorkTeam>();
		}
		return wMWorkTeams;
	}

	public void setwMWorkTeams(List<WMWorkTeam> wMWorkTeams) {
		this.wMWorkTeams = wMWorkTeams;
	}

	public String getCompanyTypeCode() {
		return companyTypeCode;
	}

	public void setCompanyTypeCode(String companyTypeCode) {
		this.companyTypeCode = companyTypeCode;
	}

	public String getOfficeScodes() {
		return officeScodes;
	}

	public void setOfficeScodes(String officeScodes) {
		this.officeScodes = officeScodes;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getStartOfficeScode() {
		return startOfficeScode;
	}

	public void setStartOfficeScode(String startOfficeScode) {
		this.startOfficeScode = startOfficeScode;
	}

	public String getEndOfficeScode() {
		return endOfficeScode;
	}

	public void setEndOfficeScode(String endOfficeScode) {
		this.endOfficeScode = endOfficeScode;
	}

	public String getWorkerSurName() {
		return workerSurName;
	}

	public void setWorkerSurName(String workerSurName) {
		this.workerSurName = workerSurName;
	}

	public String getWorkerFirstName() {
		return workerFirstName;
	}

	public void setWorkerFirstName(String workerFirstName) {
		this.workerFirstName = workerFirstName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMResourceInfo [officeScodes=");
		builder.append(officeScodes);
		builder.append("\r\n, workerId=");
		builder.append(workerId);
		builder.append("\r\n, startOfficeScode=");
		builder.append(startOfficeScode);
		builder.append("\r\n, endOfficeScode=");
		builder.append(endOfficeScode);
		builder.append("\r\n, workerSurName=");
		builder.append(workerSurName);
		builder.append("\r\n, workerFirstName=");
		builder.append(workerFirstName);
		builder.append("\r\n, companyTypeCode=");
		builder.append(companyTypeCode);
		builder.append("\r\n, description=");
		builder.append(description);
		builder.append("\r\n, contactDetails=");
		builder.append(contactDetails);
		builder.append("\r\n, grade=");
		builder.append(grade);
		builder.append("\r\n, wMWorkTeams=");
		builder.append(wMWorkTeams);
		builder.append("]");
		return builder.toString();
	}

}
