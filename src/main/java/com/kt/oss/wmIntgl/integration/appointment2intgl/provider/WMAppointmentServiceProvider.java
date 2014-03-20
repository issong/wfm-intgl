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
 * yngwie          2012. 11. 20.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMVisitScheduleResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentCancelParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOrderParam;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 20.
 * @see
 * 
 */
@Component
@WebService
public interface WMAppointmentServiceProvider {

	WMAppointmentOfferResponse makeAppointment(String appointmentRequestId,
			String sourceDt, WMAppointmentOrderParam param);

	WMAppointmentOfferResponse cancelAppointment(String appointmentRequestId,
			String sourceDt, WMAppointmentCancelParam param);

	WMAppointmentOfferResponse confirmAppointment(String appointmentRequestId,
			String sourceDt, WMAppointmentOrderParam param);

	WMAppointmentOfferResponse cancelTask(String odrNum, String sourceDt,
			WMAppointmentCancelParam param);

	WMVisitScheduleResponse searchVisitSchedule(String appointmentRequestId,
			String sourceDt);
}
