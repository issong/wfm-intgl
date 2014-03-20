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
public class MapperActivity extends RulesMapper {

	/**
	 * Activity 항목의 데이터를 적재한다.
	 * 
	 * <pre>
	 * VS1, VS5, VS10 일경우
	 * case when [workType] = 1 then [workOdrTypeCode] + "-" + [svcId] 
	 * else  
	 *     case when [svcMainClsCode] = 1000 then "PS" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = 3000 then "AD" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = 9000 then "VO" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = IPM0 then "MT" + "-" + [svcId] 
	 * end
	 * 
	 * VS6C 일경우
	 * case when [workType] = 1 then [svcId] 
	 * else  
	 *     case when [svcMainClsCode] = 1000 then "PS" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = 3000 then "AD" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = 9000 then "VO" + "-" + [svcId] 
	 *     case when [svcMainClsCode] = IPM0 then "MT" + "-" + [svcId] 
	 * end
	 * </pre>
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
				if ("1".equals(wmWorkOrder.getWorkType())) {
					rulesVo.setExternalRef(wmWorkOrder.getWorkOdrTypeCode() + "-" + wmWorkOrder.getSvcId());
				} else {
					if ("1000".equals(wmWorkOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("PS-" + wmWorkOrder.getSvcId());
					else if ("3000".equals(wmWorkOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("AD-" + wmWorkOrder.getSvcId());
					else if ("9000".equals(wmWorkOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("VO-" + wmWorkOrder.getSvcId());
					else if ("IPM0".equals(wmWorkOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("MT-" + wmWorkOrder.getSvcId());
					else
						rulesVo.setExternalRef(null);
				}
				executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB,
						ollehMapService);
				break;
			case VS6C:
				WMAppointmentOrder wmAppointmentOrder = (WMAppointmentOrder) order;
				if ("1".equals(wmAppointmentOrder.getWorkType())) {
					rulesVo.setExternalRef(wmAppointmentOrder.getSvcId());
				} else {
					if ("1000".equals(wmAppointmentOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("PS-" + wmAppointmentOrder.getSvcId());
					else if ("3000".equals(wmAppointmentOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("AD-" + wmAppointmentOrder.getSvcId());
					else if ("9000".equals(wmAppointmentOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("VO-" + wmAppointmentOrder.getSvcId());
					else if ("IPM0".equals(wmAppointmentOrder.getSvcMainClsCode()))
						rulesVo.setExternalRef("MT-" + wmAppointmentOrder.getSvcId());
					else
						rulesVo.setExternalRef(null);
				}
				executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo,
						rulesDB, ollehMapService);
				break;
			default:
				rulesVo.setExternalRef(null);
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
		return new ObjectFactory().createDsScheduleDataActivity();
	}
}
