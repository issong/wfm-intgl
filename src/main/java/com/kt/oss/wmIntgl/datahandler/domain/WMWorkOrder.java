package com.kt.oss.wmIntgl.datahandler.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wMWorkOrder")
public class WMWorkOrder implements Serializable {

	private String workType;
	private String officeScode;

	private String workOdrNum;
	private String odrNum;
	private String ttId;
	private String svcMainClsCode;
	private String companyCode;

	private int concurrentOdrFlag;

	private String dongCode;
	private String addrNoType;

	private String workOdrTypeCode;
	private int workOdrTypeNum;

	private String addr;
	private String addrEtc;

	private int addrNo;
	private int addrHo;
	private String remark;
	private String reporterOpinion;
	private XMLGregorianCalendar sendDt;
	private XMLGregorianCalendar rcvDt;
	private String workProgState;
	private String workProcState;
	private String bt360AddWorkProgState;
	private XMLGregorianCalendar workStateDt;

	private String bt360SpecialWorkTypeCode;
	private XMLGregorianCalendar bt360SlaStartDt;
	private XMLGregorianCalendar bt360SlaEndDt;

	private boolean bt360FixedOdrYn;
	private String bt360FixedWorkerId;
	private XMLGregorianCalendar bt360FixedVisitDt;

	private String bt360ExpWorkerId;
	private float bt360Preference;

	private String bt360LogOnOffState;
	private XMLGregorianCalendar bt360LogOnOffDt;
	private String bt360LogOnOffWorkerId;

	private String workTeamCode;

	private String svcId;;
	private String custName;
	private String contactTelNum;

	private String concurrentSeq;

	private String bt360VvipYn;

	private String reason;
	private String reasonValue;

	private String bt360TechMethod;

	public String getBt360TechMethod() {
		return bt360TechMethod;
	}

