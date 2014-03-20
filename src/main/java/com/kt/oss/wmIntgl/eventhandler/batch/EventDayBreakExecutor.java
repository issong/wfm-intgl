package com.kt.oss.wmIntgl.eventhandler.batch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.kt.oss.wmIntgl.common.base.service.BaseService;
import com.kt.oss.wmIntgl.common.constants.ScenarioType;
import com.kt.oss.wmIntgl.common.utils.StringUtil;
import com.kt.oss.wmIntgl.eventhandler.domain.intgl.EventLogVo;
import com.kt.oss.wmIntgl.eventhandler.facade.EventHandlerFacade;

@Component
public class EventDayBreakExecutor extends BaseService {

	@Autowired
	private EventHandlerFacade eventHandlerFacade;

	@Value("${notification.logfilepath}")
	String notificationLogfilepath;

	@Async
	public void checkBatchAsync(ScenarioType vsType) {
		logger.debug("notificationLogfilepath=" + notificationLogfilepath);

		EventLogVo vo = new EventLogVo();
		vo.setSearchFromDt(StringUtil.toDate("yyyy-MM-dd") + " 00:00:00");
		vo.setSearchToDt(StringUtil.toDate("yyyy-MM-dd HH:mm:ss"));
		vo.setEventVsTypeStr(vsType.toString());
		List<EventLogVo> list = eventHandlerFacade.getCsctBatchStatus(vo);

		if (list == null || list.size() == 0)
			return;

		saveFileText(vsType, list, true);
	}

	/**
	 * 파일 기본 위치 /applog/jboss/wfmSvrB1/notification/daybreak.log
	 */
	private void saveFileText(ScenarioType vsType, List<EventLogVo> list,
			boolean isLine) {
		String path = notificationLogfilepath.substring(0,
				notificationLogfilepath.lastIndexOf("/"));
		String filename = notificationLogfilepath
				.substring(notificationLogfilepath.lastIndexOf("/"));

		File dir = new File(path);
		if (!dir.isDirectory()) {
			dir.mkdirs();
		}

		String filePath = path + "/" + filename + "."
				+ vsType.toString().toLowerCase() + "."
				+ StringUtil.toDate("yyyyMMdd");

		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(filePath));
			for (int i = 0; i < list.size(); i++) {
				EventLogVo vo = list.get(i);
				if (vo.getEventStatusStr() != null
						&& "S".equals(vo.getEventStatusStr()))
					continue;

				StringBuilder sb = new StringBuilder();
				sb.append(StringUtil.toDate("yyyy-MM-dd HH:mm:ss"));
				sb.append((char) 9);
				if (vo.getEventStatusStr() == null) {
					sb.append("EMPTY");
				} else {
					sb.append("FAIL");
				}
				sb.append((char) 9);
				sb.append(vo.getEventSourceId());

				out.write(sb.toString());
				if (isLine)
					out.newLine();
			}
		} catch (IOException e) {
			logger.error(e.getMessage(), e.getCause());
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
			}
		}
	}

	/**
	 * 파일 기본 위치 /applog/jboss/wfmSvrB1/notification/daybreak.log
	 */
	public String loadFileText(ScenarioType vsType, String date) {
		String filePath = notificationLogfilepath + "."
				+ vsType.toString().toLowerCase() + "." + date;

		StringBuilder sb = new StringBuilder();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filePath));

			String txt = "";
			while ((txt = in.readLine()) != null) {
				sb.append(txt + "<br>");
			}
		} catch (FileNotFoundException e) {
			sb.append("File not found!");
			logger.error(e.getMessage(), e.getCause());
		} catch (IOException e) {
			sb.append("File io error!");
			logger.error(e.getMessage(), e.getCause());
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception e) {
			}
		}
		if (sb.toString().trim().length() == 0) {
			sb.setLength(0);
			sb.append("File is empty!");
		}
		return sb.toString();
	}
}
