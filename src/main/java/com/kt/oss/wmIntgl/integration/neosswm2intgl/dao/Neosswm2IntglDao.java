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
 * yngwie          2012. 12. 21.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.neosswm2intgl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.InputReferenceDataVo;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderKeyParamExt;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderParamAll;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderParamExt;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderStatusParamExt;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 12. 21.
 * @see
 * 
 */
@Repository
public interface Neosswm2IntglDao {

	InputReferenceDataVo getInputreference(InputReferenceDataVo vo);

	int updateInputreference(InputReferenceDataVo vo);

	int updateMapping360IoForVs1(WMMapping360IoVo vo);

	String selectMapping360IoForVs1(String csctId);

	int insertVS3SourceData(WMWorkOrderStatusParamExt vo);

	int insertVS8SourceData(WMWorkOrderKeyParamExt vo);

	int insertVS10SourceData(WMWorkOrderParamExt vo);

	int deleteVS3SourceData(String csctId);

	int deleteVS8SourceData(String csctId);

	int deleteVS10SourceData(String csctId);

	int updateVS3SourceData(WMWorkOrderParamAll vo);

	int updateVS8SourceData(WMWorkOrderParamAll vo);

	int updateVS10SourceData(WMWorkOrderParamAll vo);

	WMWorkOrderStatusParamExt selectVS3SourceData(String csctId);

	WMWorkOrderKeyParamExt selectVS8SourceData(String csctId);

	WMWorkOrderParamExt selectVS10SourceData(String csctId);

	List<WMWorkOrderParamAll> selectAllSourceData(String csctId);

}
