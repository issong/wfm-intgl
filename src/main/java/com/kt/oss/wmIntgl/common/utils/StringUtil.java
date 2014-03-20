package com.kt.oss.wmIntgl.common.utils;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class StringUtil {

	/**
	 * 문자열 비교
	 */
	public static boolean isEquals(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		}
		return str1.equals(str2);
	}

	/**
	 * 문자열 비교
	 */
	public static boolean isNotEquals(String str1, String str2) {
		return !isEquals(str1, str2);
	}

	/**
	 * 객체가 가지고 있는 값이 공백인지 아닌지 판별하여 true, false를 리턴
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Object obj) {
		if (obj instanceof String) {
			return obj == null || "".equals(obj.toString().trim());
		} else if (obj instanceof List) {
			return obj == null || ((List) obj).isEmpty();
		} else if (obj instanceof Map) {
			return obj == null || ((Map) obj).isEmpty();
		} else if (obj instanceof Object[]) {
			return obj == null || Array.getLength(obj) == 0;
		} else {
			return obj == null;
		}
	}

	public static boolean isNotEmpty(String s) {
		return !isEmpty(s);
	}

	/**
	 * Byte 기준으로 string 을 자른다. (한글기준 2byte 적용)
	 */
	public static String substring(String str, int start) {
		if (str == null || str.length() == 0) {
			return "";
		}
		byte[] byte_body = str.getBytes();
		if (byte_body == null) {
			return null;
		}
		return substring(byte_body, start, byte_body.length);
	}

	/**
	 * Byte 기준으로 string 을 자른다. (한글기준 2byte 적용)
	 */
	public static String substring(String str, int start, int end) {
		if (str == null || str.length() == 0) {
			return "";
		}
		byte[] byte_body = str.getBytes();
		if (byte_body == null) {
			return null;
		}
		return substring(byte_body, start, end);
	}

	/**
	 * Byte Array 데이터를 string 으로 자른다.
	 */
	public static String substring(byte[] byte_body, int start, int end) {
		if (byte_body == null || byte_body.length == 0) {
			return "";
		}
		int size = end - start;
		int length = byte_body.length - start;
		if (length < size) {
			size = length;
		}

		// byte[] tmp_body = new byte[end - start];
		byte[] tmp_body = new byte[size];
		System.arraycopy(byte_body, start, tmp_body, 0, tmp_body.length);
		return new String(tmp_body);
	}

	/**
	 * 스트링을 일정한 길이 이상일때 잘라줌. (왼쪽부터)
	 */
	public static String leftstring(String str, int end) {
		if (str == null || str.getBytes().length == 0) {
			return "";
		}
		if (str.getBytes().length < (end + 1)) {
			return str;
		} else {
			return (substring(str, 0, end));
		}
	}

	/**
	 * 스트링을 일정한 길이 이상일때 잘라줌. (오른쪽부터)
	 */
	public static String rightstring(String str, int end) {
		return rightstring(str, end, true);
	}

	/**
	 * 스트링을 일정한 길이 이상일때 잘라줌. (오른쪽부터)
	 */
	public static String rightstring(String str, int end, boolean isbyte) {
		if (str == null || str.length() == 0) {
			return "";
		}
		if (isbyte) {
			if (str.getBytes().length < (end + 1)) {
				return str;
			} else {
				return (substring(str, str.getBytes().length - end,
						str.getBytes().length));
			}
		} else {
			if (str.length() < (end + 1)) {
				return str;
			} else {
				return str.substring(str.length() - end, str.length());
			}
		}
	}

	/**
	 * 날짜를 문자열로 (현재)
	 */
	public static String toDate(String format) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss.SSS";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}

	/**
	 * 날짜를 문자열로 (현재기준 날짜 이전,이후 지정)
	 */
	public static String toDate(int amount, String format) {
		return toDate(Calendar.DATE, amount, format);
	}

	/**
	 * 날짜를 문자열로 (현재기준 날짜 이전,이후 지정)
	 */
	public static String toDate(int field, int amount, String format) {
		return toDate(null, field, amount, format);
	}

	/**
	 * 날짜를 문자열로 (특정일자 날짜 이전,이후 지정)
	 */
	public static Date toDate(Date date, int field, int amount) {
		if (amount == 0) {
			if (date != null)
				return date;
			else
				return new Date();
		}

		Calendar c = Calendar.getInstance();
		if (date != null)
			c.setTime(date);
		c.add(field, amount); // 날짜데이터(플러스,마이너스에 따라 이전/이후일자)

		return new Date(c.getTimeInMillis());
	}

	/**
	 * 날짜를 문자열로 (특정일자 날짜 이전,이후 지정)
	 */
	public static String toDate(Date date, int field, int amount, String format) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss.SSS";
		}
		if (amount == 0) {
			if (date != null)
				return toDate(date.getTime(), format); // 특정일자
			else
				return toDate(format); // 현재일자
		}

		Calendar c = Calendar.getInstance();
		if (date != null)
			c.setTime(date);
		c.add(field, amount); // 날짜데이터(플러스,마이너스에 따라 이전/이후일자)

		return toDate(c.getTimeInMillis(), format);
	}

	/**
	 * 날짜를 문자열로
	 */
	public static String toDate(long dt, String format) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss.SSS";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(dt));
	}

	/**
	 * 날짜를 문자열로
	 */
	public static Date toDate(String dt, String format) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss.SSS";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date sDate = null;
		try {
			sDate = sdf.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sDate;
	}

	/**
	 * 날짜를 문자열로
	 */
	public static String toDate(String dt, String fromformat, String toformat) {
		if (fromformat == null) {
			fromformat = "yyyyMMdd";
		}
		if (toformat == null) {
			toformat = "yyyy-MM-dd";
		}
		SimpleDateFormat fromsdf = new SimpleDateFormat(fromformat);
		SimpleDateFormat tosdf = new SimpleDateFormat(toformat);
		Date sDate = null;
		try {
			sDate = fromsdf.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return tosdf.format(sDate);
	}

	/**
	 * 현재시점을 Long 으로
	 */
	public static String toLongString() {
		return String.valueOf(new Date().getTime());
	}

	public static String toLongString(int length) {
		return rightstring(String.valueOf(new Date().getTime()), length);
	}

	/**
	 * 001020310000(12자리) 형식을 -> 010-2031-0000 형식으로 변환
	 * 
	 * @param tel
	 * @return
	 */
	public static String toPhoneString(String tel) {
		if (isEmpty(tel))
			return "";
		if (tel.length() != 12)
			return tel;
		if (tel.indexOf("-") != -1)
			return tel;
		String tel1 = null;
		try {
			tel1 = String.valueOf(Integer.parseInt(tel.substring(0, 4)));
		} catch (NumberFormatException e1) {
			tel1 = tel.substring(0, 4);
			for (int i = 0; i < tel1.length(); i++) {
				if (!tel1.startsWith("0"))
					break;
				tel1 = tel1.substring(i + 1);
			}
		}
		if (tel1.length() < 4)
			tel1 = "0" + tel1;

		String tel2 = null;
		try {
			tel2 = String.valueOf(Integer.parseInt(tel.substring(4, 8)));
		} catch (NumberFormatException e1) {
			tel2 = tel.substring(4, 8);
			for (int i = 0; i < tel2.length(); i++) {
				if (!tel2.startsWith("0"))
					break;
				tel2 = tel2.substring(i + 1);
			}
		}
		return tel1 + "-" + tel2 + "-" + tel.substring(8, 12);
	}

	/**
	 * return UID String <br />
	 * 
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	public static String getUUID(int length) {
		return leftstring(getUUID(), length);
	}

	/**
	 * xml 문자열을 포맷팅된 문자열로 반환 <br />
	 * 
	 * 
	 * @param unformattedXml
	 * @return formattedXml
	 */
	public static String getFormattedXmlString(String src) {
		if (src == null || src.length() < 55) {
			return src;
		}

		String result = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(src));
			Document document = db.parse(is);

			OutputFormat format = new OutputFormat(document);
			format.setLineWidth(80);
			format.setIndenting(true);
			format.setIndent(2);
			Writer out = new StringWriter();
			XMLSerializer serializer = new XMLSerializer(out, format);
			serializer.serialize(document);

			result = out.toString();

		} catch (Exception e) {
			result = src;
		}

		return result;

	}

	/**
	 * return error stacktrace to string <br />
	 * 
	 * 
	 * @param throwable
	 * @return
	 */
	public static String getStackTrace(Throwable e) {
		Writer result = new StringWriter();
		PrintWriter printWriter = new PrintWriter(result);
		e.printStackTrace(printWriter);
		return result.toString();
	}

}
