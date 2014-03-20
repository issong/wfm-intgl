package com.kt.oss.wmIntgl.datamapper.service.rules.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.exception.ConversionException;
import com.kt.oss.wmIntgl.common.utils.ConversionUtil;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datamapper.dao.bt360.DataMapper360Dao;
import com.kt.oss.wmIntgl.datamapper.dao.intgl.DataMapperDao;
import com.kt.oss.wmIntgl.datamapper.domain.bt360.ActivitySlaObjectVo;
import com.kt.oss.wmIntgl.datamapper.domain.bt360.RamResourceObjectVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivitySlaConfigVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivityStatusVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.ActivityTypeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.MappingTypeVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.OfficeTransVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.TPRogVo;
import com.kt.oss.wmIntgl.datamapper.domain.intgl.WorkOrderStateVo;

@Service
public class RulesDB {

	@Autowired
	private DataMapperDao dataMapperDao;

	@Autowired
	private DataMapper360Dao dataMapper360Dao;

	/**
	 * [workType], [svcMainClsCode], [CompanyCode], [bt360SpecialWorkTypeCode],
	 * [bt360VvipYn] 을 조건으로 activity_type_id 를 찾는다.
	 * 
	 * @param workType
	 * @param svcMainClsCode
	 * @param companyCode
	 * @param bt360SpecialWorkTypeCode
	 * @param bt360VvipYn
	 * @param bt360TechMethod
	 * @return
	 */
	public String selectActivityTypeId(String workType, String svcMainClsCode,
			String companyCode, String bt360SpecialWorkTypeCode,
			String bt360VvipYn, String bt360TechMethod) {
		ActivityTypeVo vo = selectMappingOdrType(workType, svcMainClsCode,
				companyCode, bt360SpecialWorkTypeCode, bt360VvipYn,
				bt360TechMethod);
		if (vo == null || StringUtil.isEmpty(vo.getThreesixtyodrType())) {
			vo = selectMappingOdrType(workType, svcMainClsCode, null, null,
					bt360VvipYn, bt360TechMethod);
			if (vo == null || StringUtil.isEmpty(vo.getThreesixtyodrType())) {
				return "EMPTY";
			} else {
				return vo.getThreesixtyodrType();
			}
		} else {
			return vo.getThreesixtyodrType();
		}
	}

	/**
	 * [workType ], [svcMainClsCode], [CompanyCode], [bt360SpecialWorkTypeCode],
	 * [bt360VvipYn] 을 조건으로 TB_WM_MAPPINGODRTYPE 테이블을 조회하여 나온activity_type_id의
	 * Left(0, 4) 가 'VVIP' 일경우 activity_type_id 매핑
	 * 
	 * @param workType
	 * @param svcMainClsCode
	 * @param companyCode
	 * @param bt360SpecialWorkTypeCode
	 * @param bt360VvipYn
	 * @param bt360TechMethod
	 * @return
	 */
	public String selectActivityTypeIdVVIP(String workType,
			String svcMainClsCode, String companyCode,
			String bt360SpecialWorkTypeCode, String bt360VvipYn,
			String bt360TechMethod) {
		ActivityTypeVo vo = selectMappingOdrType(workType, svcMainClsCode,
				companyCode, bt360SpecialWorkTypeCode, bt360VvipYn,
				bt360TechMethod);
		if (vo == null || StringUtil.isEmpty(vo.getThreesixtyodrType())) {
			return null;
		} else {
			if (vo.getThreesixtyodrType().startsWith("VVIP")) {
				return vo.getThreesixtyodrType();
			} else {
				return null;
			}
		}
	}

	/**
	 * TB_WM_MAPPINGODRTYPE 테이블에서 해당 threesixtyodr_type의 duration값을 조회하여
	 * ct_value만큼 차감(%)후 [duration] 매핑(PT1H20 형태로 변환 후 매핑)
	 * 
	 * @param workType
	 * @param svcMainClsCode
	 * @param companyCode
	 * @param bt360SpecialWorkTypeCode
	 * @param bt360VvipYn
	 * @param bt360TechMethod
	 * @return
	 */
	public Duration selectDuration(String workType, String svcMainClsCode,
			String companyCode, String bt360SpecialWorkTypeCode,
			String bt360VvipYn, String bt360TechMethod) {
		ActivityTypeVo vo = selectMappingOdrType(workType, svcMainClsCode,
				companyCode, bt360SpecialWorkTypeCode, bt360VvipYn,
				bt360TechMethod);
		Duration duration = null;
		try {
			if (vo == null || StringUtil.isEmpty(vo.getThreesixtyodrType())) {
				duration = ConversionUtil.getIntToDuration(true, 0, 0, 60, 0);
			} else {
				int value = vo.getDuration()
						- ((vo.getDuration() * vo.getCtValue()) / 100);

				int hour = value / 60;
				int minute = value % 60;

				duration = ConversionUtil.getIntToDuration(true, 0, hour,
						minute, 0);
			}
		} catch (ConversionException e) {
		}
		return duration;
	}

