//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.31 at 05:35:05 PM IST 
//


package com.opl.retail.api.model.cibil.transunion.gccs.core.services.v1;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="GetCreditScoreSuccess">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCreditScoreSuccess"
})
@XmlRootElement(name = "GetCreditScoreResponse")
public class GetCreditScoreResponse {

    @XmlElement(name = "GetCreditScoreSuccess", required = true)
    protected GetCreditScoreResponse.GetCreditScoreSuccess getCreditScoreSuccess;
    @XmlAttribute(name = "ResponseStatus")
    protected String responseStatus;

    /**
     * Gets the value of the getCreditScoreSuccess property.
     *
     * @return
     *     possible object is
     *     {@link GetCreditScoreResponse.GetCreditScoreSuccess }
     *
     */
    public GetCreditScoreResponse.GetCreditScoreSuccess getGetCreditScoreSuccess() {
        return getCreditScoreSuccess;
    }

    /**
     * Sets the value of the getCreditScoreSuccess property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCreditScoreResponse.GetCreditScoreSuccess }
     *
     */
    public void setGetCreditScoreSuccess(GetCreditScoreResponse.GetCreditScoreSuccess value) {
        this.getCreditScoreSuccess = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }


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
     *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "score"
    })
    public static class GetCreditScoreSuccess {

        @XmlElement(name = "Score", required = true)
        protected String score;

        /**
         * Gets the value of the score property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScore(String value) {
            this.score = value;
        }

    }

}
