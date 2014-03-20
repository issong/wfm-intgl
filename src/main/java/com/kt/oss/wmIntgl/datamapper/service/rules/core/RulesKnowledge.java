package com.kt.oss.wmIntgl.datamapper.service.rules.core;

import java.util.HashMap;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.core.io.Resource;

/**
 * WAS 기동시 Drools Rule 파일로부터 knowlwdgebase 를 사전에 로딩한다
 * 
 * @author song
 */
public class RulesKnowledge {

	private boolean preload = false;
	private Resource[] locations;

	private static Map<String, KnowledgeBase> knowledgeBaseList = null;

	public RulesKnowledge() {
		super();
	}

	public RulesKnowledge(boolean preload) {
		super();
		this.preload = preload;
	}

	public void setLocations(Resource[] locations) throws Exception {
		this.locations = locations;
		if (knowledgeBaseList == null)
			knowledgeBaseList = new HashMap<String, KnowledgeBase>();
		if (this.preload && this.locations != null) {
			DroolsEngine engine = new DroolsEngine();
			for (Resource location : this.locations) {
				knowledgeBaseList.put(location.getFilename(),
						engine.readKnowledgeBaseFile(location.getFile()));
			}
		}
	}

	public static KnowledgeBase getKnowledgeBase(String path) throws Exception {
		String drl = path.substring(path.lastIndexOf("/") + 1);
		if (knowledgeBaseList != null && knowledgeBaseList.containsKey(drl)) {
			return knowledgeBaseList.get(drl);
		} else {
			DroolsEngine engine = new DroolsEngine();
			return engine.readKnowledgeBase(path);
		}
	}

	public static StatefulKnowledgeSession getSession(String path)
			throws Exception {
		String drl = path.substring(path.lastIndexOf("/") + 1);
		if (knowledgeBaseList != null && knowledgeBaseList.containsKey(drl)) {
			return knowledgeBaseList.get(drl).newStatefulKnowledgeSession();
		} else {
			DroolsEngine engine = new DroolsEngine();
			return engine.readKnowledgeBase(path).newStatefulKnowledgeSession();
		}
	}
}
