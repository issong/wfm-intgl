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
 * yngwie          2013. 1. 31.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.dao.bt360;

import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMAppointmentResource;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMVisitScheduleResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParamVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 31.
 * @see
 * 
 */
@Repository
public interface WMAppointment360Dao {

	WMVisitScheduleResponse selectAllocation(String appointmentRequestId);

	List<WMAppointmentOfferParam> selectWMAppointmentOffer(
			WMAppointmentOfferParamVo vo);

    List<WMAppointmentResource> selectActivityAndOthers(String csctId);
}
