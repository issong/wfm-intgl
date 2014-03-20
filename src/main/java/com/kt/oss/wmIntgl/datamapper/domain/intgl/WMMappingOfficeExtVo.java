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
 * yngwie          2012. 11. 13.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.domain.intgl;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 13.
 * @see
 * 
 */
public class WMMappingOfficeExtVo extends WMMappingOfficeExt {

	private static final long serialVersionUID = -6110295972613654220L;
	private String searchOfficeCd;

	public String getSearchOfficeCd() {
		return searchOfficeCd;
	}

	public void setSearchOfficeCd(String searchOfficeCd) {
		this.searchOfficeCd = searchOfficeCd;
	}

}
