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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tCallableElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCallableElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedInterfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioSpecification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCallableElement", propOrder = {
    "supportedInterfaceReves",
    "ioSpecification",
    "ioBindings"
})
@XmlSeeAlso({
    TGlobalTask.class,
    TProcess.class
})
public class TCallableElement
    extends TRootElement
{

    @XmlElement(name = "supportedInterfaceRef")
    protected List<QName> supportedInterfaceReves;
    protected IoSpecification ioSpecification;
    @XmlElement(name = "ioBinding")
    protected List<IoBinding> ioBindings;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the supportedInterfaceReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedInterfaceReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedInterfaceReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getSupportedInterfaceReves() {
        if (supportedInterfaceReves == null) {
            supportedInterfaceReves = new ArrayList<QName>();
        }
        return this.supportedInterfaceReves;
    }

    /**
     * Gets the value of the ioSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link IoSpecification }
     *     
     */
    public IoSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * Sets the value of the ioSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoSpecification }
     *     
     */
    public void setIoSpecification(IoSpecification value) {
        this.ioSpecification = value;
    }

    /**
     * Gets the value of the ioBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ioBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIoBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IoBinding }
     * 
     * 
     */
    public List<IoBinding> getIoBindings() {
        if (ioBindings == null) {
            ioBindings = new ArrayList<IoBinding>();
        }
        return this.ioBindings;
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

}
