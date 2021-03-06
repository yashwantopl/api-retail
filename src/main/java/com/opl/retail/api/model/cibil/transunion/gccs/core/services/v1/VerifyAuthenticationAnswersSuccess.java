
package com.opl.retail.api.model.cibil.transunion.gccs.core.services.v1;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IVStatus" type="{com/transunion/gccs/core/services/v1}IVStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ivStatus" })
@XmlRootElement(name = "VerifyAuthenticationAnswersSuccess")
public class VerifyAuthenticationAnswersSuccess {

	@XmlElement(name = "IVStatus", required = true)
	@XmlSchemaType(name = "string")
	protected IVStatusEnum ivStatus;

	/**
	 * Gets the value of the ivStatus property.
	 * 
	 * @return possible object is {@link IVStatusEnum }
	 * 
	 */
	public IVStatusEnum getIVStatus() {
		return ivStatus;
	}

	/**
	 * Sets the value of the ivStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link IVStatusEnum }
	 * 
	 */
	public void setIVStatus(IVStatusEnum value) {
		this.ivStatus = value;
	}

	@Override
	public String toString() {
		return "VerifyAuthenticationAnswersSuccess [ivStatus=" + (ivStatus != null ? ivStatus.toString() : null) + "]";
	}

}
