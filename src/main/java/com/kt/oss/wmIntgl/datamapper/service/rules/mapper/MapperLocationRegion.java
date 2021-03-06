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

import com._360scheduling.schema.dsscheduledata.DsScheduleData.LocationRegion;
import com._360scheduling.schema.dsscheduledata.ObjectFactory;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
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
public class MapperLocationRegion extends RulesMapper {

	/**
	 * LocationRegion 항목의 데이터를 적재한다.
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
		return new ObjectFactory().createDsScheduleDataLocationRegion();
	}

	/**
	 * target object 에서 중복여부 및 null등을 체크해서, ADD 할지 여부를 결정, true:세팅가능, false:세팅불가
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	protected boolean isEnableTargetObject(Object obj) {
		LocationRegion locationRegion = (LocationRegion) obj;
		// 둘중의 하나라도 null 이면 add 시키지 않는다
		if (locationRegion.getLocationId() == null
				|| locationRegion.getRegionId() == null
				|| locationRegion.getLocationId().trim().length() == 0
				|| locationRegion.getRegionId().trim().length() == 0)
			return false;

		// 중복된 값이 있으면 add 시키지 않는다
		for (Object element : getTargetData()) {
			if (element instanceof LocationRegion) {
				LocationRegion data = (LocationRegion) element;
				if (locationRegion.getLocationId().equals(data.getLocationId())
						&& locationRegion.getRegionId().equals(
								data.getRegionId()))
					return false;
			}
		}
		return super.isEnableTargetObject(obj);
	}
}
