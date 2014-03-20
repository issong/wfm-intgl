package com.kt.oss.wmIntgl.eventhandler.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.utils.NetUtil;

@Service
public class EventDayBreakBatch extends BaseService {

	@Autowired
	EventDayBreakExecutor executor;

	@Value("${notification.host}")
	String notificationHost;

	@Value("${notification.instance}")
	String notificationInstance;

	/**
	 * 배치수행 (VS1 체크, 매일 04:00 수행 -> 05:00 체크) (wfmSvrB1 에서만 업무처리)
	 */
	public void executeBatchVS1() {
		logger.debug("BatchVS1 Address=" + NetUtil.getAddress()
				+ ", notificationHost=" + notificationHost);
		logger.debug("BatchVS1 SvrName=" + NetUtil.getSvrName()
				+ ", notificationInstance=" + notificationInstance);

		if (notificationHost.equals(NetUtil.getAddress())
				&& notificationInstance.equals(NetUtil.getSvrName())) {
			executor.checkBatchAsync(ScenarioType.VS1);
		}
	}

	/**
	 * 배치수행 (VS14B 체크, 매일 07:05 수행 -> 07:30 체크) (wfmSvrB1 에서만 업무처리)
	 */
	public void executeBatchVS14B() {
		logger.debug("BatchVS14B Address=" + NetUtil.getAddress()
				+ ", notificationHost=" + notificationHost);
		logger.debug("BatchVS14B SvrName=" + NetUtil.getSvrName()
				+ ", notificationInstance=" + notificationInstance);

		if (notificationHost.equals(NetUtil.getAddress())
				&& notificationInstance.equals(NetUtil.getSvrName())) {
			executor.checkBatchAsync(ScenarioType.VS14B);
		}
	}

	/**
	 * 배치수행 (VS14C 체크, 매일 03:30 수행 -> 04:00 체크) (wfmSvrB1 에서만 업무처리)
	 */
	public void executeBatchVS14C() {
		logger.debug("BatchVS14C Address=" + NetUtil.getAddress()
				+ ", notificationHost=" + notificationHost);
		logger.debug("BatchVS14C SvrName=" + NetUtil.getSvrName()
				+ ", notificationInstance=" + notificationInstance);

		if (notificationHost.equals(NetUtil.getAddress())
				&& notificationInstance.equals(NetUtil.getSvrName())) {
			executor.checkBatchAsync(ScenarioType.VS14C);
		}
	}
}
