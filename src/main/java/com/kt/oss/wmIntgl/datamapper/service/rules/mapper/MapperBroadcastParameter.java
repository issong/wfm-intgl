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
public class MapperBroadcastParameter extends RulesMapper {

	/**
	 * <pre>
	 * BroadcastParameter 항목의 데이터를 적재한다. (Broadcast 하나에 BroadcastParameter 3개)
	 * 
	 * VS1_Broadcast1 : VS1_BroadcastParameter1, VS1_BroadcastParameter2, (3은 사용안함)
	 * VS1_Broadcast2 : VS1_BroadcastParameter4, VS1_BroadcastParameter5, (6은 사용안함)
	 * VS1_Broadcast3 : VS1_BroadcastParameter7
	 * VS1_Broadcast4 : VS1_BroadcastParameter8
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
		case VS6:
			executeGenerate(drls, new Integer(0), intglVo, rulesVo, rulesDB,
					ollehMapService);
			executeGenerate(drls, new Integer(1), intglVo, rulesVo, rulesDB,
					ollehMapService);
			break;
		default:
			executeGenerate(drls, new Integer(0), intglVo, rulesVo, rulesDB,
					ollehMapService);
			executeGenerate(drls, new Integer(1), intglVo, rulesVo, rulesDB,
					ollehMapService);
			// 2 없음
			executeGenerate(drls, new Integer(3), intglVo, rulesVo, rulesDB,
					ollehMapService);
			executeGenerate(drls, new Integer(4), intglVo, rulesVo, rulesDB,
					ollehMapService);
			// 5 없음
			executeGenerate(drls, new Integer(6), intglVo, rulesVo, rulesDB,
					ollehMapService);
			executeGenerate(drls, new Integer(7), intglVo, rulesVo, rulesDB,
					ollehMapService);
			break;
		}
		return getTargetData();
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsScheduleDataBroadcastParameter();
	}
}
