//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.14 at 03:35:48 PM CEST 
//


package org.lorislab.p6.bpmn2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tParticipant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endPointRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantMultiplicity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="processRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParticipant", propOrder = {
    "interfaceReves",
    "endPointReves",
    "participantMultiplicity"
})
@XmlRootElement(name = "participant")
public class Participant
    extends TBaseElement
{

    @XmlElement(name = "interfaceRef")
    protected List<QName> interfaceReves;
    @XmlElement(name = "endPointRef")
    protected List<QName> endPointReves;
    protected ParticipantMultiplicity participantMultiplicity;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "processRef")
    protected QName processRef;

    /**
     * Gets the value of the interfaceReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getInterfaceReves() {
        if (interfaceReves == null) {
            interfaceReves = new ArrayList<QName>();
        }
        return this.interfaceReves;
    }

    /**
     * Gets the value of the endPointReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endPointReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndPointReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getEndPointReves() {
        if (endPointReves == null) {
            endPointReves = new ArrayList<QName>();
        }
        return this.endPointReves;
    }

    /**
     * Gets the value of the participantMultiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantMultiplicity }
     *     
     */
    public ParticipantMultiplicity getParticipantMultiplicity() {
        return participantMultiplicity;
    }

    /**
     * Sets the value of the participantMultiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantMultiplicity }
     *     
     */
    public void setParticipantMultiplicity(ParticipantMultiplicity value) {
        this.participantMultiplicity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the processRef property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getProcessRef() {
        return processRef;
    }

    /**
     * Sets the value of the processRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setProcessRef(QName value) {
        this.processRef = value;
    }

}
