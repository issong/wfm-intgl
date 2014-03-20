
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
 *         &lt;element name="minimumPlanQuality" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxWaitMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nPlanTypesRequired" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "minimumPlanQuality",
    "maxWaitMinutes",
    "nPlanTypesRequired"
})
@XmlRootElement(name = "InputAndWait")
public class InputAndWait {

    protected InputAndWait.DsInput dsInput;
    protected double minimumPlanQuality;
    protected int maxWaitMinutes;
    protected int nPlanTypesRequired;

    /**
     * dsInput 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link InputAndWait.DsInput }
     *
     */
    public InputAndWait.DsInput getDsInput() {
        return dsInput;
    }

    /**
     * dsInput 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link InputAndWait.DsInput }
     *
     */
    public void setDsInput(InputAndWait.DsInput value) {
        this.dsInput = value;
    }

    /**
     * minimumPlanQuality 속성의 값을 가져옵니다.
     *
     */
    public double getMinimumPlanQuality() {
        return minimumPlanQuality;
    }

    /**
     * minimumPlanQuality 속성의 값을 설정합니다.
     *
     */
    public void setMinimumPlanQuality(double value) {
        this.minimumPlanQuality = value;
    }

    /**
     * maxWaitMinutes 속성의 값을 가져옵니다.
     *
     */
    public int getMaxWaitMinutes() {
        return maxWaitMinutes;
    }

    /**
     * maxWaitMinutes 속성의 값을 설정합니다.
     *
     */
    public void setMaxWaitMinutes(int value) {
        this.maxWaitMinutes = value;
    }

    /**
     * nPlanTypesRequired 속성의 값을 가져옵니다.
     *
     */
    public int getNPlanTypesRequired() {
        return nPlanTypesRequired;
    }

    /**
     * nPlanTypesRequired 속성의 값을 설정합니다.
     *
     */
    public void setNPlanTypesRequired(int value) {
        this.nPlanTypesRequired = value;
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
