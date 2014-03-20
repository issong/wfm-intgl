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
 * yngwie          2012. 10. 29.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.service;

import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.utils.HttpClientUtil;
import com.kt.oss.wmIntgl.common.utils.HttpClientUtil.ClientType;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.common.utils.XMLParseUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.dao.intgl.OllehMapDao;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.MapResultVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingBjsCodeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WMMappingOfficeExtVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.OllehMapLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

import com.kt.oss.wmIntgl.datamapper.service.GoogleMapService;;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 29.
 * @see
 * 
 */
@Service
public class OllehMapService extends BaseService {

	@Value("${ollehmap.url.localsearch}")
	private String URL_LOCAL_SEARCH;

	@Value("${ollehmap.url.coordconv}")
	private String URL_COORDCONV;

	@Value("${ollehmap.appkey}")
	private String appKey;

	@Value("${ollehmap.testMode}")
	private boolean testMode;

	@Value("${ollehmap.loggingEnabled}")
	private boolean loggingEnabled;

	@Value("${ollehmap.timeout.connection}")
	private int connectionTimeout;

	@Value("${ollehmap.timeout.socket}")
	private int soTimeout; // default value : 10 sec

	@Value("${ollehmap.clienttype}")
	private String clientType;

	@Value("${ollehmap.loglevel}")
	private String logLevel;

	@Value("${ollehmap.writedetail}")
	private boolean writeDetail;
	
	@Autowired
	private GoogleMapService googleMapService; 
	
	private Map<String, Double> NONE_POS = new HashMap<String, Double>();

