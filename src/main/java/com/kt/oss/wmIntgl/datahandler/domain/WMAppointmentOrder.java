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
 * yngwie          2012. 11. 20.      First Draft.
 */
package com.kt.oss.wmIntgl.datahandler.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * short description about class <br />
 * 
 * 
 * @version 1.0
 * @author yngwie
 * @date 2012. 11. 20.
 * @see
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMAppointmentOrder")
public class WMAppointmentOrder implements Serializable {

	private String workType;
	private String officeScode;
	private String odrNum;
	private int offerId;
	private String svcMainClsCode;
	private String companyCode;
	private int concurrentOdrFlag;
	private String dongCode;
	private String addrNoType;
	private String addr;
	private String addrEtc;
	private int addrNo;
	private int addrHo;
	private String remark;
	private String reporterOpinion;
	private XMLGregorianCalendar rcvDt;
	private String bt360SpecialWorkTypeCode;
	private XMLGregorianCalendar bt360SlaStartDt;
	private XMLGregorianCalendar bt360SlaEndDt;
	private String bt360ExpWorkerId;
	private float bt360Preference;
	private int bt360OfferExpiry;
	private String workTeamCode;

	private String svcId;;
	private String custName;
	private String contactTelNum;

	private String concurrentSeq;
	private String bt360VvipYn;

	public String getConcurrentSeq() {
		return concurrentSeq;
	}

	public void setConcurrentSeq(String concurrentSeq) {
		this.concurrentSeq = concurrentSeq;
	}

	public String getBt360VvipYn() {
		return bt360VvipYn;
	}

	public void setBt360VvipYn(String bt360VvipYn) {
		this.bt360VvipYn = bt360VvipYn;
	}

	public String getSvcId() {
		return svcId;
	}

