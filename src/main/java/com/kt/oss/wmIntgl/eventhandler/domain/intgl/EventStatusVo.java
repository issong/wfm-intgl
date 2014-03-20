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
public class EventStatusVo extends EventLog {

	private IntglDataVo IntglData;
	private String eventDetailMsg;
	private String reserveStatus;

	private String eventStatusCode;
	private String eventStartDt;
	private String eventLastDt;
	private String ollehmapCount;
	private String intervalDt;

	private String searchTerm;

	private String searchPage; // extjs mapping
	private String searchStart; // extjs mapping
	private String searchLimit; // extjs mapping
	private int pageNum; // extjs mapping
	private int totalPage; // extjs mapping

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

	public String getEventStatusCode() {
		return eventStatusCode;
	}

	public void setEventStatusCode(String eventStatusCode) {
		this.eventStatusCode = eventStatusCode;
	}

	public String getEventStartDt() {
		return eventStartDt;
	}

	public void setEventStartDt(String eventStartDt) {
		this.eventStartDt = eventStartDt;
	}

	public String getEventLastDt() {
		return eventLastDt;
	}

	public void setEventLastDt(String eventLastDt) {
		this.eventLastDt = eventLastDt;
	}

	public String getOllehmapCount() {
		return ollehmapCount;
	}

	public void setOllehmapCount(String ollehmapCount) {
		this.ollehmapCount = ollehmapCount;
	}

	public String getIntervalDt() {
		return intervalDt;
	}

	public void setIntervalDt(String intervalDt) {
		this.intervalDt = intervalDt;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
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

	public String getReserveStatus() {
		return reserveStatus;
	}

	public void setReserveStatus(String reserveStatus) {
		this.reserveStatus = reserveStatus;
	}
}
