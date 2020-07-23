package com.opl.retail.api.model.eligibility;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author rahul.meena
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class EligibililityRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long income;
	private Long applicationId;
	private Long directorId;
	private Long productId;
	private Long userId;
	private Long clientId;
	private Long obligation;
	private Date dateOfBirth;
	private Integer tenure;
	private Double roi;
	private Double result;
	private Double bankBureauEmi;
	private Double bankBureauEmiAllDir;
	private Double bankBureauAmount;
	private Double bankBureauCollateralAmount;
	private String code;

	// for matches related 
	private Double newLoanEMI;
	
	//  Changes for MAtches Display
	private Double fsAdditionalLoanAmount;
	private Double existingLimits;

	private Double amount;
	private Long fpProductMappingId;
	private Double emi;

	// for New Product Purpose
	protected Long fpAssessmentEquipment;

	// for PL Eligblity based on NMI
	private Double incrementalPercentage;

	// FOR PAYBACK AND HYBRID PURPOSE KEY IN FP SIDE--
	private Double capOnCashMarginInvestMent;
	private Double valueOfCashMarginPaybackPeriod;
	// for HYBRID METHOD -------->
	private Double cashMarginPaybackMethod;

	// FOR PURPOSE OF MARGIN NEW REQUIRMENT
	private Double margin;

	// FOR NEW REQ... GOURVA DSCR
	private Double dscr;
	private Double paybackPeriod;

	// for MPBF METHOD 1
	private Double promoterContribution;

	// for NAYAK COMMITTE METHOD-
	private Double manufacturing;
	private Double service;
	private Double trading;

	// FOR PERSONAL LOAN PURPOSE---->
	private Integer employmentWithPL;

	// fp Provide max amount
	private Double fpMaxInvestSize;
	private Double fpMinInvestSize;

	private Double foir;
	private Double foirinRs;
	private Integer foirScallingSelectionType;
	
	
	private Double yearlyLoanObligation;
	private Double monthlyLoanObligation;
	private Double proposedLoanAmount;
	private Boolean collateralSecurity;
	private Double amountofCollateral;
	private Double wcRequirement;
	private Boolean isActive;

	// CHANGES FOR NEW 22-9-18
	private Boolean isAverage;
	private Integer wcRenewalStatus;

	private Integer genderType;
	private Double grossSales;
	private Double growthFp;
	private Double grossSalesItr;
	
	// Fp Kotak Bank selection type
	private Boolean isDSCRType;
	private Boolean isTOLAndTNWType;
	private Boolean isCollateralCoverageType;
	private Double loanAmountUsingDSCR;
	private Double loanAmountTOLAndTNW;
	private Double loanAmountCollateralCoverage;
	
	
	//projected sales related
	private Double fpGrowthValue;
	private Boolean isGrowthType;
	private Boolean isHistoric;
	
	// pl related changes --->
	private Double isMarginSelectionType;
	
	private Boolean isBasedOnIncomeType;
	
	private Boolean isMultiplierOfNetMonthlyIncomeType;
	private Double monthsNetMonthlyIncome;
	
	private Boolean isBasedOnEmiAndNmiType;
	private Double amountBasedOnEmiAndNmi;
	
	//PL Related Changes For (EMI/NMI)
	private Integer fpEmiAndNmiBasedOnSelectionType;
	
	// PL NET MONTHLY INCOME AND PL GROSS MONTHLY INCOME  RELATED
	private Boolean isIncomeCalculate;
	
	
	// PL RELATED CHANGES FOR NEW 
	private Long fpGmiAndNmiSelectionType;
	
	
	// CHANGES FOR NEW ASSESSMENT 17-04-19
	private Integer loanArrangeMentFpSelectionType; // ex.1,2,3
	
	// EX. +ADDITIONAL
	private Double existingAndAdditionalTotalLoanMaxAmount; // (Max_Total_loan)
	private Double existingAndAdditionalLoanMaxAmount; //(Max_additonal_loan)  
	
	// EXISTING
	private Double existingTotalLoanMaxAmount; //(MAX_total_loan) EXISTING Not Used Currently
	
	// TOTAL
	private Double additionalLoanMaxAmount;  //ADDITIONAL 
	
	private Boolean isEmiForEligibilityCalc;
	
	
	
	/**
	 * @return the foirinRs
	 */
	public Double getFoirinRs() {
		return foirinRs;
	}

	/**
	 * @return the foirScallingSelectionType
	 */
	public Integer getFoirScallingSelectionType() {
		return foirScallingSelectionType;
	}

	/**
	 * @param foirinRs the foirinRs to set
	 */
	public void setFoirinRs(Double foirinRs) {
		this.foirinRs = foirinRs;
	}

	/**
	 * @param foirScallingSelectionType the foirScallingSelectionType to set
	 */
	public void setFoirScallingSelectionType(Integer foirScallingSelectionType) {
		this.foirScallingSelectionType = foirScallingSelectionType;
	}

	public EligibililityRequest() {
		// TODO Auto-generated constructor stub
	}

	public Double getIncrementalPercentage() {
		return incrementalPercentage;
	}

	public void setIncrementalPercentage(Double incrementalPercentage) {
		this.incrementalPercentage = incrementalPercentage;
	}

	/**
	 * @return the isHistoric
	 */
	public Boolean getIsHistoric() {
		return isHistoric;
	}

	/**
	 * @param isHistoric the isHistoric to set
	 */
	public void setIsHistoric(Boolean isHistoric) {
		this.isHistoric = isHistoric;
	}

	/**
	 * @return the fpGrowthValue
	 */
	public Double getFpGrowthValue() {
		return fpGrowthValue;
	}

	/**
	 * @param fpGrowthValue the fpGrowthValue to set
	 */
	public void setFpGrowthValue(Double fpGrowthValue) {
		this.fpGrowthValue = fpGrowthValue;
	}


	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Long getDirectorId() {
		return directorId;
	}

	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public Long getObligation() {
		return obligation;
	}

	public void setObligation(Long obligation) {
		this.obligation = obligation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getRoi() {
		return roi;
	}

	public void setRoi(Double roi) {
		this.roi = roi;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
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

	public Double getProposedLoanAmount() {
		return proposedLoanAmount;
	}

	public void setProposedLoanAmount(Double proposedLoanAmount) {
		this.proposedLoanAmount = proposedLoanAmount;
	}

	public Boolean getCollateralSecurity() {
		return collateralSecurity;
	}

	public void setCollateralSecurity(Boolean collateralSecurity) {
		this.collateralSecurity = collateralSecurity;
	}

	public Double getAmountofCollateral() {
		return amountofCollateral;
	}

	public void setAmountofCollateral(Double amountofCollateral) {
		this.amountofCollateral = amountofCollateral;
	}

	public Double getAmount() {
		/*
		 * if(Double.isFinite(amount)) return 0.0;
		 */
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getFpProductMappingId() {
		return fpProductMappingId;
	}

	public void setFpProductMappingId(Long fpProductMappingId) {
		this.fpProductMappingId = fpProductMappingId;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getFpMaxInvestSize() {
		return fpMaxInvestSize;
	}

	public void setFpMaxInvestSize(Double fpMaxInvestSize) {
		this.fpMaxInvestSize = fpMaxInvestSize;
	}

	public Double getFpMinInvestSize() {
		return fpMinInvestSize;
	}

	public void setFpMinInvestSize(Double fpMinInvestSize) {
		this.fpMinInvestSize = fpMinInvestSize;
	}

	public Long getFpAssessmentEquipment() {
		return fpAssessmentEquipment;
	}

	public void setFpAssessmentEquipment(Long fpAssessmentEquipment) {
		this.fpAssessmentEquipment = fpAssessmentEquipment;
	}

	public Double getMargin() {
		return margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
	}

	public Double getCapOnCashMarginInvestMent() {
		return capOnCashMarginInvestMent;
	}

	public void setCapOnCashMarginInvestMent(Double capOnCashMarginInvestMent) {
		this.capOnCashMarginInvestMent = capOnCashMarginInvestMent;
	}

	public Double getValueOfCashMarginPaybackPeriod() {
		return valueOfCashMarginPaybackPeriod;
	}

	public void setValueOfCashMarginPaybackPeriod(Double valueOfCashMarginPaybackPeriod) {
		this.valueOfCashMarginPaybackPeriod = valueOfCashMarginPaybackPeriod;
	}

	public Double getCashMarginPaybackMethod() {
		return cashMarginPaybackMethod;
	}

	public void setCashMarginPaybackMethod(Double cashMarginPaybackMethod) {
		this.cashMarginPaybackMethod = cashMarginPaybackMethod;
	}

	public Double getDscr() {
		return dscr;
	}

	public void setDscr(Double dscr) {
		this.dscr = dscr;
	}

	public Double getPaybackPeriod() {
		return paybackPeriod;
	}

	public void setPaybackPeriod(Double paybackPeriod) {
		this.paybackPeriod = paybackPeriod;
	}

	public Integer getEmploymentWithPL() {
		return employmentWithPL;
	}

	public void setEmploymentWithPL(Integer employmentWithPL) {
		this.employmentWithPL = employmentWithPL;
	}

	public Double getPromoterContribution() {
		return promoterContribution;
	}

	public void setPromoterContribution(Double promoterContribution) {
		this.promoterContribution = promoterContribution;
	}

	public Boolean getIsAverage() {
		return isAverage;
	}

	public void setIsAverage(Boolean isAverage) {
		this.isAverage = isAverage;
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

	public Integer getWcRenewalStatus() {
		return wcRenewalStatus;
	}

	public void setWcRenewalStatus(Integer wcRenewalStatus) {
		this.wcRenewalStatus = wcRenewalStatus;
	}

	public Integer getGenderType() {
		return genderType;
	}

	public void setGenderType(Integer genderType) {
		this.genderType = genderType;
	}
	

	public Double getLoanAmountUsingDSCR() {
		return loanAmountUsingDSCR;
	}

	public void setLoanAmountUsingDSCR(Double loanAmountUsingDSCR) {
		this.loanAmountUsingDSCR = loanAmountUsingDSCR;
	}

	public Double getLoanAmountTOLAndTNW() {
		return loanAmountTOLAndTNW;
	}

	public void setLoanAmountTOLAndTNW(Double loanAmountTOLAndTNW) {
		this.loanAmountTOLAndTNW = loanAmountTOLAndTNW;
	}

	public Double getLoanAmountCollateralCoverage() {
		return loanAmountCollateralCoverage;
	}

	public void setLoanAmountCollateralCoverage(Double loanAmountCollateralCoverage) {
		this.loanAmountCollateralCoverage = loanAmountCollateralCoverage;
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

	public Double getWcRequirement() {
		return wcRequirement;
	}

	public void setWcRequirement(Double wcRequirement) {
		this.wcRequirement = wcRequirement;
	}
	
	public Double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(Double grossSales) {
		this.grossSales = grossSales;
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

	public Boolean getIsGrowthType() {
		return isGrowthType;
	}

	public void setIsGrowthType(Boolean isGrowthType) {
		this.isGrowthType = isGrowthType;
	}

	public Double getIsMarginSelectionType() {
		return isMarginSelectionType;
	}

	public void setIsMarginSelectionType(Double isMarginSelectionType) {
		this.isMarginSelectionType = isMarginSelectionType;
	}

	public Boolean getIsBasedOnIncomeType() {
		return isBasedOnIncomeType;
	}

	public void setIsBasedOnIncomeType(Boolean isBasedOnIncomeType) {
		this.isBasedOnIncomeType = isBasedOnIncomeType;
	}

	public Boolean getIsMultiplierOfNetMonthlyIncomeType() {
		return isMultiplierOfNetMonthlyIncomeType;
	}

	public void setIsMultiplierOfNetMonthlyIncomeType(Boolean isMultiplierOfNetMonthlyIncomeType) {
		this.isMultiplierOfNetMonthlyIncomeType = isMultiplierOfNetMonthlyIncomeType;
	}

	public Double getMonthsNetMonthlyIncome() {
		return monthsNetMonthlyIncome;
	}

	public void setMonthsNetMonthlyIncome(Double monthsNetMonthlyIncome) {
		this.monthsNetMonthlyIncome = monthsNetMonthlyIncome;
	}

	public Boolean getIsBasedOnEmiAndNmiType() {
		return isBasedOnEmiAndNmiType;
	}

	public void setIsBasedOnEmiAndNmiType(Boolean isBasedOnEmiAndNmiType) {
		this.isBasedOnEmiAndNmiType = isBasedOnEmiAndNmiType;
	}

	public Double getAmountBasedOnEmiAndNmi() {
		return amountBasedOnEmiAndNmi;
	}

	public void setAmountBasedOnEmiAndNmi(Double amountBasedOnEmiAndNmi) {
		this.amountBasedOnEmiAndNmi = amountBasedOnEmiAndNmi;
	}

	public Integer getLoanArrangeMentFpSelectionType() {
		return loanArrangeMentFpSelectionType;
	}

	public void setLoanArrangeMentFpSelectionType(Integer loanArrangeMentFpSelectionType) {
		this.loanArrangeMentFpSelectionType = loanArrangeMentFpSelectionType;
	}

	public Double getExistingAndAdditionalTotalLoanMaxAmount() {
		return existingAndAdditionalTotalLoanMaxAmount;
	}

	public void setExistingAndAdditionalTotalLoanMaxAmount(Double existingAndAdditionalTotalLoanMaxAmount) {
		this.existingAndAdditionalTotalLoanMaxAmount = existingAndAdditionalTotalLoanMaxAmount;
	}

	public Double getExistingAndAdditionalLoanMaxAmount() {
		return existingAndAdditionalLoanMaxAmount;
	}

	public void setExistingAndAdditionalLoanMaxAmount(Double existingAndAdditionalLoanMaxAmount) {
		this.existingAndAdditionalLoanMaxAmount = existingAndAdditionalLoanMaxAmount;
	}

	public Double getExistingTotalLoanMaxAmount() {
		return existingTotalLoanMaxAmount;
	}

	public void setExistingTotalLoanMaxAmount(Double existingTotalLoanMaxAmount) {
		this.existingTotalLoanMaxAmount = existingTotalLoanMaxAmount;
	}

	public Double getAdditionalLoanMaxAmount() {
		return additionalLoanMaxAmount;
	}

	public void setAdditionalLoanMaxAmount(Double additionalLoanMaxAmount) {
		this.additionalLoanMaxAmount = additionalLoanMaxAmount;
	}

	public Double getFsAdditionalLoanAmount() {
		return fsAdditionalLoanAmount;
	}

	public void setFsAdditionalLoanAmount(Double fsAdditionalLoanAmount) {
		this.fsAdditionalLoanAmount = fsAdditionalLoanAmount;
	}

	public Double getExistingLimits() {
		return existingLimits;
	}

	public void setExistingLimits(Double existingLimits) {
		this.existingLimits = existingLimits;
	}
	

	public Long getFpGmiAndNmiSelectionType() {
		return fpGmiAndNmiSelectionType;
	}

	public void setFpGmiAndNmiSelectionType(Long fpGmiAndNmiSelectionType) {
		this.fpGmiAndNmiSelectionType = fpGmiAndNmiSelectionType;
	}

	public Integer getFpEmiAndNmiBasedOnSelectionType() {
		return fpEmiAndNmiBasedOnSelectionType;
	}

	public void setFpEmiAndNmiBasedOnSelectionType(Integer fpEmiAndNmiBasedOnSelectionType) {
		this.fpEmiAndNmiBasedOnSelectionType = fpEmiAndNmiBasedOnSelectionType;
	}

	public Boolean getIsIncomeCalculate() {
		return isIncomeCalculate;
	}

	public void setIsIncomeCalculate(Boolean isIncomeCalculate) {
		this.isIncomeCalculate = isIncomeCalculate;
	}
	
	public Double getNewLoanEMI() {
		return newLoanEMI;
	}

	public void setNewLoanEMI(Double newLoanEMI) {
		this.newLoanEMI = newLoanEMI;
	}

	public Double getBankBureauEmi() {
		return bankBureauEmi;
	}

	public void setBankBureauEmi(Double bankBureauEmi) {
		this.bankBureauEmi = bankBureauEmi;
	}

	public Double getBankBureauAmount() {
		return bankBureauAmount;
	}

	public void setBankBureauAmount(Double bankBureauAmount) {
		this.bankBureauAmount = bankBureauAmount;
	}

	public Double getBankBureauCollateralAmount() {
		return bankBureauCollateralAmount;
	}

	public void setBankBureauCollateralAmount(Double bankBureauCollateralAmount) {
		this.bankBureauCollateralAmount = bankBureauCollateralAmount;
	}

	public Double getBankBureauEmiAllDir() {
		return bankBureauEmiAllDir;
	}

	public void setBankBureauEmiAllDir(Double bankBureauEmiAllDir) {
		this.bankBureauEmiAllDir = bankBureauEmiAllDir;
	}

	
	public Boolean getIsEmiForEligibilityCalc() {
		return isEmiForEligibilityCalc;
	}

	public void setIsEmiForEligibilityCalc(Boolean isEmiForEligibilityCalc) {
		this.isEmiForEligibilityCalc = isEmiForEligibilityCalc;
	}

	@Override
	public String toString() {
		return "EligibililityRequest [income=" + income + ", applicationId=" + applicationId + ", directorId="
				+ directorId + ", productId=" + productId + ", userId=" + userId + ", clientId=" + clientId
				+ ", obligation=" + obligation + ", dateOfBirth=" + dateOfBirth + ", tenure=" + tenure + ", roi=" + roi
				+ ", result=" + result + ", bankBureauEmi=" + bankBureauEmi + ", bankBureauEmiAllDir="
				+ bankBureauEmiAllDir + ", bankBureauAmount=" + bankBureauAmount + ", bankBureauCollateralAmount="
				+ bankBureauCollateralAmount + ", code=" + code + ", newLoanEMI=" + newLoanEMI
				+ ", fsAdditionalLoanAmount=" + fsAdditionalLoanAmount + ", existingLimits=" + existingLimits
				+ ", amount=" + amount + ", fpProductMappingId=" + fpProductMappingId + ", emi=" + emi
				+ ", fpAssessmentEquipment=" + fpAssessmentEquipment + ", incrementalPercentage="
				+ incrementalPercentage + ", capOnCashMarginInvestMent=" + capOnCashMarginInvestMent
				+ ", valueOfCashMarginPaybackPeriod=" + valueOfCashMarginPaybackPeriod + ", cashMarginPaybackMethod="
				+ cashMarginPaybackMethod + ", margin=" + margin + ", dscr=" + dscr + ", paybackPeriod=" + paybackPeriod
				+ ", promoterContribution=" + promoterContribution + ", manufacturing=" + manufacturing + ", service="
				+ service + ", trading=" + trading + ", employmentWithPL=" + employmentWithPL + ", fpMaxInvestSize="
				+ fpMaxInvestSize + ", fpMinInvestSize=" + fpMinInvestSize + ", foir=" + foir
				+ ", yearlyLoanObligation=" + yearlyLoanObligation + ", monthlyLoanObligation=" + monthlyLoanObligation
				+ ", proposedLoanAmount=" + proposedLoanAmount + ", collateralSecurity=" + collateralSecurity
				+ ", amountofCollateral=" + amountofCollateral + ", wcRequirement=" + wcRequirement + ", isActive="
				+ isActive + ", isAverage=" + isAverage + ", wcRenewalStatus=" + wcRenewalStatus + ", genderType="
				+ genderType + ", grossSales=" + grossSales + ", growthFp=" + growthFp + ", grossSalesItr="
				+ grossSalesItr + ", isDSCRType=" + isDSCRType + ", isTOLAndTNWType=" + isTOLAndTNWType
				+ ", isCollateralCoverageType=" + isCollateralCoverageType + ", loanAmountUsingDSCR="
				+ loanAmountUsingDSCR + ", loanAmountTOLAndTNW=" + loanAmountTOLAndTNW
				+ ", loanAmountCollateralCoverage=" + loanAmountCollateralCoverage + ", fpGrowthValue=" + fpGrowthValue
				+ ", isGrowthType=" + isGrowthType + ", isHistoric=" + isHistoric + ", isMarginSelectionType="
				+ isMarginSelectionType + ", isBasedOnIncomeType=" + isBasedOnIncomeType
				+ ", isMultiplierOfNetMonthlyIncomeType=" + isMultiplierOfNetMonthlyIncomeType
				+ ", monthsNetMonthlyIncome=" + monthsNetMonthlyIncome + ", isBasedOnEmiAndNmiType="
				+ isBasedOnEmiAndNmiType + ", amountBasedOnEmiAndNmi=" + amountBasedOnEmiAndNmi
				+ ", fpEmiAndNmiBasedOnSelectionType=" + fpEmiAndNmiBasedOnSelectionType + ", isIncomeCalculate="
				+ isIncomeCalculate + ", fpGmiAndNmiSelectionType=" + fpGmiAndNmiSelectionType
				+ ", loanArrangeMentFpSelectionType=" + loanArrangeMentFpSelectionType
				+ ", existingAndAdditionalTotalLoanMaxAmount=" + existingAndAdditionalTotalLoanMaxAmount
				+ ", existingAndAdditionalLoanMaxAmount=" + existingAndAdditionalLoanMaxAmount
				+ ", existingTotalLoanMaxAmount=" + existingTotalLoanMaxAmount + ", additionalLoanMaxAmount="
				+ additionalLoanMaxAmount + ", isEmiForEligibilityCalc=" + isEmiForEligibilityCalc + "]";
	}
}
