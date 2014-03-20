package com.kt.oss.wmIntgl.integration.neosswm2intgl.domain;

import java.io.Serializable;

public class InputReferenceData implements Serializable {

	private static final long serialVersionUID = -1132674412713660543L;

	private String vsType;
	private String dsType;
	private String tsType;
	private String irDate;
	private String irTime;

	public String getVsType() {
		return vsType;
	}

	public void setVsType(String vsType) {
		this.vsType = vsType;
	}

	public String getDsType() {
		return dsType;
	}

	public void setDsType(String dsType) {
		this.dsType = dsType;
	}

	public String getTsType() {
		return tsType;
	}

	public void setTsType(String tsType) {
		this.tsType = tsType;
	}

	public String getIrDate() {
		return irDate;
	}

	public void setIrDate(String irDate) {
		this.irDate = irDate;
	}

	public String getIrTime() {
		return irTime;
	}

	public void setIrTime(String irTime) {
		this.irTime = irTime;
	}
}
