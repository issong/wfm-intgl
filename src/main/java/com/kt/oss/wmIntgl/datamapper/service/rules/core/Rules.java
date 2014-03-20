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

import java.util.List;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperActivity;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperActivitySLA;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperActivityStatus;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperAdditionalAttribute;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperAppointmentOfferResponse;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperAppointmentRequest;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperAvailabilityPattern;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperBroadcast;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperBroadcastParameter;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperCustomException;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperCustomExceptionData;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperInputReference;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperIntglRules;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperLocation;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperLocationRegion;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperObjectDeletion;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMDataUpdate;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMDivision;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMResource;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMResourceDivision;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMTimePattern;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMUnavailability;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperRAMUpdate;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperResourcePreference;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperScheduleEvent;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperSourceData;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperSourceDataParameter;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperSystemDataUpdate;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperSystemInput;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperUserExternalTask;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperUserGroup;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperUsers;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperWMAppointmentOffer;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperWMWorkOrderResource;
import com.kt.oss.wmIntgl.datamapper.service.rules.mapper.MapperWMWorkOrderStatus;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public interface Rules {

	public static final String PATH = "rules/";
	public static final String EXTS = ".drl";

	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception;

	public enum _Rules {
		intgl_rule {
			@Override
			public Rules getMapper() {
				return new MapperIntglRules();
			}
		},
		InputReference {
			@Override
			public Rules getMapper() {
				return new MapperInputReference();
			}
		},
		Location {
			@Override
			public Rules getMapper() {
				return new MapperLocation();
			}
		},
		LocationRegion {
			@Override
			public Rules getMapper() {
				return new MapperLocationRegion();
			}
		},
		Activity {
			@Override
			public Rules getMapper() {
				return new MapperActivity();
			}
		},
		ActivitySLA {
			@Override
			public Rules getMapper() {
				return new MapperActivitySLA();
			}
		},
		ActivityStatus {
			@Override
			public Rules getMapper() {
				return new MapperActivityStatus();
			}
		},
		ResourcePreference {
			@Override
			public Rules getMapper() {
				return new MapperResourcePreference();
			}
		},
		ScheduleEvent {
			@Override
			public Rules getMapper() {
				return new MapperScheduleEvent();
			}
		},
		AdditionalAttribute {
			@Override
			public Rules getMapper() {
				return new MapperAdditionalAttribute();
			}
		},
		SourceData {
			@Override
			public Rules getMapper() {
				return new MapperSourceData();
			}
		},
		SourceDataParameter {
			@Override
			public Rules getMapper() {
				return new MapperSourceDataParameter();
			}
		},
		Broadcast {
			@Override
			public Rules getMapper() {
				return new MapperBroadcast();
			}
		},
		BroadcastParameter {
			@Override
			public Rules getMapper() {
				return new MapperBroadcastParameter();
			}
		},
		ObjectDeletion {
			@Override
			public Rules getMapper() {
				return new MapperObjectDeletion();
			}
		},
		RAMUpdate {
			@Override
			public Rules getMapper() {
				return new MapperRAMUpdate();
			}
		},
		RAMDataUpdate {
			@Override
			public Rules getMapper() {
				return new MapperRAMDataUpdate();
			}
		},
		RAMDivision {
			@Override
			public Rules getMapper() {
				return new MapperRAMDivision();
			}
		},
		RAMResource {
			@Override
			public Rules getMapper() {
				return new MapperRAMResource();
			}
		},
		RAMResourceDivision {
			@Override
			public Rules getMapper() {
				return new MapperRAMResourceDivision();
			}
		},
		RAMUnavailability {
			@Override
			public Rules getMapper() {
				return new MapperRAMUnavailability();
			}
		},
		RAMTimePattern {
			@Override
			public Rules getMapper() {
				return new MapperRAMTimePattern();
			}
		},
		CustomException {
			@Override
			public Rules getMapper() {
				return new MapperCustomException();
			}
		},
		CustomExceptionData {
			@Override
			public Rules getMapper() {
				return new MapperCustomExceptionData();
			}
		},
		AvailabilityPattern {
			@Override
			public Rules getMapper() {
				return new MapperAvailabilityPattern();
			}
		},
		AppointmentRequest {
			@Override
			public Rules getMapper() {
				return new MapperAppointmentRequest();
			}
		},
		AppointmentOfferResponse {
			@Override
			public Rules getMapper() {
				return new MapperAppointmentOfferResponse();
			}
		},
		SystemDataUpdate {
			@Override
			public Rules getMapper() {
				return new MapperSystemDataUpdate();
			}
		},
		SystemInput {
			@Override
			public Rules getMapper() {
				return new MapperSystemInput();
			}
		},
		UserExternalTask {
			@Override
			public Rules getMapper() {
				return new MapperUserExternalTask();
			}
		},
		UserGroup {
			@Override
			public Rules getMapper() {
				return new MapperUserGroup();
			}
		},
		Users {
			@Override
			public Rules getMapper() {
				return new MapperUsers();
			}
		},
		WMAppointmentOffer {
			@Override
			public Rules getMapper() {
				return new MapperWMAppointmentOffer();
			}
		},
		WMWorkOrderResource {
			@Override
			public Rules getMapper() {
				return new MapperWMWorkOrderResource();
			}
		},
		WMWorkOrderStatus {
			@Override
			public Rules getMapper() {
				return new MapperWMWorkOrderStatus();
			}
		};

		public abstract Rules getMapper();
	}
}
