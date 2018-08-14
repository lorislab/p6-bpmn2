//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.14 at 03:35:48 PM CEST 
//


package org.lorislab.p6.bpmn2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tStandardLoopCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStandardLoopCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loopCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="testBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="loopMaximum" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStandardLoopCharacteristics", propOrder = {
    "loopCondition"
})
public class TStandardLoopCharacteristics
    extends TLoopCharacteristics
{

    protected TExpression loopCondition;
    @XmlAttribute(name = "testBefore")
    protected Boolean testBefore;
    @XmlAttribute(name = "loopMaximum")
    protected BigInteger loopMaximum;

    /**
     * Gets the value of the loopCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getLoopCondition() {
        return loopCondition;
    }

    /**
     * Sets the value of the loopCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setLoopCondition(TExpression value) {
        this.loopCondition = value;
    }

    /**
     * Gets the value of the testBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTestBefore() {
        if (testBefore == null) {
            return false;
        } else {
            return testBefore;
        }
    }

    /**
     * Sets the value of the testBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestBefore(Boolean value) {
        this.testBefore = value;
    }

    /**
     * Gets the value of the loopMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoopMaximum() {
        return loopMaximum;
    }

    /**
     * Sets the value of the loopMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoopMaximum(BigInteger value) {
        this.loopMaximum = value;
    }

}
