//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.01 at 12:33:58 PM IST 
//


package com.opl.retail.api.model.cibil.highmark.retail;

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
 *         &lt;element ref="{}BASE-PLUS-REPORT"/>
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
    "baseplusreport"
})
@XmlRootElement(name = "BASE-PLUS-REPORTS")
public class BASEPLUSREPORTS {

    @XmlElement(name = "BASE-PLUS-REPORT", required = true)
    protected B2CREPORT baseplusreport;

    /**
     * Gets the value of the baseplusreport property.
     * 
     * @return
     *     possible object is
     *     {@link B2CREPORT }
     *     
     */
    public B2CREPORT getBASEPLUSREPORT() {
        return baseplusreport;
    }

    /**
     * Sets the value of the baseplusreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2CREPORT }
     *     
     */
    public void setBASEPLUSREPORT(B2CREPORT value) {
        this.baseplusreport = value;
    }

}
