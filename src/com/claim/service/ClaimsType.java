
package com.claim.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for claimsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="claimsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claimStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amountSettled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfSettlement" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "claimsType", propOrder = {
    "userId",
    "claimId",
    "claimStatus",
    "amountSettled",
    "dateOfSettlement",
    "policyHolderDetails",
    "vehicleDetails",
    "accidentDetails",
    "driverDetails"
})
public class ClaimsType {

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String claimId;
    @XmlElement(required = true)
    protected String claimStatus;
    @XmlElement(required = true)
    protected String amountSettled;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSettlement;
    @XmlElement(required = true)
    protected PolicyHolderDetailsType policyHolderDetails;
    @XmlElement(required = true)
    protected VehicleDetailsType vehicleDetails;
    @XmlElement(required = true)
    protected AccidentDetailsType accidentDetails;
    @XmlElement(required = true)
    protected DriverDetailsType driverDetails;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the claimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimId(String value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatus(String value) {
        this.claimStatus = value;
    }

    /**
     * Gets the value of the amountSettled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSettled() {
        return amountSettled;
    }

    /**
     * Sets the value of the amountSettled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSettled(String value) {
        this.amountSettled = value;
    }

    /**
     * Gets the value of the dateOfSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSettlement() {
        return dateOfSettlement;
    }

    /**
     * Sets the value of the dateOfSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSettlement(XMLGregorianCalendar value) {
        this.dateOfSettlement = value;
    }

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
