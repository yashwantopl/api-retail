package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

/**
 * @author rahul.meena
 *
 */
public class MFIRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3194874355152150859L;
	
	private Long applicationId;
	private Long productId;
	private Long userId;
	private Long fpProductMappingId;
	
	private Double eligibleAmount;
	private Double emi;
	
	// FOR REQUEST  MFI APPLICANT DATA 
	private Double incomeFromOccupationBussness;
	private Double existingBussnessAndFamilyExpenses;
	private Double netSaving;
	private Double expectedIncreaseInIncomeLoan;
	private Integer rePaymentFrequencyType;
	
	private Integer tenure;
	private Double loanAmount;
	private Double rateOfInterest;
	private Double margin;
	private Double cibilExistingLimit;
	
	
	public Double getCibilExistingLimit() {
		return cibilExistingLimit;
	}
	public void setCibilExistingLimit(Double cibilExistingLimit) {
		this.cibilExistingLimit = cibilExistingLimit;
	}
	public Double getNetSaving() {
		return netSaving;
	}
	public void setNetSaving(Double netSaving) {
		this.netSaving = netSaving;
	}
	public Double getMargin() {
		return margin;
	}
	public void setMargin(Double margin) {
		this.margin = margin;
	}
	public Double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getExpectedIncreaseInIncomeLoan() {
		return expectedIncreaseInIncomeLoan;
	}
	public void setExpectedIncreaseInIncomeLoan(Double expectedIncreaseInIncomeLoan) {
		this.expectedIncreaseInIncomeLoan = expectedIncreaseInIncomeLoan;
	}
	public Double getIncomeFromOccupationBussness() {
		return incomeFromOccupationBussness;
	}
	public void setIncomeFromOccupationBussness(Double incomeFromOccupationBussness) {
		this.incomeFromOccupationBussness = incomeFromOccupationBussness;
	}
	public Double getExistingBussnessAndFamilyExpenses() {
		return existingBussnessAndFamilyExpenses;
	}
	public void setExistingBussnessAndFamilyExpenses(Double existingBussnessAndFamilyExpenses) {
		this.existingBussnessAndFamilyExpenses = existingBussnessAndFamilyExpenses;
	}
	
	public Integer getRePaymentFrequencyType() {
		return rePaymentFrequencyType;
	}
	public void setRePaymentFrequencyType(Integer rePaymentFrequencyType) {
		this.rePaymentFrequencyType = rePaymentFrequencyType;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFpProductMappingId() {
		return fpProductMappingId;
	}
	public void setFpProductMappingId(Long fpProductMappingId) {
		this.fpProductMappingId = fpProductMappingId;
	}
	public Double getEligibleAmount() {
		return eligibleAmount;
	}
	public void setEligibleAmount(Double eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MFIRequest [applicationId=" + applicationId + ", productId=" + productId + ", userId=" + userId
				+ ", fpProductMappingId=" + fpProductMappingId + ", eligibleAmount=" + eligibleAmount + ", emi=" + emi
				+ ", incomeFromOccupationBussness=" + incomeFromOccupationBussness
				+ ", existingBussnessAndFamilyExpenses=" + existingBussnessAndFamilyExpenses + ", netSaving="
				+ netSaving + ", expectedIncreaseInIncomeLoan=" + expectedIncreaseInIncomeLoan
				+ ", rePaymentFrequencyType=" + rePaymentFrequencyType + ", tenure=" + tenure + ", loanAmount="
				+ loanAmount + ", rateOfInterest=" + rateOfInterest + ", margin=" + margin + ", cibilExistingLimit="
				+ cibilExistingLimit + "]";
	}
}
