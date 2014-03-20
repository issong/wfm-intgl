package org.tempuri;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Receive360WorkOrderInputParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Receive360WorkOrderInputParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOdrNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ttid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkProgState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkProcState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360AddWorkProgState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360FixedOdrYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360FixedVisitDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360CommitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OdrNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360WorkStartDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360WorkEndDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360DateTimeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ILDateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CsctID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BT360PlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Receive360WorkOrderInputParam", propOrder = { "workType",
		"officeSCode", "workOdrNum", "ttid", "workerID", "workProgState",
		"workProcState", "bt360AddWorkProgState", "bt360FixedOdrYN",
		"bt360FixedVisitDT", "bt360CommitValue", "odrNum", "bt360WorkStartDT",
		"bt360WorkEndDT", "bt360DateTimeStatus", "ilDateTimeStamp", "csctID",
		"bt360PlanId" })
public class Receive360WorkOrderInputParam implements Serializable {

	@XmlElement(name = "WorkType")
	protected String workType;
	@XmlElement(name = "OfficeSCode")
	protected String officeSCode;
	@XmlElement(name = "WorkOdrNum")
	protected String workOdrNum;
	@XmlElement(name = "Ttid")
	protected String ttid;
	@XmlElement(name = "WorkerID")
	protected String workerID;
	@XmlElement(name = "WorkProgState")
	protected String workProgState;
	@XmlElement(name = "WorkProcState")
	protected String workProcState;
	@XmlElement(name = "BT360AddWorkProgState")
	protected String bt360AddWorkProgState;
	@XmlElement(name = "BT360FixedOdrYN")
	protected String bt360FixedOdrYN;
	@XmlElement(name = "BT360FixedVisitDT")
	protected String bt360FixedVisitDT;
	@XmlElement(name = "BT360CommitValue")
	protected String bt360CommitValue;
	@XmlElement(name = "OdrNum")
	protected String odrNum;
	@XmlElement(name = "BT360WorkStartDT")
	protected String bt360WorkStartDT;
	@XmlElement(name = "BT360WorkEndDT")
	protected String bt360WorkEndDT;
	@XmlElement(name = "BT360DateTimeStatus")
	protected String bt360DateTimeStatus;
	@XmlElement(name = "ILDateTimeStamp")
	protected String ilDateTimeStamp;
	@XmlElement(name = "CsctID")
	protected String csctID;
	@XmlElement(name = "BT360PlanId")
	protected String bt360PlanId;

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
	 * Gets the value of the workerID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWorkerID() {
		return workerID;
	}

	/**
	 * Sets the value of the workerID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWorkerID(String value) {
		this.workerID = value;
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
	 * Gets the value of the bt360FixedOdrYN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360FixedOdrYN() {
		return bt360FixedOdrYN;
	}

	/**
	 * Sets the value of the bt360FixedOdrYN property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360FixedOdrYN(String value) {
		this.bt360FixedOdrYN = value;
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
	 * Gets the value of the bt360CommitValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360CommitValue() {
		return bt360CommitValue;
	}

	/**
	 * Sets the value of the bt360CommitValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360CommitValue(String value) {
		this.bt360CommitValue = value;
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

	/**
	 * Gets the value of the bt360WorkStartDT property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360WorkStartDT() {
		return bt360WorkStartDT;
	}

	/**
	 * Sets the value of the bt360WorkStartDT property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360WorkStartDT(String value) {
		this.bt360WorkStartDT = value;
	}

	/**
	 * Gets the value of the bt360WorkEndDT property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360WorkEndDT() {
		return bt360WorkEndDT;
	}

	/**
	 * Sets the value of the bt360WorkEndDT property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360WorkEndDT(String value) {
		this.bt360WorkEndDT = value;
	}

	/**
	 * Gets the value of the bt360DateTimeStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360DateTimeStatus() {
		return bt360DateTimeStatus;
	}

	/**
	 * Sets the value of the bt360DateTimeStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360DateTimeStatus(String value) {
		this.bt360DateTimeStatus = value;
	}

	/**
	 * Gets the value of the ilDateTimeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getILDateTimeStamp() {
		return ilDateTimeStamp;
	}

	/**
	 * Sets the value of the ilDateTimeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setILDateTimeStamp(String value) {
		this.ilDateTimeStamp = value;
	}

	/**
	 * Gets the value of the csctID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCsctID() {
		return csctID;
	}

	/**
	 * Sets the value of the csctID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCsctID(String value) {
		this.csctID = value;
	}

	/**
	 * Gets the value of the bt360PlanId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBT360PlanId() {
		return bt360PlanId;
	}

	/**
	 * Sets the value of the bt360PlanId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBT360PlanId(String value) {
		this.bt360PlanId = value;
	}

}