	public void setSvcId(String svcId) {
		this.svcId = svcId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactTelNum() {
		return contactTelNum;
	}

	public void setContactTelNum(String contactTelNum) {
		this.contactTelNum = contactTelNum;
	}

	public String getWorkTeamCode() {
		return workTeamCode;
	}

	public void setWorkTeamCode(String workTeamCode) {
		this.workTeamCode = workTeamCode;
	}

	private List<WMAvailabilityPattern> availabilityPatterns;

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getOfficeScode() {
		return officeScode;
	}

	public void setOfficeScode(String officeScode) {
		this.officeScode = officeScode;
	}

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getSvcMainClsCode() {
		return svcMainClsCode;
	}

	public void setSvcMainClsCode(String svcMainClsCode) {
		this.svcMainClsCode = svcMainClsCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public int getConcurrentOdrFlag() {
		return concurrentOdrFlag;
	}

	public void setConcurrentOdrFlag(int concurrentOdrFlag) {
		this.concurrentOdrFlag = concurrentOdrFlag;
	}

	public String getDongCode() {
		return dongCode;
	}

	public void setDongCode(String dongCode) {
		this.dongCode = dongCode;
	}

	public String getAddrNoType() {
		return addrNoType;
	}

	public void setAddrNoType(String addrNoType) {
		this.addrNoType = addrNoType;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrEtc() {
		return addrEtc;
	}

	public void setAddrEtc(String addrEtc) {
		this.addrEtc = addrEtc;
	}

	public int getAddrNo() {
		return addrNo;
	}

	public void setAddrNo(int addrNo) {
		this.addrNo = addrNo;
	}

	public int getAddrHo() {
		return addrHo;
	}

	public void setAddrHo(int addrHo) {
		this.addrHo = addrHo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReporterOpinion() {
		return reporterOpinion;
	}

	public void setReporterOpinion(String reporterOpinion) {
		this.reporterOpinion = reporterOpinion;
	}

	public XMLGregorianCalendar getRcvDt() {
		return rcvDt;
	}

	public void setRcvDt(XMLGregorianCalendar rcvDt) {
		this.rcvDt = rcvDt;
	}

	public String getBt360SpecialWorkTypeCode() {
		return bt360SpecialWorkTypeCode;
	}

	public void setBt360SpecialWorkTypeCode(String bt360SpecialWorkTypeCode) {
		this.bt360SpecialWorkTypeCode = bt360SpecialWorkTypeCode;
	}

	public XMLGregorianCalendar getBt360SlaStartDt() {
		return bt360SlaStartDt;
	}

	public void setBt360SlaStartDt(XMLGregorianCalendar bt360SlaStartDt) {
		this.bt360SlaStartDt = bt360SlaStartDt;
	}

	public XMLGregorianCalendar getBt360SlaEndDt() {
		return bt360SlaEndDt;
	}

	public void setBt360SlaEndDt(XMLGregorianCalendar bt360SlaEndDt) {
		this.bt360SlaEndDt = bt360SlaEndDt;
	}

	public String getBt360ExpWorkerId() {
		return bt360ExpWorkerId;
	}

	public void setBt360ExpWorkerId(String bt360ExpWorkerId) {
		this.bt360ExpWorkerId = bt360ExpWorkerId;
	}

	public float getBt360Preference() {
		return bt360Preference;
	}

	public void setBt360Preference(float bt360Preference) {
		this.bt360Preference = bt360Preference;
	}

	public int getBt360OfferExpiry() {
		return bt360OfferExpiry;
	}

	public void setBt360OfferExpiry(int bt360OfferExpiry) {
		this.bt360OfferExpiry = bt360OfferExpiry;
	}

	public List<WMAvailabilityPattern> getAvailabilityPatterns() {
		if (availabilityPatterns == null) {
			availabilityPatterns = new ArrayList<WMAvailabilityPattern>();
		}
		return availabilityPatterns;
	}

	public void setAvailabilityPatterns(
			List<WMAvailabilityPattern> availabilityPatterns) {
		this.availabilityPatterns = availabilityPatterns;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMAppointmentOrder [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("\r\n, odrNum=");
		builder.append(odrNum);
		builder.append("\r\n, offerId=");
		builder.append(offerId);
		builder.append("\r\n, svcMainClsCode=");
		builder.append(svcMainClsCode);
		builder.append("\r\n, companyCode=");
		builder.append(companyCode);
		builder.append("\r\n, concurrentOdrFlag=");
		builder.append(concurrentOdrFlag);
		builder.append("\r\n, dongCode=");
		builder.append(dongCode);
		builder.append("\r\n, addrNoType=");
		builder.append(addrNoType);
		builder.append("\r\n, addr=");
		builder.append(addr);
		builder.append("\r\n, addrEtc=");
		builder.append(addrEtc);
		builder.append("\r\n, addrNo=");
		builder.append(addrNo);
		builder.append("\r\n, addrHo=");
		builder.append(addrHo);
		builder.append("\r\n, remark=");
		builder.append(remark);
		builder.append("\r\n, reporterOpinion=");
		builder.append(reporterOpinion);
		builder.append("\r\n, rcvDt=");
		builder.append(rcvDt);
		builder.append("\r\n, bt360SpecialWorkTypeCode=");
		builder.append(bt360SpecialWorkTypeCode);
		builder.append("\r\n, bt360SlaStartDt=");
		builder.append(bt360SlaStartDt);
		builder.append("\r\n, bt360SlaEndDt=");
		builder.append(bt360SlaEndDt);
		builder.append("\r\n, bt360ExpWorkerId=");
		builder.append(bt360ExpWorkerId);
		builder.append("\r\n, bt360Preference=");
		builder.append(bt360Preference);
		builder.append("\r\n, bt360OfferExpiry=");
		builder.append(bt360OfferExpiry);
		builder.append("\r\n, workTeamCode=");
		builder.append(workTeamCode);
		builder.append("\r\n, svcId=");
		builder.append(svcId);
		builder.append("\r\n, custName=");
		builder.append(custName);
		builder.append("\r\n, contactTelNum=");
		builder.append(contactTelNum);
		builder.append("\r\n, availabilityPatterns=");
		builder.append(availabilityPatterns);
		builder.append("\r\n, concurrentSeq=");
		builder.append(concurrentSeq);
		builder.append("\r\n, bt360VvipYn=");
		builder.append(bt360VvipYn);
		builder.append("]");
		return builder.toString();
	}

}
