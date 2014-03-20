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
 *         &lt;element name="WorkOrder" type="{http://tempuri.org/}ArrayOfReceive360ManualAllocationInputParam" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "workOrder" })
@XmlRootElement(name = "receive360ManualAllocation")
public class Receive360ManualAllocation implements Serializable {

	@XmlElement(name = "WorkOrder")
	protected ArrayOfReceive360ManualAllocationInputParam workOrder;

	/**
	 * Gets the value of the workOrder property.
	 * 
	 * @return possible object is
	 *         {@link ArrayOfReceive360ManualAllocationInputParam }
	 * 
	 */
	public ArrayOfReceive360ManualAllocationInputParam getWorkOrder() {
		return workOrder;
	}

	/**
	 * Sets the value of the workOrder property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ArrayOfReceive360ManualAllocationInputParam }
	 * 
	 */
	public void setWorkOrder(ArrayOfReceive360ManualAllocationInputParam value) {
		this.workOrder = value;
	}

}
