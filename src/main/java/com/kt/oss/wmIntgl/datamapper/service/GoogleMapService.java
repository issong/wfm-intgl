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
 * yngwie          2012. 11. 28.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.dao.intgl.OllehMapDao;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingBjsCodeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingOfficeExtVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.OllehMapLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 28.
 * @see
 * 
 */
@Service
public class GoogleMapService extends BaseService {

	private String MAP_URL = "http://maps.google.com/maps/api/geocode/xml";

	@Value("${ollehmap.loggingEnabled}")
	private boolean loggingEnabled;

	@Value("${ollehmap.timeout.connection}")
	private int CONNECTION_TIME_OUT;

	@Value("${ollehmap.timeout.socket}")
	private int SO_TIME_OUT; // default value : 10 sec

	private int EXECUTION_COUNT = 1;

	private Map<String, Double> NONE_POS = new HashMap<String, Double>();

	{
		NONE_POS.put("X", 0.123456);
		NONE_POS.put("Y", 0.789012);
	}

	private DocumentBuilderFactory factory;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private OllehMapDao ollehMapDao;

	/**
	 * return HttpClient reference <br />
	 * 
	 * 
	 * @return
	 */
	private DefaultHttpClient getClient() {
		HttpParams params = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(params, CONNECTION_TIME_OUT);
		HttpConnectionParams.setSoTimeout(params, SO_TIME_OUT);

		DefaultHttpClient client = new DefaultHttpClient(params);

		client.setHttpRequestRetryHandler(getRetryHandler());

		return client;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	private HttpRequestRetryHandler getRetryHandler() {
		HttpRequestRetryHandler myRetryHandler = new HttpRequestRetryHandler() {
			@Override
			public boolean retryRequest(IOException exception,
					int executionCount, HttpContext context) {
				if (executionCount >= EXECUTION_COUNT) {
					// Do not retry if over max retry count
					return false;
				}
				if (exception instanceof InterruptedIOException) {
					// Timeout
					return false;
				}
				if (exception instanceof UnknownHostException) {
					// Unknown host
					return false;
				}
				if (exception instanceof ConnectException) {
					// Connection refused
					return false;
				}
				if (exception instanceof SSLException) {
					// SSL handshake exception
					return false;
				}
				HttpRequest request = (HttpRequest) context
						.getAttribute(ExecutionContext.HTTP_REQUEST);
				boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
				if (idempotent) {
					// Retry if the request is considered idempotent
					return true;
				}
				return false;
			}

		};

		return myRetryHandler;
	}

	/**
	 * set secure key to http request header <br />
	 * 
	 * 
	 * @param method
	 */
	private void setHeaderKeys(DefaultHttpClient client) {
		client.addRequestInterceptor(new HttpRequestInterceptor() {
			@Override
			public void process(final HttpRequest request,
					final HttpContext context) throws HttpException,
					IOException {
				request.addHeader("Accept-Language", "ko");
			}

		});
	}

	/**
	 * get Latitude & Longitude <br />
	 * 
	 * 
	 * @param address
	 * @param csctId
	 * @return
	 */
	public Map<String, Double> getCoord(String address, IntglDataVo intglVo,
			String officeScode, String dongCode) {
		Map<String, Double> result = null;

		OllehMapLogVo vo = new OllehMapLogVo();

		vo.setEventId(intglVo.getEventId());
		vo.setEventCsctCd(intglVo.getSourceId());
		vo.setEventOfficeCd(officeScode);
		vo.setEventAddr(address);
		vo.setEventHostIp(NetUtil.getLocalAddr());

		DefaultHttpClient client = getClient();
		setHeaderKeys(client);
		try {
			long seq = eventHandlerFacade.getOllehMapEventId();
			vo.setSeq(seq);

			eventHandlerFacade.writeOllehMapLog(vo);

			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			paramList.add(new BasicNameValuePair("sensor", "false"));
			paramList.add(new BasicNameValuePair("address", address));

			HttpGet httpget = new HttpGet(MAP_URL + "?"
					+ URLEncodedUtils.format(paramList, "UTF-8"));
			HttpResponse response = client.execute(httpget);

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String str = getStreamToString(entity.getContent());
				vo.setEventDetailMsg(str);

				result = parseLocation(str);
			}
		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
			String errMsg = StringUtil.getStackTrace(e);
			vo.setEventMsg(errMsg != null ? errMsg.substring(0,
					errMsg.length() > 3000 ? 3000 : errMsg.length()) : errMsg);
		} finally {
			client.getConnectionManager().shutdown();
		}

		if (result == null) {
			vo.setEventResult("false");
		} else {
			vo.setEventResult("true");
			vo.setEventResultSource("GoogleMap");
		}

		if (result == null && dongCode != null) {
			WMMappingBjsCodeVo bjs = new WMMappingBjsCodeVo();
			bjs.setSearchDongCode(StringUtils.trim(dongCode));
			WMMappingBjsCodeVo bjsData = ollehMapDao.selectMappingBjsCode(bjs);

			if (bjsData != null) {
				result = new HashMap<String, Double>();
				result.put("X", bjsData.getLatitude());
				result.put("Y", bjsData.getLongitude());

				vo.setEventResultSource("Table from Dong : dongCode ["
						+ bjs.getSearchDongCode() + "]");
			}
		}

		if (result == null && officeScode != null) {
			WMMappingOfficeExtVo evo = new WMMappingOfficeExtVo();
			evo.setSearchOfficeCd(StringUtils.trim(officeScode));
			WMMappingOfficeExtVo data = ollehMapDao.selectMappingOfficeExt(evo);

			if (data != null) {
				result = new HashMap<String, Double>();
				result.put("X", data.getLatitude());
				result.put("Y", data.getLongitude());

				vo.setEventResultSource("Table from Office : officeScode ["
						+ evo.getSearchOfficeCd() + "]");
			}
		}

		if (result == null) {
			result = NONE_POS;
			vo.setEventResultSource("None");
		}

		if (loggingEnabled) {
			vo.setEventLatitude(result.get("X"));
			vo.setEventLongitude(result.get("Y"));

			eventHandlerFacade.updateOllehMapLog(vo);
		}

		return result;
	}
	
