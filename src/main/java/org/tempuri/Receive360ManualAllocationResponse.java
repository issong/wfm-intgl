package org.tempuri;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="receive360ManualAllocationResult" type="{http://tempuri.org/}Receive360WorkOrderResult" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "receive360ManualAllocationResult" })
@XmlRootElement(name = "receive360ManualAllocationResponse")
public class Receive360ManualAllocationResponse implements Serializable {

	protected Receive360WorkOrderResult receive360ManualAllocationResult;

	/**
	 * Gets the value of the receive360ManualAllocationResult property.
	 * 
	 * @return possible object is {@link Receive360WorkOrderResult }
	 * 
	 */
	public Receive360WorkOrderResult getReceive360ManualAllocationResult() {
		return receive360ManualAllocationResult;
	}

	/**
	 * Sets the value of the receive360ManualAllocationResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Receive360WorkOrderResult }
	 * 
	 */
	public void setReceive360ManualAllocationResult(
			Receive360WorkOrderResult value) {
		this.receive360ManualAllocationResult = value;
	}

}
