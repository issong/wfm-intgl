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
package com.kt.oss.wmIntgl.integration.appointment2intgl.provider.service;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.TriggersRemove;
import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.dao.bt360.WMAppointment360Dao;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.dao.intgl.WMAppointmentProviderDao;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMAppointmentResource;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.bt360.WMVisitScheduleResponse;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParam;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMAppointmentOfferParamVo;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.domain.intgl.WMMappingReasonTypeVo;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * short description about class <br />
 *
 * @author yngwie
 * @version 1.0
 * @date 2012. 12. 21.
 * @see
 */
@Service
public class WMAppointmentProviderService extends BaseService {

    @Autowired
    private WMAppointmentProviderDao wmAppointmentProviderDao;
    @Autowired
    @Qualifier("sqlSessionFactory")
    private SqlSessionFactoryBean sqlSessionFactory;
    @Autowired
    private WMAppointment360Dao wMAppointment360Dao;

    /**
     * short description about method <br />
     *
     * @param appointmentRequestId
     * @return
     */
    public List<WMAppointmentOfferParam> selectWMAppointmentOffer(
            String appointmentRequestId) {
        return wmAppointmentProviderDao
                .selectWMAppointmentOffer(appointmentRequestId);
    }

    /**
     * short description about method <br />
     *
     * @param appointmentRequestId
     * @return
     */
    public int deleteAppointmentOffer(String appointmentRequestId) {
        return wmAppointmentProviderDao
                .deleteAppointmentOffer(appointmentRequestId);
    }

    /**
     * short description about method <br />
     *
     * @param offer
     * @return
     */
    public int insertAppointmentOffer(WMAppointmentOfferParamVo offer) {
        return wmAppointmentProviderDao.insertAppointmentOffer(offer);
    }

    /**
     * short description about method <br />
     *
     * @param list
     * @return
     */
    @Transactional
    public int insertBatchAppointmentOffer(List<WMAppointmentOfferParamVo> list) {
        int insertCount = 0;
        SqlSession session = null;
        try {
            session = sqlSessionFactory.getObject().openSession(
                    ExecutorType.BATCH, false);

            WMAppointmentProviderDao dao = session
                    .getMapper(WMAppointmentProviderDao.class);

            if (list != null && list.size() > 0) {
                for (WMAppointmentOfferParamVo vo : list) {
                    insertCount += dao.insertAppointmentOffer(vo);
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

        return insertCount;
    }

    /**
     * short description about method <br />
     *
     * @param list
     * @return
     */
    @Transactional
    public int updateBatchAppointmentOffer(List<WMAppointmentOfferParam> list) {
        int insertCount = 0;
        SqlSession session = null;
        try {
            session = sqlSessionFactory.getObject().openSession(
                    ExecutorType.BATCH, false);

            WMAppointmentProviderDao dao = session
                    .getMapper(WMAppointmentProviderDao.class);

            for (WMAppointmentOfferParam vo : list) {
                insertCount += dao.updateAppointmentOffer(vo);
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

        return insertCount;
    }

    /**
     * short description about method <br />
     *
     * @param appointmentRequestId
     * @return
     */
    public WMVisitScheduleResponse selectAllocation(String appointmentRequestId) {
        return wMAppointment360Dao.selectAllocation(appointmentRequestId);
    }

    /**
     * short description about method <br />
     *
     * @return
     */
    @Cacheable(cacheName = "reasonTypeCache")
    public List<WMMappingReasonTypeVo> selectWMMappingReasonType() {
        return wmAppointmentProviderDao.selectWMMappingReasonType();
    }

    @TriggersRemove(cacheName = {"reasonTypeCache"}, removeAll = true)
    public void clearCache() {

    }

    public List<WMAppointmentResource> selectActivityAndOthers(String csctId) {
        return wMAppointment360Dao.selectActivityAndOthers(csctId);
    }

}
