
package com._360scheduling.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="dsInput" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "dsInput",
    "nDataType"
})
@XmlRootElement(name = "SendDataTo360NoResponse")
public class SendDataTo360NoResponse {

    protected SendDataTo360NoResponse.DsInput dsInput;
    protected int nDataType;

    /**
     * dsInput 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link SendDataTo360NoResponse.DsInput }
     *
     */
    public SendDataTo360NoResponse.DsInput getDsInput() {
        return dsInput;
    }

    /**
     * dsInput 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link SendDataTo360NoResponse.DsInput }
     *
     */
    public void setDsInput(SendDataTo360NoResponse.DsInput value) {
        this.dsInput = value;
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
     *         &lt;any minOccurs="2"/>
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
        "any"
    })
    public static class DsInput {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * any 속성의 값을 가져옵니다.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getAny() {
            return any;
        }

        /**
         * any 속성의 값을 설정합니다.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
