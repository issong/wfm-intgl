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
public class MapperResourcePreference extends RulesMapper {

	/**
	 * ResourcePreference 항목의 데이터를 적재한다.
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
			executeGenerate(drls, order, intglVo, rulesVo, rulesDB,
					ollehMapService);
		}
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsScheduleDataResourcePreference();
	}

	/**
	 * source object 에서 변환관련 가능여부를 체크해서, 변환룰 적용할지 여부를 결정, true:변환가능, false:변환안함
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	protected boolean isEnableSourceObject(Object... objs) {
		for (Object element : objs) {
			if (element instanceof WMWorkOrder) {
				WMWorkOrder data = (WMWorkOrder) element;
				if (data.getBt360ExpWorkerId() == null
						|| data.getBt360ExpWorkerId().trim().length() == 0)
					return false;
			} else if (element instanceof WMAppointmentOrder) {
				WMAppointmentOrder data = (WMAppointmentOrder) element;
				if (data.getBt360ExpWorkerId() == null
						|| data.getBt360ExpWorkerId().trim().length() == 0)
					return false;
			}
		}
		return super.isEnableSourceObject(objs);
	}
}
