package com.kt.oss.wmIntgl.datamapper.domain.bt360;

import java.io.Serializable;
import java.util.List;

public class RamResourceObject implements Serializable {

	private static final long serialVersionUID = -7778375496584519470L;

	private String id;
	private String datasetId;
	private String ramDivisionId;
	private List<String> ramDivisionIdList;

	private int organisationId;
	private String ramResourceId;
	private Double withinRegionMultiplier;
	private int ramUpdateId;
	private int deleted;

	private String ramLocationIdStart;
	private String ramLocationIdEnd;
	private String ramRuleCollectionId;
	private Double costKm;
	private int utilisation;
	private Double outOfRegionMultiplier;

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

	public String getRamDivisionId() {
		return ramDivisionId;
	}

	public void setRamDivisionId(String ramDivisionId) {
		this.ramDivisionId = ramDivisionId;
	}

	public String getRamResourceId() {
		return ramResourceId;
	}

	public void setRamResourceId(String ramResourceId) {
		this.ramResourceId = ramResourceId;
	}

	public Double getWithinRegionMultiplier() {
		return withinRegionMultiplier;
	}

	public void setWithinRegionMultiplier(Double withinRegionMultiplier) {
		this.withinRegionMultiplier = withinRegionMultiplier;
	}

	public int getRamUpdateId() {
		return ramUpdateId;
	}

	public void setRamUpdateId(int ramUpdateId) {
		this.ramUpdateId = ramUpdateId;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRamLocationIdStart() {
		return ramLocationIdStart;
	}

	public void setRamLocationIdStart(String ramLocationIdStart) {
		this.ramLocationIdStart = ramLocationIdStart;
	}

	public String getRamLocationIdEnd() {
		return ramLocationIdEnd;
	}

	public void setRamLocationIdEnd(String ramLocationIdEnd) {
		this.ramLocationIdEnd = ramLocationIdEnd;
	}

	public String getRamRuleCollectionId() {
		return ramRuleCollectionId;
	}

	public void setRamRuleCollectionId(String ramRuleCollectionId) {
		this.ramRuleCollectionId = ramRuleCollectionId;
	}

	public List<String> getRamDivisionIdList() {
		return ramDivisionIdList;
	}

	public void setRamDivisionIdList(List<String> ramDivisionIdList) {
		this.ramDivisionIdList = ramDivisionIdList;
	}

	public Double getCostKm() {
		return costKm;
	}

	public void setCostKm(Double costKm) {
		this.costKm = costKm;
	}

	public int getUtilisation() {
		return utilisation;
	}

	public void setUtilisation(int utilisation) {
		this.utilisation = utilisation;
	}

	public Double getOutOfRegionMultiplier() {
		return outOfRegionMultiplier;
	}

	public void setOutOfRegionMultiplier(Double outOfRegionMultiplier) {
		this.outOfRegionMultiplier = outOfRegionMultiplier;
	}
}
