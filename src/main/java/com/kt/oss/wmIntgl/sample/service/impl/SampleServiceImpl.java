package com.kt.oss.wmIntgl.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.sample.dao.SampleDao;
import com.kt.oss.wmIntgl.sample.domain.SampleVo;
import com.kt.oss.wmIntgl.sample.service.SampleService;

@Service
public class SampleServiceImpl extends BaseService implements SampleService {
	
	@Autowired
	private SampleDao sampleDao;
	
	public List<SampleVo> selectSampleList() {
		return sampleDao.selectSampleList();
	}
}
