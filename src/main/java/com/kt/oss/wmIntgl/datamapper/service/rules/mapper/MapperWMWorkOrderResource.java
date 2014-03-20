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
package com.kt.oss.wmIntgl.datamapper.service.rules.mapper;

import java.util.List;

import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderResource;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WorkOrderStateVo;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesDB;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesMapper;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public class MapperWMWorkOrderResource extends RulesMapper {

	/**
	 * WMWorkOrderResource 항목의 데이터를 적재한다.
	 * 
	 * @param drls
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		// 360에서 오는 데이터는 DsScheduleData 에 담겨서 SourceData 에 있음
		List<Object> sourceData = intglVo.getSourceData();
		DsScheduleData dsScheduleData = (DsScheduleData) sourceData.get(0);
		for (Object order : dsScheduleData
				.getShiftPatternOrActivityOrActivitySLA()) {
			// SuggestedDispatch 일경우만 변환 수행
			if (order instanceof DsScheduleData.SuggestedDispatch) {
				executeGenerate(drls, order, intglVo, rulesVo, rulesDB,
						ollehMapService, new WorkOrderStateVo());
			}
		}
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new WMWorkOrderResource();
	}
}
