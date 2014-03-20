
package com._360scheduling.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="StandardInterfaceInputSyncResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "standardInterfaceInputSyncResult"
})
@XmlRootElement(name = "StandardInterfaceInputSyncResponse")
public class StandardInterfaceInputSyncResponse {

    @XmlElement(name = "StandardInterfaceInputSyncResult")
    protected int standardInterfaceInputSyncResult;

    /**
     * standardInterfaceInputSyncResult 속성의 값을 가져옵니다.
     *
     */
    public int getStandardInterfaceInputSyncResult() {
        return standardInterfaceInputSyncResult;
    }

    /**
     * standardInterfaceInputSyncResult 속성의 값을 설정합니다.
     *
     */
    public void setStandardInterfaceInputSyncResult(int value) {
        this.standardInterfaceInputSyncResult = value;
    }

}
