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
 * yngwie          2012. 11. 26.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.service;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.utils.StringUtil;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 26.
 * @see
 * 
 */
@Service
public class XPathService extends BaseService {

	private DocumentBuilderFactory factory;

	/**
	 * create DocumentBuilderFactory instance <br />
	 * 
	 * 
	 * @throws Exception
	 */
	private void createDocumentBuilderFactory() throws Exception {
		if (factory == null) {
			factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			factory.setIgnoringComments(true);
			factory.setIgnoringElementContentWhitespace(true);
			factory.setNamespaceAware(true);
		}
	}

	/**
	 * create Document instance <br />
	 * 
	 * 
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	private Document getDocument(String xml) throws Exception {
		createDocumentBuilderFactory();

		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder
				.parse(new InputSource(new StringReader(xml)));

		return document;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param xml
	 * @param elementStr
	 * @return
	 */
	public String getElementValue(String xml, String pathExp) {
		String result = null;

		try {
			xml = xml
					.replaceAll(
							"xmlns=\"http://360Scheduling.com/Schema/dsScheduleData.xsd\"",
							"");
			logger.debug(xml);
			Document document = getDocument(xml);
			// JXPathContext context = JXPathContext.newContext(document);
			// result = (String) context.getValue("//dataset_id");

			XPath xpath = XPathFactory.newInstance().newXPath();
			result = (String) xpath.evaluate(pathExp, document,
					XPathConstants.STRING);

		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
		}

		return result;
	}
}