	public void setBt360TechMethod(String bt360TechMethod) {
		this.bt360TechMethod = bt360TechMethod;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonValue() {
		return reasonValue;
	}

	public void setReasonValue(String reasonValue) {
		this.reasonValue = reasonValue;
	}

	public String getBt360VvipYn() {
		return bt360VvipYn;
	}

	public void setBt360VvipYn(String bt360VvipYn) {
		this.bt360VvipYn = bt360VvipYn;
	}

	public String getConcurrentSeq() {
		return concurrentSeq;
	}

	public void setConcurrentSeq(String concurrentSeq) {
		this.concurrentSeq = concurrentSeq;
	}

	public String getOdrNum() {
		return odrNum;
	}

	public void setOdrNum(String odrNum) {
		this.odrNum = odrNum;
	}

	public String getWorkTeamCode() {
		return workTeamCode;
	}

	public void setWorkTeamCode(String workTeamCode) {
		this.workTeamCode = workTeamCode;
	}

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

	public String getWorkOdrNum() {
		return workOdrNum;
	}

	public void setWorkOdrNum(String workOdrNum) {
		this.workOdrNum = workOdrNum;
	}

	public String getTtId() {
		return ttId;
	}

	public void setTtId(String ttId) {
		this.ttId = ttId;
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

	public String getWorkOdrTypeCode() {
		return workOdrTypeCode;
	}

	public void setWorkOdrTypeCode(String workOdrTypeCode) {
		this.workOdrTypeCode = workOdrTypeCode;
	}

	public int getWorkOdrTypeNum() {
		return workOdrTypeNum;
	}

	public void setWorkOdrTypeNum(int workOdrTypeNum) {
		this.workOdrTypeNum = workOdrTypeNum;
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

	public XMLGregorianCalendar getSendDt() {
		return sendDt;
	}

	public void setSendDt(XMLGregorianCalendar sendDt) {
		this.sendDt = sendDt;
	}

	public XMLGregorianCalendar getRcvDt() {
		return rcvDt;
	}

	public void setRcvDt(XMLGregorianCalendar rcvDt) {
		this.rcvDt = rcvDt;
	}

	public String getWorkProgState() {
		return workProgState;
	}

	public void setWorkProgState(String workProgState) {
		this.workProgState = workProgState;
	}

	public String getWorkProcState() {
		return workProcState;
	}

	public void setWorkProcState(String workProcState) {
		this.workProcState = workProcState;
	}

	public String getBt360AddWorkProgState() {
		return bt360AddWorkProgState;
	}

	public void setBt360AddWorkProgState(String bt360AddWorkProgState) {
		this.bt360AddWorkProgState = bt360AddWorkProgState;
	}

	public XMLGregorianCalendar getWorkStateDt() {
		return workStateDt;
	}

	public void setWorkStateDt(XMLGregorianCalendar workStateDt) {
		this.workStateDt = workStateDt;
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

	public boolean isBt360FixedOdrYn() {
		return bt360FixedOdrYn;
	}

	public void setBt360FixedOdrYn(boolean bt360FixedOdrYn) {
		this.bt360FixedOdrYn = bt360FixedOdrYn;
	}

	public String getBt360FixedWorkerId() {
		return bt360FixedWorkerId;
	}

	public void setBt360FixedWorkerId(String bt360FixedWorkerId) {
		this.bt360FixedWorkerId = bt360FixedWorkerId;
	}

	public XMLGregorianCalendar getBt360FixedVisitDt() {
		return bt360FixedVisitDt;
	}

	public void setBt360FixedVisitDt(XMLGregorianCalendar bt360FixedVisitDt) {
		this.bt360FixedVisitDt = bt360FixedVisitDt;
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

	public String getBt360LogOnOffState() {
		return bt360LogOnOffState;
	}

	public void setBt360LogOnOffState(String bt360LogOnOffState) {
		this.bt360LogOnOffState = bt360LogOnOffState;
	}

	public XMLGregorianCalendar getBt360LogOnOffDt() {
		return bt360LogOnOffDt;
	}

	public void setBt360LogOnOffDt(XMLGregorianCalendar bt360LogOnOffDt) {
		this.bt360LogOnOffDt = bt360LogOnOffDt;
	}

	public String getBt360LogOnOffWorkerId() {
		return bt360LogOnOffWorkerId;
	}

	public void setBt360LogOnOffWorkerId(String bt360LogOnOffWorkerId) {
		this.bt360LogOnOffWorkerId = bt360LogOnOffWorkerId;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\r\nWMWorkOrder [workType=");
		builder.append(workType);
		builder.append("\r\n, officeScode=");
		builder.append(officeScode);
		builder.append("\r\n, workOdrNum=");
		builder.append(workOdrNum);
		builder.append("\r\n, odrNum=");
		builder.append(odrNum);
		builder.append("\r\n, ttId=");
		builder.append(ttId);
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
		builder.append("\r\n, workOdrTypeCode=");
		builder.append(workOdrTypeCode);
		builder.append("\r\n, workOdrTypeNum=");
		builder.append(workOdrTypeNum);
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
		builder.append("\r\n, sendDt=");
		builder.append(sendDt);
		builder.append("\r\n, rcvDt=");
		builder.append(rcvDt);
		builder.append("\r\n, workProgState=");
		builder.append(workProgState);
		builder.append("\r\n, workProcState=");
		builder.append(workProcState);
		builder.append("\r\n, bt360AddWorkProgState=");
		builder.append(bt360AddWorkProgState);
		builder.append("\r\n, workStateDt=");
		builder.append(workStateDt);
		builder.append("\r\n, bt360SpecialWorkTypeCode=");
		builder.append(bt360SpecialWorkTypeCode);
		builder.append("\r\n, bt360SlaStartDt=");
		builder.append(bt360SlaStartDt);
		builder.append("\r\n, bt360SlaEndDt=");
		builder.append(bt360SlaEndDt);
		builder.append("\r\n, bt360FixedOdrYn=");
		builder.append(bt360FixedOdrYn);
		builder.append("\r\n, bt360FixedWorkerId=");
		builder.append(bt360FixedWorkerId);
		builder.append("\r\n, bt360FixedVisitDt=");
		builder.append(bt360FixedVisitDt);
		builder.append("\r\n, bt360ExpWorkerId=");
		builder.append(bt360ExpWorkerId);
		builder.append("\r\n, bt360Preference=");
		builder.append(bt360Preference);
		builder.append("\r\n, bt360LogOnOffState=");
		builder.append(bt360LogOnOffState);
		builder.append("\r\n, bt360LogOnOffDt=");
		builder.append(bt360LogOnOffDt);
		builder.append("\r\n, bt360LogOnOffWorkerId=");
		builder.append(bt360LogOnOffWorkerId);
		builder.append("\r\n, workTeamCode=");
		builder.append(workTeamCode);
		builder.append("\r\n, svcId=");
		builder.append(svcId);
		builder.append("\r\n, custName=");
		builder.append(custName);
		builder.append("\r\n, contactTelNum=");
		builder.append(contactTelNum);
		builder.append("\r\n, concurrentSeq=");
		builder.append(concurrentSeq);
		builder.append("\r\n, bt360VvipYn=");
		builder.append(bt360VvipYn);
		builder.append("\r\n, bt360TechMethod=");
		builder.append(bt360TechMethod);
		builder.append("]");
		return builder.toString();
	}

}
