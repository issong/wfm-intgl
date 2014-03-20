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
 * yngwie          2012. 11. 1.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.intgl2neosswm.helper;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.tempuri.ArrayOfReceive360ManualAllocationInputParam;
import org.tempuri.ArrayOfReceive360WorkOrderInputParam;
import org.tempuri.Receive360ManualAllocationInputParam;
import org.tempuri.Receive360WorkOrderInputParam;

import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderResource;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderStatus;

/**
 * convert VO to NeOSS data <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 1.
 * @see
 * 
 */
public final class VoConvertHelper {

	/**
	 * convert IntglDataVo type to ArrayOfReceive360WorkOrderInputParam type <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws ConversionException
	 */
	public static ArrayOfReceive360WorkOrderInputParam convertForVS2(
			IntglDataVo intglVo, StringBuilder detailMsg)
			throws ConversionException {

		ArrayOfReceive360WorkOrderInputParam dest = new ArrayOfReceive360WorkOrderInputParam();

		List<Object> list = intglVo.getTargetData();

		for (Object o : list) {
			WMWorkOrderResource src = (WMWorkOrderResource) o;

			detailMsg.append(src);

			Receive360WorkOrderInputParam param = convertReceive360WorkOrderInputParam(src);

			dest.getReceive360WorkOrderInputParam().add(param);
		}

		return dest;
	}

	public static ArrayOfReceive360ManualAllocationInputParam convertForVS7(
			IntglDataVo intglVo, StringBuilder detailMsg)
			throws ConversionException {

		ArrayOfReceive360ManualAllocationInputParam dest = new ArrayOfReceive360ManualAllocationInputParam();

		List<Object> list = intglVo.getTargetData();

		for (Object o : list) {
			WMWorkOrderStatus src = (WMWorkOrderStatus) o;

			detailMsg.append(src);

			Receive360ManualAllocationInputParam param = convertReceive360ManualAllocationInputParam(src);

			dest.getReceive360ManualAllocationInputParam().add(param);
		}

		return dest;
	}

	/**
	 * convert WMWorkOrderResource type to Receive360WorkOrderInputParam type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static Receive360ManualAllocationInputParam convertReceive360ManualAllocationInputParam(
			WMWorkOrderStatus src) throws ConversionException {

		Receive360ManualAllocationInputParam param = new Receive360ManualAllocationInputParam();

		param.setBT360AddWorkProgState(src.getBt360AddWorkProgState());
		param.setBT360FixedOdrYn(ConversionUtil.getBooleanToString(src
				.isBt360FixedOdrYn()));
		param.setBT360FixedVisitDT(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360FixedVisitDt()));
		param.setBT360FixedWorkerID(src.getBt360FixedWorkerId());
		param.setBT360LogOnOffDt(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360LogOnOffDt()));
		param.setBT360LogOnOffState(src.getBt360LogOnOffState());
		param.setBT360LogOnOffWorkerId(src.getBt360LogOnOffWorkerId());
		param.setDuration(src.getDuration());
		param.setHighlight(src.getHighlight());
		param.setOfficeSCode(src.getOfficeScode());
		param.setReason(src.getReason());
		param.setReasonValue(src.getReasonValue());
		param.setTtid(src.getTtId());
		param.setWorkOdrNum(src.getWorkOdrNum());
		param.setOdrNum(src.getOdrNum());
		param.setWorkProcState(src.getWorkProcState());
		param.setWorkProgState(src.getWorkProgState());
		param.setWorkStateDt(ConversionUtil.getXMLGregorianCalendarToString(src
				.getWorkStateDt()));
		param.setWorkType(src.getWorkType());

		return param;

	}

	/**
	 * convert WMWorkOrderResource type to Receive360WorkOrderInputParam type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static Receive360WorkOrderInputParam convertReceive360WorkOrderInputParam(
			WMWorkOrderResource src) throws ConversionException {

		Receive360WorkOrderInputParam param = new Receive360WorkOrderInputParam();

		param.setWorkType(src.getWorkType());
		param.setOfficeSCode(src.getOfficeScode());
		param.setWorkOdrNum(src.getWorkOdrNum());
		param.setOdrNum(src.getOdrNum());
		param.setTtid(src.getTtId());
		param.setWorkerID(src.getWorkerId());
		param.setWorkProgState(src.getWorkProgState());
		param.setWorkProcState(src.getWorkProcState());
		param.setBT360AddWorkProgState(src.getBt360AddWorkProgState());

		param.setBT360WorkEndDT(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360WorkEndDt()));
		param.setBT360WorkStartDT(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360WorkStartDt()));

		param.setBT360DateTimeStatus(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360DatetimeStatus()));

		param.setILDateTimeStamp(ConversionUtil
				.getXMLGregorianCalendarToString(src.getIlDateTimeStamp()));

		param.setCsctID(src.getCsctID());

		param.setBT360FixedOdrYN(String.valueOf(src.getBt360FixedOdrYn()));
		param.setBT360FixedVisitDT(ConversionUtil
				.getXMLGregorianCalendarToString(src.getBt360FixedVisitDt()));

		Double value = src.getBt360CommitValue();
		String commitValue = null;
		if (value != null) {
			commitValue = String.valueOf(value.intValue());
		}
		param.setBT360CommitValue(commitValue);

		param.setBT360PlanId(src.getBt360PlanId());

		return param;

	}

	/**
	 * marshalling ArrayOfReceive360WorkOrderInputParam <br />
	 * 
	 * 
	 * @param d
	 * @return
	 */
	public static String getMarshalArrayOfReceive360WorkOrderInputParam(
			ArrayOfReceive360WorkOrderInputParam d) {
		StringWriter writer = new StringWriter();

		try {
			JAXBContext context = JAXBContext
					.newInstance(ArrayOfReceive360WorkOrderInputParam.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			m.marshal(d, writer);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return writer.toString();
	}

	/**
	 * marshalling ArrayOfReceive360WorkOrderInputParam <br />
	 * 
	 * 
	 * @param d
	 * @return
	 */
	public static String getMarshalArrayOfReceive360ManualAllocationInputParam(
			ArrayOfReceive360ManualAllocationInputParam d) {
		StringWriter writer = new StringWriter();

		try {
			JAXBContext context = JAXBContext
					.newInstance(ArrayOfReceive360ManualAllocationInputParam.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			m.marshal(d, writer);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return writer.toString();
	}
}
