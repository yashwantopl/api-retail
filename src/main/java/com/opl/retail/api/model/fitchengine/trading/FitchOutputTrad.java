package com.opl.retail.api.model.fitchengine.trading;

public class FitchOutputTrad {
	
	private String companyName;
	private String companyRiskGrade;
	
	private Double finalRiscScore;
	private Double finalRiskWeight;
	
	private Double businessRiskScore;
	private Double businessRiskWeight;
	
	private Double managementRiskScore;
	private Double managementRiskWeight;
	
	private Double basicRiskScore;
	
	private Double conductAccountRiskFactor;

	private Double conductAccountRiskScore;
	
	private Double adjustedRiskScore;
	
	private String finalRiskGrade;
	
	
	private String keyObservationsOne="";
	private String keyObservationsTwo="";
	private String keyObservationsThree="";
	private String keyObservationsFour="";
	private String keyObservationsFive="";
	private String keyObservationsSix="";
	private String keyObservationsSeven="";
	private String keyObservationsEight="";
	private String keyObservationsNine="";
	
	////////////////////
	
	
	
	private Double ebitadNetSaleScore;
	private Double ebitadNetSaleWeight;
	
	
	private Double interestCoverageScore;
	private Double interestCoverageWeight;
	
	
	private Double roceScore;
	private Double roceWeight;
	
	
	private Double salesGrowthScore;
	private Double salesGrowthWeight;
	
	
	private Double tolTnwScore;
	private Double tolTnwWeight;
	
	private Double nwcEbitadScore;
	private Double nwcEbitadWeight;
	
	private Double sumNotchDownsScore;
	
	/////////////////
	
	
	private Double basicFinancialScore;
	private Double accountingQualityScore;
	private Double contingentLiabilityNWScore;
	private Double financialScore;
	
	
	
	
	//////////////
	
	
	
	private Double customerQualityAndConcentrationScore;
	private Double customerQualityAndConcentrationWeight;
	
	private Double supplierQualityAndConcentrationScore;
	private Double supplierQualityAndConcentrationWeight;
	
	private Double sustainabilityProductDemandScore;
	private Double sustainabilityProductDemandWeight;
	
	private Double productSeasonalityScore;
	private Double productSeasonalityWeight;
	
	private Double impactOnOperatingMarginsScore;
	private Double impactOnOperatingMarginsWeight;
	
	private Double environmentalImpactScore;
	private Double environmentalImpactWeight;
	
	
	////////////////
	
	
	
	private Double integrityScore;
	private Double integrityWeight;
	
	private Double businessCommitmentScore;
	private Double businessCommitmentWeight;
	
	
	private Double managementCompetenceScore;
	private Double managementCompetenceWeight;
	
	
	private Double businessExperienceScore;
	private Double businessExperienceWeight;
	
	private Double successionPlanningScore;
	private Double successionPlanningWeight;
	
	private Double financialStrengthScore;
	private Double financialStrengthWeight;
	
	private Double internalControlScore;
	private Double internalControlWeight;
	
	private Double creditTrackRecordScore;
	private Double creditTrackRecordWeight;
	
	
	////////////////////////////////
	
	
	private Double chequesBillsReturnedNumber;
	private Double dpLimitOverDrawnNumber;
	private Double cumulativeDPLimitOverdrawnNumberDays;
	private Double complianceSanctionedDisbursementConditions;
	private Double submissionProgressReports;
	private Double delayReceiptPrincipalInterestInstalments;
	private Double delayInSubmissionAuditedBSAndPL;
	private Double varianceInProjectedSalesVersusActualSales;
	private Double lcBgIssuedInFavorBorrowerInvoked;
	
	
	////////////////////////
	
	
	private Double capForTurnover;
	private Double capOnCreditTrackRecord;
	private Double capForEnvironment;
	private Double capForSuccessionPlanning;
	private Double capForFinancialRatios;
	
	
	////////////////


	public Double getConductAccountRiskScore() {
		return conductAccountRiskScore;
	}

