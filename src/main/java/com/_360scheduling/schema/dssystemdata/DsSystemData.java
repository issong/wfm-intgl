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
 * yngwie          2013. 1. 9.      First Draft.
 */
package com._360scheduling.schema.dssystemdata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 9.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "usersOrUserGroupOrUserExternalTask" })
@XmlRootElement(name = "DsSystemData")
public class DsSystemData implements Serializable {

	@XmlElements({
			@XmlElement(name = "Users", type = DsSystemData.Users.class),
			@XmlElement(name = "User_External_Task", type = DsSystemData.UserExternalTask.class),
			@XmlElement(name = "User_Group", type = DsSystemData.UserGroup.class),
			@XmlElement(name = "System_Input", type = DsSystemData.SystemInput.class),
			@XmlElement(name = "System_Data_Update", type = DsSystemData.SystemDataUpdate.class) })
	protected List<Object> usersOrUserGroupOrUserExternalTask;

	public List<Object> getUsersOrUserGroupOrUserExternalTask() {
		if (usersOrUserGroupOrUserExternalTask == null) {
			usersOrUserGroupOrUserExternalTask = new ArrayList<Object>();
		}
		return usersOrUserGroupOrUserExternalTask;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "id", "name",
			"userPassword", "enable", "adminAllowed", "profileId", "lowerId",
			"languageId", "lastPasswordChange", "hashMethod",
			"forcePasswordChange" })
	public static class Users implements Serializable {
		@XmlElement(name = "organisation_id", required = true, defaultValue = "1")
		protected String organisationId;
		@XmlElement(name = "id", required = true)
		protected String id;
		@XmlElement(name = "name", required = true)
		protected String name;
		@XmlElement(name = "user_password", required = true, defaultValue = "fbe37b69d1ce0d900332e48dd5ebc78bc9")
		protected String userPassword;
		@XmlElement(name = "enable", required = true, defaultValue = "true")
		protected boolean enable;
		@XmlElement(name = "admin_allowed", required = true, defaultValue = "false")
		protected boolean adminAllowed;
		@XmlElement(name = "profile_id", required = true)
		protected String profileId;
		@XmlElement(name = "lower_id", required = true)
		protected String lowerId;
		@XmlElement(name = "language_id", defaultValue = "ko-KR")
		protected String languageId;
		@XmlElement(name = "last_password_change")
		protected XMLGregorianCalendar lastPasswordChange;
		@XmlElement(name = "hash_method", defaultValue = "0")
		protected int hashMethod;
		@XmlElement(name = "force_password_change", required = true, defaultValue = "false")
		protected boolean forcePasswordChange;

		public String getOrganisationId() {
			return organisationId;
		}

		public void setOrganisationId(String organisationId) {
			this.organisationId = organisationId;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public boolean isEnable() {
			return enable;
		}

		public void setEnable(boolean enable) {
			this.enable = enable;
		}

		public boolean isAdminAllowed() {
			return adminAllowed;
		}

		public void setAdminAllowed(boolean adminAllowed) {
			this.adminAllowed = adminAllowed;
		}

		public String getProfileId() {
			return profileId;
		}

		public void setProfileId(String profileId) {
			this.profileId = profileId;
		}

		public String getLowerId() {
			return lowerId;
		}

		public void setLowerId(String lowerId) {
			this.lowerId = lowerId;
		}

		public String getLanguageId() {
			return languageId;
		}

		public void setLanguageId(String languageId) {
			this.languageId = languageId;
		}

		public XMLGregorianCalendar getLastPasswordChange() {
			return lastPasswordChange;
		}

		public void setLastPasswordChange(
				XMLGregorianCalendar lastPasswordChange) {
			this.lastPasswordChange = lastPasswordChange;
		}

		public int getHashMethod() {
			return hashMethod;
		}

		public void setHashMethod(int hashMethod) {
			this.hashMethod = hashMethod;
		}

		public boolean isForcePasswordChange() {
			return forcePasswordChange;
		}

		public void setForcePasswordChange(boolean forcePasswordChange) {
			this.forcePasswordChange = forcePasswordChange;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "userId",
			"externalTaskId" })
	public static class UserExternalTask implements Serializable {

		@XmlElement(name = "organisation_id", required = true, defaultValue = "1")
		protected String organisationId;
		@XmlElement(name = "user_id", required = true)
		protected String userId;
		@XmlElement(name = "external_task_id")
		protected String externalTaskId;

		public String getOrganisationId() {
			return organisationId;
		}

		public void setOrganisationId(String organisationId) {
			this.organisationId = organisationId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getExternalTaskId() {
			return externalTaskId;
		}

		public void setExternalTaskId(String externalTaskId) {
			this.externalTaskId = externalTaskId;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "organisationId", "userId", "groupId" })
	public static class UserGroup implements Serializable {
		@XmlElement(name = "organisation_id", required = true, defaultValue = "1")
		protected String organisationId;
		@XmlElement(name = "user_id", required = true)
		protected String userId;
		@XmlElement(name = "group_id", required = true)
		protected String groupId;

		public String getOrganisationId() {
			return organisationId;
		}

		public void setOrganisationId(String organisationId) {
			this.organisationId = organisationId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getGroupId() {
			return groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "id", "inputType" })
	public static class SystemInput implements Serializable {
		@XmlElement(name = "id", required = true, defaultValue = "0")
		protected String id;
		@XmlElement(name = "input_type", required = true)
		protected String inputType;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInputType() {
			return inputType;
		}

		public void setInputType(String inputType) {
			this.inputType = inputType;
		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "objectTypeId", "objectPkName1",
			"objectPk1", "objectPkName2", "objectPk2", "objectPkName3",
			"objectPk3", "deleteRow" })
	public static class SystemDataUpdate implements Serializable {
		@XmlElement(name = "object_type_id", required = true)
		protected String objectTypeId;
		@XmlElement(name = "object_pk_name1", required = true)
		protected String objectPkName1;
		@XmlElement(name = "object_pk1", required = true)
		protected String objectPk1;
		@XmlElement(name = "object_pk_name2")
		protected String objectPkName2;
		@XmlElement(name = "object_pk2")
		protected String objectPk2;
		@XmlElement(name = "object_pk_name3")
		protected String objectPkName3;
		@XmlElement(name = "object_pk3", defaultValue = "1")
		protected String objectPk3;
		@XmlElement(name = "delete_row", defaultValue = "true")
		protected boolean deleteRow;

		public String getObjectTypeId() {
			return objectTypeId;
		}

		public void setObjectTypeId(String objectTypeId) {
			this.objectTypeId = objectTypeId;
		}

		public String getObjectPkName1() {
			return objectPkName1;
		}

		public void setObjectPkName1(String objectPkName1) {
			this.objectPkName1 = objectPkName1;
		}

		public String getObjectPk1() {
			return objectPk1;
		}

		public void setObjectPk1(String objectPk1) {
			this.objectPk1 = objectPk1;
		}

		public String getObjectPkName2() {
			return objectPkName2;
		}

		public void setObjectPkName2(String objectPkName2) {
			this.objectPkName2 = objectPkName2;
		}

		public String getObjectPk2() {
			return objectPk2;
		}

		public void setObjectPk2(String objectPk2) {
			this.objectPk2 = objectPk2;
		}

		public String getObjectPkName3() {
			return objectPkName3;
		}

		public void setObjectPkName3(String objectPkName3) {
			this.objectPkName3 = objectPkName3;
		}

		public String getObjectPk3() {
			return objectPk3;
		}

		public void setObjectPk3(String objectPk3) {
			this.objectPk3 = objectPk3;
		}

		public boolean getDeleteRow() {
			return deleteRow;
		}

		public void setDeleteRow(boolean deleteRow) {
			this.deleteRow = deleteRow;
		}

	}
}
