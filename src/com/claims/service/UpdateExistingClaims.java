
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
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policeStationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "claimId",
    "policeStationName",
    "firNo"
})
@XmlRootElement(name = "updateExistingClaims")
public class UpdateExistingClaims {

    @XmlElement(required = true)
    protected String claimId;
    @XmlElement(required = true)
    protected String policeStationName;
    @XmlElement(name = "FIRNo", required = true)
    protected String firNo;

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

}
