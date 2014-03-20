package com._360scheduling.interfaces;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiveWorkbenchDataResult" type="{http://360Scheduling.com/Interfaces/}ReceiveWorkbenchDataResult" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "receiveWorkbenchDataResult" })
@XmlRootElement(name = "ReceiveWorkbenchDataResponse")
public class ReceiveWorkbenchDataResponse implements Serializable {

	@XmlElement(name = "ReceiveWorkbenchDataResult")
	protected ReceiveWorkbenchDataResult receiveWorkbenchDataResult;

	/**
	 * receiveWorkbenchDataResult 속성의 값을 가져옵니다.
	 * 
	 * @return possible object is {@link ReceiveWorkbenchDataResult }
	 * 
	 */
	public ReceiveWorkbenchDataResult getReceiveWorkbenchDataResult() {
		return receiveWorkbenchDataResult;
	}

	/**
	 * receiveWorkbenchDataResult 속성의 값을 설정합니다.
	 * 
	 * @param value
	 *            allowed object is {@link ReceiveWorkbenchDataResult }
	 * 
	 */
	public void setReceiveWorkbenchDataResult(ReceiveWorkbenchDataResult value) {
		this.receiveWorkbenchDataResult = value;
	}

}
