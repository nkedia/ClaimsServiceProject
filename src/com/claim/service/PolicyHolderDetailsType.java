
package com.claim.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policyHolderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyHolderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverNoteNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodOfInsurance" type="{localhost:8080/ClaimsService/policyHolderDetails}periodOfInsuranceType"/>
 *         &lt;element name="NameOfInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{localhost:8080/ClaimsService/policyHolderDetails}phoneType"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyHolderDetailsType", namespace = "localhost:8080/ClaimsService/policyHolderDetails", propOrder = {
    "policyNo",
    "coverNoteNo",
    "periodOfInsurance",
    "nameOfInsured",
    "dob",
    "address",
    "pin",
    "phone",
    "email"
})
public class PolicyHolderDetailsType {

    @XmlElement(name = "PolicyNo", namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String policyNo;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String coverNoteNo;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected PeriodOfInsuranceType periodOfInsurance;
    @XmlElement(name = "NameOfInsured", namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String nameOfInsured;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String address;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String pin;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected PhoneType phone;
    @XmlElement(namespace = "localhost:8080/ClaimsService/policyHolderDetails", required = true)
    protected String email;

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the coverNoteNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverNoteNo() {
        return coverNoteNo;
    }

    /**
     * Sets the value of the coverNoteNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverNoteNo(String value) {
        this.coverNoteNo = value;
    }

    /**
     * Gets the value of the periodOfInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodOfInsuranceType }
     *     
     */
    public PeriodOfInsuranceType getPeriodOfInsurance() {
        return periodOfInsurance;
    }

    /**
     * Sets the value of the periodOfInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOfInsuranceType }
     *     
     */
    public void setPeriodOfInsurance(PeriodOfInsuranceType value) {
        this.periodOfInsurance = value;
    }

    /**
     * Gets the value of the nameOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfInsured() {
        return nameOfInsured;
    }

    /**
     * Sets the value of the nameOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfInsured(String value) {
        this.nameOfInsured = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
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
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
