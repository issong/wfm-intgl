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
public class ActivityStatus implements Serializable {

	private static final long serialVersionUID = -5721389818588998291L;

	private int mapId;
	private String statusCd;
	private String completeCd;
	private String additionalCd;
	private int threesixtystatusCd;
	private String statusNm;
	private Date changeDt;

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getCompleteCd() {
		return completeCd;
	}

	public void setCompleteCd(String completeCd) {
		this.completeCd = completeCd;
	}

	public String getAdditionalCd() {
		return additionalCd;
	}

	public void setAdditionalCd(String additionalCd) {
		this.additionalCd = additionalCd;
	}

	public int getThreesixtystatusCd() {
		return threesixtystatusCd;
	}

	public void setThreesixtystatusCd(int threesixtystatusCd) {
		this.threesixtystatusCd = threesixtystatusCd;
	}

	public String getStatusNm() {
		return statusNm;
	}

	public void setStatusNm(String statusNm) {
		this.statusNm = statusNm;
	}

	public Date getChangeDt() {
		return changeDt;
	}

	public void setChangeDt(Date changeDt) {
		this.changeDt = changeDt;
	}
}
