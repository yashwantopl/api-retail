package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PLEligibilityRequest extends EligibililityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer constitution;
	private Integer receiptMode;
	private Integer employmentType;

	public PLEligibilityRequest() {
		super();
	}

	public Integer getConstitution() {
		return constitution;
	}

	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}

	public Integer getReceiptMode() {
		return receiptMode;
	}

	public void setReceiptMode(Integer receiptMode) {
		this.receiptMode = receiptMode;
	}

	public Integer getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(Integer employmentType) {
		this.employmentType = employmentType;
	}

	@Override
	public String toString() {
		return "PLEligibilityRequest [constitution=" + constitution + ", receiptMode=" + receiptMode
				+ ", employmentType=" + employmentType + "]";
	}
	
	

}
