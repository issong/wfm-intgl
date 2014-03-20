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
 * yngwie          2013. 1. 24.      First Draft.
 */
package com.kt.oss.wmIntgl.reprocess.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 24.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class WMWorkOrderKeyParamExt implements Serializable {

	private WMWorkOrderKeyParam order;
	private ScenarioType vsType;
	private String sourceId;
	private String sourceDt;

	private Timestamp ilRecvDt;
	private Timestamp ilSendDt;

	public WMWorkOrderKeyParam getOrder() {
		return order;
	}

	public void setOrder(WMWorkOrderKeyParam order) {
		this.order = order;
	}

	public ScenarioType getVsType() {
		return vsType;
	}

	public void setVsType(ScenarioType vsType) {
		this.vsType = vsType;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceDt() {
		return sourceDt;
	}

	public void setSourceDt(String sourceDt) {
		this.sourceDt = sourceDt;
	}

	public Timestamp getIlRecvDt() {
		return ilRecvDt;
	}

	public void setIlRecvDt(Timestamp ilRecvDt) {
		this.ilRecvDt = ilRecvDt;
	}

	public Timestamp getIlSendDt() {
		return ilSendDt;
	}

	public void setIlSendDt(Timestamp ilSendDt) {
		this.ilSendDt = ilSendDt;
	}

}
