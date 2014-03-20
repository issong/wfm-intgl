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
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentOrder;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrder;
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
public class MapperAdditionalAttribute extends RulesMapper {

	/**
	 * AdditionalAttribute 항목의 데이터를 적재한다.
	 * 
	 * @param drls
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		for (Object order : intglVo.getSourceData()) {
			switch (intglVo.getVsType()) {
			case VS1:
			case VS5:
			case VS10:
				WMWorkOrder wmWorkOrder = (WMWorkOrder) order;
				if (wmWorkOrder.getBt360SlaStartDt() != null) {
					executeGenerate(drls, new Integer(0), wmWorkOrder, intglVo,
							rulesVo, rulesDB, ollehMapService);
				}
				if (StringUtil.isNotEmpty(wmWorkOrder.getConcurrentSeq())) {
					executeGenerate(drls, new Integer(1), wmWorkOrder, intglVo,
							rulesVo, rulesDB, ollehMapService);
				}
				break;
			case VS6C:
				WMAppointmentOrder wmAppointmentOrder = (WMAppointmentOrder) order;
				if (wmAppointmentOrder.getBt360SlaStartDt() != null) {
					executeGenerate(drls, new Integer(0), wmAppointmentOrder,
							intglVo, rulesVo, rulesDB, ollehMapService);
				}
				if (StringUtil
						.isNotEmpty(wmAppointmentOrder.getConcurrentSeq())) {
					executeGenerate(drls, new Integer(1), wmAppointmentOrder,
							intglVo, rulesVo, rulesDB, ollehMapService);
				}
				break;
			default:
				executeGenerate(drls, order, intglVo, rulesVo, rulesDB,
						ollehMapService);
				break;
			}
		}
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsScheduleDataAdditionalAttribute();
	}
}
