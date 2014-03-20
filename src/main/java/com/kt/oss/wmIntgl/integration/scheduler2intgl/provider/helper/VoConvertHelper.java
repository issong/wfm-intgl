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
 * yngwie          2012. 11. 30.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.scheduler2intgl.provider.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.apache.commons.lang.StringUtils;

import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrderStatus;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParamVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 30.
 * @see
 * 
 */
public final class VoConvertHelper {

	/**
	 * convert data DsScheduleData.AppointmentOffer type To
	 * WMAppointmentOfferParamVo type <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	public static WMAppointmentOfferParamVo convertWMAppointmentOfferParamVo(
			DsScheduleData.AppointmentOffer src, EventLogVo vo)
			throws ConversionException {

		WMAppointmentOfferParamVo dest = new WMAppointmentOfferParamVo();

		dest.setEventId(vo.getEventId());

		dest.setAppointmentRequestId(src.getAppointmentRequestId());
		dest.setOfferId(String.valueOf(src.getId()));
		dest.setOfferStartDt(ConversionUtil.getXMLGregorianCalendarToString(src
				.getOfferStartDatetime()));
		dest.setOfferEndDt(ConversionUtil.getXMLGregorianCalendarToString(src
				.getOfferEndDatetime()));
		dest.setOfferValue(String.valueOf((int) src.getOfferValue()));
		dest.setAvailable(ConversionUtil.getBooleanToString(src.isAvailable()));
		dest.setReasonType(String.valueOf(src.getReasonTypeId()));

		return dest;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param d
	 * @throws ConversionException
	 */
	public static List<Object> arrangeDsScheduleData(DsScheduleData d,
			StringBuilder detailMsg) throws ConversionException {

		List<Object> result = new ArrayList<Object>();

		List<Object> source = d.getShiftPatternOrActivityOrActivitySLA();

		if (source != null && source.size() > 0) {
			for (int i = source.size() - 1; i >= 0; i--) {
				Object o = source.get(i);

				if (o instanceof DsScheduleData.SuggestedDispatch) {
					DsScheduleData.SuggestedDispatch dispatch = (DsScheduleData.SuggestedDispatch) o;
					if (dispatch.getActivityId() != null
							&& dispatch.getActivityId().trim().length() == 32) {

						// WMWorkOrderStatus order =
						// convertWMWorkOrderStatusForVS20(dispatch);
						//
						// result.add(order);
						//
						// detailMsg.append(order);
						// detailMsg.append("\r\n");

						source.remove(i);
                        continue;
					}
				}

                if (o instanceof DsScheduleData.PlanDeletion) {
                    source.remove(i);
                    continue;
                }

                if(source.size() == 1 && source instanceof DsScheduleData.InputReference) {
                    source.remove(i);
                }
			}
		}

		return result;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	@SuppressWarnings("unused")
	private static WMWorkOrderStatus convertWMWorkOrderStatusForVS20(
			DsScheduleData.SuggestedDispatch src) throws ConversionException {
		WMWorkOrderStatus dest = new WMWorkOrderStatus();

		dest.setWorkOdrNum(src.getActivityId());
		dest.setWorkProgState("A");
		dest.setWorkStateDt(ConversionUtil.getXMLGregorianCalendar());
		dest.setBt360FixedOdrYn(true);
		dest.setBt360FixedWorkerId(src.getResourceId());
		dest.setBt360FixedVisitDt(src.getExpectedStartDatetime());

		return dest;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param d
	 * @param sendBackList7B
     * @param sendBackList7C
     * @param _7bMsg
     * @param _7cMsg
	 * @return
	 * @throws ConversionException
	 */
	public static void arrangeReceiveWorkbenchData(DsScheduleData d,
			List<Object> sendBackList7B, List<Object> sendBackList7C,
			StringBuilder _7bMsg, StringBuilder _7cMsg)
			throws ConversionException {

		List<Object> source = d.getShiftPatternOrActivityOrActivitySLA();

		if (source != null && source.size() > 0) {
			for (int i = source.size() - 1; i >= 0; i--) {
				Object o = source.get(i);

				if (o instanceof DsScheduleData.ActivityStatus) {
					DsScheduleData.ActivityStatus status = (DsScheduleData.ActivityStatus) o;
					if (status.getActivityId() != null) {

                        // <Activity_Status> DATASET의 <activity_id> element가 ‘1R%’ or ‘2R%’인 것들만 분류하여 NeOSS-WM으로 전송
                        if("1R, 2R".indexOf(status.getActivityId().substring(0, 2)) == -1) {
                            source.remove(i);
                            continue;
                        }

						if (StringUtils.trim(status.getActivityId()).length() == 32) {
							source.remove(i);
						} else {
							WMWorkOrderStatus order = null;
							switch (status.getStatusId()) {
							case 35:
								order = convertWMWorkOrderStatusForVS7B(status);
								sendBackList7B.add(order);
								_7bMsg.append(order);
								_7bMsg.append("\r\n");

								source.remove(i);
								break;

							case 32:
								order = convertWMWorkOrderStatusForVS7C(status);
								sendBackList7C.add(order);
								_7cMsg.append(order);
								_7cMsg.append("\r\n");

								source.remove(i);
								break;
							}
						}
					}
				}
			}
		}

	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	private static WMWorkOrderStatus convertWMWorkOrderStatusForVS7B(
			DsScheduleData.ActivityStatus src) throws ConversionException {
		WMWorkOrderStatus dest = new WMWorkOrderStatus();

		dest.setWorkOdrNum(src.getActivityId());
		dest.setWorkProgState("Z");
		dest.setWorkStateDt(src.getDateTimeStatus());
		dest.setDuration(convertDuration(src.getDuration()));
		dest.setReason(src.getReason());
		dest.setBt360FixedOdrYn(false);
		dest.setBt360FixedWorkerId(src.getResourceId());
		dest.setBt360FixedVisitDt(src.getDateTimeFixed());

		if (src.getCommitSortValue() != null) {
			dest.setBt360CommitValue(src.getCommitSortValue());
		}

		return dest;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param src
	 * @return
	 * @throws ConversionException
	 */
	private static WMWorkOrderStatus convertWMWorkOrderStatusForVS7C(
			DsScheduleData.ActivityStatus src) throws ConversionException {
		WMWorkOrderStatus dest = new WMWorkOrderStatus();

		dest.setWorkOdrNum(src.getActivityId());
		dest.setWorkProgState("Q");
		dest.setWorkStateDt(src.getDateTimeStatus());
		dest.setDuration(convertDuration(src.getDuration()));
		dest.setReason(src.getReason());
		dest.setBt360FixedOdrYn(false);
		dest.setBt360FixedWorkerId(src.getResourceId());
		dest.setBt360FixedVisitDt(src.getDateTimeFixed());

		if (src.getCommitSortValue() != null) {
			dest.setBt360CommitValue(src.getCommitSortValue());
		}

		return dest;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param d
	 * @return
	 */
	private static String convertDuration(Duration d) {
		long minutes = -1L;

		if (d != null) {
			minutes = TimeUnit.MILLISECONDS.toMinutes(d
					.getTimeInMillis(new Date()));
		}

		return minutes == -1L ? null : String.valueOf(minutes);
	}
}
