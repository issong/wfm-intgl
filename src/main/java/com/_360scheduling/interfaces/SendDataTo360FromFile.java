
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
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bSynchronous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bNoResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "filePath",
    "nDataType",
    "bSynchronous",
    "bNoResponse"
})
@XmlRootElement(name = "SendDataTo360FromFile")
public class SendDataTo360FromFile {

    protected String filePath;
    protected int nDataType;
    protected boolean bSynchronous;
    protected boolean bNoResponse;

    /**
     * filePath 속성의 값을 가져옵니다.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * filePath 속성의 값을 설정합니다.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFilePath(String value) {
        this.filePath = value;
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
     * bSynchronous 속성의 값을 가져옵니다.
     *
     */
    public boolean isBSynchronous() {
        return bSynchronous;
    }

    /**
     * bSynchronous 속성의 값을 설정합니다.
     *
     */
    public void setBSynchronous(boolean value) {
        this.bSynchronous = value;
    }

    /**
     * bNoResponse 속성의 값을 가져옵니다.
     *
     */
    public boolean isBNoResponse() {
        return bNoResponse;
    }

    /**
     * bNoResponse 속성의 값을 설정합니다.
     *
     */
    public void setBNoResponse(boolean value) {
        this.bNoResponse = value;
    }

}
