package com._360scheduling.interfaces;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ReceiveWorkbenchDataResult complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReceiveWorkbenchDataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputInternalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ReceiveWorkbenchDataResult", propOrder = { "accepted",
		"rejectionReason", "inputInternalId" })
@XmlRootElement(name = "ReceiveWorkbenchDataResult")
public class ReceiveWorkbenchDataResult implements Serializable {

	@XmlElement(name = "Accepted")
	protected boolean accepted;
	@XmlElement(name = "RejectionReason")
	protected String rejectionReason;
	@XmlElement(name = "InputInternalId", required = true, type = Integer.class, nillable = true)
	protected Integer inputInternalId;

	/**
	 * accepted 속성의 값을 가져옵니다.
	 * 
	 */
	public boolean isAccepted() {
		return accepted;
	}

	/**
	 * accepted 속성의 값을 설정합니다.
	 * 
	 */
	public void setAccepted(boolean value) {
		this.accepted = value;
	}

	/**
	 * rejectionReason 속성의 값을 가져옵니다.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRejectionReason() {
		return rejectionReason;
	}

	/**
	 * rejectionReason 속성의 값을 설정합니다.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRejectionReason(String value) {
		this.rejectionReason = value;
	}

	/**
	 * inputInternalId 속성의 값을 가져옵니다.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getInputInternalId() {
		return inputInternalId;
	}

	/**
	 * inputInternalId 속성의 값을 설정합니다.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setInputInternalId(Integer value) {
		this.inputInternalId = value;
	}

}
