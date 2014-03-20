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
package com.kt.oss.wmIntgl.datamapper.dao.intgl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivitySlaConfigVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivityStatusVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivityTypeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.MappingTypeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.OfficeTransVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.TPRogVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WorkOrderStateVo;

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
@Repository
public interface DataMapperDao {
	public ActivityTypeVo selectMappingOdrType(ActivityTypeVo param);

	public ActivityStatusVo selectActivityStatusId(ActivityStatusVo param);

	public WorkOrderStateVo selectWMWorkOrderState(int statusId);

	public String selectCSCTId(String officeScode);

	public String selectReasonType(int reasonTypeId);

	public MappingTypeVo selectMappingType(String vsType);

	public List<ActivitySlaConfigVo> selectActivitySlaConfig(String csctCd);

	public String selectGradeName(String grdCd);

	public String selectOfficeName(String orgCd);

	public List<TPRogVo> selectTPRog(TPRogVo param);
	
	public List<OfficeTransVo> selectOfficeScodeTrans(OfficeTransVo param);
}
