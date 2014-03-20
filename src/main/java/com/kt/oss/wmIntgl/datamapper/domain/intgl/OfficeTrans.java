package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;

public class OfficeTrans implements Serializable {

	private static final long serialVersionUID = -1795747414504780686L;

	private String sourceCd;
	private String targetCd;

	public String getSourceCd() {
		return sourceCd;
	}

	public void setSourceCd(String sourceCd) {
		this.sourceCd = sourceCd;
	}

	public String getTargetCd() {
		return targetCd;
	}

	public void setTargetCd(String targetCd) {
		this.targetCd = targetCd;
	}
}
