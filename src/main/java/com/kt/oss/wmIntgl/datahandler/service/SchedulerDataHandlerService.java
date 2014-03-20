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
package com.kt.oss.wmIntgl.datahandler.service;

import com._360scheduling.schema.dsmodelling.DsModelling;
import com._360scheduling.schema.dsscheduledata.DsScheduleData;
import com._360scheduling.schema.dssystemdata.DsSystemData;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.constants.SystemType;
import com.kt.oss.wmIntgl.common.utils.NetUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.jms.SchedulerDataJMSClient;
import com.kt.oss.wmIntgl.datamapper.facade.DataMapperFacade;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.client.SchedulerServiceProxy;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.concurrent.Future;

/**
 * short description about class <br />
 *
 * @author yngwie
 * @version 1.0
 * @date 2012. 10. 19.
 * @see
 */
@Service
public class SchedulerDataHandlerService extends BaseService {
    @Autowired
    private DataMapperFacade dataMapperFacade;
    @Autowired
    private EventHandlerFacade eventHandlerFacade;
    @Autowired
    private SchedulerDataJMSClient schedulerDataJMSClient;
    @Autowired
    private SchedulerServiceProxy schedulerServiceProxy;
    @Resource(name = "scheduleMarshaller")
    private Marshaller scheduleMarshaller;
    @Resource(name = "modellingMarshaller")
    private Marshaller modellingMarshaller;
    @Resource(name = "systemDataMarshaller")
    private Marshaller systemDataMarshaller;
    @Autowired
    private AppointmentDataHandlerService appointmentDataHandlerService;

    @Value("${appointmentsenario.enabled}")
    private boolean appointmentEnabled;

    /**
     * short description about method <br />
     *
     * @param intglVo
     * @return
     * @throws javax.jms.JMSException
     */
    public void trans360ToIntglSendData(IntglDataVo intglVo)
            throws JMSException {
        schedulerDataJMSClient.sendData(intglVo);

    }

    /**
     * send data to 360 I/O Server Async method <br />
     *
     * @param intglVo
     * @return
     */
    @Async
    public Future<EventStatus> transIntglTo360SendData(IntglDataVo intglVo) {
        EventStatus result = transIntglTo360Send(intglVo);

        if (appointmentEnabled && intglVo.getVsType() == ScenarioType.VS1
                && appointmentDataHandlerService.addAppointmenetOfferList(intglVo)) {
            result = transIntglTo360Send(intglVo);
        }

        return new AsyncResult<EventStatus>(result);
    }

    /**
     * send data to 360 I/O Server Sync method <br />
     *
     * @param intglVo
     * @return
     */
    public EventStatus transIntglTo360SendDataSync(IntglDataVo intglVo) {
        return transIntglTo360Send(intglVo);
    }

    /**
     * send data to 360 I/O Server <br />
     * 1. mapping legacy data to 360 data <br />
     * 2. send mapped data to 360 proxy <br />
     *
     * @param intglVo
     * @return
     */
    private EventStatus transIntglTo360Send(IntglDataVo intglVo) {
        EventStatus result = null;
        try {
            if (!intglVo.isReprocessRequired()
                    && !intglVo.isReprocessAppointmentOffer()) {
                dataMapperFacade.generateData(intglVo);
            }

            int nDataType = 0;

            int dataSize = 0;

            String strInputXML = null;
            StringWriter writer = new StringWriter();
            StreamResult sr = new StreamResult(writer);

            switch (intglVo.getVsType()) {
                case VS14:
                case VS14A:
                case VS14B:
                case VS14C:
                case VS14D:
                case VS16:
                case VS16A:
                    DsModelling ds = (DsModelling) intglVo.getTargetData().get(0);

                    dataSize = ds.getRamUpdateOrRAMResourceOrRAMResourceDivision()
                            .size();

                    modellingMarshaller.marshal(ds, sr);
                    strInputXML = writer.toString();
                    nDataType = 5;
                    break;

                case VS15A:
			    case VS15D:
                    DsSystemData dsd = (DsSystemData) intglVo.getTargetData()
                            .get(0);

                    dataSize = dsd.getUsersOrUserGroupOrUserExternalTask().size();

                    systemDataMarshaller.marshal(dsd, sr);
                    strInputXML = writer.toString();
                    nDataType = 4;
                    break;

                default:
                    DsScheduleData d = (DsScheduleData) intglVo.getTargetData()
                            .get(0);

                    dataSize = d.getShiftPatternOrActivityOrActivitySLA().size();

                    scheduleMarshaller.marshal(d, sr);
                    strInputXML = writer.toString();
                    break;

            }

            result = schedulerServiceProxy.sendStringDataTo360Sync(strInputXML,
                    nDataType, intglVo, dataSize);

        } catch (Exception e) {
            String errMsg = StringUtil.getStackTrace(e);
            logger.error(errMsg);

            result = EventStatus.ERROR_TARGET_SEND;

            EventLogVo vo = getEventLogVo(intglVo, "transIntglTo360Send");
            vo.setEventStatus(EventStatus.ERROR_TARGET_SEND);
            vo.setEventMsg(StringUtils.abbreviate(e.getMessage(), 3200));
            vo.setEventDetailMsg(errMsg);

            if (!intglVo.isReprocessRequired()) {
                eventHandlerFacade.writeEventLog(vo);
                eventHandlerFacade.writeEventDetailLog(vo);
            } else {
                vo.setEventType(6);
                eventHandlerFacade.updateEventLog(vo);
            }
        }

        return result;
    }

    /**
     * return new EventLogVo instance <br />
     *
     * @param intglVo
     * @param methodName
     * @return
     */
    private EventLogVo getEventLogVo(IntglDataVo intglVo, String methodName) {
        EventLogVo vo = new EventLogVo();

        vo.setEventId(intglVo.getEventId());
        vo.setEventSender(SystemType.NeOSS.toString());
        vo.setEventReceiver(SystemType.Scheduling360.toString());
        vo.setEventVsType(intglVo.getVsType());
        vo.setEventSourceId(intglVo.getSourceId());
        vo.setEventType(6);
        vo.setEventStatus(EventStatus.NONE);
        vo.setEventClass(getClass().getSimpleName());
        vo.setEventMethod(methodName);
        vo.setEventHostName(NetUtil.getLocalName());
        vo.setEventHostIp(NetUtil.getLocalAddr());

        return vo;
    }
}