package com.kt.oss.wmIntgl.integration.neosswm2intgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kt.oss.wmIntgl.common.base.controller.BaseController;
import com.kt.oss.wmIntgl.datahandler.jms.LegacyDataJMSClient;

@Controller
@RequestMapping("/neoss")
public class Neosswn2IntglController extends BaseController {

	@Autowired
	LegacyDataJMSClient legacyDataJMSClient;

	@RequestMapping("/sendOrder")
	public void sendOrder() {

		// legacyDataJMSClient.sendData(vo);
	}
}
