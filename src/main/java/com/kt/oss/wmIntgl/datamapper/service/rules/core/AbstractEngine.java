package com.kt.oss.wmIntgl.datamapper.service.rules.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.SerializationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentCancel;
import com.kt.oss.wmIntgl.datahandler.domain.WMAppointmentOrder;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;

public abstract class AbstractEngine {

	@Value("${broadcastparameter.url}")
	protected String broadcastUrl;

	@Autowired
	protected RulesDB rulesDB;

	@Autowired
	protected OllehMapService ollehMapService;

	/**
	 * Slf4j logger
	 */
	protected Logger logger;

	public AbstractEngine() {
		this.logger = LoggerFactory.getLogger(getClass());
	}

	/**
	 * IntglDataVo 의 sourceData 에서 변환 적용
	 * 
	 * @param intglVo
	 */
	protected List<Object> beforeMakeGenerateData(IntglDataVo intglVo) {
		List<Object> oldSourceData = null;
		switch (intglVo.getVsType()) {
		case VS6:
		case VS6C:
			// TB_WM_MAPPINGOFFICETRANS 테이블에서 officeScode 를 변환
			Map<String, String> transMap1 = rulesDB.selectOfficeScodeTrans();
			for (Object object : intglVo.getSourceData()) {
				WMAppointmentOrder wmAppointmentOrder = (WMAppointmentOrder) object;
				String newOfficeScode = transOfficeScode(
						wmAppointmentOrder.getOfficeScode(), transMap1);

				// 변환되지 않으면 skip
				if (newOfficeScode.equals(wmAppointmentOrder.getOfficeScode()))
					continue;

				if (oldSourceData == null)
					oldSourceData = new ArrayList<Object>();
				oldSourceData.add(SerializationUtils
						.serialize(wmAppointmentOrder));

				wmAppointmentOrder.setOfficeScode(newOfficeScode);
			}
			break;
		case VS6B:
		case VS6D:
			oldSourceData = new ArrayList<Object>();
			// TB_WM_MAPPINGOFFICETRANS 테이블에서 officeScode 를 변환
			Map<String, String> transMap2 = rulesDB.selectOfficeScodeTrans();
			for (Object object : intglVo.getSourceData()) {
				WMAppointmentCancel wmAppointmentCancel = (WMAppointmentCancel) object;
				String newOfficeScode = transOfficeScode(
						wmAppointmentCancel.getOfficeScode(), transMap2);

				// 변환되지 않으면 skip
				if (newOfficeScode.equals(wmAppointmentCancel.getOfficeScode()))
					continue;

				if (oldSourceData == null)
					oldSourceData = new ArrayList<Object>();
				oldSourceData.add(SerializationUtils
						.serialize(wmAppointmentCancel));

				wmAppointmentCancel.setOfficeScode(newOfficeScode);
			}
			break;
		}
		return oldSourceData;
	}

	/**
	 * backupData 를 IntglDataVo 에 복원
	 * 
	 * @param intglVo
	 */
	protected void afterMakeGenerateData(IntglDataVo intglVo,
			List<Object> oldSourceData) {
		List<Object> sourceData = null;
		switch (intglVo.getVsType()) {
		case VS6:
		case VS6C:
			sourceData = new ArrayList<Object>();
			for (Object object : oldSourceData) {
				WMAppointmentOrder wmAppointmentOrder = (WMAppointmentOrder) SerializationUtils
						.deserialize((byte[]) object);
				sourceData.add(wmAppointmentOrder);
			}
			intglVo.setSourceData(sourceData);
			break;
		case VS6B:
		case VS6D:
			sourceData = new ArrayList<Object>();
			for (Object object : oldSourceData) {
				WMAppointmentCancel wmAppointmentCancel = (WMAppointmentCancel) SerializationUtils
						.deserialize((byte[]) object);
				sourceData.add(wmAppointmentCancel);
			}
			intglVo.setSourceData(sourceData);
			break;
		}
	}

	private String transOfficeScode(String officeScode,
			Map<String, String> transMap) {
		if (transMap.containsKey(officeScode))
			return transMap.get(officeScode);
		else
			return officeScode;
	}
}
