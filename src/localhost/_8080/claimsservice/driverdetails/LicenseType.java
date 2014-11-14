
package localhost._8080.claimsservice.driverdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for licenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="licenseNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuingRTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="class" type="{localhost:8080/ClaimsService/driverDetails}classType"/>
 *         &lt;element name="type" type="{localhost:8080/ClaimsService/driverDetails}type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseType", propOrder = {
    "licenseNo",
    "issuingRTO",
    "effectiveFrom",
    "expiryDate",
    "clazz",
    "type"
})
public class LicenseType {

    @XmlElement(required = true)
    protected String licenseNo;
    @XmlElement(required = true)
    protected String issuingRTO;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "class", required = true)
    protected ClassType clazz;
    @XmlElement(required = true)
    protected Type type;

    /**
     * Gets the value of the licenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Sets the value of the licenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNo(String value) {
        this.licenseNo = value;
    }

    /**
     * Gets the value of the issuingRTO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingRTO() {
        return issuingRTO;
    }

    /**
     * Sets the value of the issuingRTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingRTO(String value) {
        this.issuingRTO = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFrom(XMLGregorianCalendar value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    public ClassType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    public void setClazz(ClassType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

}