	/**
	 * @param workType
	 * @param svcMainClsCode
	 * @param companyCode
	 * @param bt360SpecialWorkTypeCode
	 * @param bt360VvipYn
	 * @param bt360TechMethod
	 * @return
	 */
	private ActivityTypeVo selectMappingOdrType(String workType,
			String svcMainClsCode, String companyCode,
			String bt360SpecialWorkTypeCode, String bt360VvipYn,
			String bt360TechMethod) {
		ActivityTypeVo param = new ActivityTypeVo();
		param.setWorkType(workType);
		param.setSvcType(svcMainClsCode);
		param.setCompanyType(companyCode);
		param.setSpecialCd(bt360SpecialWorkTypeCode);
		param.setVvipyn(StringUtil.isEmpty(bt360VvipYn) ? "N" : bt360VvipYn);
		param.setTechMethod(bt360TechMethod);
		return dataMapperDao.selectMappingOdrType(param);
	}

	/**
	 * WORKPROGSTATE + WORKPROCSTATE + 360ADDWORKPROGSTATE 을 조건으로 status_id 를
	 * 찾는다
	 * 
	 * @param workProgState
	 * @param workProcState
	 * @param bt360AddWorkProgState
	 * @return
	 */
	public int selectActivityStatusId(String workProgState,
			String workProcState, String bt360AddWorkProgState) {
		ActivityStatusVo param = new ActivityStatusVo();
		param.setStatusCd(workProgState);
		param.setCompleteCd(workProcState);
		param.setAdditionalCd(bt360AddWorkProgState);
		ActivityStatusVo vo = dataMapperDao.selectActivityStatusId(param);
		if (vo == null || StringUtil.isEmpty(vo.getThreesixtystatusCd()))
			return 99;
		else
			return vo.getThreesixtystatusCd();
	}

	/**
	 * status_id 을 조건으로 WORKPROGSTATE + WORKPROCSTATE + 360ADDWORKPROGSTATE 를
	 * 찾는다
	 * 
	 * 테이블 : TB_WM_MAPPINGSTATUS
	 * 
	 * 방향 : 360 -> Legacy
	 * 
	 * @param suggestedDispatch
	 * @return
	 */
	public WorkOrderStateVo selectWMWorkOrderState(int statusId) {
		return dataMapperDao.selectWMWorkOrderState(statusId);
	}

	/**
	 * OFFICESCODE 를 조건으로 dataset_id 를 찾는다
	 * 
	 * 테이블 : TB_WM_MAPPINGOFFICEEXT
	 * 
	 * 방향 : Legacy -> 360
	 * 
	 * @param officeCd
	 * @return
	 */
	public String selectCSCTId(String officeScode) {
		return dataMapperDao.selectCSCTId(officeScode);
	}

	/**
	 * [reason_type_id]를 조건으로 TB_WM_MAPPINGREASONTYPE 테이블의 reasonType 을 조회
	 * 
	 * @param reasonTypeId
	 * @return
	 */
	public String selectReasonType(int reasonTypeId) {
		String reasonType = dataMapperDao.selectReasonType(reasonTypeId);
		if (StringUtil.isEmpty(reasonType))
			return "";
		else
			return reasonType;
	}

	/**
	 * InputReference 및 SourceData, SourceDataParameter 의 데이터를 처리하기위해 테스트용
	 * 
	 * <pre>
	 * VSTYPE IS '시나리오 타입'
	 * DSTYPE IS '데이터셋 타입(0:Big, 1:Small)'
	 * TSTYPE IS '시간 타입(0:자동, 1:수동)'
	 * IRTIME IS '수동설정 시간'
	 * </pre>
	 * 
	 * @param vsType
	 * @return
	 */
	public MappingTypeVo selectMappingType(ScenarioType vsType, Date sourceDt) {
		// String strVsType = vsType.toString();
		String strVsType = "VS_ALL";

		MappingTypeVo vo = dataMapperDao.selectMappingType(strVsType);
		if (vo == null)
			vo = new MappingTypeVo();

		// 값이 없을경우 기본 세팅 (Big, 자동, sourceDt)
		if (StringUtil.isEmpty(vo.getVsType()))
			vo.setVsType(strVsType);
		if (StringUtil.isEmpty(vo.getDsType()))
			vo.setDsType("0");
		if (StringUtil.isEmpty(vo.getTsType()))
			vo.setTsType("0");
		if (StringUtil.isEmpty(vo.getIrTime())) {
			if (sourceDt == null)
				vo.setIrTime(StringUtil.toDate(null));
			else
				vo.setIrTime(StringUtil.toDate(sourceDt.getTime(), null));
		}

		// [1]작은Dataset, [0]큰Dataset 세팅
		if ("1".equals(vo.getDsType()))
			vo.setDsPostfix("_1");
		else
			vo.setDsPostfix("");

		// [1]임의의 시간, [0]IL 시간 세팅
		if ("1".equals(vo.getTsType()))
			vo.setIrSourceDt(StringUtil.toDate(vo.getIrTime(), null));
		else
			vo.setIrSourceDt(sourceDt);

		return vo;
	}

