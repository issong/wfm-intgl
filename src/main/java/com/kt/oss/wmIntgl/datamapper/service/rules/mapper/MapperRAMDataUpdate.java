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
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMDeleteResourceInfo;
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
public class MapperRAMDataUpdate extends RulesMapper {

	/**
	 * RAMDataUpdate 항목의 데이터를 적재한다.
	 * 
	 * <pre>
	 * vsType == VS14 일경우..
	 * 360 mirror DB 에서 아래 SQL을 실행하여서 해당작업자의 ram_division_id가 존재하면 
	 * 해당 ram_division_id 수만큼 해당 Set 생성
	 * 
	 * vsType == VS14A 일경우..
	 * [officeScodes]에 값이 null 이거나 ''인 경우 해당 Set만 생성
	 * [officeScodes]에 값이 있을 경우 ',' 로 Split하여 해당 Set 설정
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
		switch (intglVo.getVsType()) {
		case VS14:
			for (Object order : intglVo.getSourceData()) {
				WMResourceInfo wmResourceInfo = (WMResourceInfo) order;
				// 360 mirror DB 에서 해당작업자의 ram_division_id 조회
				List<RamResourceObjectVo> list = rulesDB
						.selectRamResourceDivision(intglVo.getSourceId(),
								wmResourceInfo.getWorkerId(), null);

				if (list == null || list.size() == 0)
					continue;

				for (RamResourceObjectVo ramResourceObjectVo : list) {
					rulesVo.setRamDivisionId(ramResourceObjectVo
							.getRamDivisionId());
					executeGenerate(drls, wmResourceInfo, intglVo, rulesVo,
							rulesDB, ollehMapService);
				}
			}
			break;
		case VS14A:
			for (Object order : intglVo.getSourceData()) {
				WMDeleteResourceInfo wmDeleteResourceInfo = (WMDeleteResourceInfo) order;
				String officeScodes = wmDeleteResourceInfo.getOfficeScodes(); // 백업후복원
				if (StringUtil.isEmpty(wmDeleteResourceInfo.getOfficeScodes())) {
					wmDeleteResourceInfo.setOfficeScodes(null);
					executeGenerate(drls, order, intglVo, rulesVo, rulesDB,
							ollehMapService);
				} else {
					String[] officeScode = wmDeleteResourceInfo
							.getOfficeScodes().split(",");
					for (int i = 0; i < officeScode.length; i++) {
						wmDeleteResourceInfo.setOfficeScodes(officeScode[i]);
						executeGenerate(drls, wmDeleteResourceInfo, intglVo,
								rulesVo, rulesDB, ollehMapService);
					}
				}
				wmDeleteResourceInfo.setOfficeScodes(officeScodes);
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
		return new ObjectFactory().createDsModellingRAMDataUpdate();
	}
}
