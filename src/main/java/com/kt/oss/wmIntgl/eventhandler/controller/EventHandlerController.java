package com.kt.oss.wmIntgl.eventhandler.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kt.oss.wmIntgl.common.base.controller.BaseController;
import com.kt.oss.wmIntgl.common.base.webservice.BaseWebService;
import com.kt.oss.wmIntgl.common.constants.EventStatus;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;
import com.kt.oss.wmIntgl.datamapper.service.OllehMapService;
import com.kt.oss.wmIntgl.datamapper.service.rules.core.RulesDB;
import com.kt.oss.wmIntgl.eventhandler.batch.EventDayBreakExecutor;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.ApplicationInstanceTaskVo;
import com.kt.oss.wmIntgl.eventhandler.domain.bt360.SessionVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventBoardVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventReprocessVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventStatusVo;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.OllehMapLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;
import com.kt.oss.wmIntgl.integration.appointment2intgl.provider.service.WMAppointmentProviderService;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.client.SchedulerServiceProxy;
import com.kt.oss.wmIntgl.integration.intgl2scheduler.service.Intgl2SchedulerService;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.domain.InputReferenceDataVo;
import com.kt.oss.wmIntgl.integration.neosswm2intgl.service.Neosswm2IntglService;
import com.kt.oss.wmIntgl.reprocess.service.NeOSSDataReprocessService;

@Controller
@RequestMapping("/event")
public class EventHandlerController extends BaseController {

	@Autowired
	private OllehMapService ollehMapService;

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Autowired
	private Neosswm2IntglService neosswm2IntglService;

	@Autowired
	private NeOSSDataReprocessService neOSSDataReprocessService;

	@Autowired
	EventDayBreakExecutor executor;

	@Autowired
	SchedulerServiceProxy schedulerServiceProxy;

	@Value("${pendingsenario.enabled}")
	String pendingsenarioEnabled;

	@Value("${drools.preload.enabled}")
	String droolsPreloadEnabled;

	@Value("${notification.logfilepath}")
	String notificationLogfilepath;

