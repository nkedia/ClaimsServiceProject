
package com.claims.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyHolderDetails" type="{localhost:8080/ClaimsService/policyHolderDetails}policyHolderDetailsType"/>
 *         &lt;element name="vehicleDetails" type="{localhost:8080/ClaimsService/vehicleDetails}vehicleDetailsType"/>
 *         &lt;element name="accidentDetails" type="{localhost:8080/ClaimsService/accidentDetails}accidentDetailsType"/>
 *         &lt;element name="driverDetails" type="{localhost:8080/ClaimsService/driverDetails}driverDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyHolderDetails",
    "vehicleDetails",
    "accidentDetails",
    "driverDetails"
})
@XmlRootElement(name = "fileNewClaim")
public class FileNewClaim {

    @XmlElement(required = true)
    protected PolicyHolderDetailsType policyHolderDetails;
    @XmlElement(required = true)
    protected VehicleDetailsType vehicleDetails;
    @XmlElement(required = true)
    protected AccidentDetailsType accidentDetails;
    @XmlElement(required = true)
    protected DriverDetailsType driverDetails;

    /**
     * Gets the value of the policyHolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyHolderDetailsType }
     *     
     */
    public PolicyHolderDetailsType getPolicyHolderDetails() {
        return policyHolderDetails;
    }

    /**
     * Sets the value of the policyHolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyHolderDetailsType }
     *     
     */
    public void setPolicyHolderDetails(PolicyHolderDetailsType value) {
        this.policyHolderDetails = value;
    }

    /**
     * Gets the value of the vehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetailsType }
     *     
     */
    public VehicleDetailsType getVehicleDetails() {
        return vehicleDetails;
    }

    /**
     * Sets the value of the vehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetailsType }
     *     
     */
    public void setVehicleDetails(VehicleDetailsType value) {
        this.vehicleDetails = value;
    }

    /**
     * Gets the value of the accidentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccidentDetailsType }
     *     
     */
    public AccidentDetailsType getAccidentDetails() {
        return accidentDetails;
    }

    /**
     * Sets the value of the accidentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentDetailsType }
     *     
     */
    public void setAccidentDetails(AccidentDetailsType value) {
        this.accidentDetails = value;
    }

    /**
     * Gets the value of the driverDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DriverDetailsType }
     *     
     */
    public DriverDetailsType getDriverDetails() {
        return driverDetails;
    }

    /**
     * Sets the value of the driverDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverDetailsType }
     *     
     */
    public void setDriverDetails(DriverDetailsType value) {
        this.driverDetails = value;
    }

}
