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

import com._360scheduling.schema.dsscheduledata.ObjectFactory;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrder;
import com.kt.oss.wmIntgl.datamapper.domain.bt360.ActivitySlaObjectVo;
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
public class MapperObjectDeletion extends RulesMapper {

	/**
	 * ObjectDeletion 항목의 데이터를 적재한다.
	 * 
	 * @param drls
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		switch (intglVo.getVsType()) {
		case VS5:
			// workType=1 이고 odrNum 값이 있을 경우 또는
			// workType=2 이고 ttId에 값이 있을 경우 만 해당 Schema 생성
			for (Object order : intglVo.getSourceData()) {
				WMWorkOrder wmWorkOrder = (WMWorkOrder) order;
				if ("1".equals(wmWorkOrder.getWorkType())) {
					if (StringUtil.isNotEmpty(wmWorkOrder.getOdrNum())) {
						executeGenerate(drls, wmWorkOrder, intglVo, rulesVo,
								rulesDB, ollehMapService);
					}
				} else if ("2".equals(wmWorkOrder.getWorkType())) {
					if (StringUtil.isNotEmpty(wmWorkOrder.getTtId())) {
						executeGenerate(drls, wmWorkOrder, intglVo, rulesVo,
								rulesDB, ollehMapService);
					}
				}
			}
			break;
		case VS6B:
		case VS6D:
			executeGenerate(drls, intglVo, rulesVo, rulesDB, ollehMapService);
			break;
		case VS6C:
			// [appointmentRequestId] 가 'NONE' 인 경우 해당 SET 생성하지 않음
			if (!"NONE".equals(intglVo.getAppointmentRequestId())) {
				executeGenerate(drls, intglVo, rulesVo, rulesDB,
						ollehMapService);
			}
			break;
		case VS10:
			// 1. workType=1 이고 odrNum 값이 있을 경우 또는
			// workType=2 이고 ttId에 값이 있을 경우 만 해당 Schema 생성
			// 2. 360 mirror DB 에서 아래 SQL을 실행하여서 해당 오더의 sla_type_id가 존재하면 해당
			// sla_type_id 수(오더당 2개) 만큼 해당 Set 생성
			for (Object order : intglVo.getSourceData()) {
				WMWorkOrder wmWorkOrder = (WMWorkOrder) order;
				if ("1".equals(wmWorkOrder.getWorkType())) {
					if (StringUtil.isNotEmpty(wmWorkOrder.getOdrNum())) {
						executeGenerate(drls, new Integer(0), wmWorkOrder,
								intglVo, rulesVo, rulesDB, ollehMapService);
					}
				} else if ("2".equals(wmWorkOrder.getWorkType())) {
					if (StringUtil.isNotEmpty(wmWorkOrder.getTtId())) {
						executeGenerate(drls, new Integer(0), wmWorkOrder,
								intglVo, rulesVo, rulesDB, ollehMapService);
					}
				}

				List<ActivitySlaObjectVo> list = rulesDB.selectActivitySla(
						intglVo.getSourceId(),
						wmWorkOrder.getWorkType()
								+ wmWorkOrder.getOfficeScode()
								+ wmWorkOrder.getWorkOdrNum());

				if (list == null || list.size() == 0)
					continue;

				for (ActivitySlaObjectVo activitySlaObjectVo : list) {
					rulesVo.setSlaTypeId(activitySlaObjectVo.getSlaTypeId());
					executeGenerate(drls, new Integer(1), wmWorkOrder, intglVo,
							rulesVo, rulesDB, ollehMapService);
				}
			}
			break;
		default:
			for (Object order : intglVo.getSourceData()) {
				executeGenerate(drls, order, intglVo, rulesVo, rulesDB,
						ollehMapService);
			}
			break;
		}
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsScheduleDataObjectDeletion();
	}
}