	public void setConductAccountRiskScore(Double conductAccountRiskScore) {
		this.conductAccountRiskScore = conductAccountRiskScore;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Double getEbitadNetSaleWeight() {
		return ebitadNetSaleWeight;
	}

	public void setEbitadNetSaleWeight(Double ebitadNetSaleWeight) {
		this.ebitadNetSaleWeight = ebitadNetSaleWeight;
	}

	public Double getInterestCoverageWeight() {
		return interestCoverageWeight;
	}

	public void setInterestCoverageWeight(Double interestCoverageWeight) {
		this.interestCoverageWeight = interestCoverageWeight;
	}

	public Double getRoceWeight() {
		return roceWeight;
	}

	public void setRoceWeight(Double roceWeight) {
		this.roceWeight = roceWeight;
	}

	public Double getSalesGrowthWeight() {
		return salesGrowthWeight;
	}

	public void setSalesGrowthWeight(Double salesGrowthWeight) {
		this.salesGrowthWeight = salesGrowthWeight;
	}

	public Double getTolTnwWeight() {
		return tolTnwWeight;
	}

	public void setTolTnwWeight(Double tolTnwWeight) {
		this.tolTnwWeight = tolTnwWeight;
	}

	public Double getNwcEbitadWeight() {
		return nwcEbitadWeight;
	}

	public void setNwcEbitadWeight(Double nwcEbitadWeight) {
		this.nwcEbitadWeight = nwcEbitadWeight;
	}

	public Double getFinancialScore() {
		return financialScore;
	}

	public void setFinancialScore(Double financialScore) {
		this.financialScore = financialScore;
	}

	public Double getCustomerQualityAndConcentrationWeight() {
		return customerQualityAndConcentrationWeight;
	}

	public void setCustomerQualityAndConcentrationWeight(Double customerQualityAndConcentrationWeight) {
		this.customerQualityAndConcentrationWeight = customerQualityAndConcentrationWeight;
	}

	public Double getSupplierQualityAndConcentrationWeight() {
		return supplierQualityAndConcentrationWeight;
	}

	public void setSupplierQualityAndConcentrationWeight(Double supplierQualityAndConcentrationWeight) {
		this.supplierQualityAndConcentrationWeight = supplierQualityAndConcentrationWeight;
	}

	public Double getSustainabilityProductDemandWeight() {
		return sustainabilityProductDemandWeight;
	}

	public void setSustainabilityProductDemandWeight(Double sustainabilityProductDemandWeight) {
		this.sustainabilityProductDemandWeight = sustainabilityProductDemandWeight;
	}

	public Double getProductSeasonalityWeight() {
		return productSeasonalityWeight;
	}

	public void setProductSeasonalityWeight(Double productSeasonalityWeight) {
		this.productSeasonalityWeight = productSeasonalityWeight;
	}

	public Double getImpactOnOperatingMarginsWeight() {
		return impactOnOperatingMarginsWeight;
	}

	public void setImpactOnOperatingMarginsWeight(Double impactOnOperatingMarginsWeight) {
		this.impactOnOperatingMarginsWeight = impactOnOperatingMarginsWeight;
	}

	public Double getEnvironmentalImpactWeight() {
		return environmentalImpactWeight;
	}

	public void setEnvironmentalImpactWeight(Double environmentalImpactWeight) {
		this.environmentalImpactWeight = environmentalImpactWeight;
	}

	public Double getIntegrityWeight() {
		return integrityWeight;
	}

	public void setIntegrityWeight(Double integrityWeight) {
		this.integrityWeight = integrityWeight;
	}

	public Double getBusinessCommitmentWeight() {
		return businessCommitmentWeight;
	}

	public void setBusinessCommitmentWeight(Double businessCommitmentWeight) {
		this.businessCommitmentWeight = businessCommitmentWeight;
	}

	public Double getManagementCompetenceWeight() {
		return managementCompetenceWeight;
	}

	public void setManagementCompetenceWeight(Double managementCompetenceWeight) {
		this.managementCompetenceWeight = managementCompetenceWeight;
	}

	public Double getBusinessExperienceWeight() {
		return businessExperienceWeight;
	}

	public void setBusinessExperienceWeight(Double businessExperienceWeight) {
		this.businessExperienceWeight = businessExperienceWeight;
	}

	public Double getSuccessionPlanningWeight() {
		return successionPlanningWeight;
	}

	public void setSuccessionPlanningWeight(Double successionPlanningWeight) {
		this.successionPlanningWeight = successionPlanningWeight;
	}

	public Double getFinancialStrengthWeight() {
		return financialStrengthWeight;
	}

	public void setFinancialStrengthWeight(Double financialStrengthWeight) {
		this.financialStrengthWeight = financialStrengthWeight;
	}

	public Double getInternalControlWeight() {
		return internalControlWeight;
	}

	public void setInternalControlWeight(Double internalControlWeight) {
		this.internalControlWeight = internalControlWeight;
	}

	public Double getCreditTrackRecordWeight() {
		return creditTrackRecordWeight;
	}

	public void setCreditTrackRecordWeight(Double creditTrackRecordWeight) {
		this.creditTrackRecordWeight = creditTrackRecordWeight;
	}

	public Double getEbitadNetSaleScore() {
		return ebitadNetSaleScore;
	}

	public void setEbitadNetSaleScore(Double ebitadNetSaleScore) {
		this.ebitadNetSaleScore = ebitadNetSaleScore;
	}

	public Double getInterestCoverageScore() {
		return interestCoverageScore;
	}

	public void setInterestCoverageScore(Double interestCoverageScore) {
		this.interestCoverageScore = interestCoverageScore;
	}

	public Double getRoceScore() {
		return roceScore;
	}

	public void setRoceScore(Double roceScore) {
		this.roceScore = roceScore;
	}

	public Double getSalesGrowthScore() {
		return salesGrowthScore;
	}

	public void setSalesGrowthScore(Double salesGrowthScore) {
		this.salesGrowthScore = salesGrowthScore;
	}

	public Double getTolTnwScore() {
		return tolTnwScore;
	}

	public void setTolTnwScore(Double tolTnwScore) {
		this.tolTnwScore = tolTnwScore;
	}

	public Double getNwcEbitadScore() {
		return nwcEbitadScore;
	}

	public void setNwcEbitadScore(Double nwcEbitadScore) {
		this.nwcEbitadScore = nwcEbitadScore;
	}

	public Double getBasicFinancialScore() {
		return basicFinancialScore;
	}

	public void setBasicFinancialScore(Double basicFinancialScore) {
		this.basicFinancialScore = basicFinancialScore;
	}

	public Double getAccountingQualityScore() {
		return accountingQualityScore;
	}

	public void setAccountingQualityScore(Double accountingQualityScore) {
		this.accountingQualityScore = accountingQualityScore;
	}

	public Double getContingentLiabilityNWScore() {
		return contingentLiabilityNWScore;
	}

	public void setContingentLiabilityNWScore(Double contingentLiabilityNWScore) {
		this.contingentLiabilityNWScore = contingentLiabilityNWScore;
	}

	public Double getSumNotchDownsScore() {
		return sumNotchDownsScore;
	}

	public void setSumNotchDownsScore(Double sumNotchDownsScore) {
		this.sumNotchDownsScore = sumNotchDownsScore;
	}

	public Double getCustomerQualityAndConcentrationScore() {
		return customerQualityAndConcentrationScore;
	}

	public void setCustomerQualityAndConcentrationScore(Double customerQualityAndConcentrationScore) {
		this.customerQualityAndConcentrationScore = customerQualityAndConcentrationScore;
	}

	public Double getSupplierQualityAndConcentrationScore() {
		return supplierQualityAndConcentrationScore;
	}

	public void setSupplierQualityAndConcentrationScore(Double supplierQualityAndConcentrationScore) {
		this.supplierQualityAndConcentrationScore = supplierQualityAndConcentrationScore;
	}

	public Double getSustainabilityProductDemandScore() {
		return sustainabilityProductDemandScore;
	}

	public void setSustainabilityProductDemandScore(Double sustainabilityProductDemandScore) {
		this.sustainabilityProductDemandScore = sustainabilityProductDemandScore;
	}

	public Double getProductSeasonalityScore() {
		return productSeasonalityScore;
	}

	public void setProductSeasonalityScore(Double productSeasonalityScore) {
		this.productSeasonalityScore = productSeasonalityScore;
	}

	public Double getImpactOnOperatingMarginsScore() {
		return impactOnOperatingMarginsScore;
	}

	public void setImpactOnOperatingMarginsScore(Double impactOnOperatingMarginsScore) {
		this.impactOnOperatingMarginsScore = impactOnOperatingMarginsScore;
	}

	public Double getEnvironmentalImpactScore() {
		return environmentalImpactScore;
	}

	public void setEnvironmentalImpactScore(Double environmentalImpactScore) {
		this.environmentalImpactScore = environmentalImpactScore;
	}

	public Double getIntegrityScore() {
		return integrityScore;
	}

	public void setIntegrityScore(Double integrityScore) {
		this.integrityScore = integrityScore;
	}

	public Double getBusinessCommitmentScore() {
		return businessCommitmentScore;
	}

	public void setBusinessCommitmentScore(Double businessCommitmentScore) {
		this.businessCommitmentScore = businessCommitmentScore;
	}

	public Double getManagementCompetenceScore() {
		return managementCompetenceScore;
	}

	public void setManagementCompetenceScore(Double managementCompetenceScore) {
		this.managementCompetenceScore = managementCompetenceScore;
	}

	public Double getBusinessExperienceScore() {
		return businessExperienceScore;
	}

	public void setBusinessExperienceScore(Double businessExperienceScore) {
		this.businessExperienceScore = businessExperienceScore;
	}

	public Double getSuccessionPlanningScore() {
		return successionPlanningScore;
	}

	public void setSuccessionPlanningScore(Double successionPlanningScore) {
		this.successionPlanningScore = successionPlanningScore;
	}

	public Double getFinancialStrengthScore() {
		return financialStrengthScore;
	}

	public void setFinancialStrengthScore(Double financialStrengthScore) {
		this.financialStrengthScore = financialStrengthScore;
	}

	public Double getInternalControlScore() {
		return internalControlScore;
	}

	public void setInternalControlScore(Double internalControlScore) {
		this.internalControlScore = internalControlScore;
	}

	public Double getCreditTrackRecordScore() {
		return creditTrackRecordScore;
	}

	public void setCreditTrackRecordScore(Double creditTrackRecordScore) {
		this.creditTrackRecordScore = creditTrackRecordScore;
	}

	public Double getChequesBillsReturnedNumber() {
		return chequesBillsReturnedNumber;
	}

	public void setChequesBillsReturnedNumber(Double chequesBillsReturnedNumber) {
		this.chequesBillsReturnedNumber = chequesBillsReturnedNumber;
	}

	public Double getDpLimitOverDrawnNumber() {
		return dpLimitOverDrawnNumber;
	}

	public void setDpLimitOverDrawnNumber(Double dpLimitOverDrawnNumber) {
		this.dpLimitOverDrawnNumber = dpLimitOverDrawnNumber;
	}

	public Double getCumulativeDPLimitOverdrawnNumberDays() {
		return cumulativeDPLimitOverdrawnNumberDays;
	}

	public void setCumulativeDPLimitOverdrawnNumberDays(Double cumulativeDPLimitOverdrawnNumberDays) {
		this.cumulativeDPLimitOverdrawnNumberDays = cumulativeDPLimitOverdrawnNumberDays;
	}

	public Double getComplianceSanctionedDisbursementConditions() {
		return complianceSanctionedDisbursementConditions;
	}

	public void setComplianceSanctionedDisbursementConditions(Double complianceSanctionedDisbursementConditions) {
		this.complianceSanctionedDisbursementConditions = complianceSanctionedDisbursementConditions;
	}

	public Double getSubmissionProgressReports() {
		return submissionProgressReports;
	}

	public void setSubmissionProgressReports(Double submissionProgressReports) {
		this.submissionProgressReports = submissionProgressReports;
	}

	public Double getDelayReceiptPrincipalInterestInstalments() {
		return delayReceiptPrincipalInterestInstalments;
	}

	public void setDelayReceiptPrincipalInterestInstalments(Double delayReceiptPrincipalInterestInstalments) {
		this.delayReceiptPrincipalInterestInstalments = delayReceiptPrincipalInterestInstalments;
	}

	public Double getDelayInSubmissionAuditedBSAndPL() {
		return delayInSubmissionAuditedBSAndPL;
	}

	public void setDelayInSubmissionAuditedBSAndPL(Double delayInSubmissionAuditedBSAndPL) {
		this.delayInSubmissionAuditedBSAndPL = delayInSubmissionAuditedBSAndPL;
	}

	public Double getVarianceInProjectedSalesVersusActualSales() {
		return varianceInProjectedSalesVersusActualSales;
	}

	public void setVarianceInProjectedSalesVersusActualSales(Double varianceInProjectedSalesVersusActualSales) {
		this.varianceInProjectedSalesVersusActualSales = varianceInProjectedSalesVersusActualSales;
	}

	public Double getLcBgIssuedInFavorBorrowerInvoked() {
		return lcBgIssuedInFavorBorrowerInvoked;
	}

	public void setLcBgIssuedInFavorBorrowerInvoked(Double lcBgIssuedInFavorBorrowerInvoked) {
		this.lcBgIssuedInFavorBorrowerInvoked = lcBgIssuedInFavorBorrowerInvoked;
	}

	public Double getCapForTurnover() {
		return capForTurnover;
	}

	public void setCapForTurnover(Double capForTurnover) {
		this.capForTurnover = capForTurnover;
	}

	public Double getCapOnCreditTrackRecord() {
		return capOnCreditTrackRecord;
	}

	public void setCapOnCreditTrackRecord(Double capOnCreditTrackRecord) {
		this.capOnCreditTrackRecord = capOnCreditTrackRecord;
	}

	public Double getCapForEnvironment() {
		return capForEnvironment;
	}

	public void setCapForEnvironment(Double capForEnvironment) {
		this.capForEnvironment = capForEnvironment;
	}

	public Double getCapForSuccessionPlanning() {
		return capForSuccessionPlanning;
	}

	public void setCapForSuccessionPlanning(Double capForSuccessionPlanning) {
		this.capForSuccessionPlanning = capForSuccessionPlanning;
	}

	public Double getCapForFinancialRatios() {
		return capForFinancialRatios;
	}

	public void setCapForFinancialRatios(Double capForFinancialRatios) {
		this.capForFinancialRatios = capForFinancialRatios;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRiskGrade() {
		return companyRiskGrade;
	}

	public void setCompanyRiskGrade(String companyRiskGrade) {
		this.companyRiskGrade = companyRiskGrade;
	}

	public Double getFinalRiscScore() {
		return finalRiscScore;
	}

	public void setFinalRiscScore(Double finalRiscScore) {
		this.finalRiscScore = finalRiscScore;
	}

	public Double getFinalRiskWeight() {
		return finalRiskWeight;
	}

	public void setFinalRiskWeight(Double finalRiskWeight) {
		this.finalRiskWeight = finalRiskWeight;
	}

	public Double getBusinessRiskScore() {
		return businessRiskScore;
	}

	public void setBusinessRiskScore(Double businessRiskScore) {
		this.businessRiskScore = businessRiskScore;
	}

	public Double getBusinessRiskWeight() {
		return businessRiskWeight;
	}

	public void setBusinessRiskWeight(Double businessRiskWeight) {
		this.businessRiskWeight = businessRiskWeight;
	}

	public Double getManagementRiskScore() {
		return managementRiskScore;
	}

	public void setManagementRiskScore(Double managementRiskScore) {
		this.managementRiskScore = managementRiskScore;
	}

	public Double getManagementRiskWeight() {
		return managementRiskWeight;
	}

	public void setManagementRiskWeight(Double managementRiskWeight) {
		this.managementRiskWeight = managementRiskWeight;
	}

	public Double getBasicRiskScore() {
		return basicRiskScore;
	}

	public void setBasicRiskScore(Double basicRiskScore) {
		this.basicRiskScore = basicRiskScore;
	}

	public Double getConductAccountRiskFactor() {
		return conductAccountRiskFactor;
	}

	public void setConductAccountRiskFactor(Double conductAccountRiskFactor) {
		this.conductAccountRiskFactor = conductAccountRiskFactor;
	}

	public Double getAdjustedRiskScore() {
		return adjustedRiskScore;
	}

	public void setAdjustedRiskScore(Double adjustedRiskScore) {
		this.adjustedRiskScore = adjustedRiskScore;
	}

	public String getFinalRiskGrade() {
		return finalRiskGrade;
	}

	public void setFinalRiskGrade(String finalRiskGrade) {
		this.finalRiskGrade = finalRiskGrade;
	}

	public String getKeyObservationsOne() {
		return keyObservationsOne;
	}

	public void setKeyObservationsOne(String keyObservationsOne) {
		this.keyObservationsOne = keyObservationsOne;
	}

	public String getKeyObservationsTwo() {
		return keyObservationsTwo;
	}

	public void setKeyObservationsTwo(String keyObservationsTwo) {
		this.keyObservationsTwo = keyObservationsTwo;
	}

	public String getKeyObservationsThree() {
		return keyObservationsThree;
	}

	public void setKeyObservationsThree(String keyObservationsThree) {
		this.keyObservationsThree = keyObservationsThree;
	}

	public String getKeyObservationsFour() {
		return keyObservationsFour;
	}

	public void setKeyObservationsFour(String keyObservationsFour) {
		this.keyObservationsFour = keyObservationsFour;
	}

	public String getKeyObservationsFive() {
		return keyObservationsFive;
	}

	public void setKeyObservationsFive(String keyObservationsFive) {
		this.keyObservationsFive = keyObservationsFive;
	}

	public String getKeyObservationsSix() {
		return keyObservationsSix;
	}

	public void setKeyObservationsSix(String keyObservationsSix) {
		this.keyObservationsSix = keyObservationsSix;
	}

	public String getKeyObservationsSeven() {
		return keyObservationsSeven;
	}

	public void setKeyObservationsSeven(String keyObservationsSeven) {
		this.keyObservationsSeven = keyObservationsSeven;
	}

	public String getKeyObservationsEight() {
		return keyObservationsEight;
	}

	public void setKeyObservationsEight(String keyObservationsEight) {
		this.keyObservationsEight = keyObservationsEight;
	}

	public String getKeyObservationsNine() {
		return keyObservationsNine;
	}

	public void setKeyObservationsNine(String keyObservationsNine) {
		this.keyObservationsNine = keyObservationsNine;
	}

	@Override
	public String toString() {
		return "FitchOutputTrad [companyName=" + companyName + ", companyRiskGrade=" + companyRiskGrade
				+ ", finalRiscScore=" + finalRiscScore + ", finalRiskWeight=" + finalRiskWeight + ", businessRiskScore="
				+ businessRiskScore + ", businessRiskWeight=" + businessRiskWeight + ", managementRiskScore="
				+ managementRiskScore + ", managementRiskWeight=" + managementRiskWeight + ", basicRiskScore="
				+ basicRiskScore + ", conductAccountRiskFactor=" + conductAccountRiskFactor + ", adjustedRiskScore="
				+ adjustedRiskScore + ", finalRiskGrade=" + finalRiskGrade + ", keyObservationsOne="
				+ keyObservationsOne + ", keyObservationsTwo=" + keyObservationsTwo + ", keyObservationsThree="
				+ keyObservationsThree + ", keyObservationsFour=" + keyObservationsFour + ", keyObservationsFive="
				+ keyObservationsFive + ", keyObservationsSix=" + keyObservationsSix + ", keyObservationsSeven="
				+ keyObservationsSeven + ", keyObservationsEight=" + keyObservationsEight + ", keyObservationsNine="
				+ keyObservationsNine + "]";
	}

	

}
