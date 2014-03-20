
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
 *         &lt;element name="SendStringDataTo360SyncResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sendStringDataTo360SyncResult"
})
@XmlRootElement(name = "SendStringDataTo360SyncResponse")
public class SendStringDataTo360SyncResponse {

    @XmlElement(name = "SendStringDataTo360SyncResult")
    protected int sendStringDataTo360SyncResult;

    /**
     * sendStringDataTo360SyncResult 속성의 값을 가져옵니다.
     *
     */
    public int getSendStringDataTo360SyncResult() {
        return sendStringDataTo360SyncResult;
    }

    /**
     * sendStringDataTo360SyncResult 속성의 값을 설정합니다.
     *
     */
    public void setSendStringDataTo360SyncResult(int value) {
        this.sendStringDataTo360SyncResult = value;
    }

}
