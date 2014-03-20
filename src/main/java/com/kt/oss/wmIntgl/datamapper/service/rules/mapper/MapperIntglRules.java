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
import java.util.List;

import com.kt.oss.wmIntgl.common.constants.ScenarioType;
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
public class MapperIntglRules extends RulesMapper {

	protected ScenarioType vsType;

	/**
	 * VS별로 룰을 로딩한다.
	 * 
	 * @param vsType
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		vsType = intglVo.getVsType();
		executeGenerate(drls);
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ArrayList<_Rules>();
	}

	/**
	 * DRL 파일명을 생성한다.
	 */
	@Override
	protected String getDrlFile(Object... midFix) {
		List<Object> list = new ArrayList<Object>();
		list.add("vs/");
		list.addAll(Arrays.asList(midFix));
		list.add("_");
		list.add(vsType.toString().toLowerCase());
		return super.getDrlFile(list.toArray());
	}
}
