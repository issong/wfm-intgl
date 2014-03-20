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
 * yngwie          2012. 10. 31.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.intgl2scheduler.service;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import com._360scheduling.interfaces.ReceiveWorkbenchDataResult;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.StringUtil;

/**
 * ReceiveWorkbenchDataResult Object marshalling & unmarshalling <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 31.
 * @see
 * 
 */
@Deprecated
public class ReceiveWorkbenchDataResultMarshalService extends BaseService {

	private JAXBContext context;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws JAXBException
	 */
	private void createContext() throws JAXBException {
		if (context == null) {
			context = JAXBContext.newInstance(ReceiveWorkbenchDataResult.class);
		}
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws JAXBException
	 */
	private Marshaller createMarshaller() throws JAXBException {
		createContext();

		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

		return marshaller;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws JAXBException
	 */
	private Unmarshaller createUnmarshaller() throws JAXBException {
		createContext();

		Unmarshaller unmarshaller = context.createUnmarshaller();
		return unmarshaller;
	}

	/**
	 * Input XML String to ReceiveWorkbenchDataResult instance <br />
	 * 
	 * 
	 * @param d
	 *            ReceiveWorkbenchDataResult
	 * @return String
	 * @throws ConversionException
	 */
	public String marshal(ReceiveWorkbenchDataResult d)
			throws ConversionException {
		StringWriter writer = new StringWriter();

		try {
			JAXBElement<ReceiveWorkbenchDataResult> element = new JAXBElement<ReceiveWorkbenchDataResult>(
					new QName("http://360Scheduling.com/Interfaces/",
							"ReceiveWorkbenchDataResult"),
					ReceiveWorkbenchDataResult.class, d);

			Marshaller marshaller = createMarshaller();
			marshaller.marshal(element, writer);
		} catch (JAXBException e) {
			logger.error(StringUtil.getStackTrace(e));
			throw new ConversionException(e);
		}

		return writer.toString();
	}

	/**
	 * Input ReceiveWorkbenchDataResult instance to XML String <br />
	 * 
	 * 
	 * @param strOutputXML
	 *            String
	 * @return ReceiveWorkbenchDataResult
	 * @throws ConversionException
	 */
	public ReceiveWorkbenchDataResult unMarshal(String strOutputXML)
			throws ConversionException {
		StringReader is = new StringReader(strOutputXML);
		ReceiveWorkbenchDataResult d = null;

		try {
			Unmarshaller unmarshaller = createUnmarshaller();
			d = (ReceiveWorkbenchDataResult) unmarshaller.unmarshal(is);
		} catch (JAXBException e) {
			logger.error(e.getMessage());
			throw new ConversionException(e.getMessage());
		}

		return d;
	}

}
