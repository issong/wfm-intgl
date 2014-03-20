package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;
import java.util.Date;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 * 
 */
public class ActivityType implements Serializable {

	private static final long serialVersionUID = 2120116102968829233L;

	private String threesixtyodrType;
	private String workType;
	private String svcType;
	private String companyType;
	private String specialCd;
	private String vvipyn;
	private int duration;
	private int ctValue;
	private Date changeDt;
	private String techMethod;

	public String getThreesixtyodrType() {
		return threesixtyodrType;
	}

	public void setThreesixtyodrType(String threesixtyodrType) {
		this.threesixtyodrType = threesixtyodrType;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getSvcType() {
		return svcType;
	}

	public void setSvcType(String svcType) {
		this.svcType = svcType;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getSpecialCd() {
		return specialCd;
	}

	public void setSpecialCd(String specialCd) {
		this.specialCd = specialCd;
	}

	public Date getChangeDt() {
		return changeDt;
	}

	public void setChangeDt(Date changeDt) {
		this.changeDt = changeDt;
	}

	public String getVvipyn() {
		return vvipyn;
	}

	public void setVvipyn(String vvipyn) {
		this.vvipyn = vvipyn;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCtValue() {
		return ctValue;
	}

	public void setCtValue(int ctValue) {
		this.ctValue = ctValue;
	}

	public String getTechMethod() {
		return techMethod;
	}

	public void setTechMethod(String techMethod) {
		this.techMethod = techMethod;
	}
}
