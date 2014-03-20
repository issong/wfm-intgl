package com.kt.oss.wmIntgl.datamapper.domain.bt360;

import java.io.Serializable;
import java.sql.Timestamp;

public class ActivitySlaObject implements Serializable {

	private static final long serialVersionUID = -6453680330325866162L;

	private int organisationId;
	private String datasetId;
	private int inputReferenceInternalId;
	private int deleteFlag;
	private String slaTypeId;
	private String activityId;
	private Timestamp datetimeStart;
	private Timestamp datetimeEnd;
	private int priority;
	private int startBased;

	public int getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}

	public String getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(String datasetId) {
		this.datasetId = datasetId;
	}

	public int getInputReferenceInternalId() {
		return inputReferenceInternalId;
	}

	public void setInputReferenceInternalId(int inputReferenceInternalId) {
		this.inputReferenceInternalId = inputReferenceInternalId;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getSlaTypeId() {
		return slaTypeId;
	}

	public void setSlaTypeId(String slaTypeId) {
		this.slaTypeId = slaTypeId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Timestamp getDatetimeStart() {
		return datetimeStart;
	}

	public void setDatetimeStart(Timestamp datetimeStart) {
		this.datetimeStart = datetimeStart;
	}

	public Timestamp getDatetimeEnd() {
		return datetimeEnd;
	}

	public void setDatetimeEnd(Timestamp datetimeEnd) {
		this.datetimeEnd = datetimeEnd;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getStartBased() {
		return startBased;
	}

	public void setStartBased(int startBased) {
		this.startBased = startBased;
	}
}
