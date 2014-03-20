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

import java.io.File;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public class DroolsEngine {

	/**
	 * Slf4j logger
	 */
	protected Logger logger;

	public DroolsEngine() {
		this.logger = LoggerFactory.getLogger(getClass());
	}

	/**
	 * this method deprecated
	 * 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	public StatefulKnowledgeSession session(String path) throws Exception {
		KnowledgeBase kbase = readKnowledgeBase(path);
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		return ksession;
	}

	/**
	 * Drools KnowledgeSession 생성
	 * 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public StatefulKnowledgeSession session(String path, KnowledgeBase kbase)
			throws Exception {
		if (kbase == null)
			kbase = readKnowledgeBase(path);
		return kbase.newStatefulKnowledgeSession();
	}

	/**
	 * Drools KnowledgeBase 생성 (drl path)
	 * 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public KnowledgeBase readKnowledgeBase(String path) throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(path),
				ResourceType.DRL);
		return createKnowledgeBase(path, kbuilder);
	}

	/**
	 * Drools KnowledgeBase 생성 (drl file)
	 * 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public KnowledgeBase readKnowledgeBaseFile(File file) throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newFileResource(file), ResourceType.DRL);
		return createKnowledgeBase(file.getCanonicalPath(), kbuilder);
	}

	/**
	 * @param path
	 * @param kbuilder
	 * @return
	 * @throws Exception
	 */
	private KnowledgeBase createKnowledgeBase(String path,
			KnowledgeBuilder kbuilder) throws Exception {
		logger.debug("Drools scan: " + path);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors) {
				logger.debug("Drools error: " + error);
			}
			throw new IllegalArgumentException(
					"Drools error: Could not parse knowledge..");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}
}
