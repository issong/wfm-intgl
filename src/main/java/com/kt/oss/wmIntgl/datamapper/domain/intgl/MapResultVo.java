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
 * yngwie          2012. 12. 6.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.domain.intgl;

import java.io.Serializable;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 12. 6.
 * @see
 * 
 */
/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 12. 6.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class MapResultVo implements Serializable {

	/*
	 * 1st, utmk 좌표 조회용 property
	 */
	private double utmkX;
	private double utmkY;

	private boolean localSearchResult;
	private String localSearchResultXML;

	/*
	 * 2nd, 위경도 조회용 property
	 */
	private double latitude;
	private double longitude;

	private boolean coordConvResult;
	private String coordConvResultXML;

	public double getUtmkX() {
		return utmkX;
	}

	public void setUtmkX(double utmkX) {
		this.utmkX = utmkX;
	}

	public double getUtmkY() {
		return utmkY;
	}

	public void setUtmkY(double utmkY) {
		this.utmkY = utmkY;
	}

	public boolean isLocalSearchResult() {
		return localSearchResult;
	}

	public void setLocalSearchResult(boolean localSearchResult) {
		this.localSearchResult = localSearchResult;
	}

	public String getLocalSearchResultXML() {
		return localSearchResultXML;
	}

	public void setLocalSearchResultXML(String localSearchResultXML) {
		this.localSearchResultXML = localSearchResultXML;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public boolean isCoordConvResult() {
		return coordConvResult;
	}

	public void setCoordConvResult(boolean coordConvResult) {
		this.coordConvResult = coordConvResult;
	}

	public String getCoordConvResultXML() {
		return coordConvResultXML;
	}

	public void setCoordConvResultXML(String coordConvResultXML) {
		this.coordConvResultXML = coordConvResultXML;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MapResultVo [utmkX=");
		builder.append(utmkX);
		builder.append("\r\n, utmkY=");
		builder.append(utmkY);
		builder.append("\r\n, localSearchResult=");
		builder.append(localSearchResult);
		builder.append("\r\n, localSearchResultXML=");
		builder.append(localSearchResultXML);
		builder.append("\r\n, latitude=");
		builder.append(latitude);
		builder.append("\r\n, longitude=");
		builder.append(longitude);
		builder.append("\r\n, coordConvResult=");
		builder.append(coordConvResult);
		builder.append("\r\n, coordConvResultXML=");
		builder.append(coordConvResultXML);
		builder.append("]");
		return builder.toString();
	}

}
