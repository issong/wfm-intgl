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
package com.kt.oss.wmIntgl.datamapper.service.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com._360scheduling.schema.dsmodelling.DsModelling;
import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com._360scheduling.schema.dssystemdata.DsSystemData;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.AbstractEngine;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.Rules;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.Rules._Rules;
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
@Component
public class RuleEngine extends AbstractEngine {

	/**
	 * <pre>
	 * VS항목을 판단해서 해당 룰을 로딩하고, 룰에 따른 데이터를 매핑한다.
	 * VS별 변환목록 : intgl_rule_vs{VS번호}.drl
	 * </pre>
	 * 
	 * @param intglVo
	 * @throws Exception
	 */
	public void generateData(IntglDataVo intglVo) throws Exception {
		RulesVo rulesVo = getRulesVo(intglVo);

		// 룰을 로딩한다. (VS에서 매핑해야할 DRL 리스트)
		List<_Rules> drlList = loadRuleData(intglVo, rulesVo);

		// 데이터 변환처리를 수행한다.
		makeGenerateData(intglVo, rulesVo, drlList);
	}

	/**
	 * 엔진 기초정보 세팅
	 */
	private RulesVo getRulesVo(IntglDataVo intglVo) {
		// 룰 엔진에 전달할 내용 세팅
		RulesVo rulesVo = new RulesVo();
		rulesVo.setBroadcastUrl(broadcastUrl);
		rulesVo.setInputReferenceId(intglVo.getInputReferenceId());
		return rulesVo;
	}

	/**
	 * VS별로 룰을 로딩한다.
	 * 
	 * @param intglVo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private List<_Rules> loadRuleData(IntglDataVo intglVo, RulesVo rulesVo)
			throws Exception {
		List<Object> dataObject = generate(_Rules.intgl_rule, intglVo, rulesVo);
		if (dataObject == null || dataObject.size() == 0)
			throw new Exception("Ruleset is empty..");
		return (List<_Rules>) dataObject.get(0);
	}

	/**
	 * 로딩한 룰을 통해 데이터를 적재한다.
	 * 
	 * 360일경우 DsScheduleData에 담아서 List에 넣고, Legacy일경우 List에 직접 넣는다.
	 * 
	 * @param intglVo
	 * @param drlList
	 * @return
	 * @throws Exception
	 */
	private void makeGenerateData(IntglDataVo intglVo, RulesVo rulesVo,
			List<_Rules> drlList) throws Exception {

		// 매핑전 데이터 처리
		List<Object> oldSourceData = beforeMakeGenerateData(intglVo);

		// TargetData를 세팅한다. (수신자가 360인가 아닌가 판단)
		if (SystemType.Scheduling360.toString().equals(intglVo.getReceiver())) {
			intglVo.setTargetData(makeGenerateDataTo360(intglVo, rulesVo,
					drlList));
		} else {
			intglVo.setTargetData(makeGenerateDataToLegacy(intglVo, rulesVo,
					drlList));
		}

		// 처리후 복원
		if (oldSourceData != null)
			afterMakeGenerateData(intglVo, oldSourceData);
	}

	/**
	 * NeOss -> IL -> 360 방향의 변환 데이터를 세팅
	 * 
	 * @param intglVo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	private List<Object> makeGenerateDataTo360(IntglDataVo intglVo,
			RulesVo rulesVo, List<_Rules> drlList) throws Exception {
		List<Object> targetData = new ArrayList<Object>();
		DsScheduleData dsScheduleData = null;
		DsSystemData dsSystemData = null;
		DsModelling dsModelling = null;
		for (_Rules drls : drlList) {
			// 로딩한 룰(drls)을 통해 입력 데이터를 파싱해서 출력데이터에 적재한다.
			List<Object> dataObject = generate(drls, intglVo, rulesVo);
			for (Object data : (ArrayList) dataObject) {
				if (data instanceof DsModelling.RAMUpdate
						|| data instanceof DsModelling.RAMResource
						|| data instanceof DsModelling.RAMResourceDivision
						|| data instanceof DsModelling.RAMDataUpdate
						|| data instanceof DsModelling.RAMDivision
						|| data instanceof DsModelling.RAMUnavailability
						|| data instanceof DsModelling.RAMTimePattern
						|| data instanceof DsModelling.RAMTimePatternTemplate
						|| data instanceof DsModelling.RAMTimePatternTemplateItem) {
					if (dsModelling == null)
						dsModelling = new DsModelling();
					dsModelling
							.getRamUpdateOrRAMResourceOrRAMResourceDivision()
							.add(data);
				} else if (data instanceof DsSystemData.SystemDataUpdate
						|| data instanceof DsSystemData.SystemInput
						|| data instanceof DsSystemData.UserExternalTask
						|| data instanceof DsSystemData.UserGroup
						|| data instanceof DsSystemData.Users) {
					if (dsSystemData == null)
						dsSystemData = new DsSystemData();
					dsSystemData.getUsersOrUserGroupOrUserExternalTask().add(
							data);
				} else {
					if (dsScheduleData == null)
						dsScheduleData = new DsScheduleData();
					dsScheduleData.getShiftPatternOrActivityOrActivitySLA()
							.add(data);
				}
			}
		}
		if (dsScheduleData != null)
			targetData.add(dsScheduleData);
		if (dsSystemData != null)
			targetData.add(dsSystemData);
		if (dsModelling != null)
			targetData.add(dsModelling);
		return targetData;
	}

	/**
	 * 360 -> IL -> NeOSS 방향의 변환 데이터를 세팅
	 * 
	 * @param intglVo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	private List<Object> makeGenerateDataToLegacy(IntglDataVo intglVo,
			RulesVo rulesVo, List<_Rules> drlList) throws Exception {
		List<Object> targetData = new ArrayList<Object>();
		for (_Rules drls : drlList) {
			// 로딩한 룰(drls)을 통해 입력 데이터를 파싱해서 출력데이터에 적재한다.
			List<Object> dataObject = generate(drls, intglVo, rulesVo);
			for (Object data : (ArrayList) dataObject) {
				targetData.add(data);
			}
		}
		return targetData;
	}

	/**
	 * 룰을 수행해서 데이터를 매핑한다.
	 */
	private List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo) throws Exception {

		// 룰을 처리할 객체를 반환한다.
		Rules rules = drls.getMapper();

		// 데이터 변환처리를 수행한다.
		List<Object> result = rules.generate(drls, intglVo, rulesVo, rulesDB,
				ollehMapService);

		return result;
	}
}
