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
 * yngwie          2012. 11. 13.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.dao.intgl;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingBjsCodeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingOfficeExtVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 13.
 * @see
 * 
 */
@Repository
public interface OllehMapDao {
	WMMappingOfficeExtVo selectMappingOfficeExt(WMMappingOfficeExtVo vo);

	WMMappingBjsCodeVo selectMappingBjsCode(WMMappingBjsCodeVo vo);

	int insertOfficeExtTemp(WMMappingBjsCodeVo vo);
}
