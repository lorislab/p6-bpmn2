//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.14 at 03:35:48 PM CEST 
//


package org.lorislab.p6.bpmn2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStartEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStartEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tCatchEvent"&gt;
 *       &lt;attribute name="isInterrupting" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStartEvent")
public class TStartEvent
    extends TCatchEvent
{

    @XmlAttribute(name = "isInterrupting")
    protected Boolean isInterrupting;

    /**
     * Gets the value of the isInterrupting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInterrupting() {
        if (isInterrupting == null) {
            return true;
        } else {
            return isInterrupting;
        }
    }

    /**
     * Sets the value of the isInterrupting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterrupting(Boolean value) {
        this.isInterrupting = value;
    }

}
