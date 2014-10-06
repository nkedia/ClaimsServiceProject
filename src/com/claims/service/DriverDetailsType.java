
package com.claims.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for driverDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driverDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relationWithInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="license" type="{localhost:8080/ClaimsService/driverDetails}licenseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driverDetailsType", namespace = "localhost:8080/ClaimsService/driverDetails", propOrder = {
    "name",
    "relationWithInsured",
    "address",
    "contactNo",
    "dob",
    "license"
})
public class DriverDetailsType {

    @XmlElement(namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    protected String name;
    @XmlElement(namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    protected String relationWithInsured;
    @XmlElement(namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    protected String address;
    @XmlElement(namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    protected String contactNo;
    @XmlElement(name = "DOB", namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(namespace = "localhost:8080/ClaimsService/driverDetails", required = true)
    protected LicenseType license;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationWithInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationWithInsured() {
        return relationWithInsured;
    }

    /**
     * Sets the value of the relationWithInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationWithInsured(String value) {
        this.relationWithInsured = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNo(String value) {
        this.contactNo = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType }
     *     
     */
    public LicenseType getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType }
     *     
     */
    public void setLicense(LicenseType value) {
        this.license = value;
    }

}
