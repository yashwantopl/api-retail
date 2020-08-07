
package com.opl.retail.api.model.cibil.transunion.gccs.core.services.v1;

import com.opl.retail.api.model.cibil.truelink.schema.database.tcps.enumerations.LegalResponseType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{com/transunion/gccs/core/services/v1}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PartnerCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partnerCustomerId",
	"legalCopyStatus"
})
@XmlRootElement(name = "GetCustomerAssetsRequest")
public class GetCustomerAssetsRequest
    extends BaseRequestType
{

    @XmlElement(name = "PartnerCustomerId", required = true)
    protected String partnerCustomerId;
    
    @XmlElement(name = "LegalCopyStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LegalResponseType legalCopyStatus;

    /**
     * Gets the value of the partnerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCustomerId() {
        return partnerCustomerId;
    }

    /**
     * Sets the value of the partnerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCustomerId(String value) {
        this.partnerCustomerId = value;
    }

    /**
     * Gets the value of the legalCopyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LegalResponseType }
     *     
     */
    public LegalResponseType getLegalCopyStatus() {
        return legalCopyStatus;
    }

    /**
     * Sets the value of the legalCopyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalResponseType }
     *     
     */
    public void setLegalCopyStatus(LegalResponseType value) {
        this.legalCopyStatus = value;
    }
}
