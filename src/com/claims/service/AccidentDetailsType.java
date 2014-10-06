
package com.claims.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accidentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accidentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfAccident" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noOfPeopleTravelling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policeStationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accidentDetailsType", namespace = "localhost:8080/ClaimsService/accidentDetails", propOrder = {
    "dateOfAccident",
    "time",
    "speed",
    "place",
    "noOfPeopleTravelling",
    "policeStationName",
    "firNo",
    "mileage"
})
public class AccidentDetailsType {

    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfAccident;
    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String speed;
    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String place;
    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String noOfPeopleTravelling;
    @XmlElement(namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String policeStationName;
    @XmlElement(name = "FIRNo", namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String firNo;
    @XmlElement(name = "Mileage", namespace = "localhost:8080/ClaimsService/accidentDetails", required = true)
    protected String mileage;

    /**
     * Gets the value of the dateOfAccident property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAccident() {
        return dateOfAccident;
    }

    /**
     * Sets the value of the dateOfAccident property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfAccident(XMLGregorianCalendar value) {
        this.dateOfAccident = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed(String value) {
        this.speed = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the noOfPeopleTravelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPeopleTravelling() {
        return noOfPeopleTravelling;
    }

    /**
     * Sets the value of the noOfPeopleTravelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPeopleTravelling(String value) {
        this.noOfPeopleTravelling = value;
    }

    /**
     * Gets the value of the policeStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceStationName() {
        return policeStationName;
    }

    /**
     * Sets the value of the policeStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceStationName(String value) {
        this.policeStationName = value;
    }

    /**
     * Gets the value of the firNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRNo() {
        return firNo;
    }

    /**
     * Sets the value of the firNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRNo(String value) {
        this.firNo = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

}
