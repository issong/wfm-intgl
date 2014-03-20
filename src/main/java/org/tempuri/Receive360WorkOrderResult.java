package org.tempuri;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Receive360WorkOrderResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Receive360WorkOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "Receive360WorkOrderResult", propOrder = { "result" })
@XmlRootElement(name = "Receive360WorkOrderResult")
public class Receive360WorkOrderResult implements Serializable {

	@XmlElement(name = "Result")
	protected int result;

	/**
	 * Gets the value of the result property.
	 * 
	 */
	public int getResult() {
		return result;
	}

	/**
	 * Sets the value of the result property.
	 * 
	 */
	public void setResult(int value) {
		this.result = value;
	}

}
