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
 * yngwie          2012. 10. 19.      First Draft.
 */
package com.kt.oss.wmIntgl.common.constants;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 19.
 * @see
 * 
 */
public enum ScenarioType {
	VS1 // Initial Load
	, VS2 // Assignments returned to NeOSS
	, VS3, VS3A // Task Status Update
	, VS4 // Dispatch of Additional Work
	, VS5 // Dispatch of Additional Work
	, VS6, VS6A, VS6B, VS6C, VS6D, VS6E, VS7 // Manual Change from iSWD
	, VS7A // Authorise Change
	, VS8 // Cancel Work
	, VS10 // Work Modification
	, VS12 // Heartbeat from NeOSS
	, VS14 // Resource sync from NeOSS
	, VS14A // Resource sync from NeOSS (delete workerinfo)
	, VS14B // Resource sync from NeOSS (accept workerinfo)
	, VS14C // Worker service info from NeOSS
	, VS14D // Worker info add from NeOSS
	, VS90 // Raise Custom Exception
	, VS91 // Remove Custom Exception
	, VS20 // Lunch Break
	, VS7B //
	, VS7C // sendback TM
	, VS15A //
    , VS15D // create User Info
    , VS16 // add ARP data
	, VS16A // remove ARP data
	, NONE;
}
