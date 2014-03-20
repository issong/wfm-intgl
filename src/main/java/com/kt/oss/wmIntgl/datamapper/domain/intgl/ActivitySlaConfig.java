package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;
import java.util.Date;

public class ActivitySlaConfig implements Serializable {

	private static final long serialVersionUID = -2478331794724335713L;

	private String officeCd;
	private int amEa;
	private int amEt;
	private int amSe;
	private int pmEa;
	private int pmEt;
	private int pmSe;
	private int ntEa;
	private int ntEt;
	private int ntSe;
	private Date changeDt;

	public String getOfficeCd() {
		return officeCd;
	}

	public void setOfficeCd(String officeCd) {
		this.officeCd = officeCd;
	}

	public int getAmEa() {
		return amEa;
	}

	public void setAmEa(int amEa) {
		this.amEa = amEa;
	}

	public int getAmEt() {
		return amEt;
	}

	public void setAmEt(int amEt) {
		this.amEt = amEt;
	}

	public int getAmSe() {
		return amSe;
	}

	public void setAmSe(int amSe) {
		this.amSe = amSe;
	}

	public int getPmEa() {
		return pmEa;
	}

	public void setPmEa(int pmEa) {
		this.pmEa = pmEa;
	}

	public int getPmEt() {
		return pmEt;
	}

	public void setPmEt(int pmEt) {
		this.pmEt = pmEt;
	}

	public int getPmSe() {
		return pmSe;
	}

	public void setPmSe(int pmSe) {
		this.pmSe = pmSe;
	}

	public int getNtEa() {
		return ntEa;
	}

	public void setNtEa(int ntEa) {
		this.ntEa = ntEa;
	}

	public int getNtEt() {
		return ntEt;
	}

	public void setNtEt(int ntEt) {
		this.ntEt = ntEt;
	}

	public int getNtSe() {
		return ntSe;
	}

	public void setNtSe(int ntSe) {
		this.ntSe = ntSe;
	}

	public Date getChangeDt() {
		return changeDt;
	}

	public void setChangeDt(Date changeDt) {
		this.changeDt = changeDt;
	}
}
