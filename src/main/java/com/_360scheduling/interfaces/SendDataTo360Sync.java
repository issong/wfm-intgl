
package com._360scheduling.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type?????Java ?대옒?ㅼ엯?덈떎.
 *
 * <p>?ㅼ쓬 ?ㅽ궎留??⑦렪?????대옒?ㅼ뿉 ?ы븿?섎뒗 ?꾩슂??肄섑뀗痢좊? 吏?뺥빀?덈떎.
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
@XmlRootElement(name = "SendDataTo360Sync")
public class SendDataTo360Sync {

    protected SendDataTo360Sync.DsInput dsInput;
    protected int nDataType;

    /**
     * dsInput ?띿꽦??媛믪쓣 媛?몄샃?덈떎.
     * 
     * @return
     *     possible object is
     *     {@link SendDataTo360Sync.DsInput }
     *     
     */
    public SendDataTo360Sync.DsInput getDsInput() {
        return dsInput;
    }

    /**
     * dsInput ?띿꽦??媛믪쓣 ?ㅼ젙?⑸땲??
     * 
     * @param value
     *     allowed object is
     *     {@link SendDataTo360Sync.DsInput }
     *     
     */
    public void setDsInput(SendDataTo360Sync.DsInput value) {
        this.dsInput = value;
    }

    /**
     * nDataType ?띿꽦??媛믪쓣 媛?몄샃?덈떎.
     * 
     */
    public int getNDataType() {
        return nDataType;
    }

    /**
     * nDataType ?띿꽦??媛믪쓣 ?ㅼ젙?⑸땲??
     * 
     */
    public void setNDataType(int value) {
        this.nDataType = value;
    }


    /**
     * <p>anonymous complex type?????Java ?대옒?ㅼ엯?덈떎.
     * 
     * <p>?ㅼ쓬 ?ㅽ궎留??⑦렪?????대옒?ㅼ뿉 ?ы븿?섎뒗 ?꾩슂??肄섑뀗痢좊? 吏?뺥빀?덈떎.
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
         * any ?띿꽦??媛믪쓣 媛?몄샃?덈떎.
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
         * any ?띿꽦??媛믪쓣 ?ㅼ젙?⑸땲??
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
