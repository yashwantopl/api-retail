package com.opl.retail.api.model.eligibility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HLEligibilityRequest extends EligibililityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer employmentType;
	private Long stampValue;
	private Long orgId;
	private Double marketValue;
	private Double nmi;
	private Double gmi;
	private Double existingObligation;
	private Double existingObligationWithoutDesignator;
	private Double purCunsExpRepAndRenovCost;
	private Double onRoadPrice;
	private Double exShowRoomRoadPrice;
	private Double purchaseAgreedIDV;
	private Double ltvScoring;
	private Double loanAmountBorrower;
	private Double amountBasedOnIncomeMultiplier;
	private Double netTakeHomeSalary;
	private Double amountBasedOnIncome;
	private Double amountBasedOnLtv;
	private Double maximumLoanAmountLender;
	private Double tenureFS;
	private Double tenureScoring;
	private Double ageFS;
	private Double tenureFP;
	private Double maxAgeFP;
	private Double eligibleTenure;
	private Double timesMultiplier;
	private Double monthlyObligation;
	private Double incrementalItrVal;
	private Double manualFillSalary;
	private Double top5FundMedianAmt;
	private Double bsSalary;
	private Double monthlySalFromItr;
	private Double itrSalary;
	private Double costOfProject;
	
	private Integer noOfCoApplicantFP;
	private Integer noOfCoApplicantFS;
	private Integer incomeType;
	private Integer incomeTypeMultiplier;
	private Integer loanPurpose;
	private List<Integer> fpLoanPurpose;
	//Boolean Flags
	private Boolean isSetGrossNetIncome;
	private Boolean isSetTimesMultiplierIncome;
	private Boolean isSetLTV;
	private Boolean isConsiderCoApp;
	private Boolean isSetPurCunsExpRepAndRenovCost;
	private Boolean isSetMarketValue;
	private Boolean isSetOnRoadPrice;
	private Boolean isSetExShowRoomPrice;
	private Boolean isSetFpTenure;
	private Boolean isSetFpAge;
	private Boolean isSetMaxExShowroomPrice;
	private Boolean isEmiForEligibilityCalc;
	private List<CoApplicantEligibilityRequest> coApps = null;
	

	public HLEligibilityRequest() {
		super();
		coApps = Collections.emptyList();
	}

	public Integer getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(Integer employmentType) {
		this.employmentType = employmentType;
	}

	public Long getStampValue() {
		return stampValue;
	}

	public void setStampValue(Long stampValue) {
		this.stampValue = stampValue;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
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
	
	public Double getPurCunsExpRepAndRenovCost() {
		return purCunsExpRepAndRenovCost;
	}

	public void setPurCunsExpRepAndRenovCost(Double purCunsExpRepAndRenovCost) {
		this.purCunsExpRepAndRenovCost = purCunsExpRepAndRenovCost;
	}

	public Double getLtvScoring() {
		return ltvScoring;
	}

	public void setLtvScoring(Double ltvScoring) {
		this.ltvScoring = ltvScoring;
	}

	public Double getLoanAmountBorrower() {
		return loanAmountBorrower;
	}

	public void setLoanAmountBorrower(Double loanAmountBorrower) {
		this.loanAmountBorrower = loanAmountBorrower;
	}

	public Double getMaximumLoanAmountLender() {
		return maximumLoanAmountLender;
	}

	public void setMaximumLoanAmountLender(Double maximumLoanAmountLender) {
		this.maximumLoanAmountLender = maximumLoanAmountLender;
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
	
	public Integer getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(Integer incomeType) {
		this.incomeType = incomeType;
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

	public Boolean getIsConsiderCoApp() {
		return isConsiderCoApp;
	}

	public void setIsConsiderCoApp(Boolean isConsiderCoApp) {
		this.isConsiderCoApp = isConsiderCoApp;
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

	public Double getTenureFP() {
		return tenureFP;
	}

	public void setTenureFP(Double tenureFP) {
		this.tenureFP = tenureFP;
	}

	public Double getAgeFS() {
		return ageFS;
	}

	public void setAgeFS(Double ageFS) {
		this.ageFS = ageFS;
	}
	

	public Integer getIncomeTypeMultiplier() {
		return incomeTypeMultiplier;
	}

	public void setIncomeTypeMultiplier(Integer incomeTypeMultiplier) {
		this.incomeTypeMultiplier = incomeTypeMultiplier;
	}

	public Double getTimesMultiplier() {
		return timesMultiplier;
	}

	public void setTimesMultiplier(Double timesMultiplier) {
		this.timesMultiplier = timesMultiplier;
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

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	
	public Double getEligibleTenure() {
		return eligibleTenure;
	}

	public void setEligibleTenure(Double eligibleTenure) {
		this.eligibleTenure = eligibleTenure;
	}

	public Double getMonthlyObligation() {
		return monthlyObligation;
	}

	public void setMonthlyObligation(Double monthlyObligation) {
		this.monthlyObligation = monthlyObligation;
	}
	public Double getAmountBasedOnIncomeMultiplier() {
		return amountBasedOnIncomeMultiplier;
	}

	public void setAmountBasedOnIncomeMultiplier(Double amountBasedOnIncomeMultiplier) {
		this.amountBasedOnIncomeMultiplier = amountBasedOnIncomeMultiplier;
	}

	public Double getAmountBasedOnLtv() {
		return amountBasedOnLtv;
	}

	public void setAmountBasedOnLtv(Double amountBasedOnLtv) {
		this.amountBasedOnLtv = amountBasedOnLtv;
	}

	public Double getAmountBasedOnIncome() {
		return amountBasedOnIncome;
	}

	public void setAmountBasedOnIncome(Double amountBasedOnIncome) {
		this.amountBasedOnIncome = amountBasedOnIncome;
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

	public Double getNetTakeHomeSalary() {
		return netTakeHomeSalary;
	}

	public void setNetTakeHomeSalary(Double netTakeHomeSalary) {
		this.netTakeHomeSalary = netTakeHomeSalary;
	}

	public List<CoApplicantEligibilityRequest> getCoApps() {
		if(coApps == null) {
			coApps = Collections.emptyList();
		}
		return coApps;
	}

	public void setCoApps(List<CoApplicantEligibilityRequest> coApps) {
		this.coApps = coApps;
	}

	public Double getCostOfProject() {
		return costOfProject;
	}

	public void setCostOfProject(Double costOfProject) {
		this.costOfProject = costOfProject;
	}

	public Double getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(Double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	public Double getExShowRoomRoadPrice() {
		return exShowRoomRoadPrice;
	}

	public void setExShowRoomRoadPrice(Double exShowRoomRoadPrice) {
		this.exShowRoomRoadPrice = exShowRoomRoadPrice;
	}

	public Boolean getIsSetOnRoadPrice() {
		return isSetOnRoadPrice;
	}

	public void setIsSetOnRoadPrice(Boolean isSetOnRoadPrice) {
		this.isSetOnRoadPrice = isSetOnRoadPrice;
	}

	public Boolean getIsSetExShowRoomPrice() {
		return isSetExShowRoomPrice;
	}

	public void setIsSetExShowRoomPrice(Boolean isSetExShowRoomPrice) {
		this.isSetExShowRoomPrice = isSetExShowRoomPrice;
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

	public Integer getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(Integer loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public Double getPurchaseAgreedIDV() {
		return purchaseAgreedIDV;
	}

	public void setPurchaseAgreedIDV(Double purchaseAgreedIDV) {
		this.purchaseAgreedIDV = purchaseAgreedIDV;
	}

	public List<Integer> getFpLoanPurpose() {
		if(fpLoanPurpose == null) {
			fpLoanPurpose = new ArrayList<Integer>();
		}
		return fpLoanPurpose;
	}

	public void setFpLoanPurpose(List<Integer> fpLoanPurpose) {
		this.fpLoanPurpose = fpLoanPurpose;
	}

	public Boolean getIsSetMaxExShowroomPrice() {
		return isSetMaxExShowroomPrice;
	}

	public void setIsSetMaxExShowroomPrice(Boolean setMaxExShowroomPrice) {
		isSetMaxExShowroomPrice = setMaxExShowroomPrice;
	}

	public Boolean getIsEmiForEligibilityCalc() {
		return isEmiForEligibilityCalc;
	}

	public void setIsEmiForEligibilityCalc(Boolean isEmiForEligibilityCalc) {
		this.isEmiForEligibilityCalc = isEmiForEligibilityCalc;
	}

	public Double getExistingObligationWithoutDesignator() {
		return existingObligationWithoutDesignator;
	}

	public void setExistingObligationWithoutDesignator(Double existingObligationWithoutDesignator) {
		this.existingObligationWithoutDesignator = existingObligationWithoutDesignator;
	}

	
}
