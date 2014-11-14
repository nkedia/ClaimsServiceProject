
package localhost._8080.claimsservice.policyholderdetails;

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
 *         &lt;element name="dobOfInsured" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="addressOfInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pinOfInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneOfInsured" type="{localhost:8080/ClaimsService/policyHolderDetails}phoneType"/>
 *         &lt;element name="emailOfInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyHolderDetailsType", propOrder = {
    "policyNo",
    "coverNoteNo",
    "periodOfInsurance",
    "nameOfInsured",
    "dobOfInsured",
    "addressOfInsured",
    "pinOfInsured",
    "phoneOfInsured",
    "emailOfInsured"
})
public class PolicyHolderDetailsType {

    @XmlElement(name = "PolicyNo", required = true)
    protected String policyNo;
    @XmlElement(required = true)
    protected String coverNoteNo;
    @XmlElement(required = true)
    protected PeriodOfInsuranceType periodOfInsurance;
    @XmlElement(name = "NameOfInsured", required = true)
    protected String nameOfInsured;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dobOfInsured;
    @XmlElement(required = true)
    protected String addressOfInsured;
    @XmlElement(required = true)
    protected String pinOfInsured;
    @XmlElement(required = true)
    protected PhoneType phoneOfInsured;
    @XmlElement(required = true)
    protected String emailOfInsured;

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
     * Gets the value of the dobOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDobOfInsured() {
        return dobOfInsured;
    }

    /**
     * Sets the value of the dobOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDobOfInsured(XMLGregorianCalendar value) {
        this.dobOfInsured = value;
    }

    /**
     * Gets the value of the addressOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOfInsured() {
        return addressOfInsured;
    }

    /**
     * Sets the value of the addressOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOfInsured(String value) {
        this.addressOfInsured = value;
    }

    /**
     * Gets the value of the pinOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinOfInsured() {
        return pinOfInsured;
    }

    /**
     * Sets the value of the pinOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinOfInsured(String value) {
        this.pinOfInsured = value;
    }

    /**
     * Gets the value of the phoneOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneOfInsured() {
        return phoneOfInsured;
    }

    /**
     * Sets the value of the phoneOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneOfInsured(PhoneType value) {
        this.phoneOfInsured = value;
    }

    /**
     * Gets the value of the emailOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailOfInsured() {
        return emailOfInsured;
    }

    /**
     * Sets the value of the emailOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailOfInsured(String value) {
        this.emailOfInsured = value;
    }

}
