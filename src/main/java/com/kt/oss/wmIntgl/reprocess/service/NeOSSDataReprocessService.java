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
 * yngwie          2013. 1. 24.      First Draft.
 */
package com.kt.oss.wmIntgl.reprocess.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.dao.Neosswm2IntglDao;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.provider.WMSchedulerServiceProvider;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderParamAll;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2013. 1. 24.
 * @see
 * 
 */
@Service
public class NeOSSDataReprocessService extends BaseService {

	@Autowired
	private Neosswm2IntglDao neosswm2IntglDao;

    @Autowired
	private WMSchedulerServiceProvider wMSchedulerServiceProvider;

	@Value("${pendingsenario.termmillisecond}")
	private long term;

	/**
	 * DB에 저장된 VS3, VS5, VS8, VS10 데이터를 다시 360으로 전송 <br />
	 * 
	 * 
	 * @param csctId
	 * @return
	 */
	@Async
	public void reprocessScenario(String csctId) {
		// VS1 처리중인지 확인
		String isYn = neosswm2IntglDao.selectMapping360IoForVs1(csctId);

		if (!StringUtils.equals(isYn, "N")) {
			return;
		}

		reprocessVSAll(csctId);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param csctId
	 * @return
	 */
	@Transactional
	private int reprocessVSAll(String csctId) {
		int result = -100;

		long start = System.currentTimeMillis();

		List<WMWorkOrderParamAll> allList = neosswm2IntglDao
				.selectAllSourceData(csctId);

		long end = System.currentTimeMillis();

		logger.debug("take time : "
				+ TimeUnit.MILLISECONDS.toSeconds(end - start) + " sec");

		if (allList == null || allList.size() == 0) {
			return result;
		}

		for (int i = 0; i < allList.size(); i++) {
			WMWorkOrderParamAll src = allList.get(i);

			switch (src.getVsType()) {
			case VS3:
				List<WMWorkOrderStatusParam> listVs3 = new ArrayList<WMWorkOrderStatusParam>();
				listVs3.add(src.getVs3());
				result = wMSchedulerServiceProvider.updateTaskStatus(
						src.getSourceId(), src.getSourceDt(), listVs3);

				neosswm2IntglDao.updateVS3SourceData(src);
				break;

			case VS8:
				List<WMWorkOrderKeyParam> listVs8 = new ArrayList<WMWorkOrderKeyParam>();
				listVs8.add(src.getVs8());
				result = wMSchedulerServiceProvider.cancelTask(
						src.getSourceId(), src.getSourceDt(), listVs8);

				neosswm2IntglDao.updateVS8SourceData(src);
				break;

			case VS5:
				List<WMWorkOrderParam> listVs5 = new ArrayList<WMWorkOrderParam>();
				listVs5.add(src.getVs5());
				result = wMSchedulerServiceProvider.addNewTask(
						src.getSourceId(), src.getSourceDt(), listVs5);

				neosswm2IntglDao.updateVS10SourceData(src);
				break;

			case VS10:
				List<WMWorkOrderParam> listVs10 = new ArrayList<WMWorkOrderParam>();
				listVs10.add(src.getVs5());
				result = wMSchedulerServiceProvider.modifyTask(
						src.getSourceId(), src.getSourceDt(), listVs10);

				neosswm2IntglDao.updateVS10SourceData(src);
				break;

			default:
				break;
			}

			try {
				Thread.sleep(term);
			} catch (InterruptedException e) {
				logger.error(e.getMessage());
			}
		}

		return result;
	}
}
