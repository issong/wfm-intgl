package com.kt.oss.wmIntgl.sample.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kt.oss.wmIntgl.sample.domain.SampleVo;


/**
 * Sample DAO Interface
 * @author 
 *
 */
@Repository
public interface SampleDao {
	
	List<SampleVo> selectSampleList();
}