	@Autowired
	private Intgl2SchedulerService intgl2SchedulerService;
	@Autowired
	private WMAppointmentProviderService wMAppointmentProviderService;
	@Autowired
	private BaseWebService baseWebService;
	@Autowired
	private RulesDB rulesDB;

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String page = request.getParameter("page");
		if (page != null && page.trim().length() > 0) {
			return page;
		}
		return "redirect:/";
	}

	@RequestMapping(value = "/getEventLogDate.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventLogDate(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		List<EventLogVo> eventLogVo = eventHandlerFacade.getEventLogDate(null);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONArray.fromObject(eventLogVo));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventLogList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventLogList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventLogVo vo = new EventLogVo();
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchFromTm"))) {
			vo.setSearchFromDt(request.getParameter("searchFromDt") + " "
					+ request.getParameter("searchFromTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchToTm"))) {
			vo.setSearchToDt(request.getParameter("searchToDt") + " "
					+ request.getParameter("searchToTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventId"))) {
			vo.setEventIdStr(request.getParameter("eventId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventSourceId"))) {
			vo.setEventSourceId(request.getParameter("eventSourceId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("vsType"))
				&& !"A".equals(request.getParameter("vsType"))) {
			vo.setEventVsTypeStr(request.getParameter("vsType"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventType"))
				&& !"A".equals(request.getParameter("eventType"))) {
			vo.setEventTypeStr(request.getParameter("eventType"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventStatus"))
				&& !"A".equals(request.getParameter("eventStatus"))) {
			vo.setEventStatusStr(request.getParameter("eventStatus"));
		}
		try {
			if (StringUtil.isNotEmpty(request.getParameter("eventMsg"))) {
				vo.setEventMsg(new String(request.getParameter("eventMsg")
						.getBytes("ISO8859-1"), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString(), e.getCause());
		}

		vo.setSearchPage(request.getParameter("page"));
		vo.setSearchStart(request.getParameter("start"));
		vo.setSearchLimit(request.getParameter("limit"));

		List<EventLogVo> eventLogList = eventHandlerFacade.getEventLogList(vo);

		int totalPage = 0;
		if (eventLogList != null && eventLogList.size() > 0) {
			totalPage = eventLogList.get(0).getTotalPage();
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("totalPage", totalPage);
		jsonObj.put("items", JSONArray.fromObject(eventLogList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventLogDetail.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventLogDetail(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventLogVo vo = new EventLogVo();
		vo.setEventId(Long.parseLong(request.getParameter("eventId")));
		vo.setEventType(Integer.parseInt(request.getParameter("eventType")));
		try {
			if (StringUtil.isNotEmpty(request.getParameter("eventMsg"))) {
				vo.setEventMsg(new String(request.getParameter("eventMsg")
						.getBytes("ISO8859-1"), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString(), e.getCause());
		}

		EventLogVo eventLogDetail = eventHandlerFacade.getEventLogDetail(vo);

		if (eventLogDetail != null) {
			if (eventLogDetail.getEventDetailMsg() != null) {
				String msg = eventLogDetail.getEventDetailMsg();
				msg = StringEscapeUtils.escapeHtml(msg);
				if (vo.getEventMsg() != null && vo.getEventMsg().length() > 0) {
					vo.setEventMsg(StringEscapeUtils.escapeHtml(vo
							.getEventMsg()));
					msg = msg.replaceAll(vo.getEventMsg(), "<font color=red>"
							+ vo.getEventMsg() + "</font>");
				}
				eventLogDetail.setEventDetailMsg("<pre>" + msg + "</pre>");
			}
		} else {
			eventLogDetail = new EventLogVo();
		}
		if (eventLogDetail.getEventDetailMsg() == null) {
			eventLogDetail.setEventDetailMsg("&lt;null&gt;");
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONObject.fromObject(eventLogDetail));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventReprocessList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventReprocessList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventReprocessVo vo = new EventReprocessVo();
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchFromTm"))) {
			vo.setSearchFromDt(request.getParameter("searchFromDt") + " "
					+ request.getParameter("searchFromTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchToTm"))) {
			vo.setSearchToDt(request.getParameter("searchToDt") + " "
					+ request.getParameter("searchToTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventId"))) {
			vo.setEventIdStr(request.getParameter("eventId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventSourceId"))) {
			vo.setEventSourceId(request.getParameter("eventSourceId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("vsType"))
				&& !"A".equals(request.getParameter("vsType"))) {
			vo.setEventVsTypeStr(request.getParameter("vsType"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventType"))
				&& !"A".equals(request.getParameter("eventType"))) {
			vo.setEventTypeStr(request.getParameter("eventType"));
		}
		try {
			if (StringUtil.isNotEmpty(request.getParameter("eventMsg"))) {
				vo.setEventMsg(new String(request.getParameter("eventMsg")
						.getBytes("ISO8859-1"), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString(), e.getCause());
		}

		vo.setSearchPage(request.getParameter("page"));
		vo.setSearchStart(request.getParameter("start"));
		vo.setSearchLimit(request.getParameter("limit"));

		List<EventReprocessVo> eventReprocessList = eventHandlerFacade
				.getEventReprocessList(vo);

		int totalPage = 0;
		if (eventReprocessList != null && eventReprocessList.size() > 0) {
			totalPage = eventReprocessList.get(0).getTotalPage();
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("totalPage", totalPage);
		jsonObj.put("items", JSONArray.fromObject(eventReprocessList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/runEventReprocess.json", method = RequestMethod.GET)
	@ResponseBody
	public String runEventReprocess(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		List<String> resultList = new ArrayList<String>();

		String[] eventId = request.getParameter("eventId").split(",");
		for (int i = 0; i < eventId.length; i++) {
			EventStatus result = eventHandlerFacade.runEventReprocess(Integer
					.parseInt(eventId[i]));
			if (result == null) {
				result = EventStatus.ERROR_REPROCESS;
			}
			resultList.add(eventId[i] + "=" + result);
		}

		JSONObject resultObj = new JSONObject();
		resultObj.put("result", resultList.toString());

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", resultObj);

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventStatusList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventStatusList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventStatusVo vo = new EventStatusVo();
		if (StringUtil.isEmpty(request.getParameter("term"))) {
			vo.setSearchTerm("1"); // 기본1분
		} else {
			vo.setSearchTerm(request.getParameter("term"));
		}
		if (StringUtil.isEmpty(request.getParameter("eventStatus"))) {
			vo.setEventStatusCode("A"); // 전체조회
		} else {
			vo.setEventStatusCode(request.getParameter("eventStatus"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventSourceId"))) {
			vo.setEventSourceId(request.getParameter("eventSourceId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("vsType"))
				&& !"A".equals(request.getParameter("vsType"))) {
			vo.setEventVsTypeStr(request.getParameter("vsType"));
		}

		vo.setSearchPage(request.getParameter("page"));
		vo.setSearchStart(request.getParameter("start"));
		vo.setSearchLimit(request.getParameter("limit"));

		List<EventStatusVo> eventLogList = eventHandlerFacade
				.getEventStatusList(vo);

		int totalPage = 0;
		if (eventLogList != null && eventLogList.size() > 0) {
			totalPage = eventLogList.get(0).getTotalPage();
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("totalPage", totalPage);
		jsonObj.put("items", JSONArray.fromObject(eventLogList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventStatusSearch.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventStatusSearch(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventStatusVo vo = new EventStatusVo();
		if (StringUtil.isNotEmpty(request.getParameter("csctId"))
				&& !"A".equals(request.getParameter("csctId"))) {
			vo.setEventSourceId(request.getParameter("csctId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("vsType"))) {
			vo.setEventVsTypeStr(request.getParameter("vsType"));
		}
		if (StringUtil.isEmpty(request.getParameter("eventStatus"))) {
			vo.setEventStatusCode("A"); // 전체조회
		} else {
			vo.setEventStatusCode(request.getParameter("eventStatus"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))) {
			vo.setEventStartDt(request.getParameter("searchFromDt")
					+ " 00:00:00");
		} else {
			vo.setEventStartDt(StringUtil.toDate("yyyy-MM-dd") + " 00:00:00");
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))) {
			vo.setEventLastDt(request.getParameter("searchToDt") + " 23:59:59");
		} else {
			vo.setEventLastDt(StringUtil.toDate("yyyy-MM-dd") + " 23:59:59");
		}

		List<EventStatusVo> eventLogList = eventHandlerFacade
				.getEventStatusList(vo);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONArray.fromObject(eventLogList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getOllehMapLogList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getOllehMapLogList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		OllehMapLogVo vo = new OllehMapLogVo();
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchFromTm"))) {
			vo.setSearchFromDt(request.getParameter("searchFromDt") + " "
					+ request.getParameter("searchFromTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))
				&& StringUtil.isNotEmpty(request.getParameter("searchToTm"))) {
			vo.setSearchToDt(request.getParameter("searchToDt") + " "
					+ request.getParameter("searchToTm"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventId"))) {
			vo.setEventIdStr(request.getParameter("eventId"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventCsctCd"))) {
			vo.setEventCsctCd(request.getParameter("eventCsctCd"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventOfficeCd"))) {
			vo.setEventOfficeCd(request.getParameter("eventOfficeCd"));
		}
		if (StringUtil.isNotEmpty(request.getParameter("eventAddr"))) {
			try {
				vo.setEventAddr(new String(request.getParameter("eventAddr")
						.getBytes("ISO8859-1"), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				logger.error(e.toString(), e.getCause());
			}
		}

		vo.setSearchPage(request.getParameter("page"));
		vo.setSearchStart(request.getParameter("start"));
		vo.setSearchLimit(request.getParameter("limit"));

		List<OllehMapLogVo> ollehMapLogList = eventHandlerFacade
				.getOllehMapLogList(vo);

		int totalPage = 0;
		if (ollehMapLogList != null && ollehMapLogList.size() > 0) {
			totalPage = ollehMapLogList.get(0).getTotalPage();
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("totalPage", totalPage);
		jsonObj.put("items", JSONArray.fromObject(ollehMapLogList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getOllehMapLogDetail.json", method = RequestMethod.GET)
	@ResponseBody
	public String getOllehMapLogDetail(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		OllehMapLogVo vo = new OllehMapLogVo();
		vo.setSeq(Long.parseLong(request.getParameter("seq")));

		OllehMapLogVo ollehMapLogDetail = eventHandlerFacade
				.getOllehMapLogDetail(vo);

		if (ollehMapLogDetail != null) {
			if (ollehMapLogDetail.getEventDetailMsg() != null) {
				String msg = ollehMapLogDetail.getEventDetailMsg();
				msg = StringEscapeUtils.escapeHtml(msg);
				msg = msg.replaceAll("\n", "<br>\n");
				msg = msg.replaceAll(" ", "&nbsp;");
				ollehMapLogDetail.clearEventDetailMsg();
				ollehMapLogDetail.setEventDetailMsg(msg);
			}
		} else {
			ollehMapLogDetail = new OllehMapLogVo();
		}
		if (ollehMapLogDetail.getEventDetailMsg() == null) {
			ollehMapLogDetail.setEventDetailMsg("&lt;null&gt;");
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONObject.fromObject(ollehMapLogDetail));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/runOllehMap.json", method = RequestMethod.GET)
	@ResponseBody
	public String runOllehMap(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		String addr = request.getParameter("addr");

		JSONObject resultObj = new JSONObject();
		if (addr == null || addr.trim().length() == 0) {
			resultObj.put("result", "false");
		} else {
			IntglDataVo vo = new IntglDataVo();
			vo.setSourceId("000000");
			vo.setEventId(new Random().nextInt(100000));

			Map<String, Double> coord = ollehMapService.getCoord(addr, vo,
					"R04003", "+++");

			resultObj.put("result", "addr=" + addr + ", X=" + coord.get("X")
					+ ", Y=" + coord.get("Y"));
		}

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", resultObj);

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getInputReference.json", method = RequestMethod.GET)
	@ResponseBody
	public String getInputReference(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		InputReferenceDataVo vo = new InputReferenceDataVo();
		InputReferenceDataVo inputReferenceDataVo = neosswm2IntglService
				.getInputreference(vo);
		Date irDateTime = StringUtil.toDate(inputReferenceDataVo.getIrTime(),
				null);
		inputReferenceDataVo.setIrDate(StringUtil.toDate(irDateTime.getTime(),
				"yyyy-MM-dd"));
		inputReferenceDataVo.setIrTime(StringUtil.toDate(irDateTime.getTime(),
				"HH:mm:ss"));

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONObject.fromObject(inputReferenceDataVo));

		// System.err.println(jsonObj.toString());

		return jsonObj.toString();
	}

	@RequestMapping(value = "/updateInputReference.json", method = RequestMethod.GET)
	@ResponseBody
	public String updateInputReference(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		InputReferenceDataVo ir = new InputReferenceDataVo();
		ir.setVsType(request.getParameter("vsType"));
		ir.setDsType(request.getParameter("dsType"));
		ir.setTsType(request.getParameter("tsType"));
		ir.setIrTime(request.getParameter("irDate") + " "
				+ request.getParameter("irTime") + ".000");

		boolean result = true;
		try {
			neosswm2IntglService.updateInputreference(ir);
		} catch (Exception e) {
			logger.error(StringUtil.getStackTrace(e));
			result = false;
		}

		JSONObject data = new JSONObject();
		data.put("result", result);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", data);

		return jsonObj.toString();
	}

	@RequestMapping("/getApplicationInstanceTaskList.json")
	@ResponseBody
	public Map<String, Object> getApplicationInstanceTaskList(
			@ModelAttribute ApplicationInstanceTaskVo param) {

		Map<String, Object> model = new HashMap<String, Object>();

		List<ApplicationInstanceTaskVo> list = eventHandlerFacade
				.selectApplicationInstanceTask(param);

		model.put("data", list);

		return model;
	}

	@RequestMapping(value = "/getEventBoardSumList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventBoardSumList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventBoardVo vo = new EventBoardVo();
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))) {
			vo.setSearchFromDt(request.getParameter("searchFromDt")
					+ " 00:00:00");
		} else {
			vo.setSearchFromDt(StringUtil.toDate("yyyy-MM-dd") + " 00:00:00");
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))) {
			vo.setSearchToDt(request.getParameter("searchToDt") + " 23:59:59");
		} else {
			vo.setSearchToDt(StringUtil.toDate("yyyy-MM-dd") + " 23:59:59");
		}

		List<EventBoardVo> eventBoardSumList = eventHandlerFacade
				.getEventBoardSumList(vo);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONArray.fromObject(eventBoardSumList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getEventBoardCountList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getEventBoardCountList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		EventBoardVo vo = new EventBoardVo();
		if (StringUtil.isNotEmpty(request.getParameter("searchFromDt"))) {
			vo.setSearchFromDt(request.getParameter("searchFromDt")
					+ " 00:00:00");
		} else {
			vo.setSearchFromDt(StringUtil.toDate("yyyy-MM-dd") + " 00:00:00");
		}
		if (StringUtil.isNotEmpty(request.getParameter("searchToDt"))) {
			vo.setSearchToDt(request.getParameter("searchToDt") + " 23:59:59");
		} else {
			vo.setSearchToDt(StringUtil.toDate("yyyy-MM-dd") + " 23:59:59");
		}

		if (StringUtil.isNotEmpty(request.getParameter("csctId"))
				&& !"A".equals(request.getParameter("csctId"))) {
			vo.setCsctId(request.getParameter("csctId"));
		}

		List<EventBoardVo> eventBoardCountList = eventHandlerFacade
				.getEventBoardCountList(vo);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONArray.fromObject(eventBoardCountList));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getCsctList.json", method = RequestMethod.GET)
	@ResponseBody
	public String getCsctList(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		List<EventBoardVo> csctListVo = eventHandlerFacade.getCsctList(null);

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", JSONArray.fromObject(csctListVo));

		return jsonObj.toString();
	}

	@RequestMapping(value = "/getConfigContext.json", method = RequestMethod.GET)
	@ResponseBody
	public String getConfigContext(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		return pendingsenarioEnabled + "/" + droolsPreloadEnabled;
	}

	@RequestMapping(value = "/getDayBreak.json", method = RequestMethod.GET)
	@ResponseBody
	public String getDayBreak(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		String vs1 = executor.loadFileText(ScenarioType.VS1,
				request.getParameter("date"));
		String vs14b = executor.loadFileText(ScenarioType.VS14B,
				request.getParameter("date"));
		String vs14c = executor.loadFileText(ScenarioType.VS14C,
				request.getParameter("date"));

		JSONObject data = new JSONObject();
		data.put("vs1", vs1);
		data.put("vs14b", vs14b);
		data.put("vs14c", vs14c);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", data);

		return jsonObj.toString();
	}

	@RequestMapping(value = "/callEventSavedprocess.json", method = RequestMethod.GET)
	@ResponseBody
	public String callEventSavedprocess(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		// 0 : 처리대기, 1 : 처리시작, 2 : 처리완료
		int result = 0;
		if (StringUtil.isNotEmpty(request.getParameter("csctId"))) {
			try {
				result = 1;

				String csctId = request.getParameter("csctId");

				schedulerServiceProxy.updateVS1ProccesStatus(csctId);
				schedulerServiceProxy.requestVS1ProcessEvent(csctId);

				result = 2;
			} catch (Exception e) {
				logger.error(StringUtil.getStackTrace(e));
			}
		}

		JSONObject data = new JSONObject();
		data.put("result", result);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", data);

		return jsonObj.toString();
	}

	@RequestMapping(value = "/runEventSavedprocess.json", method = RequestMethod.GET)
	@ResponseBody
	public String runEventSavedprocess(Locale locale, Model model,
			HttpServletRequest request, HttpServletResponse response) {

		// 0 : 처리대기, 1 : 처리시작, 2 : 처리완료
		int result = 0;
		if (StringUtil.isNotEmpty(request.getParameter("csctId"))) {
			String csctId = request.getParameter("csctId");
			try {
				result = 1;

				// 저장된건 처리
				neOSSDataReprocessService.reprocessScenario(csctId);

				result = 2;
			} catch (Exception e) {
				logger.error(StringUtil.getStackTrace(e));
			}
		}

		JSONObject data = new JSONObject();
		data.put("result", result);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("items", data);

		return jsonObj.toString();
	}

	@RequestMapping("/getSessionList.json")
	@ResponseBody
	public Map<String, Object> getSessionList(@ModelAttribute SessionVo param) {

		Map<String, Object> model = new HashMap<String, Object>();

		List<SessionVo> list = eventHandlerFacade.selectSession(param);

		model.put("data", list);

		return model;
	}

	@RequestMapping("/clearCaches.json")
	public void clearCaches() {
		intgl2SchedulerService.clearCache();
		wMAppointmentProviderService.clearCache();
		baseWebService.clearCache();
		rulesDB.clearCache();
	}
}
