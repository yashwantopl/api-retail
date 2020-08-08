package com.opl.retail.api.model.fitchengine.manufacturing;
public class FitchOutputManu {
	
	private String companyName;
	private String companyRiskGrade;
	
	private Double finalRiscScore;
	private Double finalRiskWeight;
	
	private Double roseScore;
	private Double roseWeight;
	
	private Double cashIntCoveScore;
	private Double cashIntCovWeight;
	
	private Double  debtEbitadScore;
	private Double  debtEbitadWeight;
	
	private Double  quickRationScore;
	private Double  quickRatioWeight;
	
	private Double  cargDeScore;
	private Double 	cargDeWeight;
	
	private Double  salesGrowthScore;
	private Double  salesGrowthWeight;
	
	private Double freeReserveEquityScore;
	private Double freeReserveEquityweight;
	
	private Double cfoMarginTrendScore;
	private Double cfoMarginTrendWeight;
	
	private Double interGroupScore;
	private Double interGroupWeight;
	
	private Double notchDownScore;
	
	private Double businessRiskScore;
	private Double businessRiskWeight;
	
	private Double customerQualityScore;
	private Double customerQualityWeight;
	
	private Double supplierQualityScore;
	private Double supplierQualityWeight;
	
	private Double orderBookScore;
	private Double orderBookWeight;
	
	private Double industrialEmployeeScore;
	private Double industrialEmployeeWeight;
	
	private Double managementRiskScore;
	private Double managementRiskWeight;
	
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
	
	private Double abilityToRaiseScore;
	private Double abilityToRaiseWeight;
	
	private Double intraCompanyScore;
	private Double intraCompanyWeight;
	
	private Double industryRiskScore;
	private Double industryRiskWeight;
	
	private Double basicRiskScore;
	
	private Double conductAccountRiskFactor;

	private Double conductAccountRiskScore;
	
	private Double projectRiskFactor;
	
	private Double adjustedRiskFactor;
	
	
	private Double capForTurnOver;
	private Double capForManagement;
	private Double capForIndustrial;
	private Double capForSuccession;
	private Double capForFinancial;
	private String finalRiskGrade;
	
	
	//////////////
	
	private String keyObservationsOne="";
	private String keyObservationsTwo="";
	private String keyObservationsThree="";
	private String keyObservationsFour="";
	private String keyObservationsFive="";
	private String keyObservationsSix="";
	private String keyObservationsSeven="";
	private String keyObservationsEight="";
	private String keyObservationsNine="";
	
	////////////////
	
	private Double basicFinancialScore; 
	
	private Double accountingQualityScore ; 
	private Double contigentLiabilityNwScore ; 
	private Double forexRiskScore ; 
	private Double restructuringHistoryScore ; 
	private Double sumNotchDownsScore ; 

	private Double numberofCheckBillReturnScore; 
	private Double numberOfTimesDpLimitOverdawnScore; 
	private Double cumulativeDaysDpLimitOverdawnScore; 
	private Double complianceWithSanctionedDisbursementConditionScore; 
	private Double submissionProgressReportScore; 
	private Double delayInReceiptPrincipalInterestInstalmentScore; 
	private Double delayInSubmissionOfAuditedDsPlBankScore; 
	private Double varianceInProjectedSaleVersusActualSaleScore; 
	private Double numberofLcBgIssuedFavourOfBorrowerScore; 
	
	
	private Double statusProjectClearanceScore; 
	private Double financialClosureScore; 
	private Double projectedDebtServiceCoverageRatioScore; 
	private Double internalRateReturnScore; 
	private Double sensitivityAnalysisScore; 
	private Double infrastructureAvailabilityScore; 
	private Double constructionContractScore;
	private Double designTechnologyRiskScore; 
	private Double projectedRiskScoreScore; 
	
	
	////////////////////


	public Double getConductAccountRiskScore() {
		return conductAccountRiskScore;
	}

	public void setConductAccountRiskScore(Double conductAccountRiskScore) {
		this.conductAccountRiskScore = conductAccountRiskScore;
	}

