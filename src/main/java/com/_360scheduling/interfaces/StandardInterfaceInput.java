
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
 *                   &lt;any namespace='http://360Scheduling.com/Schema/dsScheduleData.xsd'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "dsInput"
})
@XmlRootElement(name = "StandardInterfaceInput")
public class StandardInterfaceInput {

    protected StandardInterfaceInput.DsInput dsInput;

    /**
     * dsInput 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link StandardInterfaceInput.DsInput }
     *
     */
    public StandardInterfaceInput.DsInput getDsInput() {
        return dsInput;
    }

    /**
     * dsInput 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link StandardInterfaceInput.DsInput }
     *
     */
    public void setDsInput(StandardInterfaceInput.DsInput value) {
        this.dsInput = value;
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
     *         &lt;any namespace='http://360Scheduling.com/Schema/dsScheduleData.xsd'/>
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
