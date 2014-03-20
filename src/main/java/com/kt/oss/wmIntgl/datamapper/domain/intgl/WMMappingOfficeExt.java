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

import java.io.Serializable;

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
public class WMMappingOfficeExt implements Serializable {

	private static final long serialVersionUID = -4081814966185830684L;
	private String officeCd;
	private Double latitude;
	private Double longitude;

	public String getOfficeCd() {
		return officeCd;
	}

	public void setOfficeCd(String officeCd) {
		this.officeCd = officeCd;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
