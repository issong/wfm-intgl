package com.kt.oss.wmIntgl.datamapper.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert.*;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;


/**
 * OllehMapService JUnit TestCase
 * 
 * @version 1.0
 * @author song
 * @date 2012. 10. 15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring/context/context-aspect.xml",
		"classpath:spring/context/context-common.xml",
		"classpath:spring/context/context-datasource.xml",
		"classpath:spring/context/context-ehcache.xml",
		"classpath:spring/context/context-interceptor.xml",
		"classpath:spring/context/context-jms-legacy.xml",
		"classpath:spring/context/context-jms-scheduler.xml",
		"classpath:spring/context/context-mail.xml",
		"classpath:spring/context/context-mybatis.xml",
		"classpath:spring/context/context-properties.xml",
		"classpath:spring/context/context-servlet.xml",
		"classpath:spring/context/context-transaction.xml",
		"classpath:spring/context/context-webservice.xml" })
public class GoogleMapServiceTest {
	private List<String> sampleData;

	@Autowired
	GoogleMapService googleMapService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("logging.directory", "C:/Developer/Temp/Log");
		System.setProperty("wfm.server.type", "local");
		System.setProperty("server", "local-PC");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sampleData = new ArrayList<String>();
		sampleData.add("서울특별시 영등포구 문래동3가 55-20");  //에이스하이테크시티 주소
		sampleData.add("울특별시 영포구 문동3가 55-20");       //잘못된 입력된 주소
		sampleData.add(" ");                                //빈값 입력
	}
	
	@Test
	public final void testGetCoord() {
		List<String> coords = new ArrayList<String>();

		IntglDataVo vo = new IntglDataVo();
		vo.setSourceId("353201");      //서부4팀 CSCT_ID
		vo.setEventId(372637212);      //이벤트로그 ID

		String officeScode = "R00431"; //서부4팀(영등포국사) OFFICE_CD
		String dongCode = "304412";    //문래동3가 동코드(기본좌표 : X=37.5169212259158, Y=126.895907355928)
		                               //잘못된 주소 정보로 인하여 GoogleMap에서 위/경도 좌표 조회 실패시, 
		                               //DB에서 해당 동코드의 기본좌표를 조회하여 결과를 표시해야함.
		for (String addr : sampleData) {
			Map<String, Double> coord = googleMapService.getCoord(addr, vo,
					officeScode, dongCode);

			coords.add("addr=" + addr + ", X=" + coord.get("X") + ", Y="
					+ coord.get("Y"));
		}

		for (String data : coords) {
			System.out.println(data);
		}
	}
	
	@Test
	public final void testSimpleGetCoord() {
		List<String> coords = new ArrayList<String>();
		
		for (String addr : sampleData) {
			Map<String, Double> coord = googleMapService.getCoord(addr);
			
			if (coord == null){
				//fail();
				coords.add("addr=" + addr + " 주소에 대한 위/경도 좌표정보 조회 실패");
			}else {
				coords.add("addr=" + addr + ", X=" + coord.get("X") + ", Y="
						+ coord.get("Y"));
			}
		}

		for (String data : coords) {
			System.out.println(data);
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
}
