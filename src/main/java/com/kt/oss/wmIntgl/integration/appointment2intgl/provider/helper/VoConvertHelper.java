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
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.helper;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentCancel;
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentOrder;
import com.kt.oss.wmIntgl.datahandler.domain.WMAvailabilityPattern;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentCancelParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOrderParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAvailabilityPatternParam;

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
public final class VoConvertHelper {

	/**
	 * convert data WMAppointmentOrderParam type To WMAppointmentOrder type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMAppointmentOrder convertWMAppointmentOrder(
			WMAppointmentOrderParam src) throws ConversionException {
		WMAppointmentOrder dest = new WMAppointmentOrder();

		dest.setAddr(src.getAddr());
		dest.setAddrEtc(src.getAddrEtc());
		dest.setAddrHo(ConversionUtil.getStringToInt(src.getAddrHo(), true));
		dest.setAddrNo(ConversionUtil.getStringToInt(src.getAddrNo(), true));
		dest.setAddrNoType(src.getAddrNoType());
		dest.setBt360ExpWorkerId(src.getBt360ExpWorkerId());
		dest.setBt360OfferExpiry(ConversionUtil.getStringToInt(
				src.getBt360OfferExpiry(), false));

		dest.setBt360Preference(ConversionUtil.getStringToFloat(
				src.getBt360Preference(), false));

		dest.setBt360SlaEndDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360SlaEndDt()));
		dest.setBt360SlaStartDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360SlaStartDt()));
		dest.setBt360SpecialWorkTypeCode(src.getBt360SpecialWorkTypeCode());

		dest.setCompanyCode(src.getCompanyCode());
		dest.setConcurrentOdrFlag(ConversionUtil.getStringToInt(
				src.getConcurrentOdrFlag(), true));

		dest.setDongCode(src.getDongCode());
		dest.setOdrNum(src.getOdrNum());
		dest.setOfferId(ConversionUtil.getStringToInt(src.getOfferId(), false));
		dest.setOfficeScode(src.getOfficeScode());

		dest.setRcvDt(ConversionUtil.getStringToXMLGregorianCalendar(src
				.getRcvDt()));
		dest.setRemark(src.getRemark());
		dest.setReporterOpinion(src.getReporterOpinion());

		dest.setSvcMainClsCode(src.getSvcMainClsCode());
		dest.setWorkType(src.getWorkType());

		dest.setSvcId(src.getSvcId());
		dest.setCustName(src.getCustName());
		dest.setContactTelNum(src.getContactTelNum());

		dest.setWorkTeamCode(src.getWorkTeamCode());

		dest.setConcurrentSeq(src.getConcurrentSeq());
		dest.setBt360VvipYn(src.getBt360VvipYn());

		if (src.getAvailabilityPatternParams() != null
				&& src.getAvailabilityPatternParams().size() > 0) {
			for (WMAvailabilityPatternParam ap : src
					.getAvailabilityPatternParams()) {
				WMAvailabilityPattern o = new WMAvailabilityPattern();
				o.setCloseTime(ap.getCloseTime());
				o.setDayPattern(ap.getDayPattern());
				o.setOpenTime(ap.getOpenTime());
				o.setPeriodEndDt(ConversionUtil
						.getStringToXMLGregorianCalendar(ap.getPeriodEndDt()));
				o.setPeriodStartDt(ConversionUtil
						.getStringToXMLGregorianCalendar(ap.getPeriodStartDt()));
				o.setSlotId(ap.getSlotId());

				dest.getAvailabilityPatterns().add(o);
			}
		}

		return dest;
	}

	/**
	 * add slot id <br />
	 * 
	 * 
	 * @param src
	 * @param offer
	 */
	public static boolean mappingWMAppointmentOfferParamVoSlotId(
			WMAppointmentOrderParam src, WMAppointmentOfferParam dest) {

		int updateCount = 0;

		for (WMAvailabilityPatternParam param : src
				.getAvailabilityPatternParams()) {
			String srcStartHH = StringUtils.substring(param.getPeriodStartDt(),
					11, 13);
			String srcEndHH = StringUtils.substring(param.getPeriodEndDt(), 11,
					13);

			String destStartHH = StringUtils.substring(dest.getOfferStartDt(),
					11, 13);
			String destEndHH = StringUtils.substring(dest.getOfferEndDt(), 11,
					13);
			if (srcStartHH.equals(destStartHH) && srcEndHH.equals(destEndHH)) {

				dest.setSlotId(param.getSlotId());
				++updateCount;
				break;
			}
		}

		return updateCount == src.getAvailabilityPatternParams().size() ? true
				: false;
	}

	/**
	 * convert data WMAppointmentCancelParam type To WMAppointmentCancel type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMAppointmentCancel convertWMAppointmentCancel(
			WMAppointmentCancelParam src) throws ConversionException {
		WMAppointmentCancel dest = new WMAppointmentCancel();

		dest.setOfficeScode(src.getOfficeScode());
		dest.setWorkType(src.getWorkType());

		return dest;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param list
	 * @param typeMap
	 */
	public static void mappingWMAppointmentOfferParamReasonType(
			List<WMAppointmentOfferParam> list, Map<String, String> typeMap) {

		for (WMAppointmentOfferParam param : list) {
			param.setReasonType(typeMap.get(param.getReasonType()));
		}

	}
}
