package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;

/**
 * 이 VO는 테스트중에 InputReference 및 SourceData, SourceDataParameter 의 데이터를 처리하기위해
 * 테스트용으로 만들어진 VO이다
 */
public class MappingType implements Serializable {

	private static final long serialVersionUID = -6733450539943419437L;

	private String vsType;
	private String dsType;
	private String tsType;
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

	public String getIrTime() {
		return irTime;
	}

	public void setIrTime(String irTime) {
		this.irTime = irTime;
	}
}
