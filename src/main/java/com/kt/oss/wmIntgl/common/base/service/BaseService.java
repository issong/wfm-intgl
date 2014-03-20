package com.kt.oss.wmIntgl.common.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base Service 입니다.<br />
 * Business 레이어를 구성하기 위한 기본 설정을 가진 추상 클래스입니다.
 * 
 * @author
 * @version 1.0
 */
public abstract class BaseService {

	/**
	 * Slf4j logger
	 */
	protected Logger logger;

	public BaseService() {
		this.logger = LoggerFactory.getLogger(getClass());
	}
}
