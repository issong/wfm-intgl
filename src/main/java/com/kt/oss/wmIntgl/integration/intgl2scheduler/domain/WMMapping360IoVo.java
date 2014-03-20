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
 * yngwie          2012. 11. 8.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.intgl2scheduler.domain;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 8.
 * @see
 * 
 */
public class WMMapping360IoVo extends WMMapping360Io {

	private static final long serialVersionUID = 8211640000647886127L;
	private String searchCsctCd;
	private String searchEnvType;

	public String getSearchCsctCd() {
		return searchCsctCd;
	}

	public void setSearchCsctCd(String searchCsctCd) {
		this.searchCsctCd = searchCsctCd;
	}

	public String getSearchEnvType() {
		return searchEnvType;
	}

	public void setSearchEnvType(String searchEnvType) {
		this.searchEnvType = searchEnvType;
	}

}
