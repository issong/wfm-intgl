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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com._360scheduling.schema.dsmodelling.ObjectFactory;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMResourceInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkTeam;
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
public class MapperRAMResourceDivision extends RulesMapper {

	/**
	 * RAMResourceDivision 항목의 데이터를 적재한다.
	 * 
	 * <pre>
	 * officeScodes의 ','를 Split 하여 작업국사별RAM_Resource_Division Set을 생성
	 * union
	 * wmWorkTeam Set 수만큼 조합하여 RAM_Resource_Division 생성
	 * [officeScode] + '_' + [workTeamCode] 매핑
	 * 
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
				String officeScodes = wmResourceInfo.getOfficeScodes(); // 백업후복원
				String[] officeScode = wmResourceInfo.getOfficeScodes().split(
						",");
				List<WMWorkTeam> wMWorkTeams = wmResourceInfo.getwMWorkTeams();

				// 360 mirror DB 에서 해당작업자의 Division 정보를 조회
				List<String> ramDivisionIdList = new ArrayList<String>();
				ramDivisionIdList.addAll(Arrays.asList(officeScodes));
				for (WMWorkTeam wmWorkTeam : wMWorkTeams) {
					ramDivisionIdList.add(wmWorkTeam.getOfficeScode() + "_"
							+ wmWorkTeam.getWorkTeamCode());
				}
				List<RamResourceObjectVo> list = rulesDB
						.selectRamResourceDivision(intglVo.getSourceId(),
								wmResourceInfo.getWorkerId(), ramDivisionIdList);
				// 정보조회를 위해 List 를 Map 으로 변환
				Map<String, RamResourceObjectVo> map = new HashMap<String, RamResourceObjectVo>();
				if (list != null && list.size() > 0) {
					for (RamResourceObjectVo ramResourceObjectVo : list) {
						map.put(ramResourceObjectVo.getRamDivisionId(),
								ramResourceObjectVo);
					}
				}

				for (int i = 0; i < officeScode.length; i++) {
					// 쿼리 결과의 [WITHIN_REGION_MULTIPLIER] 매핑, 없으면 생성 안함
					if (map.containsKey(officeScode[i])) {
						rulesVo.setWithinRegionMultiplier(map.get(
								officeScode[i]).getWithinRegionMultiplier());
					} else {
						rulesVo.setWithinRegionMultiplier(null);
					}

					wmResourceInfo.setOfficeScodes(officeScode[i]);
					executeGenerate(drls, new Integer(0), wmResourceInfo,
							intglVo, rulesVo, rulesDB, ollehMapService);
				}
				for (WMWorkTeam wmWorkTeam : wMWorkTeams) {
					// 쿼리 결과의 [WITHIN_REGION_MULTIPLIER] 매핑, 없으면 생성 안함
					if (map.containsKey(wmWorkTeam.getOfficeScode() + "_"
							+ wmWorkTeam.getWorkTeamCode())) {
						rulesVo.setWithinRegionMultiplier(map.get(
								wmWorkTeam.getOfficeScode() + "_"
										+ wmWorkTeam.getWorkTeamCode())
								.getWithinRegionMultiplier());
					} else {
						rulesVo.setWithinRegionMultiplier(null);
					}

					executeGenerate(drls, new Integer(1), wmResourceInfo,
							wmWorkTeam, intglVo, rulesVo, rulesDB,
							ollehMapService);
				}
				wmResourceInfo.setOfficeScodes(officeScodes);
			}
			break;
		default:
			for (Object order : intglVo.getSourceData()) {
				WMResourceInfo wmResourceInfo = (WMResourceInfo) order;
				String officeScodes = wmResourceInfo.getOfficeScodes(); // 백업후복원
				String[] officeScode = wmResourceInfo.getOfficeScodes().split(
						",");
				for (int i = 0; i < officeScode.length; i++) {
					wmResourceInfo.setOfficeScodes(officeScode[i]);
					executeGenerate(drls, new Integer(0), wmResourceInfo,
							intglVo, rulesVo, rulesDB, ollehMapService);
				}
				List<WMWorkTeam> wMWorkTeams = wmResourceInfo.getwMWorkTeams();
				for (WMWorkTeam wmWorkTeam : wMWorkTeams) {
					executeGenerate(drls, new Integer(1), wmResourceInfo,
							wmWorkTeam, intglVo, rulesVo, rulesDB,
							ollehMapService);
				}
				wmResourceInfo.setOfficeScodes(officeScodes);
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
		return new ObjectFactory().createDsModellingRAMResourceDivision();
	}
}
