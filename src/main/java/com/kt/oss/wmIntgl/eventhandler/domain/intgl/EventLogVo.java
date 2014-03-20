package com.kt.oss.wmIntgl.eventhandler.domain.intgl;

import com.kt.oss.wmIntgl.datahandler.domain.IntglDataVo;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 10. 15.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class EventLogVo extends EventLog {

	private IntglDataVo IntglData;
	private String eventDetailMsg;

	private int searchEventStatus;
	private String searchFromDt;
	private String searchToDt;
	private String searchPage; // extjs mapping
	private String searchStart; // extjs mapping
	private String searchLimit; // extjs mapping
	private int pageNum; // extjs mapping
	private int totalPage; // extjs mapping

	private String irtime;

	public String getIrtime() {
		return irtime;
	}

	public void setIrtime(String irtime) {
		this.irtime = irtime;
	}

	public IntglDataVo getIntglData() {
		return IntglData;
	}

	public void setIntglData(IntglDataVo intglData) {
		IntglData = intglData;
	}

	public String getEventDetailMsg() {
		return eventDetailMsg;
	}

	public void setEventDetailMsg(String eventDetailMsg) {
		this.eventDetailMsg = eventDetailMsg;
	}

	public int getSearchEventStatus() {
		return searchEventStatus;
	}

	public void setSearchEventStatus(int searchEventStatus) {
		this.searchEventStatus = searchEventStatus;
	}

	public String getSearchFromDt() {
		return searchFromDt;
	}

	public void setSearchFromDt(String searchFromDt) {
		this.searchFromDt = searchFromDt;
	}

	public String getSearchToDt() {
		return searchToDt;
	}

	public void setSearchToDt(String searchToDt) {
		this.searchToDt = searchToDt;
	}

	public String getSearchPage() {
		return searchPage;
	}

	public void setSearchPage(String searchPage) {
		this.searchPage = searchPage;
	}

	public String getSearchStart() {
		return searchStart;
	}

	public void setSearchStart(String searchStart) {
		this.searchStart = searchStart;
	}

	public String getSearchLimit() {
		return searchLimit;
	}

	public void setSearchLimit(String searchLimit) {
		this.searchLimit = searchLimit;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
