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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com._360scheduling.schema.dsmodelling.ObjectFactory;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMResourceHolidayInfo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.TPRogVo;
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
public class MapperRAMUnavailability extends RulesMapper {

	/**
	 * RAMUnavailability 항목의 데이터를 적재한다.
	 * 
	 * @param drls
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		List<TPRogVo> list = rulesDB.selectTPRog();
		Map<String, TPRogVo> tpRogMap = new HashMap<String, TPRogVo>();
		for (TPRogVo tpRogVo : list) {
			// 사용가능한것만 추출
			if ("Y".equals(tpRogVo.getUseYn()))
				tpRogMap.put(tpRogVo.getTprog(), tpRogVo);
		}

		for (Object order : intglVo.getSourceData()) {
			WMResourceHolidayInfo wmResourceHolidayInfo = (WMResourceHolidayInfo) order;
			// 복무타입대분류코드가 있을경우에만 생성
			if (tpRogMap.containsKey(wmResourceHolidayInfo.getHolidayTcode()))
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
		return new ObjectFactory().createDsModellingRAMUnavailability();
	}
}
