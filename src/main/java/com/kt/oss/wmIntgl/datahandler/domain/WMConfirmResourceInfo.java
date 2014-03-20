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
 * yngwie          2012. 12. 11.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

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
 * @date 2012. 12. 11.
 * @see
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMConfirmResourceInfo")
public class WMConfirmResourceInfo implements Serializable {
	private static final long serialVersionUID = 1728523784154629177L;
	private String workerId;
	private String dispatchCount;
	private String companyTypeCode;

	public String getCompanyTypeCode() {
		return companyTypeCode;
	}

	public void setCompanyTypeCode(String companyTypeCode) {
		this.companyTypeCode = companyTypeCode;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getDispatchCount() {
		return dispatchCount;
	}

	public void setDispatchCount(String dispatchCount) {
		this.dispatchCount = dispatchCount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMConfirmResourceInfo [workerId=");
		builder.append(workerId);
		builder.append("\r\n, dispatchCount=");
		builder.append(dispatchCount);
		builder.append("\r\n, companyTypeCode=");
		builder.append(companyTypeCode);
		builder.append("]");
		return builder.toString();
	}
}
