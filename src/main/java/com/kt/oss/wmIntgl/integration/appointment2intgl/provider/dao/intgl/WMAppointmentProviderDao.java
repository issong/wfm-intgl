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
 * yngwie          2012. 11. 29.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.dao.intgl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParamVo;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMMappingReasonTypeVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 29.
 * @see
 * 
 */
@Repository
public interface WMAppointmentProviderDao {

	List<WMAppointmentOfferParam> selectWMAppointmentOffer(
			String appointmentRequestId);

	int updateAppointmentOffer(WMAppointmentOfferParam vo);

	int insertAppointmentOffer(WMAppointmentOfferParamVo offer);

	int deleteAppointmentOffer(String appointmentRequestId);

	List<WMMappingReasonTypeVo> selectWMMappingReasonType();

}