	{
		NONE_POS.put("X", 0.123456);
		NONE_POS.put("Y", 0.789012);
	}

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private OllehMapDao ollehMapDao;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param address
	 * @return
	 */
	public MapResultVo getCoord(String address) {
		MapResultVo mv = new MapResultVo();
		Map<String, Double> result = null;

		OllehMapLogVo vo = new OllehMapLogVo();
		try {
			Map<String, String> local = getLocalSearch(address, vo);

			if (local != null) {
				mv.setUtmkX(Double.parseDouble(local.get("X")));
				mv.setUtmkY(Double.parseDouble(local.get("Y")));
				mv.setLocalSearchResult(local != null ? true : false);
				mv.setLocalSearchResultXML(vo.getEventDetailMsg());

				vo = new OllehMapLogVo();

				result = getCoordConv(local, vo);

				mv.setCoordConvResultXML(vo.getEventDetailMsg());

				if (result != null) {
					mv.setCoordConvResult(result != null ? true : false);
					mv.setLatitude(result.get("X"));
					mv.setLongitude(result.get("Y"));
				}
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		return mv;
	}

	/**
	 * get Latitude & Longitude <br />
	 * 
	 * 
	 * @param address
	 * @param intglVo
	 * @param officeScode
	 * @param dongCode
	 * @return
	 */
	public Map<String, Double> getCoord(String address, IntglDataVo intglVo,
			String officeScode, String dongCode) {
		//return getCoord(address, intglVo, officeScode, dongCode, false);
		return googleMapService.getCoord(address, intglVo, officeScode, dongCode);
	}

	/**
	 * get Latitude & Longitude <br />
	 * 
	 * 
	 * @param address
	 * @param intglVo
	 * @param officeScode
	 * @param dongCode
	 * @param ollehMapOnly
	 * @return
	 */
	public Map<String, Double> getCoord(String address, IntglDataVo intglVo,
			String officeScode, String dongCode, boolean ollehMapOnly) {
		Timestamp startTime = getCurrentTimestamp();

		Map<String, Double> result = null;

		if (testMode) {
			return NONE_POS;
		}

		// initialize current log level
		OllehMapLogVo.LogLevel currentLogLevel = OllehMapLogVo.LogLevel.All;

		OllehMapLogVo.LogLevel configLogLevel = OllehMapLogVo.LogLevel
				.valueOf(logLevel);

		OllehMapLogVo vo = new OllehMapLogVo();

		vo.setEventId(intglVo.getEventId());
		vo.setEventCsctCd(intglVo.getSourceId());
		vo.setEventOfficeCd(officeScode);
		vo.setEventAddr(address);
		vo.setEventHostIp(NetUtil.getLocalAddr());
		vo.setWriteDetail(writeDetail);

		try {
			Map<String, String> local = getLocalSearch(address, vo);

			if (local != null) {
				result = getCoordConv(local, vo);
			}
		} catch (Exception e) {
			String errMsg = StringUtil.getStackTrace(e);
			logger.error(errMsg);
			vo.setEventMsg(StringUtils.abbreviate(errMsg, 3000));

			currentLogLevel = OllehMapLogVo.LogLevel.Error;
		}

		if (result == null) {
			vo.setEventResult("false");
		} else {
			vo.setEventResult("true");
			vo.setEventResultSource("OllehMap");
		}

		if (!ollehMapOnly) {

			if (result == null && dongCode != null) {
				WMMappingBjsCodeVo bjs = new WMMappingBjsCodeVo();
				bjs.setSearchDongCode(StringUtils.trim(dongCode));
				WMMappingBjsCodeVo bjsData = ollehMapDao
						.selectMappingBjsCode(bjs);

				if (bjsData != null) {
					result = new HashMap<String, Double>();
					result.put("X", bjsData.getLatitude());
					result.put("Y", bjsData.getLongitude());

					vo.setEventResultSource("Table from Dong : dongCode ["
							+ bjs.getSearchDongCode() + "]");

					currentLogLevel = OllehMapLogVo.LogLevel.UpToDongTable;
				}
			}

			if (result == null && officeScode != null) {
				WMMappingOfficeExtVo evo = new WMMappingOfficeExtVo();
				evo.setSearchOfficeCd(StringUtils.trim(officeScode));
				WMMappingOfficeExtVo data = ollehMapDao
						.selectMappingOfficeExt(evo);

				if (data != null) {
					result = new HashMap<String, Double>();
					result.put("X", data.getLatitude());
					result.put("Y", data.getLongitude());

					vo.setEventResultSource("Table from Office : officeScode ["
							+ evo.getSearchOfficeCd() + "]");

					currentLogLevel = OllehMapLogVo.LogLevel.UpToOfficeTable;
				}
			}
		}

		if (result == null) {
			result = NONE_POS;
			vo.setEventResultSource(ollehMapOnly ? "ollehMapOnly" : "None");

			currentLogLevel = OllehMapLogVo.LogLevel.None;
		}

		logger.debug("configLogLevel=" + configLogLevel);
		logger.debug("currentLogLevel=" + currentLogLevel);

		Timestamp endTime = getCurrentTimestamp();

		if (loggingEnabled) {
			vo.setEventLatitude(result.get("X"));
			vo.setEventLongitude(result.get("Y"));

			vo.setEventStartDt(startTime);
			vo.setEventEndDt(endTime);

			if (configLogLevel.getValue() >= currentLogLevel.getValue()) {
				eventHandlerFacade.writeOllehMapLog(vo);
			}
		}

		return result;
	}

	/**
	 * get UTMK coordinates <br />
	 * 
	 * 
	 * @param address
	 * @return
	 */
	private Map<String, String> getLocalSearch(String address, OllehMapLogVo vo)
			throws Exception {
		Map<String, String> result = null;

		HttpClientUtil httpclient = new HttpClientUtil();
		httpclient.setConnectionTimeout(connectionTimeout);
		httpclient.setSoTimeout(soTimeout);

		Map<String, String> headerParams = new HashMap<String, String>();
		headerParams.put("APPKEY", appKey);

		Map<String, String> params = new HashMap<String, String>();
		params.put("Query", address);
		params.put("option", "1");

		String str = httpclient.service(URL_LOCAL_SEARCH, headerParams, params,
				ClientType.valueOf(clientType));
		vo.setEventDetailMsg(str);

		if (str != null) {
			result = parseLocal(str);
		}

		return result;

	}

	/**
	 * get latitude, longitude <br />
	 * 
	 * 
	 * @param local
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	private Map<String, Double> getCoordConv(Map<String, String> local,
			OllehMapLogVo vo) throws Exception {
		Map<String, Double> result = null;

		HttpClientUtil httpclient = new HttpClientUtil();
		httpclient.setConnectionTimeout(connectionTimeout);
		httpclient.setSoTimeout(soTimeout);

		Map<String, String> headerParams = new HashMap<String, String>();
		headerParams.put("APPKEY", appKey);

		Map<String, String> params = new HashMap<String, String>();
		params.put("PX", local.get("X"));
		params.put("PY", local.get("Y"));
		params.put("SRC_COORDTYPE", "UTMK");
		params.put("DEST_COORDTYPE", "LLW");

		String str = httpclient.service(URL_COORDCONV, headerParams, params,
				ClientType.valueOf(clientType));
		vo.setEventDetailMsg(str);

		if (str != null) {
			result = parseCoord(str);
		}

		return result;
	}

	/**
	 * get local code <br />
	 * 
	 * 
	 * @param xml
	 * @return
	 */
	private Map<String, Double> parseCoord(String xml) throws Exception {
		Map<String, Double> result = null;

		// logger.debug(xml);
		XMLParseUtil parser = new XMLParseUtil(xml);

		String errCode = parser.getAttributeValue("/MAP/ENTRY[@ERRCODE]",
				"ERRCODE");

		logger.debug("ERRCODE=" + errCode);

		if (errCode != null && errCode.equals("0")) {
			String xValue = parser.getNodeValue("//ENTRY[@ID='X']/NUMBER");

			String yValue = parser.getNodeValue("//ENTRY[@ID='Y']/NUMBER");

			logger.debug("xValue=" + xValue);
			logger.debug("yValue=" + yValue);

			if (xValue != null && yValue != null) {
				result = new HashMap<String, Double>();

				// OllehMap API 호출하면 X, Y 값이 바뀌어서 오고있음
				result.put("Y", Double.parseDouble(xValue));
				result.put("X", Double.parseDouble(yValue));
			}

		}

		return result;
	}

	/**
	 * parse XML result to Map <br />
	 * 
	 * 
	 * @param xml
	 * @return
	 */
	private Map<String, String> parseLocal(String xml) throws Exception {

		Map<String, String> result = null;

		// logger.debug(xml);

		XMLParseUtil parser = new XMLParseUtil(xml);

		String errCode = parser.getAttributeValue("/MAP/ENTRY[@ERRCODE]",
				"ERRCODE");

		logger.debug("ERRCODE=" + errCode);

		if (errCode == null || !errCode.equals("0")) {
			return result;
		}

		String count = parser
				.getNodeValue("//ENTRY[@ID='addr']//ENTRY[@ID='Count']/NUMBER");

		logger.debug("Count=" + count);

		if (!count.equals("0")) {
			String xValue = parser
					.getNodeValue("//ENTRY[@ID='addr']//ENTRY[@ID='X']/NUMBER");

			String yValue = parser
					.getNodeValue("//ENTRY[@ID='addr']//ENTRY[@ID='Y']/NUMBER");

			logger.debug("xValue=" + xValue);
			logger.debug("yValue=" + yValue);

			if (xValue != null && yValue != null) {
				result = new HashMap<String, String>();
				result.put("X", xValue);
				result.put("Y", yValue);
			}

		}

		return result;
	}

	private Timestamp getCurrentTimestamp() {
		return new Timestamp(new GregorianCalendar().getTimeInMillis());
	}
}
