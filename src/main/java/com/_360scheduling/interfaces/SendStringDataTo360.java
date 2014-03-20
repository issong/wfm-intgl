
package com._360scheduling.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 *
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strInputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strInputXML",
    "nDataType"
})
@XmlRootElement(name = "SendStringDataTo360")
public class SendStringDataTo360 {

    protected String strInputXML;
    protected int nDataType;

    /**
     * strInputXML 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrInputXML() {
        return strInputXML;
    }

    /**
     * strInputXML 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrInputXML(String value) {
        this.strInputXML = value;
    }

    /**
     * nDataType 속성의 값을 가져옵니다.
     *
     */
    public int getNDataType() {
        return nDataType;
    }

    /**
     * nDataType 속성의 값을 설정합니다.
     *
     */
    public void setNDataType(int value) {
        this.nDataType = value;
    }

}
