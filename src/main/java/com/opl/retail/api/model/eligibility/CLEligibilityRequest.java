package com.opl.retail.api.model.eligibility;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CLEligibilityRequest extends EligibililityRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	// for Nayak Committe (EXISTING+ ADD.)
	private Double projectedSales;
	private Double workingCapitalLimit;
	private Double promoterContribution;
	private Double workingCapitalRequirement;
	private Double totalWorkingCapitalLimit;
	private Double cibilExistingLimit;
	private Double additionalWorkingCapitalLimit;
	private Double fsAdditionalLoanAmount;
	private Double maximumTotalLimitSetLender;
	private Double eligibleTotalWorkingLimit;
	
	private Double finalExisitingWorkingCapitalLimit;
	private Double finalAdditionalWorkingCapitalLimit;
	private Double finalTotalWorkingCapitalLimit;
	private Double finalLoanAmountNew;
	
	// ADDITIONAL 
	private Double fpMaxAdditionalAmount;
	private Double proposedLoanAmountFsAdditional;
	
	// (MPBF FIRST)
	private Double totalCurrentAssets;
	private Double otherCurrentLiabilities;
	private Double additionalLimit;
	private Double fpAdditionalMaxLoanAmount;
	private Double existingAndAdditionalTotalLoanMaxAmount;
	private Double finalExistingLimit;
	
	//(MPBF SECOND)
	private Double additionalWcLimit;
	
	private Double proposedLoanAmountAdditional;
	private Double finalAdditionalLimit;
	
	
	//historical Method WC
	private Double workingCapitalGap;
	private Double monthlyLoanObligation;
	private Double rateOfInterest;
	
	// For Equipment Finance
	private Double cashAccruals;
	private Double existingCashMargin;
	private Double grossFixedAssetsLastestFinancials;
	private Double turnOverAsPerLatestItr;
	//
	private Double turnOverGfaRatio;
	private Double costMachineryEquipmentPurchased;
	private Double incrementalTurnOverLimitComputed;
	private Double incrementalTurnOver;
	private Double incrementalCashMargin;
	private Double incrementalTurnOverLowerOf;
	private Double totalCashMargin;
	private Double monthlyCashMargin;
	private Double availableCashAccrualsMonthly;
	private Integer tenure;
	
	// Payback Term Loan
	private Double  finalTotalTermLoanAmount;
	
	// For Term Loan - Universal Method
	private Double availableBankFinance;
	private Double netEligibleBankFinanceDSCR;
	private Double eligibleAdditionalLoanAmount;
	private Double additionalLoanAmount;
	
	private Double totalTermLoanTol;
	private Double totalTermLoanCollateral;
	private Double totalTermLoanDSCR;
	
	private Double additionalTermLoanTOLandTNW;
	private Double additionalTermLoanDSCR;
	private Double additionalTermLoanCollateral;
	
	private Double additionalEligibleTermLoan;
	private Double eligibleTotalTermLoan;
	
	
	
	//term Loan Historical
	private Double termLoanBasedOnCashFlow;
	private Double existingAndAdditionalLoanMaxAmount;
	
	
	// Kotak Related Assessment WC Hybrid
	private Double additionalWorkingCapitalLimitTOL;
	private Double totalWorkingCapitalLimitTOL;
	private Double totalCollateralAvailable;
	private Double totalWorkingCapitalLimitCollateral;
	private Double additionalWorkingCapitalLimitDSCR;
	private Double finalEligibleLoanAmount;
	private Double eligibleTotalWorkingCapitalLimit;
	private Double proposedLoanAmountAdditionalLowerOf;
	private Double finalEligibleTotalWcLimit;
	private Double totalWCLimitBasedOnProjectedSales;
	
	
	
	private Double defaultHistoricSales; // DEFAULT SALES DISPLAY
	
	private Double foir;
	private Double availableCashAccrualsPerYear;
	
	private Double yearlyLoanObligation;
	private Double availableCashAccrualsNewLoan;
	private Double computedIncrementalMarginBasedExistingMargin;
	
	private Double loanAmt;
	
	private Double fixedIncomeObligations;
	private Double availableCashMargin;

	//
	private Double monthlyLoanObligations;
	private Double availableCashMarginsFoNew;

	private Double eligibleLoanAmount;
	private Double proposedLoanAmount;
	private Double loanAmount;
	private Double maxLoanAmountProvidedBank;
	private Double perLakhEmi;
	// for new Margin Purpose In Equipment Purpose
	private Double margin;

	// FOR NEW REQ. TERM LOAN METHOD THREE---
	private Double dscr;
	private Double payBackPeriod;
	// for nayak committee
	

	// for Ntb Purpose in eligibility Calculation starts here....
	private Double averageIncomeLastSixMonths;
	private Double averageMonthlyWithDrawal;
	private Double availableIncomeNewLoan;

	private Double averagePerMonthInvestMents;
	private Double monthlyObligation;
	private Double availableIncomeNewLoanMonthly;
	private Double eligibleMonthlyEmi;
	private Double totalEligibleLoanAmount;
	private Double averagePerMonthObligation;
	// Ending Ntb

	// FINAL RESULT FOR NTB STORE THIS VARIABLE
	private Double result;
	private Double emi;

	// for Normal WORKING CAPITAL
	private Double eligibleBankFinance;
	private String subSector;
	// ends Normal Working Capital

	
	private Double currentRatio;
	private List<CLEligibilityRequest> directorsCalculations = Collections.emptyList();
	
	private List<GstCamTeaserData> gstCamTeaserDatas = Collections.emptyList();
	// for MPBF FIRST SECOND ENDS HERE...

	// FOR PAYBACK METHOD STARTS HERE---->
	private Double costOfNewMachineryEquipmentPurchased;
	private Double incrementalMarginMentionBorrower;
	private Double capOnCashMarginInvestMent;
	private Double valueOfCashMarginPerAnnum;
	private Double finalIncrementalCashMarginLowerof;
	// STEP 4 ---->
	private Double totalCashFlow;
	private Double availableCashFlow;
	// for hybrid method
	private Double incrementalMarginExistingMargin;

	private Long fpAssessmentId;

	// CIBIL CHANGES
	private Double netWorkingLimit;
	private Double existingLimits;

	private Double topAmount;
	private Double itrSalary;
	private Double oneFormSalary;
	private Double bankStatementSalary;
	private Double itrResult;

	private String loanType;
	// for HYBRID METHOD -----15-10-18--->
	private Double cashMarginPaybackMethod;

	// for hybrid method-----cam 16-10-18
	private Double valueOfCashMarginPaybackPeriod;

	// for kotak bank parameter Testing
	private Double loanAmountTOLAndTNW;
	private Double loanAmountUsingTOLAndTNWFP;

	private Double loanAmountCollateralCoverageFp;
	private Double collateralCovrageFS;
	private Double loanAmountCollateralCoveragefinal;
	private Double additionalWorkingCapitalLimitColleteral;
	private Double totalWorkingCapitalLimitDSCR;
	private Double finalEligibleAdditionalLoanAmount;
	private Double additionalWorkingCapitalLimitLowerOf;
	private Double existingLoanCollateralAmount;
	private Double minimumResult;

	// Loan Amount as per TOL/TNW Method
	private Double totalOutsideLiabilities;
	private Double tangibleNetWorth;
	private Double tOLAndTNJ;
	private Double tOLAndTNJMaximumK;
	private Double workingCapitalLimitTOL;
	private Double eligibleBankFinanceTOL;
	private Double existingLimitsTOL;
	private Double netEligibleBankFinanceTOL;

	// Loan Amount as per Collateral Method
	private Double workingCapitalLimitColleteral;
	private Double eligibleBankFinanceColletral;
	private Double neteligibleBankFinanceColletral;
	private Double amountOfColletralFsQ;
	private Double colletralCoverageFpR;

	// Loan Amount as per DSCR Method
	private Double ebidtadscr;
	private Double existingObligationsEMIDSCR;
	private Double dscrz; 
	private Double dscrfpaa;
	private Double workingCapitalLimitAB;
	private Double eligibleBankFinanceAD;
	private Double existingLimitsAE;
	private Double netEligibleBankFinanceAF;
	private Double loanAmountLowerOfAH;
	private Double promoterContributionDscr;
	private Double promoterContributionColletral;
	private Double promoterContributionTol;
	
	private Double opProfitBeforeIntrest;
	private Double depreciation;
	private Double totalFinArrEMI;
	private Double totalFinArrEMiDir;
	
	// for DISPLAY TEASER AND CAM PROJECTED SALES
	private Double growthCalculatedFromSales;
	private Double  growthSetByBank;
	private Double  projectedSalesOfPreviousFyear;
	private Double salesOfCurrentFyear;
	private Boolean isHistoric;
	private Boolean isGrowth;
	private Boolean isApril;
	private Double sales2;
	private Double sales3;
	
	// for EXISTING AND ADDITONAL LOAN 
	private Double netEligibleBankFinance;
	private Double existingPlusAdditional;

	private Double fpMaxTotalAmount;
	private Double cashAccuralsPerMonths;
	private Double bankFinanceBasedOnCashFlowFirstExisting;
	private Double bankFinanceBasedOnCashFlowSecond;
	private Double netEligibleBankFinanceExisting;
	private Double finalTotalLoanAmount;
	private Double lowerOfLAndO;
	private Double lowerOfAmountLNAndO;
	private Double finalValueExistingLoan;
	private Double lowerOfAmountEHAndI;
	private Double lowerOfGAndI;
	private Double existingLoan;
	private Double resultCandA;
	private Double resultBandA;
	private Double workingCapitalLimitBasedProjSales;
	private Double bankFinanceBasedCashFlow;
	private Double manufacturing;
	private Double service;
	private Double trading;
	private Integer loanArrangeMentFpSelectionType;
	private Boolean isMsmeNewAssmentType;
	

	
	// FOR TERM LOAN new
    private Double lowerOfAmountRTAndU;
    private Double availableCashAccuralsperMonth;
    private Double bankFinanceExistingLoan;
    private Double bankFinanceAdditionalLoan;
    private Double netEligibleBankFinanceExistingLoan;
    private Double netEligibleBankFianceAdditionalLoan;
    private Double bankFinanceBasedOnCashFlow;
    private Double availableCashAccrualsPerMonth;
    private Double lowerOfLOAndM;
    private Double finalAdditionalLoanAmount;
  
    private Double lowerOfAmountWYAndZ;
    private Double lowerOfWZndX;
    private Double lowerOfVYndW;
    private Double lowerOfAmountVXAndY;
    private Double lowerOfRUndS;
    private Double salesdataDomesticAndExport;
    private Double debtors;
    
    // FOR KOTAK BANK 
    private Double lowerOfAmountOQR;
    private Double lowerOfRAndO;
    private Double finalNetEligibleBankFinanceTOL;
    private Double lowerOfAmountAHAIANDAJ;
    private Double lowerOfAHAJ;
    private Double bankFinanceTotalLoanDSCR;
    
    
    private Double workingCapitalLimitDSCR;
    
    private Double bankFinanceExistingPlusAdditional;
    private Double eligibleBankFinanceTakeOver;
    private Double finalNetEligibleBankFinance;
    
    private Double netEligibleBankFinanceFirst;
    private Double finalValueExistingLoanStepFirst;
    private Double finalAdditionalLoanAmountFirst;
    
    
    // TOL AND TNW
    private Double finalTotalAmountTOL;
    private Double finalAdditionalAmountTOL; 
    private Double finalValueExistingLoanTOL;
    
    // DSCR PARAMETER
    private Double finalTotalAmountDSCR;
    private Double finalAdditionalAmountDSCR;
    private Double finalValueExistingLoanDSCR;
    
    // COLLATERAL PARAMETER
    private Double finalTotalLoanAmountCollateral;
    private Double finalAdditionalLoanAmountCollateral;
    private Double finalValueExistingLoanCollateral;
    
    
    // FOR PARAMETER SELECTION TYPE
    private Boolean isTOLAndTNWType;
	private Boolean isCollateralCoverageType;
	private Boolean isDSCRType;
	
	private  Double loanAmountUsingDSCR; // for cam wc- Hybrid
	
	private Double totalWCLimitBasedOnCashFlow;
	private Double finalAdditionalTermLoanAmount;
	
	public Double getEligibleTotalTermLoan() {
		return eligibleTotalTermLoan;
	}

	public void setEligibleTotalTermLoan(Double eligibleTotalTermLoan) {
		this.eligibleTotalTermLoan = eligibleTotalTermLoan;
	}

	public Double getAdditionalEligibleTermLoan() {
		return additionalEligibleTermLoan;
	}

	public void setAdditionalEligibleTermLoan(Double additionalEligibleTermLoan) {
		this.additionalEligibleTermLoan = additionalEligibleTermLoan;
	}

	public Double getAdditionalTermLoanTOLandTNW() {
		return additionalTermLoanTOLandTNW;
	}

	public void setAdditionalTermLoanTOLandTNW(Double additionalTermLoanTOLandTNW) {
		this.additionalTermLoanTOLandTNW = additionalTermLoanTOLandTNW;
	}

	public Double getAdditionalTermLoanDSCR() {
		return additionalTermLoanDSCR;
	}

	public void setAdditionalTermLoanDSCR(Double additionalTermLoanDSCR) {
		this.additionalTermLoanDSCR = additionalTermLoanDSCR;
	}

	public Double getAdditionalTermLoanCollateral() {
		return additionalTermLoanCollateral;
	}

	public void setAdditionalTermLoanCollateral(Double additionalTermLoanCollateral) {
		this.additionalTermLoanCollateral = additionalTermLoanCollateral;
	}

	public Double getTotalTermLoanCollateral() {
		return totalTermLoanCollateral;
	}

	public void setTotalTermLoanCollateral(Double totalTermLoanCollateral) {
		this.totalTermLoanCollateral = totalTermLoanCollateral;
	}

	public Double getTotalTermLoanDSCR() {
		return totalTermLoanDSCR;
	}

	public void setTotalTermLoanDSCR(Double totalTermLoanDSCR) {
		this.totalTermLoanDSCR = totalTermLoanDSCR;
	}

	public Double getTotalTermLoanTol() {
		return totalTermLoanTol;
	}

	public void setTotalTermLoanTol(Double totalTermLoanTol) {
		this.totalTermLoanTol = totalTermLoanTol;
	}

	public Double getAdditionalLoanAmount() {
		return additionalLoanAmount;
	}

	public void setAdditionalLoanAmount(Double additionalLoanAmount) {
		this.additionalLoanAmount = additionalLoanAmount;
	}

	public Double getEligibleAdditionalLoanAmount() {
		return eligibleAdditionalLoanAmount;
	}

	public void setEligibleAdditionalLoanAmount(Double eligibleAdditionalLoanAmount) {
		this.eligibleAdditionalLoanAmount = eligibleAdditionalLoanAmount;
	}

	public Double getNetEligibleBankFinanceDSCR() {
		return netEligibleBankFinanceDSCR;
	}

	public void setNetEligibleBankFinanceDSCR(Double netEligibleBankFinanceDSCR) {
		this.netEligibleBankFinanceDSCR = netEligibleBankFinanceDSCR;
	}

	public Double getAvailableBankFinance() {
		return availableBankFinance;
	}

	public void setAvailableBankFinance(Double availableBankFinance) {
		this.availableBankFinance = availableBankFinance;
	}

	public Double getMinimumResult() {
		return minimumResult;
	}

	public void setMinimumResult(Double minimumResult) {
		this.minimumResult = minimumResult;
	}

	public Double getTotalWCLimitBasedOnProjectedSales() {
		return totalWCLimitBasedOnProjectedSales;
	}

	public void setTotalWCLimitBasedOnProjectedSales(Double totalWCLimitBasedOnProjectedSales) {
		this.totalWCLimitBasedOnProjectedSales = totalWCLimitBasedOnProjectedSales;
	}

	public Double getFinalEligibleTotalWcLimit() {
		return finalEligibleTotalWcLimit;
	}

	public void setFinalEligibleTotalWcLimit(Double finalEligibleTotalWcLimit) {
		this.finalEligibleTotalWcLimit = finalEligibleTotalWcLimit;
	}

	public Double getProposedLoanAmountAdditionalLowerOf() {
		return proposedLoanAmountAdditionalLowerOf;
	}

	public void setProposedLoanAmountAdditionalLowerOf(Double proposedLoanAmountAdditionalLowerOf) {
		this.proposedLoanAmountAdditionalLowerOf = proposedLoanAmountAdditionalLowerOf;
	}

	public Double getEligibleTotalWorkingCapitalLimit() {
		return eligibleTotalWorkingCapitalLimit;
	}

	public void setEligibleTotalWorkingCapitalLimit(Double eligibleTotalWorkingCapitalLimit) {
		this.eligibleTotalWorkingCapitalLimit = eligibleTotalWorkingCapitalLimit;
	}

	public Double getExistingLoanCollateralAmount() {
		return existingLoanCollateralAmount;
	}

	public void setExistingLoanCollateralAmount(Double existingLoanCollateralAmount) {
		this.existingLoanCollateralAmount = existingLoanCollateralAmount;
	}

	public Double getFinalEligibleLoanAmount() {
		return finalEligibleLoanAmount;
	}

	public void setFinalEligibleLoanAmount(Double finalEligibleLoanAmount) {
		this.finalEligibleLoanAmount = finalEligibleLoanAmount;
	}

	public Double getAdditionalWorkingCapitalLimitLowerOf() {
		return additionalWorkingCapitalLimitLowerOf;
	}

	public void setAdditionalWorkingCapitalLimitLowerOf(Double additionalWorkingCapitalLimitLowerOf) {
		this.additionalWorkingCapitalLimitLowerOf = additionalWorkingCapitalLimitLowerOf;
	}

	public Double getFinalEligibleAdditionalLoanAmount() {
		return finalEligibleAdditionalLoanAmount;
	}

	public void setFinalEligibleAdditionalLoanAmount(Double finalEligibleAdditionalLoanAmount) {
		this.finalEligibleAdditionalLoanAmount = finalEligibleAdditionalLoanAmount;
	}

	public Double getTotalWorkingCapitalLimitDSCR() {
		return totalWorkingCapitalLimitDSCR;
	}

	public void setTotalWorkingCapitalLimitDSCR(Double totalWorkingCapitalLimitDSCR) {
		this.totalWorkingCapitalLimitDSCR = totalWorkingCapitalLimitDSCR;
	}

	public Double getAdditionalWorkingCapitalLimitDSCR() {
		return additionalWorkingCapitalLimitDSCR;
	}

	public void setAdditionalWorkingCapitalLimitDSCR(Double additionalWorkingCapitalLimitDSCR) {
		this.additionalWorkingCapitalLimitDSCR = additionalWorkingCapitalLimitDSCR;
	}

	public Double getAdditionalWorkingCapitalLimitColleteral() {
		return additionalWorkingCapitalLimitColleteral;
	}

	public void setAdditionalWorkingCapitalLimitColleteral(Double additionalWorkingCapitalLimitColleteral) {
		this.additionalWorkingCapitalLimitColleteral = additionalWorkingCapitalLimitColleteral;
	}

	public Double getTotalWorkingCapitalLimitCollateral() {
		return totalWorkingCapitalLimitCollateral;
	}

	public void setTotalWorkingCapitalLimitCollateral(Double totalWorkingCapitalLimitCollateral) {
		this.totalWorkingCapitalLimitCollateral = totalWorkingCapitalLimitCollateral;
	}

	public Double getTotalCollateralAvailable() {
		return totalCollateralAvailable;
	}

	public void setTotalCollateralAvailable(Double totalCollateralAvailable) {
		this.totalCollateralAvailable = totalCollateralAvailable;
	}

	public Double getTotalWorkingCapitalLimitTOL() {
		return totalWorkingCapitalLimitTOL;
	}

	public void setTotalWorkingCapitalLimitTOL(Double totalWorkingCapitalLimitTOL) {
		this.totalWorkingCapitalLimitTOL = totalWorkingCapitalLimitTOL;
	}

	public Double getAdditionalWorkingCapitalLimitTOL() {
		return additionalWorkingCapitalLimitTOL;
	}

	public void setAdditionalWorkingCapitalLimitTOL(Double additionalWorkingCapitalLimitTOL) {
		this.additionalWorkingCapitalLimitTOL = additionalWorkingCapitalLimitTOL;
	}

	public Double getExistingAndAdditionalLoanMaxAmount() {
		return existingAndAdditionalLoanMaxAmount;
	}

	public void setExistingAndAdditionalLoanMaxAmount(Double existingAndAdditionalLoanMaxAmount) {
		this.existingAndAdditionalLoanMaxAmount = existingAndAdditionalLoanMaxAmount;
	}

	public Boolean getIsMsmeNewAssmentType() {
		return isMsmeNewAssmentType;
	}

	public void setIsMsmeNewAssmentType(Boolean isMsmeNewAssmentType) {
		this.isMsmeNewAssmentType = isMsmeNewAssmentType;
	}

	public Double getTermLoanBasedOnCashFlow() {
		return termLoanBasedOnCashFlow;
	}

	public void setTermLoanBasedOnCashFlow(Double termLoanBasedOnCashFlow) {
		this.termLoanBasedOnCashFlow = termLoanBasedOnCashFlow;
	}

	public Double getFinalTotalTermLoanAmount() {
		return finalTotalTermLoanAmount;
	}

	public void setFinalTotalTermLoanAmount(Double finalTotalTermLoanAmount) {
		this.finalTotalTermLoanAmount = finalTotalTermLoanAmount;
	}

	public Double getProposedLoanAmountFsAdditional() {
		return proposedLoanAmountFsAdditional;
	}

	public void setProposedLoanAmountFsAdditional(Double proposedLoanAmountFsAdditional) {
		this.proposedLoanAmountFsAdditional = proposedLoanAmountFsAdditional;
	}

	public Double getFinalTotalWorkingCapitalLimit() {
		return finalTotalWorkingCapitalLimit;
	}

	public void setFinalTotalWorkingCapitalLimit(Double finalTotalWorkingCapitalLimit) {
		this.finalTotalWorkingCapitalLimit = finalTotalWorkingCapitalLimit;
	}

	public Double getFinalAdditionalWorkingCapitalLimit() {
		return finalAdditionalWorkingCapitalLimit;
	}

	public void setFinalAdditionalWorkingCapitalLimit(Double finalAdditionalWorkingCapitalLimit) {
		this.finalAdditionalWorkingCapitalLimit = finalAdditionalWorkingCapitalLimit;
	}

	public Double getFinalExisitingWorkingCapitalLimit() {
		return finalExisitingWorkingCapitalLimit;
	}

	public void setFinalExisitingWorkingCapitalLimit(Double finalExisitingWorkingCapitalLimit) {
		this.finalExisitingWorkingCapitalLimit = finalExisitingWorkingCapitalLimit;
	}

	public Double getEligibleTotalWorkingLimit() {
		return eligibleTotalWorkingLimit;
	}

	public void setEligibleTotalWorkingLimit(Double eligibleTotalWorkingLimit) {
		this.eligibleTotalWorkingLimit = eligibleTotalWorkingLimit;
	}

	public Double getAdditionalWorkingCapitalLimit() {
		return additionalWorkingCapitalLimit;
	}

	public void setAdditionalWorkingCapitalLimit(Double additionalWorkingCapitalLimit) {
		this.additionalWorkingCapitalLimit = additionalWorkingCapitalLimit;
	}

	public Double getFinalAdditionalTermLoanAmount() {
		return finalAdditionalTermLoanAmount;
	}

	public void setFinalAdditionalTermLoanAmount(Double finalAdditionalTermLoanAmount) {
		this.finalAdditionalTermLoanAmount = finalAdditionalTermLoanAmount;
	}

	public Double getTotalWCLimitBasedOnCashFlow() {
		return totalWCLimitBasedOnCashFlow;
	}

	public void setTotalWCLimitBasedOnCashFlow(Double totalWCLimitBasedOnCashFlow) {
		this.totalWCLimitBasedOnCashFlow = totalWCLimitBasedOnCashFlow;
	}

	public Double getFinalAdditionalLimit() {
		return finalAdditionalLimit;
	}

	public void setFinalAdditionalLimit(Double finalAdditionalLimit) {
		this.finalAdditionalLimit = finalAdditionalLimit;
	}

	public Double getAdditionalWcLimit() {
		return additionalWcLimit;
	}

	public void setAdditionalWcLimit(Double additionalWcLimit) {
		this.additionalWcLimit = additionalWcLimit;
	}

	public Double getFinalExistingLimit() {
		return finalExistingLimit;
	}

	public void setFinalExistingLimit(Double finalExistingLimit) {
		this.finalExistingLimit = finalExistingLimit;
	}

	public Double getAdditionalLimit() {
		return additionalLimit;
	}

	public void setAdditionalLimit(Double additionalLimit) {
		this.additionalLimit = additionalLimit;
	}

	public Double getMaximumTotalLimitSetLender() {
		return maximumTotalLimitSetLender;
	}

	public void setMaximumTotalLimitSetLender(Double maximumTotalLimitSetLender) {
		this.maximumTotalLimitSetLender = maximumTotalLimitSetLender;
	}

	public Double getTotalWorkingCapitalLimit() {
		return totalWorkingCapitalLimit;
	}

	public void setTotalWorkingCapitalLimit(Double totalWorkingCapitalLimit) {
		this.totalWorkingCapitalLimit = totalWorkingCapitalLimit;
	}

	/**
	 * @return the defaultHistoricSales
	 */
	public Double getDefaultHistoricSales() {
		return defaultHistoricSales;
	}

	/**
	 * @param defaultHistoricSales the defaultHistoricSales to set
	 */
	public void setDefaultHistoricSales(Double defaultHistoricSales) {
		this.defaultHistoricSales = defaultHistoricSales;
	}

	public Double getLoanAmountUsingDSCR() {
		return loanAmountUsingDSCR;
	}

	public void setLoanAmountUsingDSCR(Double loanAmountUsingDSCR) {
		this.loanAmountUsingDSCR = loanAmountUsingDSCR;
	}

	public Double getTotalFinArrEMI() {
		return totalFinArrEMI;
	}

	public void setTotalFinArrEMI(Double totalFinArrEMI) {
		this.totalFinArrEMI = totalFinArrEMI;
	}

	public Double getTotalFinArrEMiDir() {
		return totalFinArrEMiDir;
	}

	public void setTotalFinArrEMiDir(Double totalFinArrEMiDir) {
		this.totalFinArrEMiDir = totalFinArrEMiDir;
	}

	public Double getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(Double depreciation) {
		this.depreciation = depreciation;
	}

	public Double getOpProfitBeforeIntrest() {
		return opProfitBeforeIntrest;
	}

	public void setOpProfitBeforeIntrest(Double opProfitBeforeIntrest) {
		this.opProfitBeforeIntrest = opProfitBeforeIntrest;
	}

	public Boolean getIsDSCRType() {
		return isDSCRType;
	}

	public void setIsDSCRType(Boolean isDSCRType) {
		this.isDSCRType = isDSCRType;
	}

	public Boolean getIsTOLAndTNWType() {
		return isTOLAndTNWType;
	}

	public void setIsTOLAndTNWType(Boolean isTOLAndTNWType) {
		this.isTOLAndTNWType = isTOLAndTNWType;
	}

	public Boolean getIsCollateralCoverageType() {
		return isCollateralCoverageType;
	}

	public void setIsCollateralCoverageType(Boolean isCollateralCoverageType) {
		this.isCollateralCoverageType = isCollateralCoverageType;
	}

	public Double getWorkingCapitalLimitDSCR() {
		return workingCapitalLimitDSCR;
	}

	public void setWorkingCapitalLimitDSCR(Double workingCapitalLimitDSCR) {
		this.workingCapitalLimitDSCR = workingCapitalLimitDSCR;
	}

	public Double getBankFinanceExistingPlusAdditional() {
		return bankFinanceExistingPlusAdditional;
	}

	public void setBankFinanceExistingPlusAdditional(Double bankFinanceExistingPlusAdditional) {
		this.bankFinanceExistingPlusAdditional = bankFinanceExistingPlusAdditional;
	}

	public Double getEligibleBankFinanceTakeOver() {
		return eligibleBankFinanceTakeOver;
	}

	public void setEligibleBankFinanceTakeOver(Double eligibleBankFinanceTakeOver) {
		this.eligibleBankFinanceTakeOver = eligibleBankFinanceTakeOver;
	}

	public Double getNetEligibleBankFinanceFirst() {
		return netEligibleBankFinanceFirst;
	}

	public void setNetEligibleBankFinanceFirst(Double netEligibleBankFinanceFirst) {
		this.netEligibleBankFinanceFirst = netEligibleBankFinanceFirst;
	}

	public Double getFinalAdditionalLoanAmountFirst() {
		return finalAdditionalLoanAmountFirst;
	}

	public void setFinalAdditionalLoanAmountFirst(Double finalAdditionalLoanAmountFirst) {
		this.finalAdditionalLoanAmountFirst = finalAdditionalLoanAmountFirst;
	}

	public Double getFinalValueExistingLoanStepFirst() {
		return finalValueExistingLoanStepFirst;
	}

	public void setFinalValueExistingLoanStepFirst(Double finalValueExistingLoanStepFirst) {
		this.finalValueExistingLoanStepFirst = finalValueExistingLoanStepFirst;
	}

	public Double getFinalNetEligibleBankFinance() {
		return finalNetEligibleBankFinance;
	}

	public void setFinalNetEligibleBankFinance(Double finalNetEligibleBankFinance) {
		this.finalNetEligibleBankFinance = finalNetEligibleBankFinance;
	}

	public Double getFinalTotalAmountTOL() {
		return finalTotalAmountTOL;
	}

	public void setFinalTotalAmountTOL(Double finalTotalAmountTOL) {
		this.finalTotalAmountTOL = finalTotalAmountTOL;
	}

	public Double getFinalAdditionalAmountTOL() {
		return finalAdditionalAmountTOL;
	}

	public void setFinalAdditionalAmountTOL(Double finalAdditionalAmountTOL) {
		this.finalAdditionalAmountTOL = finalAdditionalAmountTOL;
	}

	public Double getFinalValueExistingLoanTOL() {
		return finalValueExistingLoanTOL;
	}

	public void setFinalValueExistingLoanTOL(Double finalValueExistingLoanTOL) {
		this.finalValueExistingLoanTOL = finalValueExistingLoanTOL;
	}

	public Double getFinalAdditionalLoanAmountCollateral() {
		return finalAdditionalLoanAmountCollateral;
	}

	public void setFinalAdditionalLoanAmountCollateral(Double finalAdditionalLoanAmountCollateral) {
		this.finalAdditionalLoanAmountCollateral = finalAdditionalLoanAmountCollateral;
	}

	public Double getFinalValueExistingLoanCollateral() {
		return finalValueExistingLoanCollateral;
	}

	public void setFinalValueExistingLoanCollateral(Double finalValueExistingLoanCollateral) {
		this.finalValueExistingLoanCollateral = finalValueExistingLoanCollateral;
	}

	public Double getFinalTotalLoanAmountCollateral() {
		return finalTotalLoanAmountCollateral;
	}

	public void setFinalTotalLoanAmountCollateral(Double finalTotalLoanAmountCollateral) {
		this.finalTotalLoanAmountCollateral = finalTotalLoanAmountCollateral;
	}

	public Double getFinalAdditionalAmountDSCR() {
		return finalAdditionalAmountDSCR;
	}

	public void setFinalAdditionalAmountDSCR(Double finalAdditionalAmountDSCR) {
		this.finalAdditionalAmountDSCR = finalAdditionalAmountDSCR;
	}

	public Double getFinalTotalAmountDSCR() {
		return finalTotalAmountDSCR;
	}

	public void setFinalTotalAmountDSCR(Double finalTotalAmountDSCR) {
		this.finalTotalAmountDSCR = finalTotalAmountDSCR;
	}

	public Double getFinalValueExistingLoanDSCR() {
		return finalValueExistingLoanDSCR;
	}

	public void setFinalValueExistingLoanDSCR(Double finalValueExistingLoanDSCR) {
		this.finalValueExistingLoanDSCR = finalValueExistingLoanDSCR;
	}

	public Double getLowerOfAHAJ() {
		return lowerOfAHAJ;
	}

	public void setLowerOfAHAJ(Double lowerOfAHAJ) {
		this.lowerOfAHAJ = lowerOfAHAJ;
	}

	public Double getLowerOfAmountAHAIANDAJ() {
		return lowerOfAmountAHAIANDAJ;
	}

	public void setLowerOfAmountAHAIANDAJ(Double lowerOfAmountAHAIANDAJ) {
		this.lowerOfAmountAHAIANDAJ = lowerOfAmountAHAIANDAJ;
	}

	public CLEligibilityRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public Double getFinalNetEligibleBankFinanceTOL() {
		return finalNetEligibleBankFinanceTOL;
	}

	public void setFinalNetEligibleBankFinanceTOL(Double finalNetEligibleBankFinanceTOL) {
		this.finalNetEligibleBankFinanceTOL = finalNetEligibleBankFinanceTOL;
	}

	public Double getLowerOfRAndO() {
		return lowerOfRAndO;
	}

	public void setLowerOfRAndO(Double lowerOfRAndO) {
		this.lowerOfRAndO = lowerOfRAndO;
	}

	public Double getLowerOfAmountOQR() {
		return lowerOfAmountOQR;
	}

	public void setLowerOfAmountOQR(Double lowerOfAmountOQR) {
		this.lowerOfAmountOQR = lowerOfAmountOQR;
	}

	public Double getDebtors() {
		return debtors;
	}

	public void setDebtors(Double debtors) {
		this.debtors = debtors;
	}

	public Double getSalesdataDomesticAndExport() {
		return salesdataDomesticAndExport;
	}

	public void setSalesdataDomesticAndExport(Double salesdataDomesticAndExport) {
		this.salesdataDomesticAndExport = salesdataDomesticAndExport;
	}

	public Double getWorkingCapitalLimitBasedProjSales() {
		return workingCapitalLimitBasedProjSales;
	}

	public void setWorkingCapitalLimitBasedProjSales(Double workingCapitalLimitBasedProjSales) {
		this.workingCapitalLimitBasedProjSales = workingCapitalLimitBasedProjSales;
	}

	public Double getLowerOfRUndS() {
		return lowerOfRUndS;
	}

	public void setLowerOfRUndS(Double lowerOfRUndS) {
		this.lowerOfRUndS = lowerOfRUndS;
	}

	public Double getLowerOfAmountVXAndY() {
		return lowerOfAmountVXAndY;
	}

	public void setLowerOfAmountVXAndY(Double lowerOfAmountVXAndY) {
		this.lowerOfAmountVXAndY = lowerOfAmountVXAndY;
	}

	public Double getLowerOfVYndW() {
		return lowerOfVYndW;
	}

	public void setLowerOfVYndW(Double lowerOfVYndW) {
		this.lowerOfVYndW = lowerOfVYndW;
	}

	public Double getLowerOfWZndX() {
		return lowerOfWZndX;
	}

	public void setLowerOfWZndX(Double lowerOfWZndX) {
		this.lowerOfWZndX = lowerOfWZndX;
	}

	public Double getLowerOfAmountWYAndZ() {
		return lowerOfAmountWYAndZ;
	}

	public void setLowerOfAmountWYAndZ(Double lowerOfAmountWYAndZ) {
		this.lowerOfAmountWYAndZ = lowerOfAmountWYAndZ;
	}

	public Double getComputedIncrementalMarginBasedExistingMargin() {
		return computedIncrementalMarginBasedExistingMargin;
	}

	public void setComputedIncrementalMarginBasedExistingMargin(Double computedIncrementalMarginBasedExistingMargin) {
		this.computedIncrementalMarginBasedExistingMargin = computedIncrementalMarginBasedExistingMargin;
	}

	public Double getCibilExistingLimit() {
		return cibilExistingLimit;
	}

	public void setCibilExistingLimit(Double cibilExistingLimit) {
		this.cibilExistingLimit = cibilExistingLimit;
	}

	public Double getFinalAdditionalLoanAmount() {
		return finalAdditionalLoanAmount;
	}

	public void setFinalAdditionalLoanAmount(Double finalAdditionalLoanAmount) {
		this.finalAdditionalLoanAmount = finalAdditionalLoanAmount;
	}

	public Double getLowerOfLOAndM() {
		return lowerOfLOAndM;
	}

	public void setLowerOfLOAndM(Double lowerOfLOAndM) {
		this.lowerOfLOAndM = lowerOfLOAndM;
	}

	public Double getAvailableCashAccrualsPerMonth() {
		return availableCashAccrualsPerMonth;
	}

	public void setAvailableCashAccrualsPerMonth(Double availableCashAccrualsPerMonth) {
		this.availableCashAccrualsPerMonth = availableCashAccrualsPerMonth;
	}

	public Double getProposedLoanAmountAdditional() {
		return proposedLoanAmountAdditional;
	}

	public void setProposedLoanAmountAdditional(Double proposedLoanAmountAdditional) {
		this.proposedLoanAmountAdditional = proposedLoanAmountAdditional;
	}

	public Double getFpAdditionalMaxLoanAmount() {
		return fpAdditionalMaxLoanAmount;
	}

	public void setFpAdditionalMaxLoanAmount(Double fpAdditionalMaxLoanAmount) {
		this.fpAdditionalMaxLoanAmount = fpAdditionalMaxLoanAmount;
	}

	public Double getBankFinanceBasedOnCashFlow() {
		return bankFinanceBasedOnCashFlow;
	}

	public void setBankFinanceBasedOnCashFlow(Double bankFinanceBasedOnCashFlow) {
		this.bankFinanceBasedOnCashFlow = bankFinanceBasedOnCashFlow;
	}

	public Double getNetEligibleBankFianceAdditionalLoan() {
		return netEligibleBankFianceAdditionalLoan;
	}

	public void setNetEligibleBankFianceAdditionalLoan(Double netEligibleBankFianceAdditionalLoan) {
		this.netEligibleBankFianceAdditionalLoan = netEligibleBankFianceAdditionalLoan;
	}

	public Double getNetEligibleBankFinanceExistingLoan() {
		return netEligibleBankFinanceExistingLoan;
	}

	public void setNetEligibleBankFinanceExistingLoan(Double netEligibleBankFinanceExistingLoan) {
		this.netEligibleBankFinanceExistingLoan = netEligibleBankFinanceExistingLoan;
	}

	public Double getBankFinanceAdditionalLoan() {
		return bankFinanceAdditionalLoan;
	}

	public void setBankFinanceAdditionalLoan(Double bankFinanceAdditionalLoan) {
		this.bankFinanceAdditionalLoan = bankFinanceAdditionalLoan;
	}

	public Double getBankFinanceExistingLoan() {
		return bankFinanceExistingLoan;
	}

	public void setBankFinanceExistingLoan(Double bankFinanceExistingLoan) {
		this.bankFinanceExistingLoan = bankFinanceExistingLoan;
	}

	public Double getAvailableCashAccuralsperMonth() {
		return availableCashAccuralsperMonth;
	}

	public void setAvailableCashAccuralsperMonth(Double availableCashAccuralsperMonth) {
		this.availableCashAccuralsperMonth = availableCashAccuralsperMonth;
	}

	public Double getLowerOfAmountRTAndU() {
		return lowerOfAmountRTAndU;
	}

	public void setLowerOfAmountRTAndU(Double lowerOfAmountRTAndU) {
		this.lowerOfAmountRTAndU = lowerOfAmountRTAndU;
	}

	public Integer getLoanArrangeMentFpSelectionType() {
		return loanArrangeMentFpSelectionType;
	}

	public void setLoanArrangeMentFpSelectionType(Integer loanArrangeMentFpSelectionType) {
		this.loanArrangeMentFpSelectionType = loanArrangeMentFpSelectionType;
	}

	public Double getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(Double manufacturing) {
		this.manufacturing = manufacturing;
	}

	public Double getService() {
		return service;
	}

	public void setService(Double service) {
		this.service = service;
	}

	public Double getTrading() {
		return trading;
	}

	public void setTrading(Double trading) {
		this.trading = trading;
	}

	public Double getBankFinanceBasedCashFlow() {
		return bankFinanceBasedCashFlow;
	}

	public void setBankFinanceBasedCashFlow(Double bankFinanceBasedCashFlow) {
		this.bankFinanceBasedCashFlow = bankFinanceBasedCashFlow;
	}

	public Double getResultCandA() {
		return resultCandA;
	}

	public void setResultCandA(Double resultCandA) {
		this.resultCandA = resultCandA;
	}

	public Double getResultBandA() {
		return resultBandA;
	}

	public void setResultBandA(Double resultBandA) {
		this.resultBandA = resultBandA;
	}

	public Double getFsAdditionalLoanAmount() {
		return fsAdditionalLoanAmount;
	}

	public void setFsAdditionalLoanAmount(Double fsAdditionalLoanAmount) {
		this.fsAdditionalLoanAmount = fsAdditionalLoanAmount;
	}

	public Double getExistingLoan() {
		return existingLoan;
	}

	public void setExistingLoan(Double existingLoan) {
		this.existingLoan = existingLoan;
	}

	public Double getLowerOfGAndI() {
		return lowerOfGAndI;
	}

	public void setLowerOfGAndI(Double lowerOfGAndI) {
		this.lowerOfGAndI = lowerOfGAndI;
	}

	public Double getLowerOfAmountEHAndI() {
		return lowerOfAmountEHAndI;
	}

	public void setLowerOfAmountEHAndI(Double lowerOfAmountEHAndI) {
		this.lowerOfAmountEHAndI = lowerOfAmountEHAndI;
	}

	public Double getFinalValueExistingLoan() {
		return finalValueExistingLoan;
	}

	public void setFinalValueExistingLoan(Double finalValueExistingLoan) {
		this.finalValueExistingLoan = finalValueExistingLoan;
	}

	public Double getLowerOfAmountLNAndO() {
		return lowerOfAmountLNAndO;
	}

	public void setLowerOfAmountLNAndO(Double lowerOfAmountLNAndO) {
		this.lowerOfAmountLNAndO = lowerOfAmountLNAndO;
	}

	public Double getFinalTotalLoanAmount() {
		return finalTotalLoanAmount;
	}

	public void setFinalTotalLoanAmount(Double finalTotalLoanAmount) {
		this.finalTotalLoanAmount = finalTotalLoanAmount;
	}

	public Double getLowerOfLAndO() {
		return lowerOfLAndO;
	}

	public void setLowerOfLAndO(Double lowerOfLAndO) {
		this.lowerOfLAndO = lowerOfLAndO;
	}

	public Double getNetEligibleBankFinanceExisting() {
		return netEligibleBankFinanceExisting;
	}

	public void setNetEligibleBankFinanceExisting(Double netEligibleBankFinanceExisting) {
		this.netEligibleBankFinanceExisting = netEligibleBankFinanceExisting;
	}

	public Double getBankFinanceBasedOnCashFlowFirstExisting() {
		return bankFinanceBasedOnCashFlowFirstExisting;
	}

	public void setBankFinanceBasedOnCashFlowFirstExisting(Double bankFinanceBasedOnCashFlowFirstExisting) {
		this.bankFinanceBasedOnCashFlowFirstExisting = bankFinanceBasedOnCashFlowFirstExisting;
	}

	public Double getBankFinanceBasedOnCashFlowSecond() {
		return bankFinanceBasedOnCashFlowSecond;
	}

	public void setBankFinanceBasedOnCashFlowSecond(Double bankFinanceBasedOnCashFlowSecond) {
		this.bankFinanceBasedOnCashFlowSecond = bankFinanceBasedOnCashFlowSecond;
	}

	public Double getCashAccuralsPerMonths() {
		return cashAccuralsPerMonths;
	}

	public void setCashAccuralsPerMonths(Double cashAccuralsPerMonths) {
		this.cashAccuralsPerMonths = cashAccuralsPerMonths;
	}

	public Double getFpMaxTotalAmount() {
		return fpMaxTotalAmount;
	}

	public void setFpMaxTotalAmount(Double fpMaxTotalAmount) {
		this.fpMaxTotalAmount = fpMaxTotalAmount;
	}

	public Double getExistingAndAdditionalTotalLoanMaxAmount() {
		return existingAndAdditionalTotalLoanMaxAmount;
	}

	public void setExistingAndAdditionalTotalLoanMaxAmount(Double existingAndAdditionalTotalLoanMaxAmount) {
		this.existingAndAdditionalTotalLoanMaxAmount = existingAndAdditionalTotalLoanMaxAmount;
	}

	public Double getFpMaxAdditionalAmount() {
		return fpMaxAdditionalAmount;
	}

	public void setFpMaxAdditionalAmount(Double fpMaxAdditionalAmount) {
		this.fpMaxAdditionalAmount = fpMaxAdditionalAmount;
	}

	public Double getExistingPlusAdditional() {
		return existingPlusAdditional;
	}

	public void setExistingPlusAdditional(Double existingPlusAdditional) {
		this.existingPlusAdditional = existingPlusAdditional;
	}

	public Double getNetEligibleBankFinance() {
		return netEligibleBankFinance;
	}

	public void setNetEligibleBankFinance(Double netEligibleBankFinance) {
		this.netEligibleBankFinance = netEligibleBankFinance;
	}

	public Double getProjectedSales() {
		return projectedSales;
	}

	public String getSubSector() {
		return subSector;
	}

	public void setSubSector(String subSector) {
		this.subSector = subSector;
	}

	public void setProjectedSales(Double projectedSales) {
		this.projectedSales = projectedSales;
	}

	public Double getWorkingCapitalGap() {
		return workingCapitalGap;
	}

	public void setWorkingCapitalGap(Double workingCapitalGap) {
		this.workingCapitalGap = workingCapitalGap;
	}

	public Double getWorkingCapitalLimit() {
		return workingCapitalLimit;
	}

	public void setWorkingCapitalLimit(Double workingCapitalLimit) {
		this.workingCapitalLimit = workingCapitalLimit;
	}

	public Double getCashAccruals() {
		return cashAccruals;
	}

	public void setCashAccruals(Double cashAccruals) {
		this.cashAccruals = cashAccruals;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Double getAvailableCashAccrualsPerYear() {
		return availableCashAccrualsPerYear;
	}

	public void setAvailableCashAccrualsPerYear(Double availableCashAccrualsPerYear) {
		this.availableCashAccrualsPerYear = availableCashAccrualsPerYear;
	}

	public Double getAvailableCashAccrualsMonthly() {
		return availableCashAccrualsMonthly;
	}

	public void setAvailableCashAccrualsMonthly(Double availableCashAccrualsMonthly) {
		this.availableCashAccrualsMonthly = availableCashAccrualsMonthly;
	}

	public Double getYearlyLoanObligation() {
		return yearlyLoanObligation;
	}

	public void setYearlyLoanObligation(Double yearlyLoanObligation) {
		this.yearlyLoanObligation = yearlyLoanObligation;
	}

	public Double getMonthlyLoanObligation() {
		return monthlyLoanObligation;
	}

	public void setMonthlyLoanObligation(Double monthlyLoanObligation) {
		this.monthlyLoanObligation = monthlyLoanObligation;
	}

	public Double getAvailableCashAccrualsNewLoan() {
		return availableCashAccrualsNewLoan;
	}

	public void setAvailableCashAccrualsNewLoan(Double availableCashAccrualsNewLoan) {
		this.availableCashAccrualsNewLoan = availableCashAccrualsNewLoan;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(Double loanAmt) {
		this.loanAmt = loanAmt;
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

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
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

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getExistingCashMargin() {
		return existingCashMargin;
	}

	public void setExistingCashMargin(Double existingCashMargin) {
		this.existingCashMargin = existingCashMargin;
	}

	public Double getGrossFixedAssetsLastestFinancials() {
		return grossFixedAssetsLastestFinancials;
	}

	public void setGrossFixedAssetsLastestFinancials(Double grossFixedAssetsLastestFinancials) {
		this.grossFixedAssetsLastestFinancials = grossFixedAssetsLastestFinancials;
	}

	public Double getTurnOverAsPerLatestItr() {
		return turnOverAsPerLatestItr;
	}

	public void setTurnOverAsPerLatestItr(Double turnOverAsPerLatestItr) {
		this.turnOverAsPerLatestItr = turnOverAsPerLatestItr;
	}

	public Double getTurnOverGfaRatio() {
		return turnOverGfaRatio;
	}

	public void setTurnOverGfaRatio(Double turnOverGfaRatio) {
		this.turnOverGfaRatio = turnOverGfaRatio;
	}

	public Double getCostMachineryEquipmentPurchased() {
		return costMachineryEquipmentPurchased;
	}

	public void setCostMachineryEquipmentPurchased(Double costMachineryEquipmentPurchased) {
		this.costMachineryEquipmentPurchased = costMachineryEquipmentPurchased;
	}

	public Double getIncrementalTurnOverLimitComputed() {
		return incrementalTurnOverLimitComputed;
	}

	public void setIncrementalTurnOverLimitComputed(Double incrementalTurnOverLimitComputed) {
		this.incrementalTurnOverLimitComputed = incrementalTurnOverLimitComputed;
	}

	public Double getIncrementalTurnOver() {
		return incrementalTurnOver;
	}

	public void setIncrementalTurnOver(Double incrementalTurnOver) {
		this.incrementalTurnOver = incrementalTurnOver;
	}

	public Double getIncrementalCashMargin() {
		return incrementalCashMargin;
	}

	public void setIncrementalCashMargin(Double incrementalCashMargin) {
		this.incrementalCashMargin = incrementalCashMargin;
	}

	public Double getTotalCashMargin() {
		return totalCashMargin;
	}

	public void setTotalCashMargin(Double totalCashMargin) {
		this.totalCashMargin = totalCashMargin;
	}

	public Double getFixedIncomeObligations() {
		return fixedIncomeObligations;
	}

	public void setFixedIncomeObligations(Double fixedIncomeObligations) {
		this.fixedIncomeObligations = fixedIncomeObligations;
	}

	public Double getAvailableCashMargin() {
		return availableCashMargin;
	}

	public void setAvailableCashMargin(Double availableCashMargin) {
		this.availableCashMargin = availableCashMargin;
	}

	public Double getMonthlyCashMargin() {
		return monthlyCashMargin;
	}

	public void setMonthlyCashMargin(Double monthlyCashMargin) {
		this.monthlyCashMargin = monthlyCashMargin;
	}

	public Double getMonthlyLoanObligations() {
		return monthlyLoanObligations;
	}

	public void setMonthlyLoanObligations(Double monthlyLoanObligations) {
		this.monthlyLoanObligations = monthlyLoanObligations;
	}

	public Double getAvailableCashMarginsFoNew() {
		return availableCashMarginsFoNew;
	}

	public void setAvailableCashMarginsFoNew(Double availableCashMarginsFoNew) {
		this.availableCashMarginsFoNew = availableCashMarginsFoNew;
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

	public Double getAveragePerMonthObligation() {
		return averagePerMonthObligation;
	}

	public void setAveragePerMonthObligation(Double averagePerMonthObligation) {
		this.averagePerMonthObligation = averagePerMonthObligation;
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

	public Double getTotalEligibleLoanAmount() {
		return totalEligibleLoanAmount;
	}

	public void setTotalEligibleLoanAmount(Double totalEligibleLoanAmount) {
		this.totalEligibleLoanAmount = totalEligibleLoanAmount;
	}

	public Double getEligibleBankFinance() {
		return eligibleBankFinance;
	}

	public void setEligibleBankFinance(Double eligibleBankFinance) {
		this.eligibleBankFinance = eligibleBankFinance;
	}

	public Double getMonthlyObligation() {
		return monthlyObligation;
	}

	public void setMonthlyObligation(Double monthlyObligation) {
		this.monthlyObligation = monthlyObligation;
	}

	public Double getTotalCurrentAssets() {
		return totalCurrentAssets;
	}

	public void setTotalCurrentAssets(Double totalCurrentAssets) {
		this.totalCurrentAssets = totalCurrentAssets;
	}

	public Double getOtherCurrentLiabilities() {
		return otherCurrentLiabilities;
	}

	public void setOtherCurrentLiabilities(Double otherCurrentLiabilities) {
		this.otherCurrentLiabilities = otherCurrentLiabilities;
	}

	public Double getCurrentRatio() {
		return currentRatio;
	}

	public void setCurrentRatio(Double currentRatio) {
		this.currentRatio = currentRatio;
	}

	public Double getIncrementalTurnOverLowerOf() {
		return incrementalTurnOverLowerOf;
	}

	public void setIncrementalTurnOverLowerOf(Double incrementalTurnOverLowerOf) {
		this.incrementalTurnOverLowerOf = incrementalTurnOverLowerOf;
	}

	public Double getMargin() {
		return margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
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

	public List<CLEligibilityRequest> getDirectorsCalculations() {
		return directorsCalculations;
	}

	public void setDirectorsCalculations(List<CLEligibilityRequest> directorsCalculations) {
		this.directorsCalculations = directorsCalculations;
	}

	public Double getCostOfNewMachineryEquipmentPurchased() {
		return costOfNewMachineryEquipmentPurchased;
	}

	public void setCostOfNewMachineryEquipmentPurchased(Double costOfNewMachineryEquipmentPurchased) {
		this.costOfNewMachineryEquipmentPurchased = costOfNewMachineryEquipmentPurchased;
	}

	public Double getIncrementalMarginMentionBorrower() {
		return incrementalMarginMentionBorrower;
	}

	public void setIncrementalMarginMentionBorrower(Double incrementalMarginMentionBorrower) {
		this.incrementalMarginMentionBorrower = incrementalMarginMentionBorrower;
	}

	public Double getCapOnCashMarginInvestMent() {
		return capOnCashMarginInvestMent;
	}

	public void setCapOnCashMarginInvestMent(Double capOnCashMarginInvestMent) {
		this.capOnCashMarginInvestMent = capOnCashMarginInvestMent;
	}

	public Double getValueOfCashMarginPerAnnum() {
		return valueOfCashMarginPerAnnum;
	}

	public void setValueOfCashMarginPerAnnum(Double valueOfCashMarginPerAnnum) {
		this.valueOfCashMarginPerAnnum = valueOfCashMarginPerAnnum;
	}

	public Double getFinalIncrementalCashMarginLowerof() {
		return finalIncrementalCashMarginLowerof;
	}

	public void setFinalIncrementalCashMarginLowerof(Double finalIncrementalCashMarginLowerof) {
		this.finalIncrementalCashMarginLowerof = finalIncrementalCashMarginLowerof;
	}

	public Double getTotalCashFlow() {
		return totalCashFlow;
	}

	public void setTotalCashFlow(Double totalCashFlow) {
		this.totalCashFlow = totalCashFlow;
	}

	public Double getAvailableCashFlow() {
		return availableCashFlow;
	}

	public void setAvailableCashFlow(Double availableCashFlow) {
		this.availableCashFlow = availableCashFlow;
	}

	public Double getIncrementalMarginExistingMargin() {
		return incrementalMarginExistingMargin;
	}

	public void setIncrementalMarginExistingMargin(Double incrementalMarginExistingMargin) {
		this.incrementalMarginExistingMargin = incrementalMarginExistingMargin;
	}

	public Long getFpAssessmentId() {
		return fpAssessmentId;
	}

	public void setFpAssessmentId(Long fpAssessmentId) {
		this.fpAssessmentId = fpAssessmentId;
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

	public Double getTopAmount() {
		return topAmount;
	}

	public void setTopAmount(Double topAmount) {
		this.topAmount = topAmount;
	}

	public Double getItrResult() {
		return itrResult;
	}

	public void setItrResult(Double itrResult) {
		this.itrResult = itrResult;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getDscr() {
		return dscr;
	}

	public void setDscr(Double dscr) {
		this.dscr = dscr;
	}

	public Double getPayBackPeriod() {
		return payBackPeriod;
	}

	public void setPayBackPeriod(Double payBackPeriod) {
		this.payBackPeriod = payBackPeriod;
	}

	public Double getPromoterContribution() {
		return promoterContribution;
	}

	public void setPromoterContribution(Double promoterContribution) {
		this.promoterContribution = promoterContribution;
	}

	public Double getCashMarginPaybackMethod() {
		return cashMarginPaybackMethod;
	}

	public void setCashMarginPaybackMethod(Double cashMarginPaybackMethod) {
		this.cashMarginPaybackMethod = cashMarginPaybackMethod;
	}

	public Double getValueOfCashMarginPaybackPeriod() {
		return valueOfCashMarginPaybackPeriod;
	}

	public void setValueOfCashMarginPaybackPeriod(Double valueOfCashMarginPaybackPeriod) {
		this.valueOfCashMarginPaybackPeriod = valueOfCashMarginPaybackPeriod;
	}

	public Double getLoanAmountTOLAndTNW() {
		return loanAmountTOLAndTNW;
	}

	public void setLoanAmountTOLAndTNW(Double loanAmountTOLAndTNW) {
		this.loanAmountTOLAndTNW = loanAmountTOLAndTNW;
	}

	public Double getLoanAmountUsingTOLAndTNWFP() {
		return loanAmountUsingTOLAndTNWFP;
	}

	public void setLoanAmountUsingTOLAndTNWFP(Double loanAmountUsingTOLAndTNWFP) {
		this.loanAmountUsingTOLAndTNWFP = loanAmountUsingTOLAndTNWFP;
	}

	public Double getLoanAmountCollateralCoverageFp() {
		return loanAmountCollateralCoverageFp;
	}

	public void setLoanAmountCollateralCoverageFp(Double loanAmountCollateralCoverageFp) {
		this.loanAmountCollateralCoverageFp = loanAmountCollateralCoverageFp;
	}

	public Double getCollateralCovrageFS() {
		return collateralCovrageFS;
	}

	public void setCollateralCovrageFS(Double collateralCovrageFS) {
		this.collateralCovrageFS = collateralCovrageFS;
	}

	public Double getLoanAmountCollateralCoveragefinal() {
		return loanAmountCollateralCoveragefinal;
	}

	public void setLoanAmountCollateralCoveragefinal(Double loanAmountCollateralCoveragefinal) {
		this.loanAmountCollateralCoveragefinal = loanAmountCollateralCoveragefinal;
	}

	public Double getWorkingCapitalRequirement() {
		return workingCapitalRequirement;
	}

	public void setWorkingCapitalRequirement(Double workingCapitalRequirement) {
		this.workingCapitalRequirement = workingCapitalRequirement;
	}

	public Double getTotalOutsideLiabilities() {
		return totalOutsideLiabilities;
	}

	public void setTotalOutsideLiabilities(Double totalOutsideLiabilities) {
		this.totalOutsideLiabilities = totalOutsideLiabilities;
	}

	public Double getTangibleNetWorth() {
		return tangibleNetWorth;
	}

	public void setTangibleNetWorth(Double tangibleNetWorth) {
		this.tangibleNetWorth = tangibleNetWorth;
	}

	public Double gettOLAndTNJ() {
		return tOLAndTNJ;
	}

	public void settOLAndTNJ(Double tOLAndTNJ) {
		this.tOLAndTNJ = tOLAndTNJ;
	}

	public Double gettOLAndTNJMaximumK() {
		return tOLAndTNJMaximumK;
	}

	public void settOLAndTNJMaximumK(Double tOLAndTNJMaximumK) {
		this.tOLAndTNJMaximumK = tOLAndTNJMaximumK;
	}

	public Double getWorkingCapitalLimitTOL() {
		return workingCapitalLimitTOL;
	}

	public void setWorkingCapitalLimitTOL(Double workingCapitalLimitTOL) {
		this.workingCapitalLimitTOL = workingCapitalLimitTOL;
	}

	public Double getEligibleBankFinanceTOL() {
		return eligibleBankFinanceTOL;
	}

	public void setEligibleBankFinanceTOL(Double eligibleBankFinanceTOL) {
		this.eligibleBankFinanceTOL = eligibleBankFinanceTOL;
	}

	public Double getExistingLimitsTOL() {
		return existingLimitsTOL;
	}

	public void setExistingLimitsTOL(Double existingLimitsTOL) {
		this.existingLimitsTOL = existingLimitsTOL;
	}

	public Double getNetEligibleBankFinanceTOL() {
		return netEligibleBankFinanceTOL;
	}

	public void setNetEligibleBankFinanceTOL(Double netEligibleBankFinanceTOL) {
		this.netEligibleBankFinanceTOL = netEligibleBankFinanceTOL;
	}

	public Double getWorkingCapitalLimitColleteral() {
		return workingCapitalLimitColleteral;
	}

	public void setWorkingCapitalLimitColleteral(Double workingCapitalLimitColleteral) {
		this.workingCapitalLimitColleteral = workingCapitalLimitColleteral;
	}

	public Double getEligibleBankFinanceColletral() {
		return eligibleBankFinanceColletral;
	}

	public void setEligibleBankFinanceColletral(Double eligibleBankFinanceColletral) {
		this.eligibleBankFinanceColletral = eligibleBankFinanceColletral;
	}

	public Double getNeteligibleBankFinanceColletral() {
		return neteligibleBankFinanceColletral;
	}

	public void setNeteligibleBankFinanceColletral(Double neteligibleBankFinanceColletral) {
		this.neteligibleBankFinanceColletral = neteligibleBankFinanceColletral;
	}

	public Double getAmountOfColletralFsQ() {
		return amountOfColletralFsQ;
	}

	public void setAmountOfColletralFsQ(Double amountOfColletralFsQ) {
		this.amountOfColletralFsQ = amountOfColletralFsQ;
	}

	public Double getColletralCoverageFpR() {
		return colletralCoverageFpR;
	}

	public void setColletralCoverageFpR(Double colletralCoverageFpR) {
		this.colletralCoverageFpR = colletralCoverageFpR;
	}


	public Double getExistingObligationsEMIDSCR() {
		return existingObligationsEMIDSCR;
	}

	public void setExistingObligationsEMIDSCR(Double existingObligationsEMIDSCR) {
		this.existingObligationsEMIDSCR = existingObligationsEMIDSCR;
	}


	public Double getWorkingCapitalLimitAB() {
		return workingCapitalLimitAB;
	}

	public void setWorkingCapitalLimitAB(Double workingCapitalLimitAB) {
		this.workingCapitalLimitAB = workingCapitalLimitAB;
	}

	public Double getEligibleBankFinanceAD() {
		return eligibleBankFinanceAD;
	}

	public void setEligibleBankFinanceAD(Double eligibleBankFinanceAD) {
		this.eligibleBankFinanceAD = eligibleBankFinanceAD;
	}

	public Double getExistingLimitsAE() {
		return existingLimitsAE;
	}

	public void setExistingLimitsAE(Double existingLimitsAE) {
		this.existingLimitsAE = existingLimitsAE;
	}

	public Double getNetEligibleBankFinanceAF() {
		return netEligibleBankFinanceAF;
	}

	public void setNetEligibleBankFinanceAF(Double netEligibleBankFinanceAF) {
		this.netEligibleBankFinanceAF = netEligibleBankFinanceAF;
	}

	public Double getLoanAmountLowerOfAH() {
		return loanAmountLowerOfAH;
	}

	public void setLoanAmountLowerOfAH(Double loanAmountLowerOfAH) {
		this.loanAmountLowerOfAH = loanAmountLowerOfAH;
	}

	public Double getPromoterContributionDscr() {
		return promoterContributionDscr;
	}

	public void setPromoterContributionDscr(Double promoterContributionDscr) {
		this.promoterContributionDscr = promoterContributionDscr;
	}

	public Double getPromoterContributionColletral() {
		return promoterContributionColletral;
	}

	public void setPromoterContributionColletral(Double promoterContributionColletral) {
		this.promoterContributionColletral = promoterContributionColletral;
	}

	public Double getPromoterContributionTol() {
		return promoterContributionTol;
	}

	public void setPromoterContributionTol(Double promoterContributionTol) {
		this.promoterContributionTol = promoterContributionTol;
	}

	public Double getEbidtadscr() {
		return ebidtadscr;
	}

	public void setEbidtadscr(Double ebidtadscr) {
		this.ebidtadscr = ebidtadscr;
	}

	public Double getDscrz() {
		return dscrz;
	}

	public void setDscrz(Double dscrz) {
		this.dscrz = dscrz;
	}

	public Double getDscrfpaa() {
		return dscrfpaa;
	}

	public void setDscrfpaa(Double dscrfpaa) {
		this.dscrfpaa = dscrfpaa;
	}

	public Double getGrowthCalculatedFromSales() {
		return growthCalculatedFromSales;
	}

	public void setGrowthCalculatedFromSales(Double growthCalculatedFromSales) {
		this.growthCalculatedFromSales = growthCalculatedFromSales;
	}

	public Double getGrowthSetByBank() {
		return growthSetByBank;
	}

	public void setGrowthSetByBank(Double growthSetByBank) {
		this.growthSetByBank = growthSetByBank;
	}

	public Double getProjectedSalesOfPreviousFyear() {
		return projectedSalesOfPreviousFyear;
	}

	public void setProjectedSalesOfPreviousFyear(Double projectedSalesOfPreviousFyear) {
		this.projectedSalesOfPreviousFyear = projectedSalesOfPreviousFyear;
	}

	public Double getSalesOfCurrentFyear() {
		return salesOfCurrentFyear;
	}

	public void setSalesOfCurrentFyear(Double salesOfCurrentFyear) {
		this.salesOfCurrentFyear = salesOfCurrentFyear;
	}

	public Boolean getIsHistoric() {
		return isHistoric;
	}

	public void setIsHistoric(Boolean isHistoric) {
		this.isHistoric = isHistoric;
	}

	public Boolean getIsGrowth() {
		return isGrowth;
	}

	public void setIsGrowth(Boolean isGrowth) {
		this.isGrowth = isGrowth;
	}

	/**
	 * @return the isApril
	 */
	public Boolean getIsApril() {
		return isApril;
	}

	/**
	 * @param isApril the isApril to set
	 */
	public void setIsApril(Boolean isApril) {
		this.isApril = isApril;
	}

	/**
	 * @return the sales2
	 */
	public Double getSales2() {
		return sales2;
	}

	/**
	 * @param sales2 the sales2 to set
	 */
	public void setSales2(Double sales2) {
		this.sales2 = sales2;
	}

	/**
	 * @return the sales3
	 */
	public Double getSales3() {
		return sales3;
	}

	/**
	 * @param sales3 the sales3 to set
	 */
	public void setSales3(Double sales3) {
		this.sales3 = sales3;
	}

	public List<GstCamTeaserData> getGstCamTeaserDatas() {
		return gstCamTeaserDatas;
	}

	public void setGstCamTeaserDatas(List<GstCamTeaserData> gstCamTeaserDatas) {
		this.gstCamTeaserDatas = gstCamTeaserDatas;
	}

	public Double getBankFinanceTotalLoanDSCR() {
		return bankFinanceTotalLoanDSCR;
	}

	public void setBankFinanceTotalLoanDSCR(Double bankFinanceTotalLoanDSCR) {
		this.bankFinanceTotalLoanDSCR = bankFinanceTotalLoanDSCR;
	}

	/* (non-Javadoc)
	 * @see com.capitaworld.api.eligibility.model.EligibililityRequest#toString()
	 */
	@Override
	public String toString() {
		return "CLEligibilityRequest [projectedSales=" + projectedSales + ", workingCapitalLimit=" + workingCapitalLimit
				+ ", promoterContribution=" + promoterContribution + ", workingCapitalRequirement="
				+ workingCapitalRequirement + ", totalWorkingCapitalLimit=" + totalWorkingCapitalLimit
				+ ", cibilExistingLimit=" + cibilExistingLimit + ", additionalWorkingCapitalLimit="
				+ additionalWorkingCapitalLimit + ", fsAdditionalLoanAmount=" + fsAdditionalLoanAmount
				+ ", maximumTotalLimitSetLender=" + maximumTotalLimitSetLender + ", eligibleTotalWorkingLimit="
				+ eligibleTotalWorkingLimit + ", finalExisitingWorkingCapitalLimit=" + finalExisitingWorkingCapitalLimit
				+ ", finalAdditionalWorkingCapitalLimit=" + finalAdditionalWorkingCapitalLimit
				+ ", finalTotalWorkingCapitalLimit=" + finalTotalWorkingCapitalLimit + ", finalLoanAmountNew="
				+ finalLoanAmountNew + ", fpMaxAdditionalAmount=" + fpMaxAdditionalAmount
				+ ", proposedLoanAmountFsAdditional=" + proposedLoanAmountFsAdditional + ", totalCurrentAssets="
				+ totalCurrentAssets + ", otherCurrentLiabilities=" + otherCurrentLiabilities + ", additionalLimit="
				+ additionalLimit + ", fpAdditionalMaxLoanAmount=" + fpAdditionalMaxLoanAmount
				+ ", existingAndAdditionalTotalLoanMaxAmount=" + existingAndAdditionalTotalLoanMaxAmount
				+ ", finalExistingLimit=" + finalExistingLimit + ", additionalWcLimit=" + additionalWcLimit
				+ ", proposedLoanAmountAdditional=" + proposedLoanAmountAdditional + ", finalAdditionalLimit="
				+ finalAdditionalLimit + ", workingCapitalGap=" + workingCapitalGap + ", monthlyLoanObligation="
				+ monthlyLoanObligation + ", rateOfInterest=" + rateOfInterest + ", cashAccruals=" + cashAccruals
				+ ", existingCashMargin=" + existingCashMargin + ", grossFixedAssetsLastestFinancials="
				+ grossFixedAssetsLastestFinancials + ", turnOverAsPerLatestItr=" + turnOverAsPerLatestItr
				+ ", turnOverGfaRatio=" + turnOverGfaRatio + ", costMachineryEquipmentPurchased="
				+ costMachineryEquipmentPurchased + ", incrementalTurnOverLimitComputed="
				+ incrementalTurnOverLimitComputed + ", incrementalTurnOver=" + incrementalTurnOver
				+ ", incrementalCashMargin=" + incrementalCashMargin + ", incrementalTurnOverLowerOf="
				+ incrementalTurnOverLowerOf + ", totalCashMargin=" + totalCashMargin + ", monthlyCashMargin="
				+ monthlyCashMargin + ", availableCashAccrualsMonthly=" + availableCashAccrualsMonthly + ", tenure="
				+ tenure + ", finalTotalTermLoanAmount=" + finalTotalTermLoanAmount + ", availableBankFinance="
				+ availableBankFinance + ", netEligibleBankFinanceDSCR=" + netEligibleBankFinanceDSCR
				+ ", eligibleAdditionalLoanAmount=" + eligibleAdditionalLoanAmount + ", additionalLoanAmount="
				+ additionalLoanAmount + ", totalTermLoanTol=" + totalTermLoanTol + ", totalTermLoanCollateral="
				+ totalTermLoanCollateral + ", totalTermLoanDSCR=" + totalTermLoanDSCR
				+ ", additionalTermLoanTOLandTNW=" + additionalTermLoanTOLandTNW + ", additionalTermLoanDSCR="
				+ additionalTermLoanDSCR + ", additionalTermLoanCollateral=" + additionalTermLoanCollateral
				+ ", additionalEligibleTermLoan=" + additionalEligibleTermLoan + ", eligibleTotalTermLoan="
				+ eligibleTotalTermLoan + ", termLoanBasedOnCashFlow=" + termLoanBasedOnCashFlow
				+ ", existingAndAdditionalLoanMaxAmount=" + existingAndAdditionalLoanMaxAmount
				+ ", additionalWorkingCapitalLimitTOL=" + additionalWorkingCapitalLimitTOL
				+ ", totalWorkingCapitalLimitTOL=" + totalWorkingCapitalLimitTOL + ", totalCollateralAvailable="
				+ totalCollateralAvailable + ", totalWorkingCapitalLimitCollateral="
				+ totalWorkingCapitalLimitCollateral + ", additionalWorkingCapitalLimitDSCR="
				+ additionalWorkingCapitalLimitDSCR + ", finalEligibleLoanAmount=" + finalEligibleLoanAmount
				+ ", eligibleTotalWorkingCapitalLimit=" + eligibleTotalWorkingCapitalLimit
				+ ", proposedLoanAmountAdditionalLowerOf=" + proposedLoanAmountAdditionalLowerOf
				+ ", finalEligibleTotalWcLimit=" + finalEligibleTotalWcLimit + ", totalWCLimitBasedOnProjectedSales="
				+ totalWCLimitBasedOnProjectedSales + ", defaultHistoricSales=" + defaultHistoricSales + ", foir="
				+ foir + ", availableCashAccrualsPerYear=" + availableCashAccrualsPerYear + ", yearlyLoanObligation="
				+ yearlyLoanObligation + ", availableCashAccrualsNewLoan=" + availableCashAccrualsNewLoan
				+ ", computedIncrementalMarginBasedExistingMargin=" + computedIncrementalMarginBasedExistingMargin
				+ ", loanAmt=" + loanAmt + ", fixedIncomeObligations=" + fixedIncomeObligations
				+ ", availableCashMargin=" + availableCashMargin + ", monthlyLoanObligations=" + monthlyLoanObligations
				+ ", availableCashMarginsFoNew=" + availableCashMarginsFoNew + ", eligibleLoanAmount="
				+ eligibleLoanAmount + ", proposedLoanAmount=" + proposedLoanAmount + ", loanAmount=" + loanAmount
				+ ", maxLoanAmountProvidedBank=" + maxLoanAmountProvidedBank + ", perLakhEmi=" + perLakhEmi
				+ ", margin=" + margin + ", dscr=" + dscr + ", payBackPeriod=" + payBackPeriod
				+ ", averageIncomeLastSixMonths=" + averageIncomeLastSixMonths + ", averageMonthlyWithDrawal="
				+ averageMonthlyWithDrawal + ", availableIncomeNewLoan=" + availableIncomeNewLoan
				+ ", averagePerMonthInvestMents=" + averagePerMonthInvestMents + ", monthlyObligation="
				+ monthlyObligation + ", availableIncomeNewLoanMonthly=" + availableIncomeNewLoanMonthly
				+ ", eligibleMonthlyEmi=" + eligibleMonthlyEmi + ", totalEligibleLoanAmount=" + totalEligibleLoanAmount
				+ ", averagePerMonthObligation=" + averagePerMonthObligation + ", result=" + result + ", emi=" + emi
				+ ", eligibleBankFinance=" + eligibleBankFinance + ", subSector=" + subSector + ", currentRatio="
				+ currentRatio + ", directorsCalculations=" + directorsCalculations + ", gstCamTeaserDatas="
				+ gstCamTeaserDatas + ", costOfNewMachineryEquipmentPurchased=" + costOfNewMachineryEquipmentPurchased
				+ ", incrementalMarginMentionBorrower=" + incrementalMarginMentionBorrower
				+ ", capOnCashMarginInvestMent=" + capOnCashMarginInvestMent + ", valueOfCashMarginPerAnnum="
				+ valueOfCashMarginPerAnnum + ", finalIncrementalCashMarginLowerof=" + finalIncrementalCashMarginLowerof
				+ ", totalCashFlow=" + totalCashFlow + ", availableCashFlow=" + availableCashFlow
				+ ", incrementalMarginExistingMargin=" + incrementalMarginExistingMargin + ", fpAssessmentId="
				+ fpAssessmentId + ", netWorkingLimit=" + netWorkingLimit + ", existingLimits=" + existingLimits
				+ ", topAmount=" + topAmount + ", itrSalary=" + itrSalary + ", oneFormSalary=" + oneFormSalary
				+ ", bankStatementSalary=" + bankStatementSalary + ", itrResult=" + itrResult + ", loanType=" + loanType
				+ ", cashMarginPaybackMethod=" + cashMarginPaybackMethod + ", valueOfCashMarginPaybackPeriod="
				+ valueOfCashMarginPaybackPeriod + ", loanAmountTOLAndTNW=" + loanAmountTOLAndTNW
				+ ", loanAmountUsingTOLAndTNWFP=" + loanAmountUsingTOLAndTNWFP + ", loanAmountCollateralCoverageFp="
				+ loanAmountCollateralCoverageFp + ", collateralCovrageFS=" + collateralCovrageFS
				+ ", loanAmountCollateralCoveragefinal=" + loanAmountCollateralCoveragefinal
				+ ", additionalWorkingCapitalLimitColleteral=" + additionalWorkingCapitalLimitColleteral
				+ ", totalWorkingCapitalLimitDSCR=" + totalWorkingCapitalLimitDSCR
				+ ", finalEligibleAdditionalLoanAmount=" + finalEligibleAdditionalLoanAmount
				+ ", additionalWorkingCapitalLimitLowerOf=" + additionalWorkingCapitalLimitLowerOf
				+ ", existingLoanCollateralAmount=" + existingLoanCollateralAmount + ", minimumResult=" + minimumResult
				+ ", totalOutsideLiabilities=" + totalOutsideLiabilities + ", tangibleNetWorth=" + tangibleNetWorth
				+ ", tOLAndTNJ=" + tOLAndTNJ + ", tOLAndTNJMaximumK=" + tOLAndTNJMaximumK + ", workingCapitalLimitTOL="
				+ workingCapitalLimitTOL + ", eligibleBankFinanceTOL=" + eligibleBankFinanceTOL + ", existingLimitsTOL="
				+ existingLimitsTOL + ", netEligibleBankFinanceTOL=" + netEligibleBankFinanceTOL
				+ ", workingCapitalLimitColleteral=" + workingCapitalLimitColleteral + ", eligibleBankFinanceColletral="
				+ eligibleBankFinanceColletral + ", neteligibleBankFinanceColletral=" + neteligibleBankFinanceColletral
				+ ", amountOfColletralFsQ=" + amountOfColletralFsQ + ", colletralCoverageFpR=" + colletralCoverageFpR
				+ ", ebidtadscr=" + ebidtadscr + ", existingObligationsEMIDSCR=" + existingObligationsEMIDSCR
				+ ", dscrz=" + dscrz + ", dscrfpaa=" + dscrfpaa + ", workingCapitalLimitAB=" + workingCapitalLimitAB
				+ ", eligibleBankFinanceAD=" + eligibleBankFinanceAD + ", existingLimitsAE=" + existingLimitsAE
				+ ", netEligibleBankFinanceAF=" + netEligibleBankFinanceAF + ", loanAmountLowerOfAH="
				+ loanAmountLowerOfAH + ", promoterContributionDscr=" + promoterContributionDscr
				+ ", promoterContributionColletral=" + promoterContributionColletral + ", promoterContributionTol="
				+ promoterContributionTol + ", opProfitBeforeIntrest=" + opProfitBeforeIntrest + ", depreciation="
				+ depreciation + ", totalFinArrEMI=" + totalFinArrEMI + ", totalFinArrEMiDir=" + totalFinArrEMiDir
				+ ", growthCalculatedFromSales=" + growthCalculatedFromSales + ", growthSetByBank=" + growthSetByBank
				+ ", projectedSalesOfPreviousFyear=" + projectedSalesOfPreviousFyear + ", salesOfCurrentFyear="
				+ salesOfCurrentFyear + ", isHistoric=" + isHistoric + ", isGrowth=" + isGrowth + ", isApril=" + isApril
				+ ", sales2=" + sales2 + ", sales3=" + sales3 + ", netEligibleBankFinance=" + netEligibleBankFinance
				+ ", existingPlusAdditional=" + existingPlusAdditional + ", fpMaxTotalAmount=" + fpMaxTotalAmount
				+ ", cashAccuralsPerMonths=" + cashAccuralsPerMonths + ", bankFinanceBasedOnCashFlowFirstExisting="
				+ bankFinanceBasedOnCashFlowFirstExisting + ", bankFinanceBasedOnCashFlowSecond="
				+ bankFinanceBasedOnCashFlowSecond + ", netEligibleBankFinanceExisting="
				+ netEligibleBankFinanceExisting + ", finalTotalLoanAmount=" + finalTotalLoanAmount + ", lowerOfLAndO="
				+ lowerOfLAndO + ", lowerOfAmountLNAndO=" + lowerOfAmountLNAndO + ", finalValueExistingLoan="
				+ finalValueExistingLoan + ", lowerOfAmountEHAndI=" + lowerOfAmountEHAndI + ", lowerOfGAndI="
				+ lowerOfGAndI + ", existingLoan=" + existingLoan + ", resultCandA=" + resultCandA + ", resultBandA="
				+ resultBandA + ", workingCapitalLimitBasedProjSales=" + workingCapitalLimitBasedProjSales
				+ ", bankFinanceBasedCashFlow=" + bankFinanceBasedCashFlow + ", manufacturing=" + manufacturing
				+ ", service=" + service + ", trading=" + trading + ", loanArrangeMentFpSelectionType="
				+ loanArrangeMentFpSelectionType + ", isMsmeNewAssmentType=" + isMsmeNewAssmentType
				+ ", lowerOfAmountRTAndU=" + lowerOfAmountRTAndU + ", availableCashAccuralsperMonth="
				+ availableCashAccuralsperMonth + ", bankFinanceExistingLoan=" + bankFinanceExistingLoan
				+ ", bankFinanceAdditionalLoan=" + bankFinanceAdditionalLoan + ", netEligibleBankFinanceExistingLoan="
				+ netEligibleBankFinanceExistingLoan + ", netEligibleBankFianceAdditionalLoan="
				+ netEligibleBankFianceAdditionalLoan + ", bankFinanceBasedOnCashFlow=" + bankFinanceBasedOnCashFlow
				+ ", availableCashAccrualsPerMonth=" + availableCashAccrualsPerMonth + ", lowerOfLOAndM="
				+ lowerOfLOAndM + ", finalAdditionalLoanAmount=" + finalAdditionalLoanAmount + ", lowerOfAmountWYAndZ="
				+ lowerOfAmountWYAndZ + ", lowerOfWZndX=" + lowerOfWZndX + ", lowerOfVYndW=" + lowerOfVYndW
				+ ", lowerOfAmountVXAndY=" + lowerOfAmountVXAndY + ", lowerOfRUndS=" + lowerOfRUndS
				+ ", salesdataDomesticAndExport=" + salesdataDomesticAndExport + ", debtors=" + debtors
				+ ", lowerOfAmountOQR=" + lowerOfAmountOQR + ", lowerOfRAndO=" + lowerOfRAndO
				+ ", finalNetEligibleBankFinanceTOL=" + finalNetEligibleBankFinanceTOL + ", lowerOfAmountAHAIANDAJ="
				+ lowerOfAmountAHAIANDAJ + ", lowerOfAHAJ=" + lowerOfAHAJ + ", bankFinanceTotalLoanDSCR="
				+ bankFinanceTotalLoanDSCR + ", workingCapitalLimitDSCR=" + workingCapitalLimitDSCR
				+ ", bankFinanceExistingPlusAdditional=" + bankFinanceExistingPlusAdditional
				+ ", eligibleBankFinanceTakeOver=" + eligibleBankFinanceTakeOver + ", finalNetEligibleBankFinance="
				+ finalNetEligibleBankFinance + ", netEligibleBankFinanceFirst=" + netEligibleBankFinanceFirst
				+ ", finalValueExistingLoanStepFirst=" + finalValueExistingLoanStepFirst
				+ ", finalAdditionalLoanAmountFirst=" + finalAdditionalLoanAmountFirst + ", finalTotalAmountTOL="
				+ finalTotalAmountTOL + ", finalAdditionalAmountTOL=" + finalAdditionalAmountTOL
				+ ", finalValueExistingLoanTOL=" + finalValueExistingLoanTOL + ", finalTotalAmountDSCR="
				+ finalTotalAmountDSCR + ", finalAdditionalAmountDSCR=" + finalAdditionalAmountDSCR
				+ ", finalValueExistingLoanDSCR=" + finalValueExistingLoanDSCR + ", finalTotalLoanAmountCollateral="
				+ finalTotalLoanAmountCollateral + ", finalAdditionalLoanAmountCollateral="
				+ finalAdditionalLoanAmountCollateral + ", finalValueExistingLoanCollateral="
				+ finalValueExistingLoanCollateral + ", isTOLAndTNWType=" + isTOLAndTNWType
				+ ", isCollateralCoverageType=" + isCollateralCoverageType + ", isDSCRType=" + isDSCRType
				+ ", loanAmountUsingDSCR=" + loanAmountUsingDSCR + ", totalWCLimitBasedOnCashFlow="
				+ totalWCLimitBasedOnCashFlow + ", finalAdditionalTermLoanAmount=" + finalAdditionalTermLoanAmount
				+ "]";
	}
}