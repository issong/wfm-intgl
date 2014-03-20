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
 * yngwie          2012. 12. 21.      First Draft.
 */
package com.kt.oss.wmIntgl.integration.neosswm2intgl.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.domain.WMMapping360IoVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.dao.Neosswm2IntglDao;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.InputReferenceDataVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderKeyParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderParam;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.WMWorkOrderStatusParam;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderKeyParamExt;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderParamExt;
import com.kt.oss.wmIntgl.reprocess.domain.WMWorkOrderStatusParamExt;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 12. 21.
 * @see
 * 
 */
@Service
public class Neosswm2IntglService extends BaseService {

	@Autowired
	private Neosswm2IntglDao neosswm2IntglDao;

	@Autowired
	@Qualifier("sqlSessionFactory")
	private SqlSessionFactoryBean sqlSessionFactory;

	public InputReferenceDataVo getInputreference(InputReferenceDataVo vo) {
		return neosswm2IntglDao.getInputreference(vo);
	}

	public int updateInputreference(InputReferenceDataVo vo) {
		return neosswm2IntglDao.updateInputreference(vo);
	}

	public int updateMapping360IoForVs1(WMMapping360IoVo vo) {
		return neosswm2IntglDao.updateMapping360IoForVs1(vo);
	}

	public String selectMapping360IoForVs1(String csctId) {
		return neosswm2IntglDao.selectMapping360IoForVs1(csctId);
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param data
	 * @param type
	 * @return
	 */
	@Transactional
	public int insertNeossSourceData(String sourceId, String sourceDt,
			List<?> data, ScenarioType type) {
		int result = 0;

		SqlSession session = null;
		try {
			session = sqlSessionFactory.getObject().openSession(
					ExecutorType.BATCH, false);

			Neosswm2IntglDao dao = session.getMapper(Neosswm2IntglDao.class);

			for (int i = 0; i < data.size(); i++) {
				Object param = data.get(i);

				switch (type) {
				case VS3:
					WMWorkOrderStatusParamExt vs3 = new WMWorkOrderStatusParamExt();
					vs3.setOrder((WMWorkOrderStatusParam) param);
					vs3.setSourceId(sourceId);
					vs3.setSourceDt(sourceDt);
					vs3.setVsType(type);

					result += dao.insertVS3SourceData(vs3);
					break;

				case VS8:
					WMWorkOrderKeyParamExt vs8 = new WMWorkOrderKeyParamExt();
					vs8.setOrder((WMWorkOrderKeyParam) param);
					vs8.setSourceId(sourceId);
					vs8.setSourceDt(sourceDt);
					vs8.setVsType(type);

					result += dao.insertVS8SourceData(vs8);
					break;

				case VS5:
				case VS10:
					WMWorkOrderParamExt vs10 = new WMWorkOrderParamExt();
					vs10.setOrder((WMWorkOrderParam) param);
					vs10.setSourceId(sourceId);
					vs10.setSourceDt(sourceDt);
					vs10.setVsType(type);

					result += dao.insertVS10SourceData(vs10);
					break;

				default:
					break;
				}
			}

			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.error(StringUtil.getStackTrace(e));
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return result;
	}

	/**
	 * short description about method <br />
	 * 
	 * 
	 * @param data
	 * @param type
	 * @return
	 */
	@Transactional
	public int deleteNeossSourceData(String csctId) {
		int result = 0;

		SqlSession session = null;
		try {
			session = sqlSessionFactory.getObject().openSession(
					ExecutorType.BATCH, false);

			Neosswm2IntglDao dao = session.getMapper(Neosswm2IntglDao.class);

			dao.deleteVS3SourceData(csctId);

			dao.deleteVS8SourceData(csctId);

			dao.deleteVS10SourceData(csctId);

			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.error(StringUtil.getStackTrace(e));
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return result;
	}

}
