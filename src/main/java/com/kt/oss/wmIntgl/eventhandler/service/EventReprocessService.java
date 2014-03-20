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
 * yngwie          2012. 11. 14.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.facade.DataHandlerFacade;
import com.kt.oss.wmIntgl.eventhandler.dao.intgl.EventReprocessServiceDao;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventReprocessVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 14.
 * @see
 * 
 */
@Service
public class EventReprocessService extends BaseService {

	@Autowired
	private EventLogService eventLogService;

	@Autowired
	private EventReprocessServiceDao eventReprocessServiceDao;

	@Autowired
	private DataHandlerFacade dataHandlerFacade;

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventId
	 * @return
	 */
	public EventStatus runEventReprocess(int eventId) {
		EventStatus result = null;

		EventReprocessVo vo = eventReprocessServiceDao
				.selectEventReprocess(eventId);

		if (vo != null) {
			try {
				updateEventReprocessCount(eventId);

				ByteArrayInputStream bis = new ByteArrayInputStream(
						vo.getReprocessDataBytes());
				ObjectInputStream ois = new ObjectInputStream(bis);
				IntglDataVo intglVo = (IntglDataVo) ois.readObject();
				intglVo.setReprocessRequired(true);

				logger.debug("intglVo=" + intglVo);

				if (intglVo != null) {

					switch (intglVo.getVsType()) {
					case VS2:
					case VS6A:
					case VS7:
					case VS20:
						result = dataHandlerFacade
								.transIntglToLegacySendDataSync(intglVo);
						break;

					default:
						result = dataHandlerFacade
								.transIntglTo360SendDataSync(intglVo);
						break;
					}
				}

				vo.setReprocessStatus(result == EventStatus.SUCCES ? 1 : 0);
				vo.setEventStatus(result == EventStatus.SUCCES ? EventStatus.SUCCES_REPROCESS
						.getType() : EventStatus.ERROR_REPROCESS.getType());

			} catch (Exception e) {
				logger.error(StringUtil.getStackTrace(e));
				vo.setReprocessStatus(0);
				vo.setEventStatus(EventStatus.ERROR_REPROCESS.getType());
			} finally {
				updateEventReprocessStatus(vo);
			}
		}

		return result;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventReprocessVo
	 * @return
	 */
	public boolean writeEventReprocess(IntglDataVo intglVo) {
		int cnt = 0;

		EventReprocessVo vo = new EventReprocessVo();
		vo.setEventId(intglVo.getEventId());
		vo.setReprocessCnt(0);
		vo.setReprocessStatus(0);
		vo.setReprocessData(intglVo);

		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(vo.getReprocessData());
			oos.flush();

			byte[] bytes = bos.toByteArray();
			oos.close();
			bos.close();
			vo.setReprocessDataBytes(bytes);

			cnt = eventReprocessServiceDao.writeEventReprocess(vo);
		} catch (IOException e) {
			logger.error(StringUtil.getStackTrace(e));
		}

		return cnt > 0 ? true : false;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventReprocessListVo
	 * @return
	 */
	public List<EventReprocessVo> getEventReprocessList(
			EventReprocessVo eventReprocessVo) {
		return eventReprocessServiceDao
				.selectEventReprocessList(eventReprocessVo);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventId
	 * @return
	 */
	private int updateEventReprocessCount(int eventId) {
		return eventReprocessServiceDao.updateEventReprocessCount(eventId);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param eventReprocessVo
	 * @return
	 */
	private int updateEventReprocessStatus(EventReprocessVo eventReprocessVo) {
		return eventReprocessServiceDao
				.updateEventReprocessStatus(eventReprocessVo);
	}

}
