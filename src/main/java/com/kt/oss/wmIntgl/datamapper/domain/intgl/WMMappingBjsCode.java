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
 * yngwie          2012. 11. 21.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;
import java.util.Date;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 21.
 * @see
 * 
 */
public class WMMappingBjsCode implements Serializable {

	private static final long serialVersionUID = -680113173769819388L;
	private String dongCode;
	private String bjCd;
	private String bjNm;
	private Double latitude;
	private Double longitude;
	private Date changeDt;

	public String getDongCode() {
		return dongCode;
	}

	public void setDongCode(String dongCode) {
		this.dongCode = dongCode;
	}

	public String getBjCd() {
		return bjCd;
	}

	public void setBjCd(String bjCd) {
		this.bjCd = bjCd;
	}

	public String getBjNm() {
		return bjNm;
	}

	public void setBjNm(String bjNm) {
		this.bjNm = bjNm;
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

	public Date getChangeDt() {
		return changeDt;
	}

	public void setChangeDt(Date changeDt) {
		this.changeDt = changeDt;
	}
}
