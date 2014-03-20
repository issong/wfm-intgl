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
 * Java class for ArrayOfReceive360WorkOrderInputParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReceive360WorkOrderInputParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receive360WorkOrderInputParam" type="{http://tempuri.org/}Receive360WorkOrderInputParam" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrayOfReceive360WorkOrderInputParam", propOrder = { "receive360WorkOrderInputParam" })
@XmlRootElement(name = "ArrayOfReceive360WorkOrderInputParam")
public class ArrayOfReceive360WorkOrderInputParam implements Serializable {

	@XmlElement(name = "Receive360WorkOrderInputParam", nillable = true)
	protected List<Receive360WorkOrderInputParam> receive360WorkOrderInputParam;

	/**
	 * Gets the value of the receive360WorkOrderInputParam property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the receive360WorkOrderInputParam property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReceive360WorkOrderInputParam().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Receive360WorkOrderInputParam }
	 * 
	 * 
	 */
	public List<Receive360WorkOrderInputParam> getReceive360WorkOrderInputParam() {
		if (receive360WorkOrderInputParam == null) {
			receive360WorkOrderInputParam = new ArrayList<Receive360WorkOrderInputParam>();
		}
		return this.receive360WorkOrderInputParam;
	}

}
