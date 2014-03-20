
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
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "xml"
})
@XmlRootElement(name = "SendXmlDocument")
public class SendXmlDocument {

    protected String xml;

    /**
     * xml 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXml() {
        return xml;
    }

    /**
     * xml 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXml(String value) {
        this.xml = value;
    }

}
