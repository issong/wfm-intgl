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
 * yngwie          2013. 1. 17.      First Draft.
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
 * @date 2013. 1. 17.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMDivisionInfoParam")
public class WMDivisionInfoParam implements Serializable {
	private static final long serialVersionUID = 3528540561445552934L;
	private String officeScode;
	private String officeName;
	private String workTeamCode;

	public String getOfficeScode() {
		return officeScode;
	}

	public void setOfficeScode(String officeScode) {
		this.officeScode = officeScode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getWorkTeamCode() {
		return workTeamCode;
	}

	public void setWorkTeamCode(String workTeamCode) {
		this.workTeamCode = workTeamCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMDivisionInfoParam [officeScode=");
		builder.append(officeScode);
		builder.append(",\r\n officeName=");
		builder.append(officeName);
		builder.append(",\r\n workTeamCode=");
		builder.append(workTeamCode);
		builder.append("]");
		return builder.toString();
	}

}
