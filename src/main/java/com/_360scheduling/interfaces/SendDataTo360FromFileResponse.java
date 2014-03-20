package com._360scheduling.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * anonymous complex type?????Java ?대옒?ㅼ엯?덈떎.
 *
 * <p>
 * ?ㅼ쓬 ?ㅽ궎留??⑦렪?????대옒?ㅼ뿉 ?ы븿?섎뒗 ?꾩슂??肄섑뀗痢좊? 吏?뺥빀?덈떎.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendDataTo360FromFileResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sendDataTo360FromFileResult" })
@XmlRootElement(name = "SendDataTo360FromFileResponse")
public class SendDataTo360FromFileResponse {

	@XmlElement(name = "SendDataTo360FromFileResult")
	protected String sendDataTo360FromFileResult;

	/**
	 * sendDataTo360FromFileResult ?띿꽦??媛믪쓣 媛?몄샃?덈떎.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSendDataTo360FromFileResult() {
		return sendDataTo360FromFileResult;
	}

	/**
	 * sendDataTo360FromFileResult ?띿꽦??媛믪쓣 ?ㅼ젙?⑸땲??
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setSendDataTo360FromFileResult(String value) {
		this.sendDataTo360FromFileResult = value;
	}

}
