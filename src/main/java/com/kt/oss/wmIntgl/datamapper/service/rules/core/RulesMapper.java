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
package com.kt.oss.wmIntgl.datamapper.service.rules.core;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public abstract class RulesMapper implements Rules {

	private List<Object> targetData = new ArrayList<Object>();

	private KnowledgeBase knowledgeBase = null;

	/**
	 * 데이터 매핑을 수행한다.
	 * 
	 * @param drls
	 * @param obj
	 * @throws Exception
	 */
	protected void executeGenerate(_Rules drls, Object... objs)
			throws Exception {
		// 데이터 검증시 매핑에 유용하지 않으면 skip 함
		if (!isEnableSourceObject(objs))
			return;

		if (knowledgeBase == null) {
			knowledgeBase = RulesKnowledge.getKnowledgeBase(getDrlFile(drls
					.name()));
		}

		StatefulKnowledgeSession ksession = knowledgeBase
				.newStatefulKnowledgeSession();

		// StatefulKnowledgeSession ksession = RulesKnowledge
		// .getSession(getDrlFile(drls.name()));

		Object targetObject = getTargetObject();

		for (int i = 0; i < objs.length; i++) {
			ksession.insert(objs[i]);
		}
		ksession.insert(targetObject);
		ksession.fireAllRules();
		ksession.dispose();

		setTargetData(targetObject);

		ksession = null;
	}

	/**
	 * 룰파일명을 정의한다.
	 * 
	 * @param midFix
	 * @return
	 */
	protected String getDrlFile(Object... midFix) {
		StringBuilder sb = new StringBuilder();
		sb.append(PATH);
		for (int i = 0; i < midFix.length; i++) {
			sb.append(String.valueOf(midFix[i]));
		}
		sb.append(EXTS);
		return sb.toString();
	}

	/**
	 * targetData를 세팅한다. (중복값이 있으면 skip 한다)
	 * 
	 * @param obj
	 */
	private void setTargetData(Object obj) {
		if (isEnableTargetObject(obj))
			targetData.add(obj);
	}

	/**
	 * 최종 매핑된 데이터를 리턴한다.
	 * 
	 * @return
	 */
	protected List<Object> getTargetData() {
		return targetData;
	}

	/**
	 * 하위클래스에서 결과를 저장할 객체를 생성한다.
	 * 
	 * @return
	 */
	protected abstract Object getTargetObject();

	/**
	 * source object 에서 변환관련 가능여부를 체크해서, 변환룰 적용할지 여부를 결정, true:변환가능, false:변환안함
	 * 
	 * @param obj
	 * @return
	 */
	protected boolean isEnableSourceObject(Object... objs) {
		return true;
	}

	/**
	 * target object 에서 중복여부 및 null등을 체크해서, ADD 할지 여부를 결정, true:세팅가능, false:세팅불가
	 * 
	 * @param obj
	 * @return
	 */
	protected boolean isEnableTargetObject(Object obj) {
		return true;
	}
}
