package com.kt.oss.wmIntgl.common.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base Controller 입니다.<br />
 * 웹 요청을 처리하기 위한 Controller 레이어를 정의한 추상 클래스입니다.
 * 
 * @author
 * @version 1.0
 */
public abstract class BaseController {

	/**
	 * Slf4j logger
	 */
	protected Logger logger;

	public BaseController() {
		this.logger = LoggerFactory.getLogger(getClass());
	}
}
