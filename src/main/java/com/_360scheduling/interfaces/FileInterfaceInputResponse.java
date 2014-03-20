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
 *         &lt;element name="FileInterfaceInputResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fileInterfaceInputResult" })
@XmlRootElement(name = "FileInterfaceInputResponse")
public class FileInterfaceInputResponse {

	@XmlElement(name = "FileInterfaceInputResult")
	protected String fileInterfaceInputResult;

	/**
	 * fileInterfaceInputResult ?띿꽦??媛믪쓣 媛?몄샃?덈떎.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getFileInterfaceInputResult() {
		return fileInterfaceInputResult;
	}

	/**
	 * fileInterfaceInputResult ?띿꽦??媛믪쓣 ?ㅼ젙?⑸땲??
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setFileInterfaceInputResult(String value) {
		this.fileInterfaceInputResult = value;
	}

}
