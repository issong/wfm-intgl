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
 * yngwie          2012. 10. 15.      First Draft.
 */
package com.kt.oss.wmIntgl.datamapper.service.rules.mapper;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import com._360scheduling.schema.dsscheduledata.ObjectFactory;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentOrder;
import com.kt.oss.wmIntgl.datahandler.domain.WMWorkOrder;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivitySlaConfigVo;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesDB;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesMapper;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author jysong
 * @date 2012. 10. 15.
 * @see
 */
public class MapperActivitySLA extends RulesMapper {

	/**
	 * ActivitySLA 항목의 데이터를 적재한다.
	 * 
	 * @param drls
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Object> generate(_Rules drls, IntglDataVo intglVo,
			RulesVo rulesVo, RulesDB rulesDB, OllehMapService ollehMapService)
			throws Exception {
		// TB_WM_MAPPINGSLACONFIG 테이블에서 국사별 SLA 설정값을 조회하여 사용
		rulesVo.setActivitySlaConfigs(rulesDB.selectActivitySlaConfig(intglVo.getSourceId()));
		Map<String, ActivitySlaConfigVo> slaMap = rulesVo.getActivitySlaConfigsMap();

		ActivitySlaConfigVo vo = null;
		switch (intglVo.getVsType()) {
		case VS1:
		case VS5:
		case VS10:
			for (Object order : intglVo.getSourceData()) {
				WMWorkOrder wmWorkOrder = (WMWorkOrder) order;
				vo = slaMap.get(wmWorkOrder.getOfficeScode());
				if (vo == null)
					vo = new ActivitySlaConfigVo();
				
				XMLGregorianCalendar bt360SlaStartDt = wmWorkOrder.getBt360SlaStartDt(); // 백업후복원
				XMLGregorianCalendar bt360SlaEndDt = wmWorkOrder.getBt360SlaEndDt(); // 백업후복원
				
				if (bt360SlaStartDt == null || bt360SlaEndDt == null)
					continue;
				
				if (bt360SlaStartDt.getHour() == 9 && bt360SlaStartDt.getMinute() == 0) { // 09:00일때
					rulesVo.setSlaTypeId(null);
					rulesVo.setPriority(1);
					wmWorkOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaStartDt, vo.getAmEa(), false));
					wmWorkOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getAmEt(), false));
					executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB, ollehMapService);

					rulesVo.setSlaTypeId("AM_SLA");
					rulesVo.setPriority(2);
					wmWorkOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaEndDt, vo.getAmEt(), false));
					wmWorkOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getAmSe(), true));
					executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				} else if (bt360SlaStartDt.getHour() == 13 && bt360SlaStartDt.getMinute() == 0) { // 13:00일때
					rulesVo.setSlaTypeId(null);
					rulesVo.setPriority(1);
					wmWorkOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaStartDt, vo.getPmEa(), false));
					wmWorkOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getPmEt(), false));
					executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB, ollehMapService);

					rulesVo.setSlaTypeId("PM_SLA");
					rulesVo.setPriority(2);
					wmWorkOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaEndDt, vo.getPmEt(), false));
					wmWorkOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getPmSe(), true));
					executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				} else { // 그외일때
					rulesVo.setPriority(1);
					executeGenerate(drls, wmWorkOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				}
				
				wmWorkOrder.setBt360SlaStartDt(bt360SlaStartDt);
				wmWorkOrder.setBt360SlaEndDt(bt360SlaEndDt);
			}
			break;
		case VS6C:
			for (Object order : intglVo.getSourceData()) {
				WMAppointmentOrder wmAppointmentOrder = (WMAppointmentOrder) order;
				vo = slaMap.get(wmAppointmentOrder.getOfficeScode());
				if (vo == null)
					vo = new ActivitySlaConfigVo();

				XMLGregorianCalendar bt360SlaStartDt = wmAppointmentOrder.getBt360SlaStartDt(); // 백업후복원
				XMLGregorianCalendar bt360SlaEndDt = wmAppointmentOrder.getBt360SlaEndDt(); // 백업후복원
				
				if (bt360SlaStartDt == null || bt360SlaEndDt == null)
					continue;

				if (bt360SlaStartDt.getHour() == 9 && bt360SlaStartDt.getMinute() == 0) { // 09:00일때
					rulesVo.setSlaTypeId(null);
					rulesVo.setPriority(1);
					wmAppointmentOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaStartDt, vo.getAmEa(), false));
					wmAppointmentOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getAmEt(), false));
					executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo, rulesDB, ollehMapService);
					
					rulesVo.setSlaTypeId("AM_SLA");
					rulesVo.setPriority(2);
					wmAppointmentOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaEndDt, vo.getAmEt(), false));
					wmAppointmentOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getAmSe(), true));
					executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				} else if (bt360SlaStartDt.getHour() == 13 && bt360SlaStartDt.getMinute() == 0) { // 13:00일때
					rulesVo.setSlaTypeId(null);
					rulesVo.setPriority(1);
					wmAppointmentOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaStartDt, vo.getPmEa(), false));
					wmAppointmentOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getPmEt(), false));
					executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo, rulesDB, ollehMapService);

					rulesVo.setSlaTypeId("PM_SLA");
					rulesVo.setPriority(2);
					wmAppointmentOrder.setBt360SlaStartDt(getBt360SlaStartDt(bt360SlaEndDt, vo.getPmEt(), false));
					wmAppointmentOrder.setBt360SlaEndDt(getBt360SlaEndtDt(bt360SlaEndDt, vo.getPmSe(), true));
					executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				} else { // 그외일때
					rulesVo.setPriority(1);
					executeGenerate(drls, wmAppointmentOrder, intglVo, rulesVo, rulesDB, ollehMapService);
				}
				
				wmAppointmentOrder.setBt360SlaStartDt(bt360SlaStartDt);
				wmAppointmentOrder.setBt360SlaEndDt(bt360SlaEndDt);
			}
			break;
		default:
			rulesVo.setPriority(1);
			for (Object order : intglVo.getSourceData()) {
				executeGenerate(drls, order, intglVo, rulesVo, rulesDB, ollehMapService);
			}
			break;
		}
		return getTargetData();
	}

	/**
	 * bt360SlaStartDt 값을 세팅한다
	 * 
	 * <pre>
	 * 대상 : VS1, VS5, VS6C, VS10
	 * 
	 * 1번째 ActivitySLA
	 * datetime_start =
	 *    case [bt360SlaStartDt] = 오전(09:00) then
	 *         [bt360SlaStartDt] - [AM_EA] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaStartDt] - [PM_EA] 설정
	 *    else [bt360SlaStartDt]
	 * datetime_end =
	 *    case [bt360SlaStartDt] = 오전(09:00) then
	 *         [bt360SlaEndDt] - [AM_ET] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndDt] - [PM_ET] 설정
	 *    else [bt360SlaEndDt]
	 *    
	 * 2번째 ActivitySLA
	 * sla_type_id =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 'AM_SLA' 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then 'PM_SLA' 설정
	 *    else 해당 Set 생성 안함.
	 * datetime_start =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 
	 *         [bt360SlaEndtDt] - [AM_ET] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndtDt] - [PM_ET] 설정
	 *    else 해당 Set 생성안함.
	 * datetime_end =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 
	 *         [bt360SlaEndtDt] + [AM_SE] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndtDt] + [PM_SE] 설정
	 *    else 해당 Set 생성안함.
	 * </pre>
	 * 
	 * @param bt360SlaStartDt
	 * @param amountStart
	 * @param isPlusStart
	 * @return
	 * @throws ConversionException
	 */
	private XMLGregorianCalendar getBt360SlaStartDt(
			XMLGregorianCalendar bt360SlaStartDt, int amountStart,
			boolean isPlusStart) throws ConversionException {
		if (amountStart != 0) {
			if (!isPlusStart)
				amountStart = amountStart * -1;
			return ConversionUtil.getXMLGregorianCalendar(StringUtil.toDate(
					ConversionUtil.getDate(bt360SlaStartDt), Calendar.MINUTE,
					amountStart));
		} else {
			return bt360SlaStartDt;
		}
	}

