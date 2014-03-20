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
 * yngwie          2013. 02. 21.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.service;

import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com._360scheduling.schema.dsscheduledata.ObjectFactory;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.MappingTypeVo;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesDB;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMAppointmentResource;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.service.WMAppointmentProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * VS1 전송후 360에 저장된 예약목록을 가져와서 다시 전송하는 Service <br />
 *
 * @author yngwie
 * @version 1.0
 * @date 2013. 02. 21.
 * @see
 */
@Service
public class AppointmentDataHandlerService extends BaseService {

    @Autowired
    private WMAppointmentProviderService wMAppointmentProviderService;
    @Autowired
    private RulesDB rulesDB;

    public boolean addAppointmenetOfferList(IntglDataVo intglVo) {

        boolean result = false;

        changeIntglVoProperties(intglVo);

        List<WMAppointmentResource> list = wMAppointmentProviderService.selectActivityAndOthers(intglVo.getSourceId());

        if (list != null && list.size() > 0) {
            DsScheduleData d = (DsScheduleData) intglVo.getTargetData().get(0);

            if(d != null) {
                d.getShiftPatternOrActivityOrActivitySLA().clear();

                List<DsScheduleData.Activity> activityList = new ArrayList<DsScheduleData.Activity>();
                List<DsScheduleData.ActivitySLA> slaList = new ArrayList<DsScheduleData.ActivitySLA>();
                List<DsScheduleData.ActivityStatus> statusList = new ArrayList<DsScheduleData.ActivityStatus>();
                List<DsScheduleData.Location> locList = new ArrayList<DsScheduleData.Location>();
                List<DsScheduleData.LocationRegion> regList = new ArrayList<DsScheduleData.LocationRegion>();
                List<DsScheduleData.AdditionalAttribute> attList = new ArrayList<DsScheduleData.AdditionalAttribute>();

                for(WMAppointmentResource resource : list) {
                    if(resource.getActivity() != null) {
                        activityList.add(resource.getActivity());
                    }
                    if(resource.getActivity_SLA() != null) {
                        slaList.add(resource.getActivity_SLA());
                    }
                    if(resource.getActivity_SLA1() != null) {
                        slaList.add(resource.getActivity_SLA1());
                    }
                    if(resource.getActivityStatus() != null) {
                        statusList.add(resource.getActivityStatus());
                    }
                    if(resource.getLocation() != null) {
                        locList.add(resource.getLocation());
                    }
                    if(resource.getLocationRegion() != null) {
                        regList.add(resource.getLocationRegion());
                    }
                    if(resource.getAdditionalAttribute() != null) {
                        attList.add(resource.getAdditionalAttribute());
                    }
                }

                d.getShiftPatternOrActivityOrActivitySLA().addAll(locList);
                d.getShiftPatternOrActivityOrActivitySLA().addAll(regList);
                d.getShiftPatternOrActivityOrActivitySLA().addAll(activityList);
                d.getShiftPatternOrActivityOrActivitySLA().addAll(slaList);
                d.getShiftPatternOrActivityOrActivitySLA().addAll(statusList);
                d.getShiftPatternOrActivityOrActivitySLA().addAll(attList);
            }

            addInputReference(intglVo);
            result = true;
        }

        return result;
    }

    private void changeIntglVoProperties(IntglDataVo intglVo) {
        try {
            String sourceDt = ConversionUtil.getXMLGregorianCalendarToString(ConversionUtil.getXMLGregorianCalendar());

            intglVo.setSourceDt(ConversionUtil.getStringToDate(sourceDt));
            intglVo.setInputReferenceId(StringUtil.getUUID());

            intglVo.setReprocessAppointmentOffer(true);

        } catch (ConversionException e) {
            logger.warn(e.getMessage());
        }
    }

    private void addInputReference(IntglDataVo intglVo) {
        try {
            DsScheduleData.InputReference inputReference = new ObjectFactory().createDsScheduleDataInputReference();

            MappingTypeVo mappingTypeVo = rulesDB.selectMappingType(intglVo.getVsType(), intglVo.getSourceDt());
            inputReference.setId(intglVo.getInputReferenceId());

            inputReference.setDatasetId(intglVo.getSourceId() + mappingTypeVo.getDsPostfix());
            inputReference.setDatetime(ConversionUtil.getXMLGregorianCalendar(mappingTypeVo.getIrSourceDt()));

            inputReference.setDescription("");
            inputReference.setDuration(ConversionUtil.getIntToDuration(true, 2, 0, 0, 0));
            inputReference.setAppointmentWindowDuration(ConversionUtil.getIntToDuration(true, 30, 0, 0, 0));
            inputReference.setProcessType("APPOINTMENT");
            inputReference.setInputType("CHANGE");
            inputReference.setOrganisationId(1);

            DsScheduleData d = (DsScheduleData) intglVo.getTargetData().get(0);

            if(d != null) {
                d.getShiftPatternOrActivityOrActivitySLA().add(inputReference);
            }

        } catch (ConversionException e) {
            logger.warn(e.getMessage());
        }

    }
}
