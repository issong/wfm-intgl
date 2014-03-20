/**
 * Copyright (c) 2012 KT Corp, Inc.
 * All right reserved.
 *
 * This software is the confidential and proprietary information of KT
 * Corp, Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with KT Corp.
 *
 * Revision History
 * Author              Date             Description
 * ------------------   --------------    ------------------
 * yngwie          2012. 10. 15.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.service.rules.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivitySlaConfigVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public class RulesVo {

	private String broadcastUrl;
	private String inputReferenceId;

	// Activity 관련 설정
	private String externalRef;

	// ActivitySLA, ObjectDeletion 관련 설정
	private String slaTypeId;
	private int priority;
	private List<ActivitySlaConfigVo> activitySlaConfigs;
	private Map<String, ActivitySlaConfigVo> activitySlaConfigsMap;

	// RAMDivision 관련 설정
	private String prefix;
	private String postfix;

	// RAMDataUpdate 관련 설정
	private String ramDivisionId;

	// CustomExceptionData 관련 설정
	private String label;
	private String value;

	// RAMResource 관련 설정
	private String ramLocationIdStart;
	private String ramLocationIdEnd;
	private String ramRuleCollectionId;
	private Double costKm;
	private int utilisation;
	private Double outOfRegionMultiplier;

	// RAMResourceDivision 관련 설정
	private Double withinRegionMultiplier;

	public String getBroadcastUrl() {
		return broadcastUrl;
	}

	public void setBroadcastUrl(String broadcastUrl) {
		this.broadcastUrl = broadcastUrl;
	}

	public String getInputReferenceId() {
		return inputReferenceId;
	}

	public void setInputReferenceId(String inputReferenceId) {
		this.inputReferenceId = inputReferenceId;
	}

	public String getSlaTypeId() {
		return slaTypeId;
	}

	public void setSlaTypeId(String slaTypeId) {
		this.slaTypeId = slaTypeId;
	}

	public List<ActivitySlaConfigVo> getActivitySlaConfigs() {
		return activitySlaConfigs;
	}

	public Map<String, ActivitySlaConfigVo> getActivitySlaConfigsMap() {
		return activitySlaConfigsMap;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getExternalRef() {
		return externalRef;
	}

	public void setExternalRef(String externalRef) {
		this.externalRef = externalRef;
	}

	/**
	 * List 를 Map 으로 변환한다
	 * 
	 * @param activitySlaConfigs
	 */
	public void setActivitySlaConfigs(
			List<ActivitySlaConfigVo> activitySlaConfigs) {
		this.activitySlaConfigs = activitySlaConfigs;

		activitySlaConfigsMap = new HashMap<String, ActivitySlaConfigVo>();
		for (ActivitySlaConfigVo activitySlaConfigVo : activitySlaConfigs) {
			activitySlaConfigsMap.put(activitySlaConfigVo.getOfficeCd(),
					activitySlaConfigVo);
		}
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getPostfix() {
		return postfix;
	}

	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	public String getRamDivisionId() {
		return ramDivisionId;
	}

	public void setRamDivisionId(String ramDivisionId) {
		this.ramDivisionId = ramDivisionId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Double getWithinRegionMultiplier() {
		return withinRegionMultiplier;
	}

	public void setWithinRegionMultiplier(Double withinRegionMultiplier) {
		this.withinRegionMultiplier = withinRegionMultiplier;
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
