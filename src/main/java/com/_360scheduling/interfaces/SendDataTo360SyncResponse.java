
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
 *         &lt;element name="SendDataTo360SyncResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sendDataTo360SyncResult"
})
@XmlRootElement(name = "SendDataTo360SyncResponse")
public class SendDataTo360SyncResponse {

    @XmlElement(name = "SendDataTo360SyncResult")
    protected int sendDataTo360SyncResult;

    /**
     * sendDataTo360SyncResult 속성의 값을 가져옵니다.
     *
     */
    public int getSendDataTo360SyncResult() {
        return sendDataTo360SyncResult;
    }

    /**
     * sendDataTo360SyncResult 속성의 값을 설정합니다.
     *
     */
    public void setSendDataTo360SyncResult(int value) {
        this.sendDataTo360SyncResult = value;
    }

}
