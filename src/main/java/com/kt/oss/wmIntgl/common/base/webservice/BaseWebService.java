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
 * yngwie          2012. 11. 9.      First Draft.
 */
package com.kt.oss.wmIntgl.common.base.webservice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.kt.oss.wmIntgl.common.base.dao.BaseWebserviceDao;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.exception.ClientException;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 9.
 * @see
 * 
 */
@Service
public class BaseWebService extends BaseService {

	@Resource
	private WebServiceContext context;

	private BaseWebserviceDao baseWebserviceDao;

	public BaseWebserviceDao getBaseWebserviceDao() {
		return baseWebserviceDao;
	}

	@Autowired
	public void setBaseWebserviceDao(BaseWebserviceDao baseWebserviceDao) {
		this.baseWebserviceDao = baseWebserviceDao;
	}

	@Value("${system.envtype}")
	private String envType;

	public String getEnvType() {
		return envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	@Cacheable(cacheName = "acceptClientIpCache")
	private List<String> selectAcceptedClientList() {
		return baseWebserviceDao.selectAcceptedClientIp(this.envType);
	}

	@TriggersRemove(cacheName = { "acceptClientIpCache" }, removeAll = true)
	public void clearCache() {

	}

	/**
	 * get client ip address
	 * 
	 * @return remote ip
	 */
	protected String getRemoteAddr() {
		String ip = null;

		if (context != null) {
			MessageContext msgCtxt = context.getMessageContext();
			HttpServletRequest request = (HttpServletRequest) msgCtxt
					.get(MessageContext.SERVLET_REQUEST);

			// printHeaderInfo();

			ip = request.getHeader("NS-CLIENT-IP");

			if (ip == null || ip.length() == 0
					|| ip.toLowerCase().equals("unknown")) {
				ip = request.getRemoteAddr();
			}
		} else {
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}

		return ip;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private void printHeaderInfo() {
		if (context != null) {
			MessageContext msgCtxt = context.getMessageContext();
			HttpServletRequest request = (HttpServletRequest) msgCtxt
					.get(MessageContext.SERVLET_REQUEST);

			Map requestHeaders = (Map) msgCtxt
					.get(MessageContext.HTTP_REQUEST_HEADERS);

			Iterator iter = requestHeaders.keySet().iterator();

			while (iter.hasNext()) {
				String header = (String) iter.next();
				logger.warn("HTTP_REQUEST_HEADERS : request header [" + header
						+ "=" + requestHeaders.get(header) + "]");
			}

			Enumeration<?> headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String headerName = (String) headerNames.nextElement();
				logger.warn("SERVLET_REQUEST : request header [" + headerName
						+ "=" + request.getHeader(headerName) + "]");
			}
		}
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	protected void checkClientIp() throws ClientException {
		String clientIp = getRemoteAddr();

		List<String> acceptedClientList = selectAcceptedClientList();

		if (acceptedClientList != null && acceptedClientList.size() > 0) {
			boolean result = ArrayUtils.contains(acceptedClientList.toArray(),
					clientIp);

			if (!result) {
				throw new ClientException("Client IP [" + clientIp
						+ "] not accepted");
			}
		}
	}

}
