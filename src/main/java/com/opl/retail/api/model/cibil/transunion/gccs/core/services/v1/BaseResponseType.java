
package com.opl.retail.api.model.cibil.transunion.gccs.core.services.v1;

import com.opl.retail.api.model.cibil.truelink.schema.database.tcps.enumerations.ResponseStatusType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ResponseStatus" type="{com/truelink/schema/database/tcps/enumerations}ResponseStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseType")
@XmlSeeAlso({
    VerifyAuthenticationAnswersResponse.class,
    GetCustomerAssetsResponse.class,
    FulfillOfferResponse.class,
    UpdateCustomerIVStatusResponse.class,
    PingResponse.class,
    GetAuthenticationQuestionsResponse.class
})
public class BaseResponseType {

    @XmlAttribute(name = "ResponseStatus")
    protected ResponseStatusType responseStatus;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

	@Override
	public String toString() {
		return "BaseResponseType [responseStatus=" + responseStatus + "]";
	}

    
}
