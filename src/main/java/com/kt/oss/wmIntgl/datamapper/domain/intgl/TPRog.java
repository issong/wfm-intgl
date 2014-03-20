package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;
import java.util.Date;

public class TPRog implements Serializable {

	private static final long serialVersionUID = -7506655627894256786L;

	private String tprog;
	private String ttext;
	private String description;
	private String useYn;
	private String baseTime;
	private int duration;
	private String durationStr;
	private Date changeDt;
	private String changeDtStr;

	public String getTprog() {
		return tprog;
	}

	public void setTprog(String tprog) {
		this.tprog = tprog;
	}

	public String getTtext() {
		return ttext;
	}

	public void setTtext(String ttext) {
		this.ttext = ttext;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getBaseTime() {
		return baseTime;
	}

	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getChangeDt() {
		return changeDt;
	}

	public void setChangeDt(Date changeDt) {
		this.changeDt = changeDt;
	}

	public String getDurationStr() {
		return durationStr;
	}

	public void setDurationStr(String durationStr) {
		this.durationStr = durationStr;
	}

	public String getChangeDtStr() {
		return changeDtStr;
	}

	public void setChangeDtStr(String changeDtStr) {
		this.changeDtStr = changeDtStr;
	}
}
