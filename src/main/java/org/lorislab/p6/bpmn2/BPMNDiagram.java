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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMNDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNDiagram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Diagram"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNPlane"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabelStyle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", propOrder = {
    "bpmnPlane",
    "bpmnLabelStyles"
})
@XmlRootElement(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BPMNDiagram
    extends Diagram
{

    @XmlElement(name = "BPMNPlane", required = true)
    protected BPMNPlane bpmnPlane;
    @XmlElement(name = "BPMNLabelStyle")
    protected List<BPMNLabelStyle> bpmnLabelStyles;

    /**
     * Gets the value of the bpmnPlane property.
     * 
     * @return
     *     possible object is
     *     {@link BPMNPlane }
     *     
     */
    public BPMNPlane getBPMNPlane() {
        return bpmnPlane;
    }

    /**
     * Sets the value of the bpmnPlane property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNPlane }
     *     
     */
    public void setBPMNPlane(BPMNPlane value) {
        this.bpmnPlane = value;
    }

    /**
     * Gets the value of the bpmnLabelStyles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmnLabelStyles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBPMNLabelStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNLabelStyle }
     * 
     * 
     */
    public List<BPMNLabelStyle> getBPMNLabelStyles() {
        if (bpmnLabelStyles == null) {
            bpmnLabelStyles = new ArrayList<BPMNLabelStyle>();
        }
        return this.bpmnLabelStyles;
    }

}
