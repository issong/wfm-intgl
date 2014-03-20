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
@XmlRootElement(name = "wMAppointmentCancelParam")
public class WMAppointmentCancelParam implements Serializable {

	private static final long serialVersionUID = -547151481711247207L;
	private String workType;
	private String officeScode;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAppointmentCancelParam [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("]");
		return builder.toString();
	}

}
