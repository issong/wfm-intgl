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
 * yngwie          2013. 1. 9.      First Draft.
 */
package com._360scheduling.schema.dssystemdata;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 9.
 * @see
 * 
 */

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public DsSystemData createDsSystemData() {
		return new DsSystemData();
	}

	public DsSystemData.Users createDsSystemDataUsers() {
		return new DsSystemData.Users();
	}

	public DsSystemData.UserGroup createDsSystemDataUserGroup() {
		return new DsSystemData.UserGroup();
	}

	public DsSystemData.UserExternalTask createDsSystemDataUserExternalTask() {
		return new DsSystemData.UserExternalTask();
	}

	public DsSystemData.SystemInput createDsSystemDataSystemInput() {
		return new DsSystemData.SystemInput();
	}

	public DsSystemData.SystemDataUpdate createDsSystemDataSystemDataUpdate() {
		return new DsSystemData.SystemDataUpdate();
	}
}
