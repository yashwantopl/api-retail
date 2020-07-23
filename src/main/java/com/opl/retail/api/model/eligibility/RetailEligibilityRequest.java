package com.opl.retail.api.model.eligibility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.opl.retail.api.utils.eligibility.EligibilityUtils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailEligibilityRequest extends EligibililityRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double grossMonthlyIncome;
	private Double grossMonthlyIncomeManually;
	private Double netMonthlyIncome;
	private Double finalIncomeToConsiderBasedOnIncome;
	
	private Double foir;
	private Double foirInRS;
	private Integer foirScallingSelectionType;
	private Double takeHomeBasedFoirFirst ;
	private Double  finaltakeHomePayConsidered;
	private String foirScallingSelectionTypeText;
	
	
	
	private Double takeHomeBasedFoirFirstResultCoApp;
	private Double takeHomeBasedFoirSecondResultCoApp;
	
	private Double netTakeFinalHomeBasedFoirFirstResultCoApp;
	private Double  netTakeFinalHomeBasedFoirSecondResultCoApp;
	
	
	private Double netTakeHomeSalaryFirst;
	private Double netTakeHomeSalarySecond;
	
	private Double availableIncome;
	private Double existingObligation;
	private Double existingObligationWithoutDesignator;
	private Double availableIncomeForNewLoan;
	private Double totalIncomeForNewLoanBasedOnIncome;
	private Double totalIncomeForNewLoanBasedOnIncomeWithCoApp;
	private Double netTakeHomeSalary;
	private Double roi;
	private Double perLakhEMI;
	private Double elAmountBasedOnIncome;
	private Double finalIncomeToConsiderBasedOnIncomeMultiplier;
	private Double timesMultiplierOfGrossMonthlyIncome;
	private Double totalIncomeForNewLoanBasedOnIncomeMultiplier;
	private Double elAmountBasedOnIncomeMultiplier;

	private Double purCunsExpRepAndRenovCost;
	private Double purchasePriceOrvaluationOfVehicle;
	private Double marketValue;
	private Double onRoadPrice;
	private Double exShowRoomPrice;
	private Double valueToConsiderForLoanAmount;
	private Double ltv;
	private Double elAmountBasedOnLTV;
	private Double elAmountBasedOnMinOf3Criteria;
	private Double requestedLoanAmountByBorrower;
	private Double maxLoanAmountProvidedByLender;
	private Boolean isSetGrossNetIncome;
	private Boolean isSetTimesMultiplierIncome;
	private Boolean isSetLTV;
	private Boolean isConsiderCoApp;
	private Boolean isSetPurCunsExpRepAndRenovCost;
	private Boolean isSetMarketValue;
	private Boolean isSetFpTenure;
	private Boolean isSetFpAge;
	private String incomeType;
	private String incomeTypeMultiplier;
	private String loanPurposeValue;
	private List<String> fpLoanPurposeValue;
	private Integer noOfCoApplicantFP;
	private Integer noOfCoApplicantFS;
	private Double tenureFS;
	private Double tenureScoring;
	private Double ageFS;
	private Double tenureFP;
	private Double maxAgeFP;
	private Double calculatedTenure;
	private Double finalTenure;
	private Double timesMultiplier;
	private Double result;
	private Double finalEmiProposedObligation;
	private Double finalEmiExistingObligationAndProposedObligation;
	private Double incrementalItrVal;
	private Double manualFillSalary;
	private Double top5FundMedianAmt;
	private Double bsSalary;
	private Double monthlySalFromItr;
	private Double itrSalary;
	private Double costOfProject;
	private Double minGmiConsider;
	private Double grossMonthlyIncomeComputedBySystem;
	private Integer loanPurpose;
	private List<Integer> fpLoanPurpose;
	private Double elAmountBeforeSubtoLoanCalc;
	private Boolean isSetMaxExShowroomPrice;
	private Boolean isEmiForEligibilityCalc;
	private List<CoApplicantEligibilityRequest> coApplicants = null;

	public RetailEligibilityRequest() {
		super();
	}
	
	
	
	
	

	/**
	 * @return the netTakeFinalHomeBasedFoirFirstResultCoApp
	 */
	public Double getNetTakeFinalHomeBasedFoirFirstResultCoApp() {
		return netTakeFinalHomeBasedFoirFirstResultCoApp;
	}






	/**
	 * @return the netTakeFinalHomeBasedFoirSecondResultCoApp
	 */
	public Double getNetTakeFinalHomeBasedFoirSecondResultCoApp() {
		return netTakeFinalHomeBasedFoirSecondResultCoApp;
	}






	/**
	 * @param netTakeFinalHomeBasedFoirFirstResultCoApp the netTakeFinalHomeBasedFoirFirstResultCoApp to set
	 */
	public void setNetTakeFinalHomeBasedFoirFirstResultCoApp(Double netTakeFinalHomeBasedFoirFirstResultCoApp) {
		this.netTakeFinalHomeBasedFoirFirstResultCoApp = netTakeFinalHomeBasedFoirFirstResultCoApp;
	}






	/**
	 * @param netTakeFinalHomeBasedFoirSecondResultCoApp the netTakeFinalHomeBasedFoirSecondResultCoApp to set
	 */
	public void setNetTakeFinalHomeBasedFoirSecondResultCoApp(Double netTakeFinalHomeBasedFoirSecondResultCoApp) {
		this.netTakeFinalHomeBasedFoirSecondResultCoApp = netTakeFinalHomeBasedFoirSecondResultCoApp;
	}






	/**
	 * @return the takeHomeBasedFoirFirstResultCoApp
	 */
	public Double getTakeHomeBasedFoirFirstResultCoApp() {
		return takeHomeBasedFoirFirstResultCoApp;
	}








	/**
	 * @return the takeHomeBasedFoirSecondResultCoApp
	 */
	public Double getTakeHomeBasedFoirSecondResultCoApp() {
		return takeHomeBasedFoirSecondResultCoApp;
	}








	/**
	 * @param takeHomeBasedFoirFirstResultCoApp the takeHomeBasedFoirFirstResultCoApp to set
	 */
	public void setTakeHomeBasedFoirFirstResultCoApp(Double takeHomeBasedFoirFirstResultCoApp) {
		this.takeHomeBasedFoirFirstResultCoApp = takeHomeBasedFoirFirstResultCoApp;
	}








	/**
	 * @param takeHomeBasedFoirSecondResultCoApp the takeHomeBasedFoirSecondResultCoApp to set
	 */
	public void setTakeHomeBasedFoirSecondResultCoApp(Double takeHomeBasedFoirSecondResultCoApp) {
		this.takeHomeBasedFoirSecondResultCoApp = takeHomeBasedFoirSecondResultCoApp;
	}








	/**
	 * @return the netTakeHomeSalaryFirst
	 */
	public Double getNetTakeHomeSalaryFirst() {
		return netTakeHomeSalaryFirst;
	}






	/**
	 * @return the netTakeHomeSalarySecond
	 */
	public Double getNetTakeHomeSalarySecond() {
		return netTakeHomeSalarySecond;
	}






	/**
	 * @param netTakeHomeSalaryFirst the netTakeHomeSalaryFirst to set
	 */
	public void setNetTakeHomeSalaryFirst(Double netTakeHomeSalaryFirst) {
		this.netTakeHomeSalaryFirst = netTakeHomeSalaryFirst;
	}






	/**
	 * @param netTakeHomeSalarySecond the netTakeHomeSalarySecond to set
	 */
	public void setNetTakeHomeSalarySecond(Double netTakeHomeSalarySecond) {
		this.netTakeHomeSalarySecond = netTakeHomeSalarySecond;
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
	 * @return the foirScallingSelectionTypeText
	 */
	public String getFoirScallingSelectionTypeText() {
		return foirScallingSelectionTypeText;
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
	 * @param foirScallingSelectionTypeText the foirScallingSelectionTypeText to set
	 */
	public void setFoirScallingSelectionTypeText(String foirScallingSelectionTypeText) {
		this.foirScallingSelectionTypeText = foirScallingSelectionTypeText;
	}






	public Double getGrossMonthlyIncomeComputedBySystem() {
		return grossMonthlyIncomeComputedBySystem;
	}

	public void setGrossMonthlyIncomeComputedBySystem(Double grossMonthlyIncomeComputedBySystem) {
		this.grossMonthlyIncomeComputedBySystem = grossMonthlyIncomeComputedBySystem;
	}

	public Double getMinGmiConsider() {
		return minGmiConsider;
	}

	public void setMinGmiConsider(Double minGmiConsider) {
		this.minGmiConsider = minGmiConsider;
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

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Double getAvailableIncome() {
		return availableIncome;
	}

	public void setAvailableIncome(Double availableIncome) {
		this.availableIncome = availableIncome;
	}

	public Double getExistingObligation() {
		return existingObligation;
	}

	public void setExistingObligation(Double existingObligation) {
		this.existingObligation = existingObligation;
	}

	public Double getAvailableIncomeForNewLoan() {
		return availableIncomeForNewLoan;
	}

	public void setAvailableIncomeForNewLoan(Double availableIncomeForNewLoan) {
		this.availableIncomeForNewLoan = availableIncomeForNewLoan;
	}

	public Double getTotalIncomeForNewLoanBasedOnIncome() {
		return totalIncomeForNewLoanBasedOnIncome;
	}

	public void setTotalIncomeForNewLoanBasedOnIncome(Double totalIncomeForNewLoanBasedOnIncome) {
		this.totalIncomeForNewLoanBasedOnIncome = totalIncomeForNewLoanBasedOnIncome;
	}

	/*
	 * public Double getTenure() { return tenure; }
	 */
	/*
	 * public void setTenure(Double tenure) { this.tenure = tenure; }
	 */
	public Double getRoi() {
		return roi;
	}

	public void setRoi(Double roi) {
		this.roi = roi;
	}

	public Double getPerLakhEMI() {
		return perLakhEMI;
	}

	public void setPerLakhEMI(Double perLakhEMI) {
		this.perLakhEMI = perLakhEMI;
	}

	public Double getElAmountBasedOnIncome() {
		return elAmountBasedOnIncome;
	}

	public void setElAmountBasedOnIncome(Double elAmountBasedOnIncome) {
		this.elAmountBasedOnIncome = elAmountBasedOnIncome;
	}

	public Double getFinalIncomeToConsiderBasedOnIncomeMultiplier() {
		return finalIncomeToConsiderBasedOnIncomeMultiplier;
	}

	public void setFinalIncomeToConsiderBasedOnIncomeMultiplier(Double finalIncomeToConsiderBasedOnIncomeMultiplier) {
		this.finalIncomeToConsiderBasedOnIncomeMultiplier = finalIncomeToConsiderBasedOnIncomeMultiplier;
	}

	public Double getTimesMultiplierOfGrossMonthlyIncome() {
		return timesMultiplierOfGrossMonthlyIncome;
	}

	public void setTimesMultiplierOfGrossMonthlyIncome(Double timesMultiplierOfGrossMonthlyIncome) {
		this.timesMultiplierOfGrossMonthlyIncome = timesMultiplierOfGrossMonthlyIncome;
	}

	public Double getTotalIncomeForNewLoanBasedOnIncomeMultiplier() {
		return totalIncomeForNewLoanBasedOnIncomeMultiplier;
	}

	public void setTotalIncomeForNewLoanBasedOnIncomeMultiplier(Double totalIncomeForNewLoanBasedOnIncomeMultiplier) {
		this.totalIncomeForNewLoanBasedOnIncomeMultiplier = totalIncomeForNewLoanBasedOnIncomeMultiplier;
	}

	public Double getElAmountBasedOnIncomeMultiplier() {
		return elAmountBasedOnIncomeMultiplier;
	}

	public void setElAmountBasedOnIncomeMultiplier(Double elAmountBasedOnIncomeMultiplier) {
		this.elAmountBasedOnIncomeMultiplier = elAmountBasedOnIncomeMultiplier;
	}

	public Double getPurCunsExpRepAndRenovCost() {
		return purCunsExpRepAndRenovCost;
	}

	public void setPurCunsExpRepAndRenovCost(Double purCunsExpRepAndRenovCost) {
		this.purCunsExpRepAndRenovCost = purCunsExpRepAndRenovCost;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	public Double getValueToConsiderForLoanAmount() {
		return valueToConsiderForLoanAmount;
	}

	public void setValueToConsiderForLoanAmount(Double valueToConsiderForLoanAmount) {
		this.valueToConsiderForLoanAmount = valueToConsiderForLoanAmount;
	}

	public Double getLtv() {
		return ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	public Double getElAmountBasedOnLTV() {
		return elAmountBasedOnLTV;
	}

	public void setElAmountBasedOnLTV(Double elAmountBasedOnLTV) {
		this.elAmountBasedOnLTV = elAmountBasedOnLTV;
	}

	public Double getElAmountBasedOnMinOf3Criteria() {
		return elAmountBasedOnMinOf3Criteria;
	}

	public void setElAmountBasedOnMinOf3Criteria(Double elAmountBasedOnMinOf3Criteria) {
		this.elAmountBasedOnMinOf3Criteria = elAmountBasedOnMinOf3Criteria;
	}

	public Double getRequestedLoanAmountByBorrower() {
		return requestedLoanAmountByBorrower;
	}

	public void setRequestedLoanAmountByBorrower(Double requestedLoanAmountByBorrower) {
		this.requestedLoanAmountByBorrower = requestedLoanAmountByBorrower;
	}

	public Double getMaxLoanAmountProvidedByLender() {
		return maxLoanAmountProvidedByLender;
	}

	public void setMaxLoanAmountProvidedByLender(Double maxLoanAmountProvidedByLender) {
		this.maxLoanAmountProvidedByLender = maxLoanAmountProvidedByLender;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Boolean getIsSetGrossNetIncome() {
		return isSetGrossNetIncome;
	}

	public void setIsSetGrossNetIncome(Boolean isSetGrossNetIncome) {
		this.isSetGrossNetIncome = isSetGrossNetIncome;
	}

	public Boolean getIsSetTimesMultiplierIncome() {
		return isSetTimesMultiplierIncome;
	}

	public void setIsSetTimesMultiplierIncome(Boolean isSetTimesMultiplierIncome) {
		this.isSetTimesMultiplierIncome = isSetTimesMultiplierIncome;
	}

	public Boolean getIsSetLTV() {
		return isSetLTV;
	}

	public void setIsSetLTV(Boolean isSetLTV) {
		this.isSetLTV = isSetLTV;
	}

	public Boolean getIsConsiderCoApp() {
		return isConsiderCoApp;
	}

	public void setIsConsiderCoApp(Boolean isConsiderCoApp) {
		this.isConsiderCoApp = isConsiderCoApp;
	}

	public Boolean getIsSetPurCunsExpRepAndRenovCost() {
		return isSetPurCunsExpRepAndRenovCost;
	}

	public void setIsSetPurCunsExpRepAndRenovCost(Boolean isSetPurCunsExpRepAndRenovCost) {
		this.isSetPurCunsExpRepAndRenovCost = isSetPurCunsExpRepAndRenovCost;
	}

	public Boolean getIsSetMarketValue() {
		return isSetMarketValue;
	}

	public void setIsSetMarketValue(Boolean isSetMarketValue) {
		this.isSetMarketValue = isSetMarketValue;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public String getIncomeTypeMultiplier() {
		return incomeTypeMultiplier;
	}

	public void setIncomeTypeMultiplier(String incomeTypeMultiplier) {
		this.incomeTypeMultiplier = incomeTypeMultiplier;
	}

	public Integer getNoOfCoApplicantFP() {
		return noOfCoApplicantFP;
	}

	public void setNoOfCoApplicantFP(Integer noOfCoApplicantFP) {
		this.noOfCoApplicantFP = noOfCoApplicantFP;
	}

	public Integer getNoOfCoApplicantFS() {
		return noOfCoApplicantFS;
	}

	public void setNoOfCoApplicantFS(Integer noOfCoApplicantFS) {
		this.noOfCoApplicantFS = noOfCoApplicantFS;
	}

	public Double getTenureFS() {
		return tenureFS;
	}

	public void setTenureFS(Double tenureFS) {
		this.tenureFS = tenureFS;
	}

	public Double getTenureScoring() {
		return tenureScoring;
	}

	public void setTenureScoring(Double tenureScoring) {
		this.tenureScoring = tenureScoring;
	}

	public Double getAgeFS() {
		return ageFS;
	}

	public void setAgeFS(Double ageFS) {
		this.ageFS = ageFS;
	}

	public Double getTenureFP() {
		return tenureFP;
	}

	public void setTenureFP(Double tenureFP) {
		this.tenureFP = tenureFP;
	}

	public Double getTimesMultiplier() {
		return timesMultiplier;
	}

	public void setTimesMultiplier(Double timesMultiplier) {
		this.timesMultiplier = timesMultiplier;
	}

	public Double getCalculatedTenure() {
		return calculatedTenure;
	}

	public void setCalculatedTenure(Double calculatedTenure) {
		this.calculatedTenure = calculatedTenure;
	}

	public Double getFinalTenure() {
		return finalTenure;
	}

	public void setFinalTenure(Double finalTenure) {
		this.finalTenure = finalTenure;
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

	public void setFinalEmiExistingObligationAndProposedObligation(
			Double finalEmiExistingObligationAndProposedObligation) {
		this.finalEmiExistingObligationAndProposedObligation = finalEmiExistingObligationAndProposedObligation;
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

	public Double getMaxAgeFP() {
		return maxAgeFP;
	}

	public void setMaxAgeFP(Double maxAgeFP) {
		this.maxAgeFP = maxAgeFP;
	}

	public List<CoApplicantEligibilityRequest> getCoApplicants() {
		if (EligibilityUtils.isListNullOrEmpty(coApplicants)) {
			coApplicants = new ArrayList<CoApplicantEligibilityRequest>();
		}
		return coApplicants;
	}

	public void setCoApplicants(List<CoApplicantEligibilityRequest> coApplicants) {
		this.coApplicants = coApplicants;
	}

	public Double getTotalIncomeForNewLoanBasedOnIncomeWithCoApp() {
		return totalIncomeForNewLoanBasedOnIncomeWithCoApp;
	}

	public void setTotalIncomeForNewLoanBasedOnIncomeWithCoApp(Double totalIncomeForNewLoanBasedOnIncomeWithCoApp) {
		this.totalIncomeForNewLoanBasedOnIncomeWithCoApp = totalIncomeForNewLoanBasedOnIncomeWithCoApp;
	}

	public Double getNetTakeHomeSalary() {
		return netTakeHomeSalary;
	}

	public void setNetTakeHomeSalary(Double netTakeHomeSalary) {
		this.netTakeHomeSalary = netTakeHomeSalary;
	}

	public Double getCostOfProject() {
		return costOfProject;
	}

	public void setCostOfProject(Double costOfProject) {
		this.costOfProject = costOfProject;
	}

	public Double getGrossMonthlyIncomeManually() {
		return grossMonthlyIncomeManually;
	}

	public void setGrossMonthlyIncomeManually(Double grossMonthlyIncomeManually) {
		this.grossMonthlyIncomeManually = grossMonthlyIncomeManually;
	}

	public Double getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(Double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	public Double getExShowRoomPrice() {
		return exShowRoomPrice;
	}

	public void setExShowRoomPrice(Double exShowRoomPrice) {
		this.exShowRoomPrice = exShowRoomPrice;
	}

	public Boolean getIsSetFpTenure() {
		return isSetFpTenure;
	}

	public void setIsSetFpTenure(Boolean isSetFpTenure) {
		this.isSetFpTenure = isSetFpTenure;
	}

	public Boolean getIsSetFpAge() {
		return isSetFpAge;
	}

	public void setIsSetFpAge(Boolean isSetFpAge) {
		this.isSetFpAge = isSetFpAge;
	}

	public String getLoanPurposeValue() {
		return loanPurposeValue;
	}

	public void setLoanPurposeValue(String loanPurposeValue) {
		this.loanPurposeValue = loanPurposeValue;
	}

	public Integer getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(Integer loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public List<String> getFpLoanPurposeValue() {
		return fpLoanPurposeValue;
	}

	public void setFpLoanPurposeValue(List<String> fpLoanPurposeValue) {
		this.fpLoanPurposeValue = fpLoanPurposeValue;
	}

	public List<Integer> getFpLoanPurpose() {
		return fpLoanPurpose;
	}

	public void setFpLoanPurpose(List<Integer> fpLoanPurpose) {
		this.fpLoanPurpose = fpLoanPurpose;
	}

	public Double getPurchasePriceOrvaluationOfVehicle() {
		return purchasePriceOrvaluationOfVehicle;
	}

	public void setPurchasePriceOrvaluationOfVehicle(Double purchasePriceOrvaluationOfVehicle) {
		this.purchasePriceOrvaluationOfVehicle = purchasePriceOrvaluationOfVehicle;
	}

	public Double getElAmountBeforeSubtoLoanCalc() {
		return elAmountBeforeSubtoLoanCalc;
	}

	public void setElAmountBeforeSubtoLoanCalc(Double elAmountBeforeSubtoLoanCalc) {
		this.elAmountBeforeSubtoLoanCalc = elAmountBeforeSubtoLoanCalc;
	}

	public Boolean getSetMaxExShowroomPrice() {
		return isSetMaxExShowroomPrice;
	}

	public void setSetMaxExShowroomPrice(Boolean setMaxExShowroomPrice) {
		isSetMaxExShowroomPrice = setMaxExShowroomPrice;
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

	
}