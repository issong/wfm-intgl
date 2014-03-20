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
 * yngwie          2012. 11. 16.      First Draft.
 */
package com.kt.oss.wmIntgl.common.constants;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 16.
 * @see
 * 
 */
public enum EventStatus {

	/**
	 * 0: 정상, 1:타입체크오류, 2:JMS오류, 3:데이터변환오류, 4:타켓전송오류, 5:타켓처리오류, 6:재처리실패, 7:재처리성공, 99:기타오류
	 */
	SUCCES(0)
	, ERROR_TYPECHECK(1)
	, ERROR_JMS(2)
	, ERROR_MAPPING(3)
	, ERROR_TARGET_SEND(4)
	, ERROR_TARGET_PROCESS(5)
	, ERROR_REPROCESS(6)
	, SUCCES_REPROCESS(7)
	, ERROR_ETC(99)
	, NONE(-1)
	;

	/**
	 * @param s
	 */
	private EventStatus(int s) {
		this.type = s;
	}

	private int type;

	
	public int getType() {
		return type;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(type);
	}
}
