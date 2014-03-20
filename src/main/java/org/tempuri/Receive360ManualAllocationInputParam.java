package org.tempuri;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Receive360ManualAllocationInputParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Receive360ManualAllocationInputParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOdrNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ttid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkProgState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkProcState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360AddWorkProgState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStateDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Highlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360FixedOdrYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360FixedWorkerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360FixedVisitDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360LogOnOffState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360LogOnOffDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360LogOnOffWorkerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OdrNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receive360ManualAllocationInputParam", propOrder = {
		"workType", "officeSCode", "workOdrNum", "ttid", "workProgState",
		"workProcState", "bt360AddWorkProgState", "workStateDt", "duration",
		"highlight", "reason", "reasonValue", "bt360FixedOdrYn",
		"bt360FixedWorkerID", "bt360FixedVisitDT", "bt360LogOnOffState",
		"bt360LogOnOffDt", "bt360LogOnOffWorkerId", "odrNum" })
@XmlRootElement(name = "Receive360ManualAllocationInputParam")
public class Receive360ManualAllocationInputParam implements Serializable {

	@XmlElement(name = "WorkType")
	protected String workType;
	@XmlElement(name = "OfficeSCode")
	protected String officeSCode;
	@XmlElement(name = "WorkOdrNum")
	protected String workOdrNum;
	@XmlElement(name = "Ttid")
	protected String ttid;
	@XmlElement(name = "WorkProgState")
	protected String workProgState;
	@XmlElement(name = "WorkProcState")
	protected String workProcState;
	@XmlElement(name = "BT360AddWorkProgState")
	protected String bt360AddWorkProgState;
	@XmlElement(name = "WorkStateDt")
	protected String workStateDt;
	@XmlElement(name = "Duration")
	protected String duration;
	@XmlElement(name = "Highlight")
	protected String highlight;
	@XmlElement(name = "Reason")
	protected String reason;
	@XmlElement(name = "ReasonValue")
	protected String reasonValue;
	@XmlElement(name = "BT360FixedOdrYn")
	protected String bt360FixedOdrYn;
	@XmlElement(name = "BT360FixedWorkerID")
	protected String bt360FixedWorkerID;
	@XmlElement(name = "BT360FixedVisitDT")
	protected String bt360FixedVisitDT;
	@XmlElement(name = "BT360LogOnOffState")
	protected String bt360LogOnOffState;
	@XmlElement(name = "BT360LogOnOffDt")
	protected String bt360LogOnOffDt;
	@XmlElement(name = "BT360LogOnOffWorkerId")
	protected String bt360LogOnOffWorkerId;
	@XmlElement(name = "OdrNum")
	protected String odrNum;

	/**
	 * Gets the value of the workType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkType() {
		return workType;
	}

	/**
	 * Sets the value of the workType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkType(String value) {
		this.workType = value;
	}

	/**
	 * Gets the value of the officeSCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOfficeSCode() {
		return officeSCode;
	}

	/**
	 * Sets the value of the officeSCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOfficeSCode(String value) {
		this.officeSCode = value;
	}

	/**
	 * Gets the value of the workOdrNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkOdrNum() {
		return workOdrNum;
	}

	/**
	 * Sets the value of the workOdrNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkOdrNum(String value) {
		this.workOdrNum = value;
	}

	/**
	 * Gets the value of the ttid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTtid() {
		return ttid;
	}

	/**
	 * Sets the value of the ttid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTtid(String value) {
		this.ttid = value;
	}

	/**
	 * Gets the value of the workProgState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkProgState() {
		return workProgState;
	}

	/**
	 * Sets the value of the workProgState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkProgState(String value) {
		this.workProgState = value;
	}

	/**
	 * Gets the value of the workProcState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkProcState() {
		return workProcState;
	}

	/**
	 * Sets the value of the workProcState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkProcState(String value) {
		this.workProcState = value;
	}

	/**
	 * Gets the value of the bt360AddWorkProgState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360AddWorkProgState() {
		return bt360AddWorkProgState;
	}

	/**
	 * Sets the value of the bt360AddWorkProgState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360AddWorkProgState(String value) {
		this.bt360AddWorkProgState = value;
	}

	/**
	 * Gets the value of the workStateDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkStateDt() {
		return workStateDt;
	}

	/**
	 * Sets the value of the workStateDt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkStateDt(String value) {
		this.workStateDt = value;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the duration property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDuration(String value) {
		this.duration = value;
	}

	/**
	 * Gets the value of the highlight property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHighlight() {
		return highlight;
	}

	/**
	 * Sets the value of the highlight property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHighlight(String value) {
		this.highlight = value;
	}

	/**
	 * Gets the value of the reason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the reason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReason(String value) {
		this.reason = value;
	}

	/**
	 * Gets the value of the reasonValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReasonValue() {
		return reasonValue;
	}

	/**
	 * Sets the value of the reasonValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReasonValue(String value) {
		this.reasonValue = value;
	}

	/**
	 * Gets the value of the bt360FixedOdrYn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360FixedOdrYn() {
		return bt360FixedOdrYn;
	}

	/**
	 * Sets the value of the bt360FixedOdrYn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360FixedOdrYn(String value) {
		this.bt360FixedOdrYn = value;
	}

	/**
	 * Gets the value of the bt360FixedWorkerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360FixedWorkerID() {
		return bt360FixedWorkerID;
	}

	/**
	 * Sets the value of the bt360FixedWorkerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360FixedWorkerID(String value) {
		this.bt360FixedWorkerID = value;
	}

	/**
	 * Gets the value of the bt360FixedVisitDT property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360FixedVisitDT() {
		return bt360FixedVisitDT;
	}

	/**
	 * Sets the value of the bt360FixedVisitDT property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360FixedVisitDT(String value) {
		this.bt360FixedVisitDT = value;
	}

	/**
	 * Gets the value of the bt360LogOnOffState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360LogOnOffState() {
		return bt360LogOnOffState;
	}

	/**
	 * Sets the value of the bt360LogOnOffState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360LogOnOffState(String value) {
		this.bt360LogOnOffState = value;
	}

	/**
	 * Gets the value of the bt360LogOnOffDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360LogOnOffDt() {
		return bt360LogOnOffDt;
	}

	/**
	 * Sets the value of the bt360LogOnOffDt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360LogOnOffDt(String value) {
		this.bt360LogOnOffDt = value;
	}

	/**
	 * Gets the value of the bt360LogOnOffWorkerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360LogOnOffWorkerId() {
		return bt360LogOnOffWorkerId;
	}

	/**
	 * Sets the value of the bt360LogOnOffWorkerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360LogOnOffWorkerId(String value) {
		this.bt360LogOnOffWorkerId = value;
	}

	/**
	 * Gets the value of the odrNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOdrNum() {
		return odrNum;
	}

	/**
	 * Sets the value of the odrNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOdrNum(String value) {
		this.odrNum = value;
	}

}
