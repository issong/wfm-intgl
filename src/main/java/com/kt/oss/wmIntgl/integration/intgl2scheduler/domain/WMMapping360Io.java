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

import java.io.Serializable;
import java.sql.Timestamp;

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
public class WMMapping360Io implements Serializable {

	private static final long serialVersionUID = -5981454728985098318L;
	private String csctId;
	private String envType;
	private String threeSixtyIOServerIp;
	private String vs1ProcStatus;
	private Timestamp vs1LastProcDt;

	public String getVs1ProcStatus() {
		return vs1ProcStatus;
	}

	public void setVs1ProcStatus(String vs1ProcStatus) {
		this.vs1ProcStatus = vs1ProcStatus;
	}

	public Timestamp getVs1LastProcDt() {
		return vs1LastProcDt;
	}

	public void setVs1LastProcDt(Timestamp vs1LastProcDt) {
		this.vs1LastProcDt = vs1LastProcDt;
	}

	public String getCsctId() {
		return csctId;
	}

	public void setCsctId(String csctId) {
		this.csctId = csctId;
	}

	public String getEnvType() {
		return envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
	}

	public String getThreeSixtyIOServerIp() {
		return threeSixtyIOServerIp;
	}

	public void setThreeSixtyIOServerIp(String threeSixtyIOServerIp) {
		this.threeSixtyIOServerIp = threeSixtyIOServerIp;
	}

}
