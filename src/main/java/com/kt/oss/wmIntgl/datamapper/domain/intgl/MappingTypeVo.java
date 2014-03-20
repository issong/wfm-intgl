package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.util.Date;

/**
 * 이 VO는 테스트중에 InputReference 및 SourceData, SourceDataParameter 의 데이터를 처리하기위해
 * 테스트용으로 만들어진 VO이다
 */
public class MappingTypeVo extends MappingType {

	private static final long serialVersionUID = -8479525553682270673L;

	private String dsPostfix;
	private Date irSourceDt;

	public String getDsPostfix() {
		return dsPostfix;
	}

	public void setDsPostfix(String dsPostfix) {
		this.dsPostfix = dsPostfix;
	}

	public Date getIrSourceDt() {
		return irSourceDt;
	}

	public void setIrSourceDt(Date irSourceDt) {
		this.irSourceDt = irSourceDt;
	}
}
