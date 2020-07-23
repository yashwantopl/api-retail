package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HlEmiForUbiRequest  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double loanAmount;
	private Double interestRate;
	private Long 	months;
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public Long getMonths() {
		return months;
	}
	public void setMonths(Long months) {
		this.months = months;
	} 

	

}