	/**
	 * ActivitySLA 매핑하기 위한 Config 정보 조회
	 * 
	 * @param csctCd
	 * @return
	 */
	public List<ActivitySlaConfigVo> selectActivitySlaConfig(String csctCd) {
		List<ActivitySlaConfigVo> ActivitySlaConfigs = dataMapperDao
				.selectActivitySlaConfig(csctCd);
		if (ActivitySlaConfigs == null)
			ActivitySlaConfigs = new ArrayList<ActivitySlaConfigVo>();
		return ActivitySlaConfigs;
	}

	/**
	 * [grade]로 TB_WM_MAPPINGWORKERGRADE 테이블을 조회하여 [GDR_NM] 컬럼을 매핑
	 * 
	 * 테이블 : TB_WM_MAPPINGWORKERGRADE
	 * 
	 * 방향 : Legacy -> 360
	 * 
	 * @param grdCd
	 * @return
	 */
	public String selectGradeName(String grdCd) {
		if (grdCd == null)
			return "";
		String grdNm = dataMapperDao.selectGradeName(grdCd);
		if (grdNm == null)
			return "";
		return grdNm;
	}

	/**
	 * [officeScode] +"_"+[workTeamCode]를 key로 TB_WM_MAPPINGOFFICE 테이블을 조회하여 국사명
	 * 매핑 + "/" + [custName] + "/" + [contactTelNum] 매핑
	 * 
	 * @param officeScode
	 * @param workTeamCode
	 * @return
	 */
	public String selectOfficeName(String orgCd) {
		if (orgCd == null)
			return "";
		String orgNm = dataMapperDao.selectOfficeName(orgCd);
		if (orgNm == null)
			return "";
		return orgNm;
	}

	/**
	 * TB_WM_MAPPINGTPROG 테이블을 조회하여 VS14C 매핑시 참고한다
	 * 
	 * 테이블 : TB_WM_MAPPINGTPROG
	 * 
	 * 방향 : Legacy -> 360
	 * 
	 * @return
	 */
	public List<TPRogVo> selectTPRog() {
		return dataMapperDao.selectTPRog(new TPRogVo());
	}

	/**
	 * TB_WM_MAPPINGOFFICETRANS 테이블을 조회하여 officeScode 변환시 참고한다
	 * 
	 * @return
	 */
	@Cacheable(cacheName = "transOfficeScodeCache")
	public Map<String, String> selectOfficeScodeTrans() {
		List<OfficeTransVo> transList = dataMapperDao
				.selectOfficeScodeTrans(new OfficeTransVo());
		if (transList == null || transList.size() == 0)
			return null;

		Map<String, String> transMap = new HashMap<String, String>();
		for (OfficeTransVo officeTransVo : transList) {
			transMap.put(officeTransVo.getSourceCd(),
					officeTransVo.getTargetCd());
		}
		return transMap;
	}

	@TriggersRemove(cacheName = { "transOfficeScodeCache" }, removeAll = true)
	public void clearCache() {
	}

	/**
	 * 
	 * 360 mirror DB 에서 해당 작업자 정보를 조회
	 * 
	 * 테이블 : RAM_RESOURCE
	 * 
	 * @param datasetId
	 * @param id
	 * @return
	 */
	public RamResourceObjectVo selectRamResource(String datasetId, String id) {
		RamResourceObjectVo param = new RamResourceObjectVo();
		param.setDatasetId(datasetId);
		param.setId(id);
		return dataMapper360Dao.selectRamResource(param);
	}

	/**
	 * 
	 * 360 mirror DB 에서 해당작업자의 ram_division_id 조회
	 * 
	 * 테이블 : RAM_RESOURCE_DIVISION
	 * 
	 * @param datasetId
	 * @param ramResourceId
	 * @param ramDivisionIdList
	 * @return
	 */
	public List<RamResourceObjectVo> selectRamResourceDivision(
			String datasetId, String ramResourceId,
			List<String> ramDivisionIdList) {
		RamResourceObjectVo param = new RamResourceObjectVo();
		param.setDatasetId(datasetId);
		param.setRamResourceId(ramResourceId);
		param.setRamDivisionIdList(ramDivisionIdList);
		return dataMapper360Dao.selectRamResourceDivision(param);
	}

	/**
	 * 360 mirror DB 에서 아래 해당 오더의 sla_type_id 조회
	 * 
	 * 테이블 : ACTIVITY_SLA
	 * 
	 * @param datasetId
	 * @param activityId
	 * @return
	 */
	public List<ActivitySlaObjectVo> selectActivitySla(String datasetId,
			String activityId) {
		ActivitySlaObjectVo param = new ActivitySlaObjectVo();
		param.setDatasetId(datasetId);
		param.setActivityId(activityId);
		return dataMapper360Dao.selectActivitySla(param);
	}
}
