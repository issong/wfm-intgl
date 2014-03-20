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
public class WMMappingBjsCodeVo extends WMMappingBjsCode {

	private static final long serialVersionUID = -4756611250677881885L;

	private String searchDongCode;

	private String officeCd;
	private String officeNm;
	private String fullAddr;

	private int seq;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getFullAddr() {
		return fullAddr;
	}

	public void setFullAddr(String fullAddr) {
		this.fullAddr = fullAddr;
	}

	public String getOfficeCd() {
		return officeCd;
	}

	public void setOfficeCd(String officeCd) {
		this.officeCd = officeCd;
	}

	public String getOfficeNm() {
		return officeNm;
	}

	public void setOfficeNm(String officeNm) {
		this.officeNm = officeNm;
	}

	public String getSearchDongCode() {
		return searchDongCode;
	}

	public void setSearchDongCode(String searchDongCode) {
		this.searchDongCode = searchDongCode;
	}

}
