package org.tempuri;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receive360WorkOrderResult" type="{http://tempuri.org/}Receive360WorkOrderResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "receive360WorkOrderResult" })
@XmlRootElement(name = "Receive360WorkOrderResponse")
public class Receive360WorkOrderResponse implements Serializable {

	@XmlElement(name = "Receive360WorkOrderResult")
	protected Receive360WorkOrderResult receive360WorkOrderResult;

	/**
	 * Gets the value of the receive360WorkOrderResult property.
	 * 
	 * @return possible object is {@link Receive360WorkOrderResult }
	 * 
	 */
	public Receive360WorkOrderResult getReceive360WorkOrderResult() {
		return receive360WorkOrderResult;
	}

	/**
	 * Sets the value of the receive360WorkOrderResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Receive360WorkOrderResult }
	 * 
	 */
	public void setReceive360WorkOrderResult(Receive360WorkOrderResult value) {
		this.receive360WorkOrderResult = value;
	}

}
