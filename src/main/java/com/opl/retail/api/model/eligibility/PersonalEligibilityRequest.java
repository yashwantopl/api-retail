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
public class PersonalEligibilityRequest extends EligibililityRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double foir;
	
	private Double foirInRS;
	private Integer foirScallingSelectionType;
	private Double takeHomeBasedFoirFirst ;
	private Double  finaltakeHomePayConsidered;
	private String foirScallingSelectionTypeText;
	private String incomeConsiderType;
	
	
	
	
	
	private Double monthlyLoanObligation;
	private Double monthlyLoanObligationWithoutDesignator;
	private Double rateOfInterest;
	private Integer tenure;

	private Double eligibleLoanAmount;
	private Double proposedLoanAmount;
	private Double maxLoanAmountProvidedBank;
	private Double finalLoanAmountNew;
	private Double perLakhEmi;
	private Double margin;

	private Double averageIncomeLastSixMonths;
	private Double averageMonthlyWithDrawal;
	private Double availableIncomeNewLoan;

	private Double averagePerMonthInvestMents;
	private Double availableIncomeNewLoanMonthly;
	private Double eligibleMonthlyEmi;

	// FINAL RESULT FOR NTB STORE THIS VARIABLE
	private Double result;
	private Double emi;

	// CIBIL CHANGES
	private Double netWorkingLimit;
	private Double existingLimits;

	// DISPLAY THIS DATA IN TEASER AND CAM
	private Double topAmount;
	private Double itrSalary;
	private Double oneFormSalary;
	private Double bankStatementSalary;
	private Double itrResult;

	// PERSONAL LOAN
	private Double eligibleEmi;
	private Double newLoanEmi;
	private Double finalEmiAndNMI;
	private Double finalNetMonthlyIncome;
	private Double lastSixMonthsMedianValue;
	private Double loanAmountRequired;
	private Double itrIncomeCurrentYear;
	private Double itrIncomeActualValue;
	private Double monthlySalFromItr;
	private Double grossMonthlyIncomeManually;
	private Double finalNetMonthlyIncomeToBeConsider;
	private Double finalGrossMonthlyIncomeToBeConsider;
	private Double finalGMIMinimum;
	private Double finalNmiMinimumConsider;
	private Double grossMonthlyIncomeComputedBySystem;
	
	// FOR PL RELATED THIRD PARAMETER
	private Boolean isBasedOnEmiAndNmiType;


	// DISPLAY IN TEASER VIEW===== LOAN TYPE PL
	private String loanType;
	private Double finalGrossMonthlyIncome;
	
	
	private Double eligibileLoanAmountBasedOnNmi;
	private Double eligibileLoanAmountBasedOnGmi;
	
	private Double eligibleLoanAmountBasedOnEmi;
	private Double emiExistingAndProposedObligation;
	private Double emiAndNmiSetByLender;
	private Double monthsSetByLenderForNmi;
	private Double monthsSetByLenderForGmi;
	
    private Double resultAfterMinusExistingEmi;	
	private Double eligibleLoanAmountBasedOnEmiAndNmi;
	private Double finalEmiProposedObligation;
	private Double finalEmiExistingObligationAndProposedObligation;

	// for New Product Purpose
	protected Long fpAssessmentEquipment;
	
	private Boolean isSelfDeclareSalary;


	
	
	/**
	 * @return the incomeConsiderType
	 */
	public String getIncomeConsiderType() {
		return incomeConsiderType;
	}
	/**
	 * @param incomeConsiderType the incomeConsiderType to set
	 */
	public void setIncomeConsiderType(String incomeConsiderType) {
		this.incomeConsiderType = incomeConsiderType;
	}
	/**
	 * @return the foirScallingSelectionTypeText
	 */
	public String getFoirScallingSelectionTypeText() {
		return foirScallingSelectionTypeText;
	}
	/**
	 * @param foirScallingSelectionTypeText the foirScallingSelectionTypeText to set
	 */
	public void setFoirScallingSelectionTypeText(String foirScallingSelectionTypeText) {
		this.foirScallingSelectionTypeText = foirScallingSelectionTypeText;
	}
	/**
	 * @return the takeHomeBasedFoirFirst
	 */
	public Double getTakeHomeBasedFoirFirst() {
		return takeHomeBasedFoirFirst;
	}
	/**
	 * @return the finaltakeHomePayConsidered
	 */
	public Double getFinaltakeHomePayConsidered() {
		return finaltakeHomePayConsidered;
	}
	/**
	 * @param takeHomeBasedFoirFirst the takeHomeBasedFoirFirst to set
	 */
	public void setTakeHomeBasedFoirFirst(Double takeHomeBasedFoirFirst) {
		this.takeHomeBasedFoirFirst = takeHomeBasedFoirFirst;
	}
	/**
	 * @param finaltakeHomePayConsidered the finaltakeHomePayConsidered to set
	 */
	public void setFinaltakeHomePayConsidered(Double finaltakeHomePayConsidered) {
		this.finaltakeHomePayConsidered = finaltakeHomePayConsidered;
	}
	/**
	 * @return the foirInRS
	 */
	public Double getFoirInRS() {
		return foirInRS;
	}
	/**
	 * @return the foirScallingSelectionType
	 */
	public Integer getFoirScallingSelectionType() {
		return foirScallingSelectionType;
	}
	/**
	 * @param foirInRS the foirInRS to set
	 */
	public void setFoirInRS(Double foirInRS) {
		this.foirInRS = foirInRS;
	}
	/**
	 * @param foirScallingSelectionType the foirScallingSelectionType to set
	 */
	public void setFoirScallingSelectionType(Integer foirScallingSelectionType) {
		this.foirScallingSelectionType = foirScallingSelectionType;
	}
	public Long getFpAssessmentEquipment() {
		return fpAssessmentEquipment;
	}
	public void setFpAssessmentEquipment(Long fpAssessmentEquipment) {
		this.fpAssessmentEquipment = fpAssessmentEquipment;
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

	public Double getFinalGMIMinimum() {
		return finalGMIMinimum;
	}

	public void setFinalGMIMinimum(Double finalGMIMinimum) {
		this.finalGMIMinimum = finalGMIMinimum;
	}

	public Double getFinalGrossMonthlyIncomeToBeConsider() {
		return finalGrossMonthlyIncomeToBeConsider;
	}

	public void setFinalGrossMonthlyIncomeToBeConsider(Double finalGrossMonthlyIncomeToBeConsider) {
		this.finalGrossMonthlyIncomeToBeConsider = finalGrossMonthlyIncomeToBeConsider;
	}

	public Double getFinalNetMonthlyIncomeToBeConsider() {
		return finalNetMonthlyIncomeToBeConsider;
	}

	public void setFinalNetMonthlyIncomeToBeConsider(Double finalNetMonthlyIncomeToBeConsider) {
		this.finalNetMonthlyIncomeToBeConsider = finalNetMonthlyIncomeToBeConsider;
	}

	public Boolean getIsBasedOnEmiAndNmiType() {
		return isBasedOnEmiAndNmiType;
	}

	public void setIsBasedOnEmiAndNmiType(Boolean isBasedOnEmiAndNmiType) {
		this.isBasedOnEmiAndNmiType = isBasedOnEmiAndNmiType;
	}

	public Double getMonthsSetByLenderForGmi() {
		return monthsSetByLenderForGmi;
	}

	public void setMonthsSetByLenderForGmi(Double monthsSetByLenderForGmi) {
		this.monthsSetByLenderForGmi = monthsSetByLenderForGmi;
	}

	public Double getEligibileLoanAmountBasedOnNmi() {
		return eligibileLoanAmountBasedOnNmi;
	}

	public void setEligibileLoanAmountBasedOnNmi(Double eligibileLoanAmountBasedOnNmi) {
		this.eligibileLoanAmountBasedOnNmi = eligibileLoanAmountBasedOnNmi;
	}

	public Double getEligibileLoanAmountBasedOnGmi() {
		return eligibileLoanAmountBasedOnGmi;
	}

	public void setEligibileLoanAmountBasedOnGmi(Double eligibileLoanAmountBasedOnGmi) {
		this.eligibileLoanAmountBasedOnGmi = eligibileLoanAmountBasedOnGmi;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Double getMonthlyLoanObligation() {
		return monthlyLoanObligation;
	}

	public void setMonthlyLoanObligation(Double monthlyLoanObligation) {
		this.monthlyLoanObligation = monthlyLoanObligation;
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

	public Double getEligibleLoanAmount() {
		return eligibleLoanAmount;
	}

	public void setEligibleLoanAmount(Double eligibleLoanAmount) {
		this.eligibleLoanAmount = eligibleLoanAmount;
	}

	public Double getProposedLoanAmount() {
		return proposedLoanAmount;
	}

	public void setProposedLoanAmount(Double proposedLoanAmount) {
		this.proposedLoanAmount = proposedLoanAmount;
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

	public Double getPerLakhEmi() {
		return perLakhEmi;
	}

	public void setPerLakhEmi(Double perLakhEmi) {
		this.perLakhEmi = perLakhEmi;
	}

	public Double getMargin() {
		return margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
	}

	public Double getAverageIncomeLastSixMonths() {
		return averageIncomeLastSixMonths;
	}

	public void setAverageIncomeLastSixMonths(Double averageIncomeLastSixMonths) {
		this.averageIncomeLastSixMonths = averageIncomeLastSixMonths;
	}

	public Double getAverageMonthlyWithDrawal() {
		return averageMonthlyWithDrawal;
	}

	public void setAverageMonthlyWithDrawal(Double averageMonthlyWithDrawal) {
		this.averageMonthlyWithDrawal = averageMonthlyWithDrawal;
	}

	public Double getAvailableIncomeNewLoan() {
		return availableIncomeNewLoan;
	}

	public void setAvailableIncomeNewLoan(Double availableIncomeNewLoan) {
		this.availableIncomeNewLoan = availableIncomeNewLoan;
	}

	public Double getAveragePerMonthInvestMents() {
		return averagePerMonthInvestMents;
	}

	public void setAveragePerMonthInvestMents(Double averagePerMonthInvestMents) {
		this.averagePerMonthInvestMents = averagePerMonthInvestMents;
	}

	public Double getAvailableIncomeNewLoanMonthly() {
		return availableIncomeNewLoanMonthly;
	}

	public void setAvailableIncomeNewLoanMonthly(Double availableIncomeNewLoanMonthly) {
		this.availableIncomeNewLoanMonthly = availableIncomeNewLoanMonthly;
	}

	public Double getEligibleMonthlyEmi() {
		return eligibleMonthlyEmi;
	}

	public void setEligibleMonthlyEmi(Double eligibleMonthlyEmi) {
		this.eligibleMonthlyEmi = eligibleMonthlyEmi;
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

	public Double getNetWorkingLimit() {
		return netWorkingLimit;
	}

	public void setNetWorkingLimit(Double netWorkingLimit) {
		this.netWorkingLimit = netWorkingLimit;
	}

	public Double getExistingLimits() {
		return existingLimits;
	}

	public void setExistingLimits(Double existingLimits) {
		this.existingLimits = existingLimits;
	}

	public Double getTopAmount() {
		return topAmount;
	}

	public void setTopAmount(Double topAmount) {
		this.topAmount = topAmount;
	}

	public Double getItrSalary() {
		return itrSalary;
	}

	public void setItrSalary(Double itrSalary) {
		this.itrSalary = itrSalary;
	}

	public Double getOneFormSalary() {
		return oneFormSalary;
	}

	public void setOneFormSalary(Double oneFormSalary) {
		this.oneFormSalary = oneFormSalary;
	}

	public Double getBankStatementSalary() {
		return bankStatementSalary;
	}

	public void setBankStatementSalary(Double bankStatementSalary) {
		this.bankStatementSalary = bankStatementSalary;
	}

	public Double getItrResult() {
		return itrResult;
	}

	public void setItrResult(Double itrResult) {
		this.itrResult = itrResult;
	}

	public Double getEligibleEmi() {
		return eligibleEmi;
	}

	public void setEligibleEmi(Double eligibleEmi) {
		this.eligibleEmi = eligibleEmi;
	}

	public Double getNewLoanEmi() {
		return newLoanEmi;
	}

	public void setNewLoanEmi(Double newLoanEmi) {
		this.newLoanEmi = newLoanEmi;
	}


	/**
	 * @return
	 */
	public Double getFinalEmiAndNMI() {
		return finalEmiAndNMI;
	}

	/**
	 * @param finalEmiAndNMI
	 */
	public void setFinalEmiAndNMI(Double finalEmiAndNMI) {
		this.finalEmiAndNMI = finalEmiAndNMI;
	}

	/**
	 * @return
	 */
	public Double getFinalNetMonthlyIncome() {
		return finalNetMonthlyIncome;
	}

	/**
	 * @param finalNetMonthlyIncome
	 */
	public void setFinalNetMonthlyIncome(Double finalNetMonthlyIncome) {
		this.finalNetMonthlyIncome = finalNetMonthlyIncome;
	}

	/**
	 * @return
	 */
	public Double getLastSixMonthsMedianValue() {
		return lastSixMonthsMedianValue;
	}

	/**
	 * @param lastSixMonthsMedianValue
	 */
	public void setLastSixMonthsMedianValue(Double lastSixMonthsMedianValue) {
		this.lastSixMonthsMedianValue = lastSixMonthsMedianValue;
	}

	/**
	 * @return
	 */
	public Double getLoanAmountRequired() {
		return loanAmountRequired;
	}

	/**
	 * @param loanAmountRequired
	 */
	public void setLoanAmountRequired(Double loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	/**
	 * @return
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	/**
	 * @return
	 */
	public Double getMonthlySalFromItr() {
		return monthlySalFromItr;
	}

	/**
	 * @param monthlySalFromItr
	 */
	public void setMonthlySalFromItr(Double monthlySalFromItr) {
		this.monthlySalFromItr = monthlySalFromItr;
	}
	
	/**
	 * @return
	 */
	public Double getItrIncomeCurrentYear() {
		return itrIncomeCurrentYear;
	}

	/**
	 * @param itrIncomeCurrentYear
	 */
	public void setItrIncomeCurrentYear(Double itrIncomeCurrentYear) {
		this.itrIncomeCurrentYear = itrIncomeCurrentYear;
	}

	/**
	 * @return
	 */
	public Double getItrIncomeActualValue() {
		return itrIncomeActualValue;
	}

	/**
	 * @param itrIncomeActualValue
	 */
	public void setItrIncomeActualValue(Double itrIncomeActualValue) {
		this.itrIncomeActualValue = itrIncomeActualValue;
	}
	
	/**
	 * @return
	 */
	public Double getFinalGrossMonthlyIncome() {
		return finalGrossMonthlyIncome;
	}

	/**
	 * @param finalGrossMonthlyIncome
	 */
	public void setFinalGrossMonthlyIncome(Double finalGrossMonthlyIncome) {
		this.finalGrossMonthlyIncome = finalGrossMonthlyIncome;
	}

	public Double getEligibleLoanAmountBasedOnEmi() {
		return eligibleLoanAmountBasedOnEmi;
	}

	public void setEligibleLoanAmountBasedOnEmi(Double eligibleLoanAmountBasedOnEmi) {
		this.eligibleLoanAmountBasedOnEmi = eligibleLoanAmountBasedOnEmi;
	}


	public Double getEmiExistingAndProposedObligation() {
		return emiExistingAndProposedObligation;
	}

	public void setEmiExistingAndProposedObligation(Double emiExistingAndProposedObligation) {
		this.emiExistingAndProposedObligation = emiExistingAndProposedObligation;
	}

	public Double getEmiAndNmiSetByLender() {
		return emiAndNmiSetByLender;
	}

	public void setEmiAndNmiSetByLender(Double emiAndNmiSetByLender) {
		this.emiAndNmiSetByLender = emiAndNmiSetByLender;
	}

	public Double getMonthsSetByLenderForNmi() {
		return monthsSetByLenderForNmi;
	}

	public void setMonthsSetByLenderForNmi(Double monthsSetByLenderForNmi) {
		this.monthsSetByLenderForNmi = monthsSetByLenderForNmi;
	}

	public Double getResultAfterMinusExistingEmi() {
		return resultAfterMinusExistingEmi;
	}

	public void setResultAfterMinusExistingEmi(Double resultAfterMinusExistingEmi) {
		this.resultAfterMinusExistingEmi = resultAfterMinusExistingEmi;
	}

	public Double getEligibleLoanAmountBasedOnEmiAndNmi() {
		return eligibleLoanAmountBasedOnEmiAndNmi;
	}

	public void setEligibleLoanAmountBasedOnEmiAndNmi(Double eligibleLoanAmountBasedOnEmiAndNmi) {
		this.eligibleLoanAmountBasedOnEmiAndNmi = eligibleLoanAmountBasedOnEmiAndNmi;
	}

	public Double getFinalEmiProposedObligation() {
		return finalEmiProposedObligation;
	}

	public void setFinalEmiProposedObligation(Double finalEmiProposedObligation) {
		this.finalEmiProposedObligation = finalEmiProposedObligation;
	}

	public Double getFinalEmiExistingObligationAndProposedObligation() {
		return finalEmiExistingObligationAndProposedObligation;
	}

	public void setFinalEmiExistingObligationAndProposedObligation(Double finalEmiExistingObligationAndProposedObligation) {
		this.finalEmiExistingObligationAndProposedObligation = finalEmiExistingObligationAndProposedObligation;
	}

	public Double getGrossMonthlyIncomeManually() {
		return grossMonthlyIncomeManually;
	}

	public void setGrossMonthlyIncomeManually(Double grossMonthlyIncomeManually) {
		this.grossMonthlyIncomeManually = grossMonthlyIncomeManually;
	}
	
	
	public Double getMonthlyLoanObligationWithoutDesignator() {
		return monthlyLoanObligationWithoutDesignator;
	}
	public void setMonthlyLoanObligationWithoutDesignator(Double monthlyLoanObligationWithoutDesignator) {
		this.monthlyLoanObligationWithoutDesignator = monthlyLoanObligationWithoutDesignator;
	}
	
	public Boolean getIsSelfDeclareSalary() {
		return isSelfDeclareSalary;
	}
	public void setIsSelfDeclareSalary(Boolean isSelfDeclareSalary) {
		this.isSelfDeclareSalary = isSelfDeclareSalary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalEligibilityRequest [foir=" + foir + ", foirInRS=" + foirInRS + ", foirScallingSelectionType="
				+ foirScallingSelectionType + ", takeHomeBasedFoirFirst=" + takeHomeBasedFoirFirst
				+ ", finaltakeHomePayConsidered=" + finaltakeHomePayConsidered + ", foirScallingSelectionTypeText="
				+ foirScallingSelectionTypeText + ", monthlyLoanObligation=" + monthlyLoanObligation
				+ ", monthlyLoanObligationWithoutDesignator=" + monthlyLoanObligationWithoutDesignator
				+ ", rateOfInterest=" + rateOfInterest + ", tenure=" + tenure + ", eligibleLoanAmount="
				+ eligibleLoanAmount + ", proposedLoanAmount=" + proposedLoanAmount + ", maxLoanAmountProvidedBank="
				+ maxLoanAmountProvidedBank + ", finalLoanAmountNew=" + finalLoanAmountNew + ", perLakhEmi="
				+ perLakhEmi + ", margin=" + margin + ", averageIncomeLastSixMonths=" + averageIncomeLastSixMonths
				+ ", averageMonthlyWithDrawal=" + averageMonthlyWithDrawal + ", availableIncomeNewLoan="
				+ availableIncomeNewLoan + ", averagePerMonthInvestMents=" + averagePerMonthInvestMents
				+ ", availableIncomeNewLoanMonthly=" + availableIncomeNewLoanMonthly + ", eligibleMonthlyEmi="
				+ eligibleMonthlyEmi + ", result=" + result + ", emi=" + emi + ", netWorkingLimit=" + netWorkingLimit
				+ ", existingLimits=" + existingLimits + ", topAmount=" + topAmount + ", itrSalary=" + itrSalary
				+ ", oneFormSalary=" + oneFormSalary + ", bankStatementSalary=" + bankStatementSalary + ", itrResult="
				+ itrResult + ", eligibleEmi=" + eligibleEmi + ", newLoanEmi=" + newLoanEmi + ", finalEmiAndNMI="
				+ finalEmiAndNMI + ", finalNetMonthlyIncome=" + finalNetMonthlyIncome + ", lastSixMonthsMedianValue="
				+ lastSixMonthsMedianValue + ", loanAmountRequired=" + loanAmountRequired + ", itrIncomeCurrentYear="
				+ itrIncomeCurrentYear + ", itrIncomeActualValue=" + itrIncomeActualValue + ", monthlySalFromItr="
				+ monthlySalFromItr + ", grossMonthlyIncomeManually=" + grossMonthlyIncomeManually
				+ ", finalNetMonthlyIncomeToBeConsider=" + finalNetMonthlyIncomeToBeConsider
				+ ", finalGrossMonthlyIncomeToBeConsider=" + finalGrossMonthlyIncomeToBeConsider + ", finalGMIMinimum="
				+ finalGMIMinimum + ", finalNmiMinimumConsider=" + finalNmiMinimumConsider
				+ ", grossMonthlyIncomeComputedBySystem=" + grossMonthlyIncomeComputedBySystem
				+ ", isBasedOnEmiAndNmiType=" + isBasedOnEmiAndNmiType + ", loanType=" + loanType
				+ ", finalGrossMonthlyIncome=" + finalGrossMonthlyIncome + ", eligibileLoanAmountBasedOnNmi="
				+ eligibileLoanAmountBasedOnNmi + ", eligibileLoanAmountBasedOnGmi=" + eligibileLoanAmountBasedOnGmi
				+ ", eligibleLoanAmountBasedOnEmi=" + eligibleLoanAmountBasedOnEmi
				+ ", emiExistingAndProposedObligation=" + emiExistingAndProposedObligation + ", emiAndNmiSetByLender="
				+ emiAndNmiSetByLender + ", monthsSetByLenderForNmi=" + monthsSetByLenderForNmi
				+ ", monthsSetByLenderForGmi=" + monthsSetByLenderForGmi + ", resultAfterMinusExistingEmi="
				+ resultAfterMinusExistingEmi + ", eligibleLoanAmountBasedOnEmiAndNmi="
				+ eligibleLoanAmountBasedOnEmiAndNmi + ", finalEmiProposedObligation=" + finalEmiProposedObligation
				+ ", finalEmiExistingObligationAndProposedObligation=" + finalEmiExistingObligationAndProposedObligation
				+ ", fpAssessmentEquipment=" + fpAssessmentEquipment + "]";
	}
	
	
	
	
}
