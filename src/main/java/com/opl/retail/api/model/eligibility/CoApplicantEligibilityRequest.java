package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoApplicantEligibilityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Double nmi;
	private Double gmi;
	private Double existingObligationOrg;
	private Double existingObligation;
	private Double existingObligationWithoutDesignator;
	private Double finalIncomeToConsiderBasedOnIncome = 0.0d;
	private Double availableIncome = 0.0d;
	private Double availableIncomeForNewLoan = 0.0d;
	private Double netTakeFinalIncomeToConsiderBasedOnIncome = 0.0d;
	private Double netTakeAvailableIncome = 0.0d;
	private Double netTakeAvailableIncomeForNewLoan = 0.0d;
	private Double finalIncomeToConsiderBasedOnIncomeMultiplier = 0.0d;
	private Double totalIncomeForNewLoanBasedOnIncomeMultiplier = 0.0d;
	private Double monthlyObligation = 0.0d;
	private Double incrementalItrVal = 0.0d;
	private Double manualFillSalary = 0.0d;
	private Double top5FundMedianAmt = 0.0d;
	private Double bsSalary = 0.0d;
	private Double monthlySalFromItr = 0.0d;
	private Double itrSalary = 0.0d;
	private Double grossMonthlyIncome = 0.0d;
	private Double grossMonthlyIncomeManually = 0.0d;
	private Double netMonthlyIncome = 0.0d;
	private Double requiredLoanAmount = 0.0d;
	private Boolean isConsiderIncome;
	private Boolean isConsiderForCalcBasedOnIncome;
	private Boolean isConsiderForCalcBasedOnIncomeMultiplier;
	private Boolean isConsiderForCalcBasedOnIncomeForNetTake;
	private String considerIncometext;
	private Double finalNmiMinimumConsider;
	private String incomeType;
	private Double grossMonthlyIncomeComputedBySystem;
	private Double minGmiConsider;
	private Boolean isEmiForEligibilityCalc;
	
	

	public CoApplicantEligibilityRequest() {
		super();
	}
	
	public Double getMinGmiConsider() {
		return minGmiConsider;
	}

	public void setMinGmiConsider(Double minGmiConsider) {
		this.minGmiConsider = minGmiConsider;
	}

	public Double getGrossMonthlyIncomeComputedBySystem() {
		return grossMonthlyIncomeComputedBySystem;
	}

	public void setGrossMonthlyIncomeComputedBySystem(Double grossMonthlyIncomeComputedBySystem) {
		this.grossMonthlyIncomeComputedBySystem = grossMonthlyIncomeComputedBySystem;
	}

	public Double getFinalNmiMinimumConsider() {
		return finalNmiMinimumConsider;
	}

	public void setFinalNmiMinimumConsider(Double finalNmiMinimumConsider) {
		this.finalNmiMinimumConsider = finalNmiMinimumConsider;
	}
	
	public CoApplicantEligibilityRequest(Long id) {
		this.id = id;
	}

	public Double getNmi() {
		return nmi;
	}

	public void setNmi(Double nmi) {
		this.nmi = nmi;
	}

	public Double getGmi() {
		return gmi;
	}

	public void setGmi(Double gmi) {
		this.gmi = gmi;
	}

	public Double getExistingObligation() {
		return existingObligation;
	}

	public void setExistingObligation(Double existingObligation) {
		this.existingObligation = existingObligation;
	}

	public Double getMonthlyObligation() {
		return monthlyObligation;
	}

	public void setMonthlyObligation(Double monthlyObligation) {
		this.monthlyObligation = monthlyObligation;
	}


	public Double getIncrementalItrVal() {
		return incrementalItrVal;
	}

	public void setIncrementalItrVal(Double incrementalItrVal) {
		this.incrementalItrVal = incrementalItrVal;
	}

	public Double getManualFillSalary() {
		return manualFillSalary;
	}

	public void setManualFillSalary(Double manualFillSalary) {
		this.manualFillSalary = manualFillSalary;
	}

	public Double getTop5FundMedianAmt() {
		return top5FundMedianAmt;
	}

	public void setTop5FundMedianAmt(Double top5FundMedianAmt) {
		this.top5FundMedianAmt = top5FundMedianAmt;
	}

	public Double getBsSalary() {
		return bsSalary;
	}

	public void setBsSalary(Double bsSalary) {
		this.bsSalary = bsSalary;
	}

	public Double getMonthlySalFromItr() {
		return monthlySalFromItr;
	}

	public void setMonthlySalFromItr(Double monthlySalFromItr) {
		this.monthlySalFromItr = monthlySalFromItr;
	}

	public Double getItrSalary() {
		return itrSalary;
	}

	public void setItrSalary(Double itrSalary) {
		this.itrSalary = itrSalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getGrossMonthlyIncome() {
		return grossMonthlyIncome;
	}

	public void setGrossMonthlyIncome(Double grossMonthlyIncome) {
		this.grossMonthlyIncome = grossMonthlyIncome;
	}

	public Double getNetMonthlyIncome() {
		return netMonthlyIncome;
	}

	public void setNetMonthlyIncome(Double netMonthlyIncome) {
		this.netMonthlyIncome = netMonthlyIncome;
	}

	public Double getFinalIncomeToConsiderBasedOnIncome() {
		return finalIncomeToConsiderBasedOnIncome;
	}

	public void setFinalIncomeToConsiderBasedOnIncome(Double finalIncomeToConsiderBasedOnIncome) {
		this.finalIncomeToConsiderBasedOnIncome = finalIncomeToConsiderBasedOnIncome;
	}

	public Double getAvailableIncome() {
		return availableIncome;
	}

	public void setAvailableIncome(Double availableIncome) {
		this.availableIncome = availableIncome;
	}

	public Double getAvailableIncomeForNewLoan() {
		return availableIncomeForNewLoan;
	}

	public void setAvailableIncomeForNewLoan(Double availableIncomeForNewLoan) {
		this.availableIncomeForNewLoan = availableIncomeForNewLoan;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public Double getFinalIncomeToConsiderBasedOnIncomeMultiplier() {
		return finalIncomeToConsiderBasedOnIncomeMultiplier;
	}

	public void setFinalIncomeToConsiderBasedOnIncomeMultiplier(Double finalIncomeToConsiderBasedOnIncomeMultiplier) {
		this.finalIncomeToConsiderBasedOnIncomeMultiplier = finalIncomeToConsiderBasedOnIncomeMultiplier;
	}

	public Double getTotalIncomeForNewLoanBasedOnIncomeMultiplier() {
		return totalIncomeForNewLoanBasedOnIncomeMultiplier;
	}

	public void setTotalIncomeForNewLoanBasedOnIncomeMultiplier(Double totalIncomeForNewLoanBasedOnIncomeMultiplier) {
		this.totalIncomeForNewLoanBasedOnIncomeMultiplier = totalIncomeForNewLoanBasedOnIncomeMultiplier;
	}

	public Double getRequiredLoanAmount() {
		return requiredLoanAmount;
	}

	public void setRequiredLoanAmount(Double requiredLoanAmount) {
		this.requiredLoanAmount = requiredLoanAmount;
	}

	public Boolean getIsConsiderIncome() {
		return isConsiderIncome;
	}

	public void setIsConsiderIncome(Boolean isConsiderIncome) {
		this.isConsiderIncome = isConsiderIncome;
	}

	public String getConsiderIncometext() {
		return considerIncometext;
	}

	public void setConsiderIncometext(String considerIncometext) {
		this.considerIncometext = considerIncometext;
	}

	public Double getNetTakeFinalIncomeToConsiderBasedOnIncome() {
		return netTakeFinalIncomeToConsiderBasedOnIncome;
	}

	public void setNetTakeFinalIncomeToConsiderBasedOnIncome(Double netTakeFinalIncomeToConsiderBasedOnIncome) {
		this.netTakeFinalIncomeToConsiderBasedOnIncome = netTakeFinalIncomeToConsiderBasedOnIncome;
	}

	public Double getNetTakeAvailableIncome() {
		return netTakeAvailableIncome;
	}

	public void setNetTakeAvailableIncome(Double netTakeAvailableIncome) {
		this.netTakeAvailableIncome = netTakeAvailableIncome;
	}

	public Double getNetTakeAvailableIncomeForNewLoan() {
		return netTakeAvailableIncomeForNewLoan;
	}

	public void setNetTakeAvailableIncomeForNewLoan(Double netTakeAvailableIncomeForNewLoan) {
		this.netTakeAvailableIncomeForNewLoan = netTakeAvailableIncomeForNewLoan;
	}

	public Double getGrossMonthlyIncomeManually() {
		return grossMonthlyIncomeManually;
	}

	public void setGrossMonthlyIncomeManually(Double grossMonthlyIncomeManually) {
		this.grossMonthlyIncomeManually = grossMonthlyIncomeManually;
	}

	public Boolean getIsConsiderForCalcBasedOnIncome() {
		return isConsiderForCalcBasedOnIncome;
	}

	public void setIsConsiderForCalcBasedOnIncome(Boolean isConsiderAsMax) {
		this.isConsiderForCalcBasedOnIncome = isConsiderAsMax;
	}

	public Boolean getIsConsiderForCalcBasedOnIncomeForNetTake() {
		return isConsiderForCalcBasedOnIncomeForNetTake;
	}

	public void setIsConsiderForCalcBasedOnIncomeForNetTake(Boolean isConsiderForCalculationForNetTake) {
		this.isConsiderForCalcBasedOnIncomeForNetTake = isConsiderForCalculationForNetTake;
	}

	public Boolean getIsConsiderForCalcBasedOnIncomeMultiplier() {
		return isConsiderForCalcBasedOnIncomeMultiplier;
	}

	public void setIsConsiderForCalcBasedOnIncomeMultiplier(Boolean isConsiderForCalcBasedOnIncomeMultiplier) {
		this.isConsiderForCalcBasedOnIncomeMultiplier = isConsiderForCalcBasedOnIncomeMultiplier;
	}

	public Double getExistingObligationWithoutDesignator() {
		return existingObligationWithoutDesignator;
	}

	public void setExistingObligationWithoutDesignator(Double existingObligationWithoutDesignator) {
		this.existingObligationWithoutDesignator = existingObligationWithoutDesignator;
	}

	public Boolean getIsEmiForEligibilityCalc() {
		return isEmiForEligibilityCalc;
	}

	public void setIsEmiForEligibilityCalc(Boolean isEmiForEligibilityCalc) {
		this.isEmiForEligibilityCalc = isEmiForEligibilityCalc;
	}

	public Double getExistingObligationOrg() {
		return existingObligationOrg;
	}

	public void setExistingObligationOrg(Double existingObligationOrg) {
		this.existingObligationOrg = existingObligationOrg;
	}

	
}
