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
 * yngwie          2012. 10. 30.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.neosswm2intgl.helper;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.datahandler.domain.WMConfirmResourceInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMCustomException;
import com.kt.oss.wmIntgl.datahandler.domain.WMDeleteResourceInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMDivisionInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMResourceHolidayInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMResourceInfo;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrder;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderKey;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderStatus;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkTeam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMConfirmResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMCustomExceptionParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDeleteResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMDivisionInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceHolidayInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMResourceInfoParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkTeamParam;

/**
 * convert VO from NeOSS data <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 30.
 * @see
 * 
 */
public final class VoConvertHelper {

	/**
	 * convert data WMWorkOrderParam type To WMWorkOrder type <br />
	 * 
	 * 
	 * @param src
	 * @param rcvDt
	 * @return
	 * @throws ConversionException
	 */
	public static WMWorkOrder convertWMWorkOrder(WMWorkOrderParam src,
			XMLGregorianCalendar rcvDt) throws ConversionException {

		WMWorkOrder dest = new WMWorkOrder();

		dest.setAddr(src.getAddr());
		dest.setAddrEtc(src.getAddrEtc());
		dest.setAddrHo(ConversionUtil.getStringToInt(src.getAddrHo(), true));
		dest.setAddrNo(ConversionUtil.getStringToInt(src.getAddrNo(), true));
		dest.setAddrNoType(src.getAddrNoType());
		dest.setBt360AddWorkProgState(src.getBt360AddWorkProgState());
		dest.setBt360ExpWorkerId(src.getBt360ExpWorkerId());
		dest.setBt360FixedOdrYn(ConversionUtil.getStringToBoolean(
				src.getBt360FixedOdrYn(), false));

		dest.setBt360FixedVisitDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360FixedVisitDt()));
		dest.setBt360FixedWorkerId(src.getBt360FixedWorkerId());
		dest.setBt360LogOnOffDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360LogOnOffDt()));

		dest.setBt360LogOnOffState(src.getBt360LogOnOffState());
		dest.setBt360LogOnOffWorkerId(src.getBt360LogOnOffWorkerId());
		dest.setBt360Preference(ConversionUtil.getStringToFloat(
				src.getBt360Preference(), true));
		dest.setBt360SlaEndDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360SlaEndDt()));

		dest.setBt360SlaStartDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360SlaStartDt()));
		dest.setBt360SpecialWorkTypeCode(src.getBt360SpecialWorkTypeCode());
		dest.setCompanyCode(src.getCompanyCode());
		dest.setConcurrentOdrFlag(ConversionUtil.getStringToInt(
				src.getConcurrentOdrFlag(), true));

		dest.setDongCode(src.getDongCode());
		dest.setOfficeScode(src.getOfficeScode());

		dest.setRcvDt(rcvDt);
		dest.setRemark(src.getRemark());
		dest.setReporterOpinion(src.getReporterOpinion());
		dest.setSendDt(ConversionUtil.getStringToXMLGregorianCalendar(src
				.getSendDt()));

		dest.setSvcMainClsCode(src.getSvcMainClsCode());
		dest.setTtId(src.getTtId());
		dest.setWorkOdrNum(src.getWorkOdrNum());
		dest.setWorkOdrTypeCode(src.getWorkOdrTypeCode());
		dest.setWorkOdrTypeNum(ConversionUtil.getStringToInt(
				src.getWorkOdrTypeNum(), false));

		dest.setWorkProcState(src.getWorkProcState());
		dest.setWorkProgState(src.getWorkProgState());

		dest.setWorkStateDt(ConversionUtil.getStringToXMLGregorianCalendar(src
				.getWorkStateDt()));

		dest.setWorkTeamCode(src.getWorkTeamCode());
		dest.setWorkType(src.getWorkType());

		dest.setOdrNum(src.getOdrNum());

		dest.setSvcId(src.getSvcId());
		dest.setCustName(src.getCustName());
		dest.setContactTelNum(src.getContactTelNum());

		dest.setConcurrentSeq(src.getConcurrentSeq());
		dest.setBt360VvipYn(src.getBt360VvipYn());

		dest.setReason(src.getReason());
		dest.setReasonValue(src.getReasonValue());

		dest.setBt360TechMethod(src.getBt360TechMethod());

		return dest;

	}

	/**
	 * convert data WMWorkOrderStatusParam type To WMWorkOrderStatus type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMWorkOrderStatus convertWMWorkOrderStatus(
			WMWorkOrderStatusParam src) throws ConversionException {
		WMWorkOrderStatus dest = new WMWorkOrderStatus();

		dest.setBt360AddWorkProgState(src.getBt360AddWorkProgState());
		dest.setBt360LogOnOffDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360LogOnOffDt()));
		dest.setBt360LogOnOffState(src.getBt360LogOnOffState());
		dest.setBt360LogOnOffWorkerId(src.getBt360LogOnOffWorkerId());
		dest.setOfficeScode(src.getOfficeScode());
		dest.setTtId(src.getTtId());
		dest.setWorkOdrNum(src.getWorkOdrNum());
		dest.setWorkProgState(src.getWorkProgState());
		dest.setWorkProcState(src.getWorkProcState());
		dest.setWorkStateDt(ConversionUtil.getStringToXMLGregorianCalendar(src
				.getWorkStateDt()));
		dest.setWorkType(src.getWorkType());

		dest.setBt360FixedOdrYn(ConversionUtil.getStringToBoolean(
				src.getBt360FixedOdrYn(), false));

		dest.setBt360FixedVisitDt(ConversionUtil
				.getStringToXMLGregorianCalendar(src.getBt360FixedVisitDt()));

		dest.setBt360FixedWorkerId(src.getBt360FixedWorkerId());

		dest.setDuration(src.getDuration());
		dest.setHighlight(src.getHighlight());
		dest.setReason(src.getReason());
		dest.setReasonValue(src.getReasonValue());

		dest.setOdrNum(src.getOdrNum());

		dest.setBt360CommitValue(ConversionUtil.getStringToDouble(src
				.getBt360CommitValue()));

		return dest;
	}

	/**
	 * convert data WMWorkOrderKeyParam type To WMWorkOrderKey type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMWorkOrderKey convertWMWorkOrderkey(WMWorkOrderKeyParam src) {
		WMWorkOrderKey dest = new WMWorkOrderKey();

		dest.setOfficeScode(src.getOfficeScode());
		dest.setTtId(src.getTtId());
		dest.setWorkOdrNum(src.getWorkOdrNum());
		dest.setWorkType(src.getWorkType());

		dest.setOdrNum(src.getOdrNum());

		return dest;
	}

	/**
	 * convert data WMResourceInfoParam type To WMResourceInfo type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMResourceInfo convertWMResourceInfo(WMResourceInfoParam src,
			ScenarioType sType) {
		WMResourceInfo dest = new WMResourceInfo();

		dest.setContactDetails(src.getContactDetails());
		dest.setDescription(src.getDescription());
		dest.setEndOfficeScode(src.getEndOfficeScode());
		dest.setStartOfficeScode(src.getStartOfficeScode());
		dest.setWorkerFirstName(src.getWorkerFirstName());
		dest.setWorkerId(src.getWorkerId());
		dest.setWorkerSurName(src.getWorkerSurName());
		dest.setCompanyTypeCode(src.getCompanyTypeCode());
		dest.setGrade(src.getGrade());

		if (sType == ScenarioType.VS14 || sType == ScenarioType.VS14D) {
			dest.setOfficeScodes(src.getOfficeScodes());

			List<WMWorkTeamParam> list = src.getwMWorkTeamParams();

			for (WMWorkTeamParam param : list) {
				WMWorkTeam team = new WMWorkTeam();
				team.setOfficeScode(param.getOfficeScode());
				team.setWorkTeamCode(param.getWorkTeamCode());

				dest.getwMWorkTeams().add(team);
			}
		}

		return dest;
	}

	/**
	 * convert data WMDeleteResourceInfoParam type To WMDeleteResourceInfo type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 */
	public static WMDeleteResourceInfo convertWMDeleteResourceInfo(
			WMDeleteResourceInfoParam src, ScenarioType sType) {
		WMDeleteResourceInfo dest = new WMDeleteResourceInfo();

		if (sType == ScenarioType.VS14A) {
			dest.setOfficeScodes(src.getOfficeScodes());

		}
		dest.setWorkerId(src.getWorkerId());

		return dest;
	}

	/**
	 * convert data WMCustomExceptionParam type To WMCustomException type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 */
	public static WMCustomException convertWMCustomException(
			WMCustomExceptionParam src) throws ConversionException {
		WMCustomException dest = new WMCustomException();

		dest.setBt360AddWorkProgState(src.getBt360AddWorkProgState());
		dest.setBt360ExceptionType(ConversionUtil.getStringToInt(
				src.getBt360ExceptionType(), false));
		dest.setOdrNum(src.getOdrNum());
		dest.setOfficeScode(src.getOfficeScode());
		dest.setTtId(src.getTtId());
		dest.setUseStatusChange(ConversionUtil.getStringToInt(
				src.getUseStatusChange(), false));
		dest.setWorkerId(src.getWorkerId());
		dest.setWorkOdrNum(src.getWorkOdrNum());
		dest.setWorkProcState(src.getWorkProcState());
		dest.setWorkProgState(src.getWorkProgState());
		dest.setWorkType(src.getWorkType());

		dest.setBt360Label(src.getBt360Label());
		dest.setBt360Value(src.getBt360Value());

		return dest;
	}

	/**
	 * convert data WMConfirmResourceInfoParam type To WMConfirmResourceInfo
	 * type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMConfirmResourceInfo convertWMConfirmResourceInfo(
			WMConfirmResourceInfoParam src) throws ConversionException {
		WMConfirmResourceInfo dest = new WMConfirmResourceInfo();

		dest.setDispatchCount(src.getDispatchCount());
		dest.setWorkerId(src.getWorkerId());
		dest.setCompanyTypeCode(src.getCompanyTypeCode());

		return dest;
	}

	/**
	 * convert data WMResourceHolidayInfoParam type To WMResourceHolidayInfo
	 * type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 */
	public static WMResourceHolidayInfo convertWMResourceHolidayInfo(
			WMResourceHolidayInfoParam src) {

		WMResourceHolidayInfo dest = new WMResourceHolidayInfo();

		dest.setEventDate(src.getEventDate());
		dest.setHolidayAcode(src.getHolidayAcode());
		dest.setHolidayTcode(src.getHolidayTcode());
		dest.setWorkerId(src.getWorkerId());

		return dest;
	}

	/**
	 * convert data WMDivisionInfoParam type To WMDivisionInfo <br />
	 * 
	 * 
	 * @param src
	 * @return
	 */
	public static WMDivisionInfo convertWMDivisionInfo(WMDivisionInfoParam src) {
		WMDivisionInfo dest = new WMDivisionInfo();

		dest.setOfficeName(src.getOfficeName());
		dest.setOfficeScode(src.getOfficeScode());
		dest.setWorkTeamCode(src.getWorkTeamCode());

		return dest;
	}
}
