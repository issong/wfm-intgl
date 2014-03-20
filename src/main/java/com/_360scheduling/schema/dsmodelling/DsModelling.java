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
 * yngwie          2012. 11. 6.      First Draft.
 */
package com._360scheduling.schema.dsmodelling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 6.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ramUpdateOrRAMResourceOrRAMResourceDivision" })
@XmlRootElement(name = "DsModelling")
public class DsModelling implements Serializable {

	@XmlElements({
			@XmlElement(name = "RAM_Update", type = DsModelling.RAMUpdate.class),
			@XmlElement(name = "RAM_Resource", type = DsModelling.RAMResource.class),
			@XmlElement(name = "RAM_Resource_Division", type = DsModelling.RAMResourceDivision.class),
			@XmlElement(name = "RAM_Data_Update", type = DsModelling.RAMDataUpdate.class),
			@XmlElement(name = "RAM_Unavailability", type = DsModelling.RAMUnavailability.class),
			@XmlElement(name = "RAM_Time_Pattern", type = DsModelling.RAMTimePattern.class),
			@XmlElement(name = "RAM_Time_Pattern_Template", type = DsModelling.RAMTimePatternTemplate.class),
			@XmlElement(name = "RAM_Time_Pattern_Template_Item", type = DsModelling.RAMTimePatternTemplateItem.class),
			@XmlElement(name = "RAM_Division", type = DsModelling.RAMDivision.class) })
	protected List<Object> ramUpdateOrRAMResourceOrRAMResourceDivision;

