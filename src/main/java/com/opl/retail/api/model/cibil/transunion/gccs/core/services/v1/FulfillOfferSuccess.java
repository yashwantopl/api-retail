
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
 *         &lt;element name="Status" type="{com/transunion/gccs/core/services/v1}IVStatusEnum"/>
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
    "status"
})
@XmlRootElement(name = "FulfillOfferSuccess")
public class FulfillOfferSuccess {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected IVStatusEnum status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link IVStatusEnum }
     *     
     */
    public IVStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVStatusEnum }
     *     
     */
    public void setStatus(IVStatusEnum value) {
        this.status = value;
    }

}
