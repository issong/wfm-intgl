package com.kt.oss.wmIntgl.datamapper.service.rules.mapper;

import java.util.List;

import com._360scheduling.schema.dssystemdata.ObjectFactory;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesDB;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesMapper;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesVo;

public class MapperSystemInput extends RulesMapper {

	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		executeGenerate(drls, intglVo, rulesVo, rulesDB, ollehMapService);
		return getTargetData();
	}

	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsSystemDataSystemInput();
	}
}