	public Double getAccountingQualityScore() {
		return accountingQualityScore;
	}
	public Double getDesignTechnologyRiskScore() {
		return designTechnologyRiskScore;
	}
	public void setDesignTechnologyRiskScore(Double designTechnologyRiskScore) {
		this.designTechnologyRiskScore = designTechnologyRiskScore;
	}
	public Double getBasicFinancialScore() {
		return basicFinancialScore;
	}
	public void setBasicFinancialScore(Double basicFinancialScore) {
		this.basicFinancialScore = basicFinancialScore;
	}
	public void setAccountingQualityScore(Double accountingQualityScore) {
		this.accountingQualityScore = accountingQualityScore;
	}
	public Double getContigentLiabilityNwScore() {
		return contigentLiabilityNwScore;
	}
	public void setContigentLiabilityNwScore(Double contigentLiabilityNwScore) {
		this.contigentLiabilityNwScore = contigentLiabilityNwScore;
	}
	public Double getForexRiskScore() {
		return forexRiskScore;
	}
	public void setForexRiskScore(Double forexRiskScore) {
		this.forexRiskScore = forexRiskScore;
	}
	public Double getRestructuringHistoryScore() {
		return restructuringHistoryScore;
	}
	public void setRestructuringHistoryScore(Double restructuringHistoryScore) {
		this.restructuringHistoryScore = restructuringHistoryScore;
	}
	public Double getSumNotchDownsScore() {
		return sumNotchDownsScore;
	}
	public void setSumNotchDownsScore(Double sumNotchDownsScore) {
		this.sumNotchDownsScore = sumNotchDownsScore;
	}
	public Double getNumberofCheckBillReturnScore() {
		return numberofCheckBillReturnScore;
	}
	public void setNumberofCheckBillReturnScore(Double numberofCheckBillReturnScore) {
		this.numberofCheckBillReturnScore = numberofCheckBillReturnScore;
	}
	public Double getNumberOfTimesDpLimitOverdawnScore() {
		return numberOfTimesDpLimitOverdawnScore;
	}
	public void setNumberOfTimesDpLimitOverdawnScore(Double numberOfTimesDpLimitOverdawnScore) {
		this.numberOfTimesDpLimitOverdawnScore = numberOfTimesDpLimitOverdawnScore;
	}
	public Double getCumulativeDaysDpLimitOverdawnScore() {
		return cumulativeDaysDpLimitOverdawnScore;
	}
	public void setCumulativeDaysDpLimitOverdawnScore(Double cumulativeDaysDpLimitOverdawnScore) {
		this.cumulativeDaysDpLimitOverdawnScore = cumulativeDaysDpLimitOverdawnScore;
	}
	public Double getComplianceWithSanctionedDisbursementConditionScore() {
		return complianceWithSanctionedDisbursementConditionScore;
	}
	public void setComplianceWithSanctionedDisbursementConditionScore(
			Double complianceWithSanctionedDisbursementConditionScore) {
		this.complianceWithSanctionedDisbursementConditionScore = complianceWithSanctionedDisbursementConditionScore;
	}
	public Double getSubmissionProgressReportScore() {
		return submissionProgressReportScore;
	}
	public void setSubmissionProgressReportScore(Double submissionProgressReportScore) {
		this.submissionProgressReportScore = submissionProgressReportScore;
	}
	public Double getDelayInReceiptPrincipalInterestInstalmentScore() {
		return delayInReceiptPrincipalInterestInstalmentScore;
	}
	public void setDelayInReceiptPrincipalInterestInstalmentScore(Double delayInReceiptPrincipalInterestInstalmentScore) {
		this.delayInReceiptPrincipalInterestInstalmentScore = delayInReceiptPrincipalInterestInstalmentScore;
	}
	public Double getDelayInSubmissionOfAuditedDsPlBankScore() {
		return delayInSubmissionOfAuditedDsPlBankScore;
	}
	public void setDelayInSubmissionOfAuditedDsPlBankScore(Double delayInSubmissionOfAuditedDsPlBankScore) {
		this.delayInSubmissionOfAuditedDsPlBankScore = delayInSubmissionOfAuditedDsPlBankScore;
	}
	public Double getVarianceInProjectedSaleVersusActualSaleScore() {
		return varianceInProjectedSaleVersusActualSaleScore;
	}
	public void setVarianceInProjectedSaleVersusActualSaleScore(Double varianceInProjectedSaleVersusActualSaleScore) {
		this.varianceInProjectedSaleVersusActualSaleScore = varianceInProjectedSaleVersusActualSaleScore;
	}
	public Double getNumberofLcBgIssuedFavourOfBorrowerScore() {
		return numberofLcBgIssuedFavourOfBorrowerScore;
	}
	public void setNumberofLcBgIssuedFavourOfBorrowerScore(Double numberofLcBgIssuedFavourOfBorrowerScore) {
		this.numberofLcBgIssuedFavourOfBorrowerScore = numberofLcBgIssuedFavourOfBorrowerScore;
	}
	public Double getStatusProjectClearanceScore() {
		return statusProjectClearanceScore;
	}
	public void setStatusProjectClearanceScore(Double statusProjectClearanceScore) {
		this.statusProjectClearanceScore = statusProjectClearanceScore;
	}
	public Double getFinancialClosureScore() {
		return financialClosureScore;
	}
	public void setFinancialClosureScore(Double financialClosureScore) {
		this.financialClosureScore = financialClosureScore;
	}
	public Double getProjectedDebtServiceCoverageRatioScore() {
		return projectedDebtServiceCoverageRatioScore;
	}
	public void setProjectedDebtServiceCoverageRatioScore(Double projectedDebtServiceCoverageRatioScore) {
		this.projectedDebtServiceCoverageRatioScore = projectedDebtServiceCoverageRatioScore;
	}
	public Double getInternalRateReturnScore() {
		return internalRateReturnScore;
	}
	public void setInternalRateReturnScore(Double internalRateReturnScore) {
		this.internalRateReturnScore = internalRateReturnScore;
	}
	public Double getSensitivityAnalysisScore() {
		return sensitivityAnalysisScore;
	}
	public void setSensitivityAnalysisScore(Double sensitivityAnalysisScore) {
		this.sensitivityAnalysisScore = sensitivityAnalysisScore;
	}
	public Double getInfrastructureAvailabilityScore() {
		return infrastructureAvailabilityScore;
	}
	public void setInfrastructureAvailabilityScore(Double infrastructureAvailabilityScore) {
		this.infrastructureAvailabilityScore = infrastructureAvailabilityScore;
	}
	public Double getConstructionContractScore() {
		return constructionContractScore;
	}
	public void setConstructionContractScore(Double constructionContractScore) {
		this.constructionContractScore = constructionContractScore;
	}
	public Double getProjectedRiskScoreScore() {
		return projectedRiskScoreScore;
	}
	public void setProjectedRiskScoreScore(Double projectedRiskScoreScore) {
		this.projectedRiskScoreScore = projectedRiskScoreScore;
	}
	public String getCompanyName() {
		return companyName;
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
	public Double getRoseScore() {
		return roseScore;
	}
	public void setRoseScore(Double roseScore) {
		this.roseScore = roseScore;
	}
	public Double getRoseWeight() {
		return roseWeight;
	}
	public void setRoseWeight(Double roseWeight) {
		this.roseWeight = roseWeight;
	}
	public Double getCashIntCoveScore() {
		return cashIntCoveScore;
	}
	public void setCashIntCoveScore(Double cashIntCoveScore) {
		this.cashIntCoveScore = cashIntCoveScore;
	}
	public Double getCashIntCovWeight() {
		return cashIntCovWeight;
	}
	public void setCashIntCovWeight(Double cashIntCovWeight) {
		this.cashIntCovWeight = cashIntCovWeight;
	}
	public Double getDebtEbitadScore() {
		return debtEbitadScore;
	}
	public void setDebtEbitadScore(Double debtEbitadScore) {
		this.debtEbitadScore = debtEbitadScore;
	}
	public Double getDebtEbitadWeight() {
		return debtEbitadWeight;
	}
	public void setDebtEbitadWeight(Double debtEbitadWeight) {
		this.debtEbitadWeight = debtEbitadWeight;
	}
	public Double getQuickRationScore() {
		return quickRationScore;
	}
	public void setQuickRationScore(Double quickRationScore) {
		this.quickRationScore = quickRationScore;
	}
	public Double getQuickRatioWeight() {
		return quickRatioWeight;
	}
	public void setQuickRatioWeight(Double quickRatioWeight) {
		this.quickRatioWeight = quickRatioWeight;
	}
	public Double getCargDeScore() {
		return cargDeScore;
	}
	public void setCargDeScore(Double cargDeScore) {
		this.cargDeScore = cargDeScore;
	}
	public Double getCargDeWeight() {
		return cargDeWeight;
	}
	public void setCargDeWeight(Double cargDeWeight) {
		this.cargDeWeight = cargDeWeight;
	}
	public Double getSalesGrowthScore() {
		return salesGrowthScore;
	}
	public void setSalesGrowthScore(Double salesGrowthScore) {
		this.salesGrowthScore = salesGrowthScore;
	}
	public Double getSalesGrowthWeight() {
		return salesGrowthWeight;
	}
	public void setSalesGrowthWeight(Double salesGrowthWeight) {
		this.salesGrowthWeight = salesGrowthWeight;
	}
	public Double getFreeReserveEquityScore() {
		return freeReserveEquityScore;
	}
	public void setFreeReserveEquityScore(Double freeReserveEquityScore) {
		this.freeReserveEquityScore = freeReserveEquityScore;
	}
	public Double getFreeReserveEquityweight() {
		return freeReserveEquityweight;
	}
	public void setFreeReserveEquityweight(Double freeReserveEquityweight) {
		this.freeReserveEquityweight = freeReserveEquityweight;
	}
	public Double getCfoMarginTrendScore() {
		return cfoMarginTrendScore;
	}
	public void setCfoMarginTrendScore(Double cfoMarginTrendScore) {
		this.cfoMarginTrendScore = cfoMarginTrendScore;
	}
	public Double getCfoMarginTrendWeight() {
		return cfoMarginTrendWeight;
	}
	public void setCfoMarginTrendWeight(Double cfoMarginTrendWeight) {
		this.cfoMarginTrendWeight = cfoMarginTrendWeight;
	}
	public Double getInterGroupScore() {
		return interGroupScore;
	}
	public void setInterGroupScore(Double interGroupScore) {
		this.interGroupScore = interGroupScore;
	}
	public Double getInterGroupWeight() {
		return interGroupWeight;
	}
	public void setInterGroupWeight(Double interGroupWeight) {
		this.interGroupWeight = interGroupWeight;
	}
	public Double getNotchDownScore() {
		return notchDownScore;
	}
	public void setNotchDownScore(Double notchDownScore) {
		this.notchDownScore = notchDownScore;
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
	public Double getCustomerQualityScore() {
		return customerQualityScore;
	}
	public void setCustomerQualityScore(Double customerQualityScore) {
		this.customerQualityScore = customerQualityScore;
	}
	public Double getCustomerQualityWeight() {
		return customerQualityWeight;
	}
	public void setCustomerQualityWeight(Double customerQualityWeight) {
		this.customerQualityWeight = customerQualityWeight;
	}
	public Double getSupplierQualityScore() {
		return supplierQualityScore;
	}
	public void setSupplierQualityScore(Double supplierQualityScore) {
		this.supplierQualityScore = supplierQualityScore;
	}
	public Double getSupplierQualityWeight() {
		return supplierQualityWeight;
	}
	public void setSupplierQualityWeight(Double supplierQualityWeight) {
		this.supplierQualityWeight = supplierQualityWeight;
	}
	public Double getOrderBookScore() {
		return orderBookScore;
	}
	public void setOrderBookScore(Double orderBookScore) {
		this.orderBookScore = orderBookScore;
	}
	public Double getOrderBookWeight() {
		return orderBookWeight;
	}
	public void setOrderBookWeight(Double orderBookWeight) {
		this.orderBookWeight = orderBookWeight;
	}
	public Double getIndustrialEmployeeScore() {
		return industrialEmployeeScore;
	}
	public void setIndustrialEmployeeScore(Double industrialEmployeeScore) {
		this.industrialEmployeeScore = industrialEmployeeScore;
	}
	public Double getIndustrialEmployeeWeight() {
		return industrialEmployeeWeight;
	}
	public void setIndustrialEmployeeWeight(Double industrialEmployeeWeight) {
		this.industrialEmployeeWeight = industrialEmployeeWeight;
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
	public Double getIntegrityScore() {
		return integrityScore;
	}
	public void setIntegrityScore(Double integrityScore) {
		this.integrityScore = integrityScore;
	}
	public Double getIntegrityWeight() {
		return integrityWeight;
	}
	public void setIntegrityWeight(Double integrityWeight) {
		this.integrityWeight = integrityWeight;
	}
	public Double getBusinessCommitmentScore() {
		return businessCommitmentScore;
	}
	public void setBusinessCommitmentScore(Double businessCommitmentScore) {
		this.businessCommitmentScore = businessCommitmentScore;
	}
	public Double getBusinessCommitmentWeight() {
		return businessCommitmentWeight;
	}
	public void setBusinessCommitmentWeight(Double businessCommitmentWeight) {
		this.businessCommitmentWeight = businessCommitmentWeight;
	}
	public Double getManagementCompetenceScore() {
		return managementCompetenceScore;
	}
	public void setManagementCompetenceScore(Double managementCompetenceScore) {
		this.managementCompetenceScore = managementCompetenceScore;
	}
	public Double getManagementCompetenceWeight() {
		return managementCompetenceWeight;
	}
	public void setManagementCompetenceWeight(Double managementCompetenceWeight) {
		this.managementCompetenceWeight = managementCompetenceWeight;
	}
	public Double getBusinessExperienceScore() {
		return businessExperienceScore;
	}
	public void setBusinessExperienceScore(Double businessExperienceScore) {
		this.businessExperienceScore = businessExperienceScore;
	}
	public Double getBusinessExperienceWeight() {
		return businessExperienceWeight;
	}
	public void setBusinessExperienceWeight(Double businessExperienceWeight) {
		this.businessExperienceWeight = businessExperienceWeight;
	}
	public Double getSuccessionPlanningScore() {
		return successionPlanningScore;
	}
	public void setSuccessionPlanningScore(Double successionPlanningScore) {
		this.successionPlanningScore = successionPlanningScore;
	}
	public Double getSuccessionPlanningWeight() {
		return successionPlanningWeight;
	}
	public void setSuccessionPlanningWeight(Double successionPlanningWeight) {
		this.successionPlanningWeight = successionPlanningWeight;
	}
	public Double getFinancialStrengthScore() {
		return financialStrengthScore;
	}
	public void setFinancialStrengthScore(Double financialStrengthScore) {
		this.financialStrengthScore = financialStrengthScore;
	}
	public Double getFinancialStrengthWeight() {
		return financialStrengthWeight;
	}
	public void setFinancialStrengthWeight(Double financialStrengthWeight) {
		this.financialStrengthWeight = financialStrengthWeight;
	}
	public Double getAbilityToRaiseScore() {
		return abilityToRaiseScore;
	}
	public void setAbilityToRaiseScore(Double abilityToRaiseScore) {
		this.abilityToRaiseScore = abilityToRaiseScore;
	}
	public Double getAbilityToRaiseWeight() {
		return abilityToRaiseWeight;
	}
	public void setAbilityToRaiseWeight(Double abilityToRaiseWeight) {
		this.abilityToRaiseWeight = abilityToRaiseWeight;
	}
	public Double getIntraCompanyScore() {
		return intraCompanyScore;
	}
	public void setIntraCompanyScore(Double intraCompanyScore) {
		this.intraCompanyScore = intraCompanyScore;
	}
	public Double getIntraCompanyWeight() {
		return intraCompanyWeight;
	}
	public void setIntraCompanyWeight(Double intraCompanyWeight) {
		this.intraCompanyWeight = intraCompanyWeight;
	}
	public Double getIndustryRiskScore() {
		return industryRiskScore;
	}
	public void setIndustryRiskScore(Double industryRiskScore) {
		this.industryRiskScore = industryRiskScore;
	}
	public Double getIndustryRiskWeight() {
		return industryRiskWeight;
	}
	public void setIndustryRiskWeight(Double industryRiskWeight) {
		this.industryRiskWeight = industryRiskWeight;
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
	public Double getProjectRiskFactor() {
		return projectRiskFactor;
	}
	public void setProjectRiskFactor(Double projectRiskFactor) {
		this.projectRiskFactor = projectRiskFactor;
	}
	public Double getAdjustedRiskFactor() {
		return adjustedRiskFactor;
	}
	public void setAdjustedRiskFactor(Double adjustedRiskFactor) {
		this.adjustedRiskFactor = adjustedRiskFactor;
	}
	public Double getCapForTurnOver() {
		return capForTurnOver;
	}
	public void setCapForTurnOver(Double capForTurnOver) {
		this.capForTurnOver = capForTurnOver;
	}
	public Double getCapForManagement() {
		return capForManagement;
	}
	public void setCapForManagement(Double capForManagement) {
		this.capForManagement = capForManagement;
	}
	public Double getCapForIndustrial() {
		return capForIndustrial;
	}
	public void setCapForIndustrial(Double capForIndustrial) {
		this.capForIndustrial = capForIndustrial;
	}
	public Double getCapForSuccession() {
		return capForSuccession;
	}
	public void setCapForSuccession(Double capForSuccession) {
		this.capForSuccession = capForSuccession;
	}
	public Double getCapForFinancial() {
		return capForFinancial;
	}
	public void setCapForFinancial(Double capForFinancial) {
		this.capForFinancial = capForFinancial;
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
		return "FitchOutputManu [companyName=" + companyName + ", companyRiskGrade=" + companyRiskGrade
				+ ", finalRiscScore=" + finalRiscScore + ", finalRiskWeight=" + finalRiskWeight + ", roseScore="
				+ roseScore + ", roseWeight=" + roseWeight + ", cashIntCoveScore=" + cashIntCoveScore
				+ ", cashIntCovWeight=" + cashIntCovWeight + ", debtEbitadScore=" + debtEbitadScore
				+ ", debtEbitadWeight=" + debtEbitadWeight + ", quickRationScore=" + quickRationScore
				+ ", quickRatioWeight=" + quickRatioWeight + ", cargDeScore=" + cargDeScore + ", cargDeWeight="
				+ cargDeWeight + ", salesGrowthScore=" + salesGrowthScore + ", salesGrowthWeight=" + salesGrowthWeight
				+ ", freeReserveEquityScore=" + freeReserveEquityScore + ", freeReserveEquityweight="
				+ freeReserveEquityweight + ", cfoMarginTrendScore=" + cfoMarginTrendScore + ", cfoMarginTrendWeight="
				+ cfoMarginTrendWeight + ", interGroupScore=" + interGroupScore + ", interGroupWeight="
				+ interGroupWeight + ", notchDownScore=" + notchDownScore + ", businessRiskScore=" + businessRiskScore
				+ ", businessRiskWeight=" + businessRiskWeight + ", customerQualityScore=" + customerQualityScore
				+ ", customerQualityWeight=" + customerQualityWeight + ", supplierQualityScore=" + supplierQualityScore
				+ ", supplierQualityWeight=" + supplierQualityWeight + ", orderBookScore=" + orderBookScore
				+ ", orderBookWeight=" + orderBookWeight + ", industrialEmployeeScore=" + industrialEmployeeScore
				+ ", industrialEmployeeWeight=" + industrialEmployeeWeight + ", managementRiskScore="
				+ managementRiskScore + ", managementRiskWeight=" + managementRiskWeight + ", integrityScore="
				+ integrityScore + ", integrityWeight=" + integrityWeight + ", businessCommitmentScore="
				+ businessCommitmentScore + ", businessCommitmentWeight=" + businessCommitmentWeight
				+ ", managementCompetenceScore=" + managementCompetenceScore + ", managementCompetenceWeight="
				+ managementCompetenceWeight + ", businessExperienceScore=" + businessExperienceScore
				+ ", businessExperienceWeight=" + businessExperienceWeight + ", successionPlanningScore="
				+ successionPlanningScore + ", successionPlanningWeight=" + successionPlanningWeight
				+ ", financialStrengthScore=" + financialStrengthScore + ", financialStrengthWeight="
				+ financialStrengthWeight + ", abilityToRaiseScore=" + abilityToRaiseScore + ", abilityToRaiseWeight="
				+ abilityToRaiseWeight + ", intraCompanyScore=" + intraCompanyScore + ", intraCompanyWeight="
				+ intraCompanyWeight + ", industryRiskScore=" + industryRiskScore + ", industryRiskWeight="
				+ industryRiskWeight + ", basicRiskScore=" + basicRiskScore + ", conductAccountRiskFactor="
				+ conductAccountRiskFactor + ", projectRiskFactor=" + projectRiskFactor + ", adjustedRiskFactor="
				+ adjustedRiskFactor + ", capForTurnOver=" + capForTurnOver + ", capForManagement=" + capForManagement
				+ ", capForIndustrial=" + capForIndustrial + ", capForSuccession=" + capForSuccession
				+ ", capForFinancial=" + capForFinancial + ", finalRiskGrade=" + finalRiskGrade
				+ ", keyObservationsOne=" + keyObservationsOne + ", keyObservationsTwo=" + keyObservationsTwo
				+ ", keyObservationsThree=" + keyObservationsThree + ", keyObservationsFour=" + keyObservationsFour
				+ ", keyObservationsFive=" + keyObservationsFive + ", keyObservationsSix=" + keyObservationsSix
				+ ", keyObservationsSeven=" + keyObservationsSeven + ", keyObservationsEight=" + keyObservationsEight
				+ ", keyObservationsNine=" + keyObservationsNine + ", basicFinancialScore=" + basicFinancialScore
				+ ", accountingQualityScore=" + accountingQualityScore + ", contigentLiabilityNwScore="
				+ contigentLiabilityNwScore + ", forexRiskScore=" + forexRiskScore + ", restructuringHistoryScore="
				+ restructuringHistoryScore + ", sumNotchDownsScore=" + sumNotchDownsScore
				+ ", numberofCheckBillReturnScore=" + numberofCheckBillReturnScore
				+ ", numberOfTimesDpLimitOverdawnScore=" + numberOfTimesDpLimitOverdawnScore
				+ ", cumulativeDaysDpLimitOverdawnScore=" + cumulativeDaysDpLimitOverdawnScore
				+ ", complianceWithSanctionedDisbursementConditionScore="
				+ complianceWithSanctionedDisbursementConditionScore + ", submissionProgressReportScore="
				+ submissionProgressReportScore + ", delayInReceiptPrincipalInterestInstalmentScore="
				+ delayInReceiptPrincipalInterestInstalmentScore + ", delayInSubmissionOfAuditedDsPlBankScore="
				+ delayInSubmissionOfAuditedDsPlBankScore + ", varianceInProjectedSaleVersusActualSaleScore="
				+ varianceInProjectedSaleVersusActualSaleScore + ", numberofLcBgIssuedFavourOfBorrowerScore="
				+ numberofLcBgIssuedFavourOfBorrowerScore + ", statusProjectClearanceScore="
				+ statusProjectClearanceScore + ", financialClosureScore=" + financialClosureScore
				+ ", projectedDebtServiceCoverageRatioScore=" + projectedDebtServiceCoverageRatioScore
				+ ", internalRateReturnScore=" + internalRateReturnScore + ", sensitivityAnalysisScore="
				+ sensitivityAnalysisScore + ", infrastructureAvailabilityScore=" + infrastructureAvailabilityScore
				+ ", constructionContractScore=" + constructionContractScore + ", designTechnologyRiskScore="
				+ designTechnologyRiskScore + ", projectedRiskScoreScore=" + projectedRiskScoreScore + "]";
	}
	
	
	

}