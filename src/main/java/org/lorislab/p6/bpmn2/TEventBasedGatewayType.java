//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 08:15:19 PM CET 
//


package org.lorislab.p6.bpmn2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tEventBasedGatewayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tEventBasedGatewayType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="Parallel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tEventBasedGatewayType")
@XmlEnum
public enum TEventBasedGatewayType {

    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Parallel")
    PARALLEL("Parallel");
    private final String value;

    TEventBasedGatewayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TEventBasedGatewayType fromValue(String v) {
        for (TEventBasedGatewayType c: TEventBasedGatewayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