	public List<Object> getRamUpdateOrRAMResourceOrRAMResourceDivision() {
		if (ramUpdateOrRAMResourceOrRAMResourceDivision == null) {
			ramUpdateOrRAMResourceOrRAMResourceDivision = new ArrayList<Object>();
		}
		return ramUpdateOrRAMResourceOrRAMResourceDivision;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "datasetId", "id",
			"ramUpdateTypeId" })
	public static class RAMUpdate implements Serializable {
		@XmlElement(name = "organisation_id")
		protected String organisationId;
		@XmlElement(name = "dataset_id")
		protected String datasetId;
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "ram_update_type_id")
		protected String ramUpdateTypeId;

		public String getOrganisationId() {
			return organisationId;
		}

		public void setOrganisationId(String organisationId) {
			this.organisationId = organisationId;
		}

		public String getDatasetId() {
			return datasetId;
		}

		public void setDatasetId(String datasetId) {
			this.datasetId = datasetId;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRamUpdateTypeId() {
			return ramUpdateTypeId;
		}

		public void setRamUpdateTypeId(String ramUpdateTypeId) {
			this.ramUpdateTypeId = ramUpdateTypeId;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "ramResourceClassId",
			"ramResourceTypeId", "ramLocationIdStart", "ramLocationIdEnd",
			"firstName", "surname", "ramShiftTemplateSetId", "description",
			"contactDetails", "memo", "ramRuleCollectionId", "costKm", "utilisation", "outOfRegionMultiplier" })
	public static class RAMResource implements Serializable {

		@XmlElement(name = "id")
		protected String id;
		@XmlElement(name = "ram_resource_class_id")
		protected String ramResourceClassId;
		@XmlElement(name = "ram_resource_type_id")
		protected String ramResourceTypeId;
		@XmlElement(name = "ram_location_id_start")
		protected String ramLocationIdStart;
		@XmlElement(name = "ram_location_id_end")
		protected String ramLocationIdEnd;
		@XmlElement(name = "first_name")
		protected String firstName;
		@XmlElement(name = "surname")
		protected String surname;
		@XmlElement(name = "ram_shift_template_set_id")
		protected String ramShiftTemplateSetId;
		@XmlElement(name = "description")
		protected String description;
		@XmlElement(name = "contact_details")
		protected String contactDetails;
		@XmlElement(name = "memo")
		protected String memo;

        @XmlElement(name = "ram_rule_collection_id")
        protected String ramRuleCollectionId;
        @XmlElement(name = "cost_km")
        protected Double costKm;
        @XmlElement(name = "utilisation")
        protected Integer utilisation;
        @XmlElement(name = "out_of_region_multiplier")
        protected Double outOfRegionMultiplier;

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

        public Integer getUtilisation() {
            return utilisation;
        }

        public void setUtilisation(Integer utilisation) {
            this.utilisation = utilisation;
        }

        public Double getOutOfRegionMultiplier() {
            return outOfRegionMultiplier;
        }

        public void setOutOfRegionMultiplier(Double outOfRegionMultiplier) {
            this.outOfRegionMultiplier = outOfRegionMultiplier;
        }

        public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRamResourceClassId() {
			return ramResourceClassId;
		}

		public void setRamResourceClassId(String ramResourceClassId) {
			this.ramResourceClassId = ramResourceClassId;
		}

		public String getRamResourceTypeId() {
			return ramResourceTypeId;
		}

		public void setRamResourceTypeId(String ramResourceTypeId) {
			this.ramResourceTypeId = ramResourceTypeId;
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

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getRamShiftTemplateSetId() {
			return ramShiftTemplateSetId;
		}

		public void setRamShiftTemplateSetId(String ramShiftTemplateSetId) {
			this.ramShiftTemplateSetId = ramShiftTemplateSetId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getContactDetails() {
			return contactDetails;
		}

		public void setContactDetails(String contactDetails) {
			this.contactDetails = contactDetails;
		}

		public String getMemo() {
			return memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ramDivisionId", "ramResourceId", "withinRegionMultiplier" })
	public static class RAMResourceDivision implements Serializable {

		@XmlElement(name = "ram_division_id")
		protected String ramDivisionId;
		@XmlElement(name = "ram_resource_id")
		protected String ramResourceId;
        @XmlElement(name = "within_region_multiplier")
        protected Double withinRegionMultiplier;

        public Double getWithinRegionMultiplier() {
            return withinRegionMultiplier;
        }

        public void setWithinRegionMultiplier(Double withinRegionMultiplier) {
            this.withinRegionMultiplier = withinRegionMultiplier;
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

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "objectTypeId", "objectPk1",
			"objectPkName1", "objectPk2", "objectPkName2", "objectPk3",
			"objectPkName3", "objectPk4", "objectPkName4", "deleteRow",
			"columnName", "columnValue" })
	public static class RAMDataUpdate implements Serializable {
		@XmlElement(name = "object_type_id")
		protected String objectTypeId;
		@XmlElement(name = "object_pk1")
		protected String objectPk1;
		@XmlElement(name = "object_pk_name1")
		protected String objectPkName1;
		@XmlElement(name = "object_pk2")
		protected String objectPk2;
		@XmlElement(name = "object_pk_name2")
		protected String objectPkName2;
		@XmlElement(name = "object_pk3")
		protected String objectPk3;
		@XmlElement(name = "object_pk_name3")
		protected String objectPkName3;
		@XmlElement(name = "object_pk4")
		protected String objectPk4;
		@XmlElement(name = "object_pk_name4")
		protected String objectPkName4;
		@XmlElement(name = "delete_row", defaultValue = "true")
		protected boolean deleteRow;
		@XmlElement(name = "column_name")
		protected String columnName;
		@XmlElement(name = "column_value")
		protected String columnValue;

		public String getObjectTypeId() {
			return objectTypeId;
		}

		public void setObjectTypeId(String objectTypeId) {
			this.objectTypeId = objectTypeId;
		}

		public String getObjectPk1() {
			return objectPk1;
		}

		public void setObjectPk1(String objectPk1) {
			this.objectPk1 = objectPk1;
		}

		public String getObjectPkName1() {
			return objectPkName1;
		}

		public void setObjectPkName1(String objectPkName1) {
			this.objectPkName1 = objectPkName1;
		}

		public String getObjectPk2() {
			return objectPk2;
		}

		public void setObjectPk2(String objectPk2) {
			this.objectPk2 = objectPk2;
		}

		public String getObjectPkName2() {
			return objectPkName2;
		}

		public void setObjectPkName2(String objectPkName2) {
			this.objectPkName2 = objectPkName2;
		}

		public String getObjectPk3() {
			return objectPk3;
		}

		public void setObjectPk3(String objectPk3) {
			this.objectPk3 = objectPk3;
		}

		public String getObjectPkName3() {
			return objectPkName3;
		}

		public void setObjectPkName3(String objectPkName3) {
			this.objectPkName3 = objectPkName3;
		}

		public String getObjectPk4() {
			return objectPk4;
		}

		public void setObjectPk4(String objectPk4) {
			this.objectPk4 = objectPk4;
		}

		public String getObjectPkName4() {
			return objectPkName4;
		}

		public void setObjectPkName4(String objectPkName4) {
			this.objectPkName4 = objectPkName4;
		}

		public boolean isDeleteRow() {
			return deleteRow;
		}

		public void setDeleteRow(boolean deleteRow) {
			this.deleteRow = deleteRow;
		}

		public String getColumnName() {
			return columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnValue() {
			return columnValue;
		}

		public void setColumnValue(String columnValue) {
			this.columnValue = columnValue;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ramResourceId", "ramTimePatternId",
			"id", "ramUnavailabilityCategoryId" })
	public static class RAMUnavailability implements Serializable {
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "ram_resource_id")
		protected String ramResourceId;
		@XmlElement(name = "ram_time_pattern_id")
		protected String ramTimePatternId;
		@XmlElement(name = "ram_unavailability_category_id")
		protected String ramUnavailabilityCategoryId;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRamResourceId() {
			return ramResourceId;
		}

		public void setRamResourceId(String ramResourceId) {
			this.ramResourceId = ramResourceId;
		}

		public String getRamTimePatternId() {
			return ramTimePatternId;
		}

		public void setRamTimePatternId(String ramTimePatternId) {
			this.ramTimePatternId = ramTimePatternId;
		}

		public String getRamUnavailabilityCategoryId() {
			return ramUnavailabilityCategoryId;
		}

		public void setRamUnavailabilityCategoryId(
				String ramUnavailabilityCategoryId) {
			this.ramUnavailabilityCategoryId = ramUnavailabilityCategoryId;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "baseTime", "duration", "id",
			"ramTimePatternTemplateId" })
	public static class RAMTimePattern implements Serializable {
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "base_time")
		protected String baseTime;
		@XmlElement(name = "duration")
		protected Duration duration;
		@XmlElement(name = "ram_time_pattern_template_id")
		protected String ramTimePatternTemplateId;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBaseTime() {
			return baseTime;
		}

		public void setBaseTime(String baseTime) {
			this.baseTime = baseTime;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public String getRamTimePatternTemplateId() {
			return ramTimePatternTemplateId;
		}

		public void setRamTimePatternTemplateId(String ramTimePatternTemplateId) {
			this.ramTimePatternTemplateId = ramTimePatternTemplateId;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "recurrenceDays" })
	public static class RAMTimePatternTemplate implements Serializable {
		@XmlElement(required = true)
		protected String id;
		@XmlElement(name = "recurrence_days")
		protected int recurrenceDays;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getRecurrenceDays() {
			return recurrenceDays;
		}

		public void setRecurrenceDays(int recurrenceDays) {
			this.recurrenceDays = recurrenceDays;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ramTimePatternTemplateId", "sequence",
			"timeIncrement", "duration" })
	public static class RAMTimePatternTemplateItem implements Serializable {
		@XmlElement(name = "ram_time_pattern_template_id", required = true)
		protected String ramTimePatternTemplateId;
		@XmlElement(name = "sequence")
		protected int sequence;
		@XmlElement(name = "time_increment")
		protected Duration timeIncrement;
		@XmlElement(name = "duration")
		protected Duration duration;

		public String getRamTimePatternTemplateId() {
			return ramTimePatternTemplateId;
		}

		public void setRamTimePatternTemplateId(String ramTimePatternTemplateId) {
			this.ramTimePatternTemplateId = ramTimePatternTemplateId;
		}

		public int getSequence() {
			return sequence;
		}

		public void setSequence(int sequence) {
			this.sequence = sequence;
		}

		public Duration getTimeIncrement() {
			return timeIncrement;
		}

		public void setTimeIncrement(Duration timeIncrement) {
			this.timeIncrement = timeIncrement;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "description", "send",
			"ramDivisionId", "ramDivisionTypeId" })
	public static class RAMDivision implements Serializable {
		@XmlElement(name = "id", required = true)
		protected String id;
		@XmlElement(name = "description")
		protected String description;
		@XmlElement(name = "send", required = true, defaultValue = "true")
		protected boolean send;
		@XmlElement(name = "ram_division_id")
		protected String ramDivisionId;
		@XmlElement(name = "ram_division_type_id", required = true, defaultValue = "pwa")
		protected String ramDivisionTypeId;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public boolean isSend() {
			return send;
		}

		public void setSend(boolean send) {
			this.send = send;
		}

		public String getRamDivisionId() {
			return ramDivisionId;
		}

		public void setRamDivisionId(String ramDivisionId) {
			this.ramDivisionId = ramDivisionId;
		}

		public String getRamDivisionTypeId() {
			return ramDivisionTypeId;
		}

		public void setRamDivisionTypeId(String ramDivisionTypeId) {
			this.ramDivisionTypeId = ramDivisionTypeId;
		}

	}
}
