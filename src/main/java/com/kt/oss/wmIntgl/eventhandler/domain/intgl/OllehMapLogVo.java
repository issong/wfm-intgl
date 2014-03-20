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
 * yngwie          2012. 11. 12.      First Draft.
 */
package com.kt.oss.wmIntgl.eventhandler.domain.intgl;

import com.kt.oss.wmIntgl.common.utils.StringUtil;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 12.
 * @see
 * 
 */
@SuppressWarnings("serial")
public class OllehMapLogVo extends OllehMapLog {

	public enum LogLevel {
		Error("Error", 1)
		, None("None", 2)
		, UpToOfficeTable("UpToOfficeTable", 3)
		, UpToDongTable("UpToDongTable", 4)
		, All("All", 5);

		private LogLevel(final String s, int i) {
			this.stringVal = s;
			this.intval = i;
		}

		private final String stringVal;
		private final int intval;

		public int getValue() {
			return intval;
		}

		@Override
		public String toString() {
			return stringVal;
		}
	}

	private StringBuilder eventDetailMsg;

	private String searchEventAddr;
	private String searchEventResult;

	private String searchFromDt;
	private String searchToDt;
	private String searchPage; // extjs mapping
	private String searchStart; // extjs mapping
	private String searchLimit; // extjs mapping
	private int pageNum; // extjs mapping
	private int totalPage; // extjs mapping

	private boolean writeDetail;

	public boolean isWriteDetail() {
		return writeDetail;
	}

	public void setWriteDetail(boolean writeDetail) {
		this.writeDetail = writeDetail;
	}

	public void clearEventDetailMsg() {
		if (eventDetailMsg != null) {
			eventDetailMsg.setLength(0);
		}
	}

	public String getEventDetailMsg() {
		if (eventDetailMsg == null) {
			eventDetailMsg = new StringBuilder();
		}
		return eventDetailMsg.toString();
	}

	public void setEventDetailMsg(String msg) {
		if (eventDetailMsg == null) {
			eventDetailMsg = new StringBuilder();
		}
		eventDetailMsg.append("\r\n");
		eventDetailMsg.append(StringUtil.getFormattedXmlString(msg));
	}

	public String getSearchEventAddr() {
		return searchEventAddr;
	}

	public void setSearchEventAddr(String searchEventAddr) {
		this.searchEventAddr = searchEventAddr;
	}

	public String getSearchEventResult() {
		return searchEventResult;
	}

	public void setSearchEventResult(String searchEventResult) {
		this.searchEventResult = searchEventResult;
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
