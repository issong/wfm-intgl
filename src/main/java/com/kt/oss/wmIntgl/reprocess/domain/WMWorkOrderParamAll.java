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
 * yngwie          2013. 2. 1.      First Draft.
 */
package com.kt.oss.wmIntgl.reprocess.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 2. 1.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class WMWorkOrderParamAll implements Serializable {

	private WMWorkOrderStatusParam vs3;
	private WMWorkOrderParam vs5;
	private WMWorkOrderKeyParam vs8;

	private ScenarioType vsType;
	private String sourceId;
	private String sourceDt;

	private Timestamp ilRecvDt;
	private Timestamp ilSendDt;

	public WMWorkOrderParam getVs5() {
		return vs5;
	}

	public void setVs5(WMWorkOrderParam vs5) {
		this.vs5 = vs5;
	}

	public WMWorkOrderKeyParam getVs8() {
		return vs8;
	}

	public void setVs8(WMWorkOrderKeyParam vs8) {
		this.vs8 = vs8;
	}

	public WMWorkOrderStatusParam getVs3() {
		return vs3;
	}

	public void setVs3(WMWorkOrderStatusParam vs3) {
		this.vs3 = vs3;
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
