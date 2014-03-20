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
 * yngwie          2012. 10. 24.      First Draft.
 */
package com.kt.oss.wmIntgl.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

import com.kt.oss.wmIntgl.common.exception.ConversionException;

/**
 * several types conversion for WebService & Client <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 24.
 * @see
 * 
 */
public final class ConversionUtil {

	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

	public static final boolean DEFAULT_BOOLEAN = false;

	public static final int DEFAULT_INT = -99;

	public static final float DEFAULT_FLOAT = -99F;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param date
	 * @return
	 * @throws ConversionException
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date)
			throws ConversionException {
		if (date == null) {
			return null;
		}

		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar now = null;
		try {
			now = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gCalendar);
		} catch (DatatypeConfigurationException e) {
			throw new ConversionException(
					"Date to XMLGregorianCalendar : invalid data format ["
							+ date + "]");
		}

		return now;
	}

	/**
	 * @return
	 * @throws ConversionException
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar()
			throws ConversionException {
		return getXMLGregorianCalendar(new Date());
	}

	/**
	 * @param xgc
	 * @return
	 */
	public static java.util.Date getDate(XMLGregorianCalendar xgc) {
		if (xgc == null) {
			return null;
		} else {
			return xgc.toGregorianCalendar().getTime();
		}
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param dateStr
	 * @return
	 * @throws ConversionException
	 */
	public static Date getStringToDate(String dateStr)
			throws ConversionException {
		if (dateStr == null || dateStr.trim().length() == 0) {
			return null;
		}

		Date date = null;

		try {
			DateFormat sdFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
			date = sdFormat.parse(dateStr);
		} catch (Exception e) {
			throw new ConversionException(
					"String to Date : invalid data format [" + dateStr + "]");
		}
		return date;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param dateStr
	 * @return
	 * @throws ConversionException
	 */
	public static XMLGregorianCalendar getStringToXMLGregorianCalendar(
			String dateStr) throws ConversionException {
		return getXMLGregorianCalendar(getStringToDate(dateStr));
	}

	public static String getXMLGregorianCalendarToString(
			XMLGregorianCalendar value) {

		if (value == null) {
			return null;
		}

		Date date = value.toGregorianCalendar().getTime();
		DateFormat sdFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		return sdFormat.format(date);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param value
	 * @return
	 * @throws ConversionException
	 */
	public static boolean getStringToBoolean(String value, boolean required)
			throws ConversionException {

		if (!required && StringUtils.trimToNull(value) == null) {
			return DEFAULT_BOOLEAN;
		}

		if (value == null || "01".indexOf(value) == -1) {
			throw new ConversionException(
					"String to Boolean : invalid data format [" + value + "]");
		}

		return value.equals("1") ? true : false;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param value
	 * @return
	 * @throws ConversionException
	 */
	public static String getBooleanToString(boolean value) {

		return value ? "1" : "0";
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param value
	 * @param required
	 * @return
	 * @throws ConversionException
	 */
	public static float getStringToFloat(String value, boolean required)
			throws ConversionException {

		if (!required && StringUtils.trimToNull(value) == null) {
			return DEFAULT_FLOAT;
		}

		if (value == null || !Pattern.matches("^[0-9-]+(.[0-9-]+)?$", value)) {
			throw new ConversionException(
					"String to float : invalid data format [" + value + "]");
		}
		return Float.valueOf(value).floatValue();
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param value
	 * @param required
	 * @return
	 * @throws ConversionException
	 */
	public static int getStringToInt(String value, boolean required)
			throws ConversionException {

		if (!required && StringUtils.trimToNull(value) == null) {
			return DEFAULT_INT;
		}

		if (value == null || !Pattern.matches("^[0-9-]+$", value)) {
			throw new ConversionException(
					"String to int : invalid data format [" + value + "]");
		}

		return Integer.parseInt(value);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param value
	 * @return
	 * @throws ConversionException
	 */
	public static Double getStringToDouble(String value)
			throws ConversionException {

		if (StringUtils.trimToNull(value) == null) {
			return null;
		}

		if (!Pattern.matches("^[0-9-]+(.[0-9-]+)?$", value)) {
			throw new ConversionException(
					"String to Double : invalid data format [" + value + "]");
		}

		return Double.valueOf(value);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param range
	 * @return
	 * @throws ConversionException
	 */
	public static Duration getIntToDuration(long range)
			throws ConversionException {
		Duration d = null;
		try {
			d = DatatypeFactory.newInstance().newDuration(range);
		} catch (DatatypeConfigurationException e) {
			throw new ConversionException(e.getMessage());
		}
		return d;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param range
	 * @return
	 * @throws ConversionException
	 */
	public static Duration getIntToDuration(boolean isPositive, int day,
			int hour, int minute, int second) throws ConversionException {
		Duration d = null;
		try {
			d = DatatypeFactory.newInstance().newDurationDayTime(isPositive,
					day, hour, minute, second);
		} catch (DatatypeConfigurationException e) {
			throw new ConversionException(e.getMessage());
		}
		return d;
	}

	public static String getCallerInfo() {
		StringBuilder result = new StringBuilder();

		StackTraceElement[] stackTraceElements = Thread.currentThread()
				.getStackTrace();

		if (stackTraceElements != null && stackTraceElements.length > 0) {
			int len = stackTraceElements.length - 1;
			result.append("line ");
			result.append(stackTraceElements[len].getLineNumber());
			result.append(":");
			result.append(stackTraceElements[len].getClassName());
			result.append(".");
			result.append(stackTraceElements[len].getMethodName());
		}

		return result.toString();
	}
}
