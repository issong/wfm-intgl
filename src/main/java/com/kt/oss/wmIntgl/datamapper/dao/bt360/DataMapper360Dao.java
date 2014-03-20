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
package com.kt.oss.wmIntgl.datamapper.dao.bt360;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.datamapper.domain.bt360.ActivitySlaObjectVo;
import com.kt.oss.wmIntgl.datamapper.domain.bt360.RamResourceObjectVo;

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
public interface DataMapper360Dao {
	public RamResourceObjectVo selectRamResource(RamResourceObjectVo param);

	public List<RamResourceObjectVo> selectRamResourceDivision(
			RamResourceObjectVo param);

	public List<ActivitySlaObjectVo> selectActivitySla(ActivitySlaObjectVo param);
}
