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
 * yngwie          2012. 11. 29.      First Draft.
 */
package com.kt.oss.wmIntgl.common.utils;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 29.
 * @see
 * 
 */
/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 29.
 * @see
 * 
 */
public final class XMLParseUtil {

	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private Document document;
	private JXPathContext context;

	private String sourceXml;

	/**
	 * @param source
	 * @throws Exception
	 */
	public XMLParseUtil(String source) throws Exception {
		if (source == null) {
			throw new Exception("XML String is null");
		}
		sourceXml = source;

		createFactory();
		createBuilder();
		createDocument();
		createContext();
	}

	/**
	 * create DocumentBuilderFactory instance <br />
	 * 
	 * 
	 * @throws Exception
	 */
	private void createFactory() throws Exception {
		factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setIgnoringComments(true);
		factory.setIgnoringElementContentWhitespace(true);
		factory.setNamespaceAware(true);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws Exception
	 */
	private void createBuilder() throws Exception {
		builder = factory.newDocumentBuilder();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws Exception
	 */
	private void createDocument() throws Exception {
		document = builder.parse(new InputSource(new StringReader(sourceXml)));
	}

	/**
	 * create JXPathContext instance <br />
	 * 
	 * 
	 * @throws Exception
	 */
	private void createContext() throws Exception {
		context = JXPathContext.newContext(document);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param xml
	 * @param regx
	 * @param attribute
	 * @return
	 * @throws Exception
	 */
	public String getAttributeValue(String regx, String attribute)
			throws Exception {
		Element element = (Element) context.selectSingleNode(regx);

		return element.getAttribute(attribute);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param xml
	 * @param regx
	 * @return
	 * @throws Exception
	 */
	public String getNodeValue(String regx) throws Exception {
		return (String) context.getValue(regx);
	}
}