	public Map<String, Double> getCoord(String address) {
		Map<String, Double> result = null;

		OllehMapLogVo vo = new OllehMapLogVo();

		DefaultHttpClient client = getClient();
		setHeaderKeys(client);
		try {
			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			paramList.add(new BasicNameValuePair("sensor", "false"));
			paramList.add(new BasicNameValuePair("address", address));

			HttpGet httpget = new HttpGet(MAP_URL + "?"
					+ URLEncodedUtils.format(paramList, "UTF-8"));
			HttpResponse response = client.execute(httpget);

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String str = getStreamToString(entity.getContent());
				vo.setEventDetailMsg(str);

				result = parseLocation(str);
			}
		} catch (Exception e) {
			//logger.error(StringUtil.getStackTrace(e));
		} finally {
			client.getConnectionManager().shutdown();
		}

		return result;
	}
	
	
	
	/**
	 * return HTTP result inputStream to string <br />
	 * 
	 * 
	 * @param is
	 * @return
	 * @throws IOException
	 */
	private String getStreamToString(InputStream is) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

		StringBuilder sb = new StringBuilder();
		String s = null;
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}

		return sb.toString();
	}

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
	 * get local code <br />
	 * 
	 * 
	 * @param xml
	 * @return
	 */
	private Map<String, Double> parseLocation(String xml) throws Exception {
		Map<String, Double> result = null;

		logger.debug(xml);

		try {
			Document document = getDocument(xml);
			JXPathContext context = JXPathContext.newContext(document);

			String xValue = (String) context
					.getValue("//viewport/southwest/lat");

			String yValue = (String) context
					.getValue("//viewport/southwest/lng");

			logger.debug("xValue=" + xValue);
			logger.debug("yValue=" + yValue);

			if (xValue != null && yValue != null) {
				result = new HashMap<String, Double>();

				result.put("X", Double.parseDouble(xValue));
				result.put("Y", Double.parseDouble(yValue));
			}

		} catch (Exception e) {
			throw e;
		}
		return result;
	}

}
