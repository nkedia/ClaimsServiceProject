
package com.claim.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfFirstRegistration" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="chassisNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfTransfer" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="typeOfFuel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleDetailsType", namespace = "localhost:8080/ClaimsService/vehicleDetails", propOrder = {
    "regdNo",
    "make",
    "dateOfFirstRegistration",
    "chassisNo",
    "engineNo",
    "dateOfTransfer",
    "typeOfFuel",
    "color"
})
public class VehicleDetailsType {

    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String regdNo;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String make;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfFirstRegistration;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String chassisNo;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String engineNo;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfTransfer;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String typeOfFuel;
    @XmlElement(namespace = "localhost:8080/ClaimsService/vehicleDetails", required = true)
    protected String color;

    /**
     * Gets the value of the regdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdNo() {
        return regdNo;
    }

    /**
     * Sets the value of the regdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdNo(String value) {
        this.regdNo = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the dateOfFirstRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfFirstRegistration() {
        return dateOfFirstRegistration;
    }

    /**
     * Sets the value of the dateOfFirstRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfFirstRegistration(XMLGregorianCalendar value) {
        this.dateOfFirstRegistration = value;
    }

    /**
     * Gets the value of the chassisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNo() {
        return chassisNo;
    }

    /**
     * Sets the value of the chassisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNo(String value) {
        this.chassisNo = value;
    }

    /**
     * Gets the value of the engineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNo() {
        return engineNo;
    }

    /**
     * Sets the value of the engineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNo(String value) {
        this.engineNo = value;
    }

    /**
     * Gets the value of the dateOfTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfTransfer() {
        return dateOfTransfer;
    }

    /**
     * Sets the value of the dateOfTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfTransfer(XMLGregorianCalendar value) {
        this.dateOfTransfer = value;
    }

    /**
     * Gets the value of the typeOfFuel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    /**
     * Sets the value of the typeOfFuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfFuel(String value) {
        this.typeOfFuel = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

}
