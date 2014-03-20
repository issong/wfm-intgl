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
 * yngwie          2012. 11. 12.      First Draft.
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
 * @date 2012. 11. 12.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMDeleteResourceInfoParam")
public class WMDeleteResourceInfoParam implements Serializable {
	private static final long serialVersionUID = 7944706621552074978L;
	private String workerId;
	private String officeScodes;

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getOfficeScodes() {
		return officeScodes;
	}

	public void setOfficeScodes(String officeScodes) {
		this.officeScodes = officeScodes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMDeleteResourceInfoParam [workerId=");
		builder.append(workerId);
		builder.append(",\r\n officeScodes=");
		builder.append(officeScodes);
		builder.append("]");
		return builder.toString();
	}

}
