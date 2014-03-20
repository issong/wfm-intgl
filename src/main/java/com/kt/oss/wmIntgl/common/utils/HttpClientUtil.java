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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

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
public final class HttpClientUtil {

	public enum ClientType {
		HttpClient_GET("HttpClient_GET"), HttpClient_POST("HttpClient_POST"), URLConnection_GET(
				"URLConnection_GET"), URLConnection_POST("URLConnection_POST");

		private ClientType(final String s) {
			this.value = s;
		}

		private final String value;

		@Override
		public String toString() {
			return value;
		}
	}

	private int connectionTimeout;

	private int soTimeout; // default value : 10 sec

	private int executionCount = 1;

	private String encoding = "UTF-8";

	private String requestMethod = "GET";

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public int getSoTimeout() {
		return soTimeout;
	}

	public void setSoTimeout(int soTimeout) {
		this.soTimeout = soTimeout;
	}

	public int getExecutionCount() {
		return executionCount;
	}

	public void setExecutionCount(int executionCount) {
		this.executionCount = executionCount;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @return
	 */
	private DefaultHttpClient getClient() {
		HttpParams params = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(params,
				getConnectionTimeout());
		HttpConnectionParams.setSoTimeout(params, getSoTimeout());

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
				if (executionCount >= getExecutionCount()) {
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
	 * set key, value to http request header <br />
	 * 
	 * 
	 * @param params
	 */
	private void addHeader(DefaultHttpClient client,
			final Map<String, String> params) {
		client.addRequestInterceptor(new HttpRequestInterceptor() {
			@Override
			public void process(final HttpRequest request,
					final HttpContext context) throws HttpException,
					IOException {

				for (String key : params.keySet()) {
					String value = params.get(key);

					request.addHeader(key, value);
				}
			}
		});
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param params
	 * @return
	 */
	private List<NameValuePair> convertParams(Map<String, String> params) {
		List<NameValuePair> paramList = new ArrayList<NameValuePair>();

		for (String key : params.keySet()) {
			paramList.add(new BasicNameValuePair(key, params.get(key)));
		}

		return paramList;
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
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		StringBuilder sb = new StringBuilder();
		String s = null;
		while ((s = br.readLine()) != null) {
			sb.append(s);
		}

		return sb.toString();
	}

	/**
	 * process http request <br />
	 * 
	 * 
	 * @param url
	 * @param headerParams
	 * @param params
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public String service(String url, Map<String, String> headerParams,
			Map<String, String> params, ClientType type) throws Exception {
		String result = null;

		switch (type) {
		case HttpClient_POST:
			result = doPost(url, headerParams, params);
			break;

		case URLConnection_GET:
			result = doURLConnection(url, headerParams, params);
			break;

		case URLConnection_POST:
			setRequestMethod("POST");
			result = doURLConnection(url, headerParams, params);
			break;

		default:
			result = doGet(url, headerParams, params);
			break;
		}

		return result;
	}

	/**
	 * post method handler using Jakarta Httpclient ver 4 <br />
	 * 
	 * 
	 * @param url
	 * @param headerParams
	 * @param params
	 * @return
	 */
	private String doPost(String url, Map<String, String> headerParams,
			Map<String, String> params) throws Exception {

		String result = null;

		DefaultHttpClient client = getClient();

		if (headerParams != null) {
			addHeader(client, headerParams);
		}

		try {
			HttpPost httppost = new HttpPost(url);

			if (params != null) {
				httppost.setEntity(new UrlEncodedFormEntity(
						convertParams(params), getEncoding()));
			}

			HttpResponse response = client.execute(httppost);

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				result = getStreamToString(entity.getContent());
			}
		} catch (Exception e) {
			throw e;
		} finally {
			client.getConnectionManager().shutdown();
		}

		return result;
	}

	/**
	 * get method handler using Jakarta Httpclient ver 4 <br />
	 * 
	 * 
	 * @param url
	 * @param headerParams
	 * @param params
	 * @return
	 */
	private String doGet(String url, Map<String, String> headerParams,
			Map<String, String> params) throws Exception {

		String result = null;

		DefaultHttpClient client = getClient();

		if (headerParams != null) {
			addHeader(client, headerParams);
		}

		try {
			if (params != null) {
				List<NameValuePair> paramList = convertParams(params);
				url = url + "?"
						+ URLEncodedUtils.format(paramList, getEncoding());
			}

			HttpGet httpget = new HttpGet(url);

			ResponseHandler<String> rh = new BasicResponseHandler();
			result = client.execute(httpget, rh);
		} catch (Exception e) {
			throw e;
		} finally {
			client.getConnectionManager().shutdown();
		}

		return result;
	}

	/**
	 * get/post method handler using URLConnection api <br />
	 * 
	 * 
	 * @param url
	 * @param headerParams
	 * @param params
	 * @return
	 * @throws Exception
	 */
	private String doURLConnection(String url,
			Map<String, String> headerParams, Map<String, String> params)
			throws Exception {
		HttpURLConnection conn = null;

		StringBuilder result = new StringBuilder();
		try {

			StringBuilder paramStr = new StringBuilder();

			if (params != null) {
				for (String key : params.keySet()) {
					paramStr.append(key);
					paramStr.append("=");
					paramStr.append(URLEncoder.encode(params.get(key),
							getEncoding()));
					paramStr.append("&");
				}

				if (getRequestMethod().equals("GET")) {
					url += "?" + paramStr.toString();
				}
			}

			URL u = new URL(url);
			conn = (HttpURLConnection) u.openConnection();

			conn.setConnectTimeout(getConnectionTimeout());
			conn.setReadTimeout(getSoTimeout());
			conn.setRequestMethod(getRequestMethod());

			if (headerParams != null) {
				for (String key : headerParams.keySet()) {
					conn.setRequestProperty(key, headerParams.get(key));
				}
			}

			if (getRequestMethod().equals("POST")) {
				conn.setDoOutput(true);
				conn.setRequestProperty("Content-type",
						"application/x-www-form-urlencoded; charset="
								+ getEncoding());

				if (params != null) {
					PrintWriter out = new PrintWriter(conn.getOutputStream());
					out.write(paramStr.toString());
					out.flush();
				}
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), getEncoding()));
			String line;
			while ((line = reader.readLine()) != null) {
				result.append(line);
			}
			reader.close();
		} catch (Exception e) {
			throw e;
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}

		return result.toString();
	}
}
