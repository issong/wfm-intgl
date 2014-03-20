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

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.jms.LegacyDataJMSClient;
import com.kt.oss.wmIntgl.datamapper.facade.DataMapperFacade;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.intgl2neosswm.client.WMServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import java.util.concurrent.Future;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */

@Service
public class LegacyDataHandlerService extends BaseService {
	@Autowired
	private DataMapperFacade dataMapperFacade;
	@Autowired
	private EventHandlerFacade eventHandlerFacade;
    @Autowired
	private LegacyDataJMSClient legacyDataJMSClient;
	@Autowired
	private WMServiceProxy wMServiceProxy;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 */
	@Async
	public Future<EventStatus> transIntglToLegacySendData(IntglDataVo intglVo) {
		EventStatus result = null;

		try {
			if (!intglVo.isReprocessRequired()) {
				dataMapperFacade.generateData(intglVo);
			}

			switch (intglVo.getVsType()) {
			case VS2:
				result = wMServiceProxy.receive360WorkOrder(intglVo);
				break;

			case VS7:
				result = wMServiceProxy.receive360WorkOrderStatus(intglVo);
				break;

			default:
				break;
			}

		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
		}

		return new AsyncResult<EventStatus>(result);
	}

	public EventStatus transIntglToLegacySendDataSync(IntglDataVo intglVo) {
		EventStatus result = null;

		try {
			if (!intglVo.isReprocessRequired()) {
				dataMapperFacade.generateData(intglVo);
			}

			switch (intglVo.getVsType()) {
			case VS2:
				result = wMServiceProxy.receive360WorkOrder(intglVo);
				break;

			case VS7:
				result = wMServiceProxy.receive360WorkOrderStatus(intglVo);
				break;

			default:
				break;
			}

		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
		}

		return result;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param intglVo
	 * @return
	 * @throws javax.jms.JMSException
	 */
	public void transLegacyToIntglSendData(IntglDataVo intglVo)
			throws JMSException {
		legacyDataJMSClient.sendData(intglVo);
	}
}