	/**
	 * bt360SlaEndDt 값을 세팅한다
	 * 
	 * <pre>
	 * 대상 : VS1, VS5, VS6C, VS10
	 * 
	 * 1번째 ActivitySLA
	 * datetime_start =
	 *    case [bt360SlaStartDt] = 오전(09:00) then
	 *         [bt360SlaStartDt] - [AM_EA] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaStartDt] - [PM_EA] 설정
	 *    else [bt360SlaStartDt]
	 * datetime_end =
	 *    case [bt360SlaStartDt] = 오전(09:00) then
	 *         [bt360SlaEndDt] - [AM_ET] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndDt] - [PM_ET] 설정
	 *    else [bt360SlaEndDt]
	 *    
	 * 2번째 ActivitySLA
	 * sla_type_id =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 'AM_SLA' 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then 'PM_SLA' 설정
	 *    else 해당 Set 생성 안함.
	 * datetime_start =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 
	 *         [bt360SlaEndtDt] - [AM_ET] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndtDt] - [PM_ET] 설정
	 *    else 해당 Set 생성안함.
	 * datetime_end =
	 *    case [bt360SlaStartDt] = 오전(09:00) then 
	 *         [bt360SlaEndtDt] + [AM_SE] 설정
	 *    case [bt360SlaStartDt] = 오후(13:00) then
	 *         [bt360SlaEndtDt] + [PM_SE] 설정
	 *    else 해당 Set 생성안함.
	 * </pre>
	 * 
	 * @param bt360SlaEndDt
	 * @param amountEnd
	 * @param isPlusEnd
	 * @return
	 * @throws ConversionException
	 */
	private XMLGregorianCalendar getBt360SlaEndtDt(
			XMLGregorianCalendar bt360SlaEndDt, int amountEnd, boolean isPlusEnd)
			throws ConversionException {
		if (amountEnd != 0) {
			if (!isPlusEnd)
				amountEnd = amountEnd * -1;
			return ConversionUtil.getXMLGregorianCalendar(StringUtil.toDate(
					ConversionUtil.getDate(bt360SlaEndDt), Calendar.MINUTE,
					amountEnd));
		} else {
			return bt360SlaEndDt;
		}
	}

	/**
	 * 결과를 저장할 객체를 생성한다.
	 */
	@Override
	protected Object getTargetObject() {
		return new ObjectFactory().createDsScheduleDataActivitySLA();
	}
}
