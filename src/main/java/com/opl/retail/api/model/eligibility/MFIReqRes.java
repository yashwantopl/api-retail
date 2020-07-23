package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author rahul.meena
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFIReqRes extends MFIRequest implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long applicationId;
	private Long fpProductMapId;

	private Double incomeFromOccupation;
	private Double existingBussnessAndFamilyExpenses;
	private Double netSavings;
	private Double expectedIncreaseInIncomeLoan;
	private Double totalCashFlow;
	
	private Double emiCapacity;
	private Double weeeklyEmiCapacity;
	private Double forthNightlyEMiCapacity;
	private String instalmentRecommendedProposedLoan;
	
	private Boolean isMonthlyEmi;
	private Boolean isWeeklyEmi;
	private Boolean isFortNightlyEmi;
	private Integer rePaymentFrequencyType;
	private Double cibilExistingLimit;
	
	private Double rateOfInterest;
	private Integer tenure;
	private Double loanAmountRecomendation;
	private Double margin;
	private Double loanAmountBasedOnIncome;
	private Double finalLoanAmountLowerOf;
	private Double emiFinalLoanAmount;
	private Double finalActualEmi;
	private Double perLakhEmi;
	private Double finalLoanAmountToBeConsider;
	
	public Double getCibilExistingLimit() {
		return cibilExistingLimit;
	}
	public void setCibilExistingLimit(Double cibilExistingLimit) {
		this.cibilExistingLimit = cibilExistingLimit;
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public Long getFpProductMapId() {
		return fpProductMapId;
	}
	public void setFpProductMapId(Long fpProductMapId) {
		this.fpProductMapId = fpProductMapId;
	}
	public Double getPerLakhEmi() {
		return perLakhEmi;
	}
	public void setPerLakhEmi(Double perLakhEmi) {
		this.perLakhEmi = perLakhEmi;
	}
	public Double getFinalLoanAmountToBeConsider() {
		return finalLoanAmountToBeConsider;
	}
	public void setFinalLoanAmountToBeConsider(Double finalLoanAmountToBeConsider) {
		this.finalLoanAmountToBeConsider = finalLoanAmountToBeConsider;
	}
	public Double getFinalActualEmi() {
		return finalActualEmi;
	}
	public void setFinalActualEmi(Double finalActualEmi) {
		this.finalActualEmi = finalActualEmi;
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
	public Double getLoanAmountRecomendation() {
		return loanAmountRecomendation;
	}
	public void setLoanAmountRecomendation(Double loanAmountRecomendation) {
		this.loanAmountRecomendation = loanAmountRecomendation;
	}
	public Double getMargin() {
		return margin;
	}
	public void setMargin(Double margin) {
		this.margin = margin;
	}
	public Double getLoanAmountBasedOnIncome() {
		return loanAmountBasedOnIncome;
	}
	public void setLoanAmountBasedOnIncome(Double loanAmountBasedOnIncome) {
		this.loanAmountBasedOnIncome = loanAmountBasedOnIncome;
	}
	public Double getFinalLoanAmountLowerOf() {
		return finalLoanAmountLowerOf;
	}
	public void setFinalLoanAmountLowerOf(Double finalLoanAmountLowerOf) {
		this.finalLoanAmountLowerOf = finalLoanAmountLowerOf;
	}
	public Double getEmiFinalLoanAmount() {
		return emiFinalLoanAmount;
	}
	public void setEmiFinalLoanAmount(Double emiFinalLoanAmount) {
		this.emiFinalLoanAmount = emiFinalLoanAmount;
	}
	public Integer getRePaymentFrequencyType() {
		return rePaymentFrequencyType;
	}
	public void setRePaymentFrequencyType(Integer rePaymentFrequencyType) {
		this.rePaymentFrequencyType = rePaymentFrequencyType;
	}
	public Boolean getIsMonthlyEmi() {
		return isMonthlyEmi;
	}
	public void setIsMonthlyEmi(Boolean isMonthlyEmi) {
		this.isMonthlyEmi = isMonthlyEmi;
	}
	public Boolean getIsWeeklyEmi() {
		return isWeeklyEmi;
	}
	public void setIsWeeklyEmi(Boolean isWeeklyEmi) {
		this.isWeeklyEmi = isWeeklyEmi;
	}
	public Boolean getIsFortNightlyEmi() {
		return isFortNightlyEmi;
	}
	public void setIsFortNightlyEmi(Boolean isFortNightlyEmi) {
		this.isFortNightlyEmi = isFortNightlyEmi;
	}
	/**
	 * @return the forthNightlyEMiCapacity
	 */
	public Double getForthNightlyEMiCapacity() {
		return forthNightlyEMiCapacity;
	}
	/**
	 * @param forthNightlyEMiCapacity the forthNightlyEMiCapacity to set
	 */
	public void setForthNightlyEMiCapacity(Double forthNightlyEMiCapacity) {
		this.forthNightlyEMiCapacity = forthNightlyEMiCapacity;
	}
	/**
	 * @return the incomeFromOccupation
	 */
	public Double getIncomeFromOccupation() {
		return incomeFromOccupation;
	}
	/**
	 * @return the existingBussnessAndFamilyExpenses
	 */
	public Double getExistingBussnessAndFamilyExpenses() {
		return existingBussnessAndFamilyExpenses;
	}
	/**
	 * @return the netSavings
	 */
	public Double getNetSavings() {
		return netSavings;
	}
	/**
	 * @return the expectedIncreaseInIncomeLoan
	 */
	public Double getExpectedIncreaseInIncomeLoan() {
		return expectedIncreaseInIncomeLoan;
	}
	/**
	 * @return the totalCashFlow
	 */
	public Double getTotalCashFlow() {
		return totalCashFlow;
	}
	/**
	 * @return the emiCapacity
	 */
	public Double getEmiCapacity() {
		return emiCapacity;
	}
	/**
	 * @return the weeeklyEmiCapacity
	 */
	public Double getWeeeklyEmiCapacity() {
		return weeeklyEmiCapacity;
	}
	/**
	 * @param incomeFromOccupation the incomeFromOccupation to set
	 */
	public void setIncomeFromOccupation(Double incomeFromOccupation) {
		this.incomeFromOccupation = incomeFromOccupation;
	}
	/**
	 * @param existingBussnessAndFamilyExpenses the existingBussnessAndFamilyExpenses to set
	 */
	public void setExistingBussnessAndFamilyExpenses(Double existingBussnessAndFamilyExpenses) {
		this.existingBussnessAndFamilyExpenses = existingBussnessAndFamilyExpenses;
	}
	/**
	 * @param netSavings the netSavings to set
	 */
	public void setNetSavings(Double netSavings) {
		this.netSavings = netSavings;
	}
	/**
	 * @param expectedIncreaseInIncomeLoan the expectedIncreaseInIncomeLoan to set
	 */
	public void setExpectedIncreaseInIncomeLoan(Double expectedIncreaseInIncomeLoan) {
		this.expectedIncreaseInIncomeLoan = expectedIncreaseInIncomeLoan;
	}
	/**
	 * @param totalCashFlow the totalCashFlow to set
	 */
	public void setTotalCashFlow(Double totalCashFlow) {
		this.totalCashFlow = totalCashFlow;
	}
	/**
	 * @param emiCapacity the emiCapacity to set
	 */
	public void setEmiCapacity(Double emiCapacity) {
		this.emiCapacity = emiCapacity;
	}
	/**
	 * @param weeeklyEmiCapacity the weeeklyEmiCapacity to set
	 */
	public void setWeeeklyEmiCapacity(Double weeeklyEmiCapacity) {
		this.weeeklyEmiCapacity = weeeklyEmiCapacity;
	}
	/**
	 *
	 */
	
	/**
	 * @return the instalmentRecommendedProposedLoan
	 */
	public String getInstalmentRecommendedProposedLoan() {
		return instalmentRecommendedProposedLoan;
	}
	/**
	 * @param instalmentRecommendedProposedLoan the instalmentRecommendedProposedLoan to set
	 */
	public void setInstalmentRecommendedProposedLoan(String instalmentRecommendedProposedLoan) {
		this.instalmentRecommendedProposedLoan = instalmentRecommendedProposedLoan;
	}
	/* (non-Javadoc)
	 * @see com.capitaworld.api.eligibility.model.MFIRequest#toString()
	 */
	@Override
	public String toString() {
		return "MFIReqRes [applicationId=" + applicationId + ", fpProductMapId=" + fpProductMapId
				+ ", incomeFromOccupation=" + incomeFromOccupation + ", existingBussnessAndFamilyExpenses="
				+ existingBussnessAndFamilyExpenses + ", netSavings=" + netSavings + ", expectedIncreaseInIncomeLoan="
				+ expectedIncreaseInIncomeLoan + ", totalCashFlow=" + totalCashFlow + ", emiCapacity=" + emiCapacity
				+ ", weeeklyEmiCapacity=" + weeeklyEmiCapacity + ", forthNightlyEMiCapacity=" + forthNightlyEMiCapacity
				+ ", instalmentRecommendedProposedLoan=" + instalmentRecommendedProposedLoan + ", isMonthlyEmi="
				+ isMonthlyEmi + ", isWeeklyEmi=" + isWeeklyEmi + ", isFortNightlyEmi=" + isFortNightlyEmi
				+ ", rePaymentFrequencyType=" + rePaymentFrequencyType + ", cibilExistingLimit=" + cibilExistingLimit
				+ ", rateOfInterest=" + rateOfInterest + ", tenure=" + tenure + ", loanAmountRecomendation="
				+ loanAmountRecomendation + ", margin=" + margin + ", loanAmountBasedOnIncome="
				+ loanAmountBasedOnIncome + ", finalLoanAmountLowerOf=" + finalLoanAmountLowerOf
				+ ", emiFinalLoanAmount=" + emiFinalLoanAmount + ", finalActualEmi=" + finalActualEmi + ", perLakhEmi="
				+ perLakhEmi + ", finalLoanAmountToBeConsider=" + finalLoanAmountToBeConsider + "]";
	}
}
