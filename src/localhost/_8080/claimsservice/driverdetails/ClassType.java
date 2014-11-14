
package localhost._8080.claimsservice.driverdetails;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MCycle"/>
 *     &lt;enumeration value="LMV"/>
 *     &lt;enumeration value="HGV"/>
 *     &lt;enumeration value="Transport"/>
 *     &lt;enumeration value="Non-Transport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classType")
@XmlEnum
public enum ClassType {

    @XmlEnumValue("MCycle")
    M_CYCLE("MCycle"),
    LMV("LMV"),
    HGV("HGV"),
    @XmlEnumValue("Transport")
    TRANSPORT("Transport"),
    @XmlEnumValue("Non-Transport")
    NON_TRANSPORT("Non-Transport");
    private final String value;

    ClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassType fromValue(String v) {
        for (ClassType c: ClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
