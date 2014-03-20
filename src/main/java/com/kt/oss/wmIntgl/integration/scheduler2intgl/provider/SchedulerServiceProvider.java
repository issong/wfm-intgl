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
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.springframework.stereotype.Component;

import com._360scheduling.interfaces.ReceiveWorkbenchDataResult;

/**
 * WebService Interface from 360 System <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@Component
@WebService(targetNamespace = "http://360Scheduling.com/Interfaces/")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public interface SchedulerServiceProvider {

	@WebResult(name = "ReceiveStringDataResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
	@RequestWrapper(localName = "ReceiveStringData", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveStringData")
	@WebMethod(operationName = "ReceiveStringData", action = "http://360Scheduling.com/Interfaces/ReceiveStringData")
	@ResponseWrapper(localName = "ReceiveStringDataResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveStringDataResponse")
	public boolean ReceiveStringData(
			@WebParam(name = "strOutputXML", targetNamespace = "http://360Scheduling.com/Interfaces/") String strOutputXML);

	@WebResult(name = "ReceiveWorkbenchDataResult", targetNamespace = "http://360Scheduling.com/Interfaces/")
	@RequestWrapper(localName = "ReceiveWorkbenchData", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveWorkbenchData")
	@WebMethod(operationName = "ReceiveWorkbenchData", action = "http://360Scheduling.com/Interfaces/ReceiveWorkbenchData")
	@ResponseWrapper(localName = "ReceiveWorkbenchDataResponse", targetNamespace = "http://360Scheduling.com/Interfaces/", className = "com._360scheduling.interfaces.ReceiveWorkbenchDataResponse")
	public ReceiveWorkbenchDataResult ReceiveWorkbenchData(
			@WebParam(name = "strInputXML", targetNamespace = "http://360Scheduling.com/Interfaces/") String input,
			@WebParam(name = "strLanguageId", targetNamespace = "http://360Scheduling.com/Interfaces/") String languageId);

}
