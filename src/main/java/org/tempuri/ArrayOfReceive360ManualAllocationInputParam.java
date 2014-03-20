package org.tempuri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfReceive360ManualAllocationInputParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReceive360ManualAllocationInputParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receive360ManualAllocationInputParam" type="{http://tempuri.org/}Receive360ManualAllocationInputParam" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrayOfReceive360ManualAllocationInputParam", propOrder = { "receive360ManualAllocationInputParam" })
@XmlRootElement(name = "ArrayOfReceive360ManualAllocationInputParam")
public class ArrayOfReceive360ManualAllocationInputParam implements
		Serializable {

	@XmlElement(name = "Receive360ManualAllocationInputParam", nillable = true)
	protected List<Receive360ManualAllocationInputParam> receive360ManualAllocationInputParam;

	/**
	 * Gets the value of the receive360ManualAllocationInputParam property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the receive360ManualAllocationInputParam
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReceive360ManualAllocationInputParam().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Receive360ManualAllocationInputParam }
	 * 
	 * 
	 */
	public List<Receive360ManualAllocationInputParam> getReceive360ManualAllocationInputParam() {
		if (receive360ManualAllocationInputParam == null) {
			receive360ManualAllocationInputParam = new ArrayList<Receive360ManualAllocationInputParam>();
		}
		return this.receive360ManualAllocationInputParam;
	}

}
