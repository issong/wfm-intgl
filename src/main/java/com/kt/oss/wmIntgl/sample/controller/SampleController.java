package com.kt.oss.wmIntgl.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kt.oss.wmIntgl.common.base.controller.BaseController;
import com.kt.oss.wmIntgl.datamapper.service.GoogleMapService;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.sample.domain.SampleVo;
import com.kt.oss.wmIntgl.sample.service.SampleService;

@Controller
@RequestMapping("/sample")
public class SampleController extends BaseController {

	@Autowired
	private SampleService sampleService;

	@Autowired
	private OllehMapService ollehMapService;

	@Autowired
	private GoogleMapService googleMapService;

	@RequestMapping("/sampleList")
	public ModelAndView sampleList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView view = new ModelAndView();
		try {
			List<SampleVo> itemList = sampleService.selectSampleList();
			view.addObject("itemList", itemList);

			view.setViewName("sample/sampleList");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return view;
	}

}
