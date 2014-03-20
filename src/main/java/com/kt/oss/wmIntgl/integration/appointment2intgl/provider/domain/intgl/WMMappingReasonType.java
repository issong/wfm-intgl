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
 * yngwie          2013. 2. 7.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl;

import java.io.Serializable;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 2. 7.
 * @see
 * 
 */
public class WMMappingReasonType implements Serializable {

	private static final long serialVersionUID = -6814377502640578200L;
	private String reasonTypeId;
	private String description;
	private String explanation;

	public String getReasonTypeId() {
		return reasonTypeId;
	}

	public void setReasonTypeId(String reasonTypeId) {
		this.reasonTypeId = reasonTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

}
