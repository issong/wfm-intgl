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
package com.kt.oss.wmIntgl.integration.neosswm2intgl.provider;

import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMConfirmResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMCustomExceptionParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDeleteResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDivisionInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceHolidayInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;

/**
 * WebService Interface from Legacy System <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Component
@WebService
public interface WMSchedulerServiceProvider {

	int initialLoadData(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data);

	int updateTaskStatus(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data);

	int heartbeat(String sourceId, String sourceDt);

	int addNewTask(String sourceId, String sourceDt, List<WMWorkOrderParam> data);

	int modifyTask(String sourceId, String sourceDt, List<WMWorkOrderParam> data);

	int cancelTask(String sourceId, String sourceDt,
			List<WMWorkOrderKeyParam> data);

	int changeTaskDuration(String sourceId, String sourceDt,
			List<WMWorkOrderParam> data);

	int changeAuthorize(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data);

	int changeResourceInfo(String sourceId, String sourceDt,
			WMResourceInfoParam data);

	int raiseCustomException(String sourceId, String sourceDt,
			List<WMCustomExceptionParam> data);

	int removeCustomException(String sourceId, String sourceDt,
			List<WMCustomExceptionParam> data);

	int deleteResourceInfo(String sourceId, String sourceDt,
			List<WMDeleteResourceInfoParam> data);

	int confirmResourceInfo(String sourceId, String sourceDt,
			List<WMConfirmResourceInfoParam> data);

	int resourceHolidayInfo(String sourceId, String sourceDt,
			List<WMResourceHolidayInfoParam> data);

	int createDivisonInfo(String sourceId, String sourceDt,
			List<WMDivisionInfoParam> data);

	int deleteDivisonInfo(String sourceId, String sourceDt,
			List<WMDivisionInfoParam> data);

	int updateTaskStatusForVS2(String sourceId, String sourceDt,
			List<WMWorkOrderStatusParam> data);

	int createResourceInfo(String sourceId, String sourceDt,
			WMResourceInfoParam data);
	
	String getCoord(String address);
}
