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
package com.kt.oss.wmIntgl.datamapper.facade;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.DataMapperService;
import com.kt.oss.wmIntgl.datamapper.service.GoogleMapService;
import com.kt.oss.wmIntgl.integration.intgl2neosswm.client.WMServiceProxy;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Component
public class DataMapperFacade {

	@Autowired
	private DataMapperService dataMapperService;
	
	@Autowired
	private GoogleMapService googleMapService;

	@Autowired
	private WMServiceProxy wMServiceProxy;

	public void generateData(IntglDataVo intglVo) throws Exception {
		dataMapperService.generateData(intglVo);
	}
	
	public Map<String, Double> getCoord(String address) throws Exception {
		return googleMapService.getCoord(address);
	}
}
