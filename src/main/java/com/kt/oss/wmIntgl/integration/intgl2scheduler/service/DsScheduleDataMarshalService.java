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
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.StringUtil;

/**
 * DsScheduleData Object marshalling & unmarshalling <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 31.
 * @see
 * 
 */
@Deprecated
@Service
public class DsScheduleDataMarshalService extends BaseService {

	private JAXBContext context;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @throws JAXBException
	 */
	private void createContext() throws JAXBException {
		if (context == null) {
			context = JAXBContext.newInstance(DsScheduleData.class);
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
	 * Input XML String to DsScheduleData instance <br />
	 * 
	 * 
	 * @param d
	 *            DsScheduleData
	 * @return String
	 * @throws ConversionException
	 */
	public String marshal(DsScheduleData d) throws ConversionException {
		StringWriter writer = new StringWriter();

		try {
			Marshaller marshaller = createMarshaller();
			marshaller.marshal(d, writer);
		} catch (JAXBException e) {
			logger.error(StringUtil.getStackTrace(e));
			throw new ConversionException(e);
		}

		return writer.toString();
	}

	/**
	 * Input DsScheduleData instance to XML String <br />
	 * 
	 * 
	 * @param strOutputXML
	 *            String
	 * @return DsScheduleData
	 * @throws ConversionException
	 */
	public DsScheduleData unMarshal(String strOutputXML)
			throws ConversionException {
		StringReader is = new StringReader(strOutputXML);
		DsScheduleData d = null;

		try {
			Unmarshaller unmarshaller = createUnmarshaller();
			d = (DsScheduleData) unmarshaller.unmarshal(is);
		} catch (JAXBException e) {
			logger.error(StringUtil.getStackTrace(e));
			throw new ConversionException(e);
		}

		return d;
	}

}
