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

import com._360scheduling.schema.dsmodelling.ObjectFactory;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMResourceInfo;
import com.kt.oss.wmIntgl.datamapper.domain.bt360.RamResourceObjectVo;
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
public class MapperRAMResource extends RulesMapper {

	/**
	 * RAMResource 항목의 데이터를 적재한다.
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
		case VS14:
			for (Object order : intglVo.getSourceData()) {
				WMResourceInfo wmResourceInfo = (WMResourceInfo) order;

				// 360 mirror DB 에서 해당작업자의정보를 조회하여 해당 Element에 매핑
				RamResourceObjectVo vo = rulesDB.selectRamResource(
						intglVo.getSourceId(), wmResourceInfo.getWorkerId());

				// 쿼리 결과가 있으면 DB Data 매핑, 없으면 Default 값 매핑
				if (vo != null) {
					rulesVo.setRamLocationIdStart(vo.getRamLocationIdStart());
					rulesVo.setRamLocationIdEnd(vo.getRamLocationIdEnd());
					rulesVo.setRamRuleCollectionId(vo.getRamRuleCollectionId());
					rulesVo.setCostKm(vo.getCostKm());
					rulesVo.setUtilisation(vo.getUtilisation());
					rulesVo.setOutOfRegionMultiplier(vo
							.getOutOfRegionMultiplier());
				} else {
					rulesVo.setRamLocationIdStart(wmResourceInfo
							.getStartOfficeScode());
					rulesVo.setRamLocationIdEnd(wmResourceInfo
							.getEndOfficeScode());
					rulesVo.setRamRuleCollectionId("KT_0");
					rulesVo.setCostKm(30D);
					rulesVo.setUtilisation(100);
					rulesVo.setOutOfRegionMultiplier(0D);
				}

				executeGenerate(drls, wmResourceInfo, intglVo, rulesVo,
						rulesDB, ollehMapService);
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
		return new ObjectFactory().createDsModellingRAMResource();
	}
}
