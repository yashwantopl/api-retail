package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author rahul.meena
 *
 */
/**
 * @author rahul.meena
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class OnePageEligibilityResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	// FOR ONE PAGER ELIGIBILITY
	private Long applicationId;
	private Long fpProductMappingId;
	private Double projectedSales;
	private Double projectedSalesFs;
	private Double workingCapitalRequirement;
	private Double workingCapitalLimit;
	private Double existingLimits;
	private Double netEligibleBankFinance;
	private Double promoterContribution;
	private Double growthFp;
	private Double grossSalesItr;
	private Double eligibleBankFinance;
	private Double proposedLoanAmount;
	private Double loanAmountLowerOf;
	private Double maxLoanAmountProvidedBank;
	private Double finalLoanAmountNew;
	private Double grossSales;
	private Double fpMaxInvestSize;
	private Double eligibleLoanAmount;
	private Double result;
	private Double emi;
	private Long fpAssessmentId;
	
	


	public Double getProjectedSales() {
		return projectedSales;
	}

	public void setProjectedSales(Double projectedSales) {
		this.projectedSales = projectedSales;
	}

	public Double getWorkingCapitalRequirement() {
		return workingCapitalRequirement;
	}

	public void setWorkingCapitalRequirement(Double workingCapitalRequirement) {
		this.workingCapitalRequirement = workingCapitalRequirement;
	}

	public Double getWorkingCapitalLimit() {
		return workingCapitalLimit;
	}

	public void setWorkingCapitalLimit(Double workingCapitalLimit) {
		this.workingCapitalLimit = workingCapitalLimit;
	}

	public Double getExistingLimits() {
		return existingLimits;
	}

	public void setExistingLimits(Double existingLimits) {
		this.existingLimits = existingLimits;
	}

	public Double getNetEligibleBankFinance() {
		return netEligibleBankFinance;
	}

	public void setNetEligibleBankFinance(Double netEligibleBankFinance) {
		this.netEligibleBankFinance = netEligibleBankFinance;
	}

	public Double getProposedLoanAmount() {
		return proposedLoanAmount;
	}

	public void setProposedLoanAmount(Double proposedLoanAmount) {
		this.proposedLoanAmount = proposedLoanAmount;
	}

	public Double getLoanAmountLowerOf() {
		return loanAmountLowerOf;
	}

	public void setLoanAmountLowerOf(Double loanAmountLowerOf) {
		this.loanAmountLowerOf = loanAmountLowerOf;
	}

	public Double getMaxLoanAmountProvidedBank() {
		return maxLoanAmountProvidedBank;
	}

	public void setMaxLoanAmountProvidedBank(Double maxLoanAmountProvidedBank) {
		this.maxLoanAmountProvidedBank = maxLoanAmountProvidedBank;
	}

	public Double getFinalLoanAmountNew() {
		return finalLoanAmountNew;
	}

	public void setFinalLoanAmountNew(Double finalLoanAmountNew) {
		this.finalLoanAmountNew = finalLoanAmountNew;
	}

	/**
	 * @return
	 */
	public Double getEligibleLoanAmount() {
		return eligibleLoanAmount;
		
	}

	public void setEligibleLoanAmount(Double eligibleLoanAmount) {
		this.eligibleLoanAmount = eligibleLoanAmount;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Long getFpAssessmentId() {
		return fpAssessmentId;
	}

	public void setFpAssessmentId(Long fpAssessmentId) {
		this.fpAssessmentId = fpAssessmentId;
	}

	public Double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(Double grossSales) {
		this.grossSales = grossSales;
	}

	public Double getEligibleBankFinance() {
		return eligibleBankFinance;
	}

	public void setEligibleBankFinance(Double eligibleBankFinance) {
		this.eligibleBankFinance = eligibleBankFinance;
	}
	

	public Double getProjectedSalesFs() {
		return projectedSalesFs;
	}

	public void setProjectedSalesFs(Double projectedSalesFs) {
		this.projectedSalesFs = projectedSalesFs;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getFpProductMappingId() {
		return fpProductMappingId;
	}

	public void setFpProductMappingId(Long fpProductMappingId) {
		this.fpProductMappingId = fpProductMappingId;
	}

	public Double getPromoterContribution() {
		return promoterContribution;
	}

	public void setPromoterContribution(Double promoterContribution) {
		this.promoterContribution = promoterContribution;
	}

	public Double getGrowthFp() {
		return growthFp;
	}

	public void setGrowthFp(Double growthFp) {
		this.growthFp = growthFp;
	}

	public Double getGrossSalesItr() {
		return grossSalesItr;
	}

	public void setGrossSalesItr(Double grossSalesItr) {
		this.grossSalesItr = grossSalesItr;
	}

	public Double getFpMaxInvestSize() {
		return fpMaxInvestSize;
	}

	public void setFpMaxInvestSize(Double fpMaxInvestSize) {
		this.fpMaxInvestSize = fpMaxInvestSize;
	}

	@Override
	public String toString() {
		return "OnePageEligibilityResponse [applicationId=" + applicationId + ", fpProductMappingId="
				+ fpProductMappingId + ", projectedSales=" + projectedSales + ", projectedSalesFs=" + projectedSalesFs
				+ ", workingCapitalRequirement=" + workingCapitalRequirement + ", workingCapitalLimit="
				+ workingCapitalLimit + ", existingLimits=" + existingLimits + ", netEligibleBankFinance="
				+ netEligibleBankFinance + ", promoterContribution=" + promoterContribution + ", growthFp=" + growthFp
				+ ", grossSalesItr=" + grossSalesItr + ", eligibleBankFinance=" + eligibleBankFinance
				+ ", proposedLoanAmount=" + proposedLoanAmount + ", loanAmountLowerOf=" + loanAmountLowerOf
				+ ", maxLoanAmountProvidedBank=" + maxLoanAmountProvidedBank + ", finalLoanAmountNew="
				+ finalLoanAmountNew + ", grossSales=" + grossSales + ", fpMaxInvestSize=" + fpMaxInvestSize
				+ ", eligibleLoanAmount=" + eligibleLoanAmount + ", result=" + result + ", emi=" + emi
				+ ", fpAssessmentId=" + fpAssessmentId + "]";
	}
}