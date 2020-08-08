package com.opl.retail.api.model.fitchengine.service;

public class FinancialInputSheetServ
{
		private String companyName;
		
		private String industryName;
		private Double shareFaceValue=0.0;
	
		///////////////////////////
		
		private Double noOfMonthFy=0.0;
		private Double noOfMonthSy=0.0;
		private Double noOfMonthTy=0.0;
		
		private Double grossSalesFy=0.0;
		private Double grossSalesSy=0.0;
		private Double grossSalesTy=0.0;
		
		private Double lessExciseDuityFy=0.0;
		private Double lessExciseDuitySy=0.0;
		private Double lessExciseDuityTy=0.0;
		
		private Double  netSaleFy;
		private Double  netSaleSy;
		private Double  netSaleTy;
		
		private Double increaseDecreaseStockFy=0.0;
		private Double increaseDecreaseStockSy=0.0;
		private Double increaseDecreaseStockTy=0.0;
		
		private Double rawMaterialConsumedFy=0.0;
		private Double rawMaterialConsumedSy=0.0;
		private Double rawMaterialConsumedTy=0.0;
		
		private Double powerAndFuelCostFy=0.0;
		private Double powerAndFuelCostSy=0.0;
		private Double powerAndFuelCostTy=0.0;
		
		private Double employeeCostFy=0.0;
		private Double employeeCostSy=0.0;
		private Double employeeCostTy=0.0;
		
		private Double generalAndAdminExpeFy=0.0;
		private Double generalAndAdminExpeSy=0.0;
		private Double generalAndAdminExpeTy=0.0;
		
		private Double sellingAndDistriExpeFy=0.0;
		private Double sellingAndDistriExpeSy=0.0;
		private Double sellingAndDistriExpeTy=0.0;
		
		private Double miscelExpeFy=0.0;
		private Double miscelExpeSy=0.0;
		private Double miscelExpeTy=0.0;
		
		private Double lessExpeCapitaFy=0.0;
		private Double lessExpeCapitaSy=0.0;
		private Double lessExpeCapitaTy=0.0;

		private Double  totalExpenditureFy;
		private Double  totalExpenditureSy;
		private Double  totalExpenditureTy;

		private Double  operatingProfitExclOiFy;
		private Double  operatingProfitExclOiSy;
		private Double  operatingProfitExclOiTy;
		
		private Double otherIncomeFy=0.0;
		private Double otherIncomeSy=0.0;
		private Double otherIncomeTy=0.0;
		
		private Double  operatingProfitEbitadOiFy ;
		private Double  operatingProfitEbitadOiSy ;
		private Double  operatingProfitEbitadOiTy ;

		private Double interestFy=0.0;
		private Double interestSy=0.0;
		private Double interestTy=0.0;
		
		private Double  pbdtFy;
		private Double  pbdtSy;
		private Double  pbdtTy;

		private Double depriciationFy=0.0;
		private Double depriciationSy=0.0;
		private Double depriciationTy=0.0;
		
		private Double  profitBeforeTaxationFy;
		private Double  profitBeforeTaxationSy;
		private Double  profitBeforeTaxationTy;
		
		
		private Double exceptionalIncomeFy=0.0;
		private Double exceptionalIncomeSy=0.0;
		private Double exceptionalIncomeTy=0.0;
		
		private Double  profitBeforeTaxFy;
		private Double  profitBeforeTaxSy;
		private Double  profitBeforeTaxTy;

		
		private Double provisionForTaxFy=0.0;
		private Double provisionForTaxSy=0.0;
		private Double provisionForTaxTy=0.0;
		
		private Double  profitAfterTaxFy;
		private Double  profitAfterTaxSy;
		private Double  profitAfterTaxTy;
		
		private Double dividendPayOutFy=0.0;
		private Double dividendPayOutSy=0.0;
		private Double dividendPayOutTy=0.0;
		
		private Double  equityDividendFy;
		private Double  equityDividendSy;
		private Double  equityDividendTy;
		
		private Double  earningPerShareFy;
		private Double  earningPerShareSy;
		private Double  earningPerShareTy;
		
		////////////////////////////////
		
		private Double shareCapitalFy=0.0;
		private Double shareCapitalSy=0.0;
		private Double shareCapitalTy=0.0;
		
		private Double shareWarrantOutstandingsFy=0.0;
		private Double shareWarrantOutstandingsSy=0.0;
		private Double shareWarrantOutstandingsTy=0.0;
		
		private Double revalationReserveFy=0.0;
		private Double revalationReserveSy=0.0;
		private Double revalationReserveTy=0.0;
		
		private Double otherReserveAndSurplusFy=0.0;
		private Double otherReserveAndSurplusSy=0.0;
		private Double otherReserveAndSurplusTy=0.0;
		
		private Double  shareHolderFundsFy;
		private Double  shareHolderFundsSy;
		private Double  shareHolderFundsTy;
		
		private Double minorityInterestFy=0.0;
		private Double minorityInterestSy=0.0;
		private Double minorityInterestTy=0.0;
		
		private Double securedLoansFy=0.0;
		private Double securedLoansSy=0.0;
		private Double securedLoansTy=0.0;
		
		private Double unsecuredLoansPromotersFy=0.0;
		private Double unsecuredLoansPromotersSy=0.0;
		private Double unsecuredLoansPromotersTy=0.0;
		
		private Double unsecuredLoansOthersFy=0.0;
		private Double unsecuredLoansOthersSy=0.0;
		private Double unsecuredLoansOthersTy=0.0;
		
		private Double deferredTaxLiablitiesFy=0.0;
		private Double deferredTaxLiablitiesSy=0.0;
		private Double deferredTaxLiablitiesTy=0.0;
		
		private Double otherLongTermLiablitiesFy=0.0;
		private Double otherLongTermLiablitiesSy=0.0;
		private Double otherLongTermLiablitiesTy=0.0;
		
		private Double otherBorrowingFy=0.0;
		private Double otherBorrowingSy=0.0;
		private Double otherBorrowingTy=0.0;
		
		private Double longTermProvisionFy=0.0;
		private Double longTermProvisionSy=0.0;
		private Double longTermProvisionTy=0.0;
		
		
		private Double  totalNoncurruntLiablitiesFy;
		private Double  totalNoncurruntLiablitiesSy;
		private Double  totalNoncurruntLiablitiesTy;
		
		private Double tradePayablesFy=0.0;
		private Double tradePayablesSy=0.0;
		private Double tradePayablesTy=0.0;
		
		private Double otherCurruntLiablitiesFy=0.0;
		private Double otherCurruntLiablitiesSy=0.0;
		private Double otherCurruntLiablitiesTy=0.0;
		
		private Double shortTermProvisionFy=0.0;
		private Double shortTermProvisionSy=0.0;
		private Double shortTermProvisionTy=0.0;
		
		private Double  totalCurruntLiablitiesFy;
		private Double  totalCurruntLiablitiesSy;
		private Double  totalCurruntLiablitiesTy;
		
		private Double  totalLiablitiesFy;
		private Double  totalLiablitiesSy;
		private Double  totalLiablitiesTy;
		
		
		
		///////////////////////
		
		
		
		private Double grossBlockFy=0.0;
		private Double grossBlockSy=0.0;
		private Double grossBlockTy=0.0;
		
		private Double lessAccumulatedDepreFy=0.0;
		private Double lessAccumulatedDepreSy=0.0;
		private Double lessAccumulatedDepreTy=0.0;
		
		private Double impairmentofAssetFy=0.0;
		private Double impairmentofAssetSy=0.0;
		private Double impairmentofAssetTy=0.0;
		
		private Double  netBlockFy;
		private Double  netBlockSy;
		private Double  netBlockTy;
		
		private Double capitalWorkInProgressFy=0.0;
		private Double capitalWorkInProgressSy=0.0;
		private Double capitalWorkInProgressTy=0.0;
		
		private Double intengibleAssetsFy=0.0;
		private Double intengibleAssetsSy=0.0;
		private Double intengibleAssetsTy=0.0;
		
		private Double preOperativeExpeFy=0.0;
		private Double preOperativeExpeSy=0.0;
		private Double preOperativeExpeTy=0.0;
		
		private Double assetInTransitFy=0.0;
		private Double assetInTransitSy=0.0;
		private Double assetInTransitTy=0.0;
		
		private Double investmentInSubsidiariesFy=0.0;
		private Double investmentInSubsidiariesSy=0.0;
		private Double investmentInSubsidiariesTy=0.0;
		
		private Double otherInvestmentFy=0.0;
		private Double otherInvestmentSy=0.0;
		private Double otherInvestmentTy=0.0;
		
		
		private Double longTermLoansAndAdvaFy=0.0;
		private Double longTermLoansAndAdvaSy=0.0;
		private Double longTermLoansAndAdvaTy=0.0;
		
		private Double otheNonCurruntAssetFy=0.0;
		private Double otheNonCurruntAssetSy=0.0;
		private Double otheNonCurruntAssetTy=0.0;
		
		private Double  totalNonCurruntAssetFy;
		private Double  totalNonCurruntAssetSy;
		private Double  totalNonCurruntAssetTy;
		
		private Double inventoriesFy=0.0;
		private Double inventoriesSy=0.0;
		private Double inventoriesTy=0.0;
		
		private Double sundryDebtorsFy=0.0;
		private Double sundryDebtorsSy=0.0;
		private Double sundryDebtorsTy=0.0;
		
		private Double cashAndBankFy=0.0;
		private Double cashAndBankSy=0.0;
		private Double cashAndBankTy=0.0;
		
		private Double otherCurruntAssetFy=0.0;
		private Double otherCurruntAssetSy=0.0;
		private Double otherCurruntAssetTy=0.0;
		
		
		private Double shortTermLoansAdvancesFy=0.0;
		private Double shortTermLoansAdvancesSy=0.0;
		private Double shortTermLoansAdvancesTy=0.0;
		
		
		private Double  totalCurruntAssetFy;
		private Double  totalCurruntAssetSy;
		private Double  totalCurruntAssetTy;
		
		private Double  totalAssetFy;
		private Double  totalAssetSy;
		private Double  totalAssetTy;
		
		private Double contingentLiablitiesFy=0.0;
		private Double contingentLiablitiesSy=0.0;
		private Double contingentLiablitiesTy=0.0;
		
		
		private Double  bookValueFy;
		private Double  bookValueSy;
		private Double  bookValueTy;
		
		
		
		
		////////////////////////
		
		private Double  ebitdaFy;
		private Double  ebitdaSy;
		
		private Double  interestPaidFy;
		private Double  interestPaidSy;
		
		private Double  increaseWorkingCapitalFy;
		private Double  increaseWorkingCapitalSy;
		
		private Double  taxPaidFy;
		private Double  taxPaidSy;
		
		private Double  cashFromOperatingFy;
		private Double  cashFromOperatingSy;
		
		
		///////////////////////////
		
		private String ratioAnalysisFyFullDate;
		
		private Double  ebitadPercentageFy;
		private Double  ebitadPercentageSy;
		private Double  ebitadPercentageTy;
		
		private Double  patmFy;
		private Double  patmSy;
		private Double  patmTy;
		
		private Double  roceFy;
		private Double  roceSy;
		
		private Double  assetTurnoverFy;
		private Double  assetTurnoverSy;
		private Double  assetTurnoverTy;
		
		private Double  inventoryTurnOverFy;
		private Double  inventoryTurnOverSy;
		private Double  inventoryTurnOverTy;
		
		private Double  debtorsTurnoverFy;
		private Double  debtorsTurnoverSy;
		private Double  debtorsTurnoverTy;
		
		private Double  creditorsTurnoverFy;
		private Double  creditorsTurnoverSy;
		private Double  creditorsTurnoverTy;
		
		private Double  salesWorkingCapitalFy;
		private Double  salesWorkingCapitalSy;
		private Double  salesWorkingCapitalTy;
		
		private Double  netSalesGrowthCapitalFy;
		private Double  netSalesGrowthCapitalSy;
		
		private Double  patGrowthCapitalFy;
		private Double  patGrowthCapitalSy;
		
		private Double  adjustedTotalDebtEquityFy;
		private Double  adjustedTotalDebtEquitySy;
		private Double  adjustedTotalDebtEquityTy;
		
		private Double  growthDebtEquityFy;
		private Double  growthDebtEquitySy;
		
		private Double  curruntRatioXFy;
		private Double  curruntRatioXSy;
		private Double  curruntRatioXTy;
		
		private Double  quickRatioXFy;
		private Double  quickRatioSSy;
		private Double  quickRatioTTy;
		
		private Double  interestCoverFy;
		private Double  interestCoverSy;
		private Double  interestCoverTy;
		
		private Double  debtEbitadFy;
		private Double  debtEbitadSy;
		private Double  debtEbitadTy;
		
		private Double  freeReserveEquityFy;
		private Double  freeReserveEquitySy;
		private Double  freeReserveEquityTy;
		
		private Double  cfoMargineFy;
		private Double  cfoMargineSy;
		
		private Double  growthCfoMargineFy;
		private Double  growthCfoMargineSy;
		
		
		//////////////////////
		
		
		
		
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getIndustryName() {
			return industryName;
		}
		public void setIndustryName(String industryName) {
			this.industryName = industryName;
		}
		public Double getShareFaceValue() {
			return shareFaceValue;
		}
		public void setShareFaceValue(Double shareFaceValue) {
			this.shareFaceValue = shareFaceValue;
		}
		public Double getNoOfMonthFy() {
			return noOfMonthFy;
		}
		public void setNoOfMonthFy(Double noOfMonthFy) {
			this.noOfMonthFy = noOfMonthFy;
		}
		public Double getNoOfMonthSy() {
			return noOfMonthSy;
		}
		public void setNoOfMonthSy(Double noOfMonthSy) {
			this.noOfMonthSy = noOfMonthSy;
		}
		public Double getNoOfMonthTy() {
			return noOfMonthTy;
		}
		public void setNoOfMonthTy(Double noOfMonthTy) {
			this.noOfMonthTy = noOfMonthTy;
		}
		public Double getGrossSalesFy() {
			return grossSalesFy;
		}
		public void setGrossSalesFy(Double grossSalesFy) {
			this.grossSalesFy = grossSalesFy;
		}
		public Double getGrossSalesSy() {
			return grossSalesSy;
		}
		public void setGrossSalesSy(Double grossSalesSy) {
			this.grossSalesSy = grossSalesSy;
		}
		public Double getGrossSalesTy() {
			return grossSalesTy;
		}
		public void setGrossSalesTy(Double grossSalesTy) {
			this.grossSalesTy = grossSalesTy;
		}
		public Double getLessExciseDuityFy() {
			return lessExciseDuityFy;
		}
		public void setLessExciseDuityFy(Double lessExciseDuityFy) {
			this.lessExciseDuityFy = lessExciseDuityFy;
		}
		public Double getLessExciseDuitySy() {
			return lessExciseDuitySy;
		}
		public void setLessExciseDuitySy(Double lessExciseDuitySy) {
			this.lessExciseDuitySy = lessExciseDuitySy;
		}
		public Double getLessExciseDuityTy() {
			return lessExciseDuityTy;
		}
		public void setLessExciseDuityTy(Double lessExciseDuityTy) {
			this.lessExciseDuityTy = lessExciseDuityTy;
		}
		public Double getNetSaleFy() {
			return netSaleFy;
		}
		public void setNetSaleFy(Double netSaleFy) {
			this.netSaleFy = netSaleFy;
		}
		public Double getNetSaleSy() {
			return netSaleSy;
		}
		public void setNetSaleSy(Double netSaleSy) {
			this.netSaleSy = netSaleSy;
		}
		public Double getNetSaleTy() {
			return netSaleTy;
		}
		public void setNetSaleTy(Double netSaleTy) {
			this.netSaleTy = netSaleTy;
		}
		public Double getIncreaseDecreaseStockFy() {
			return increaseDecreaseStockFy;
		}
		public void setIncreaseDecreaseStockFy(Double increaseDecreaseStockFy) {
			this.increaseDecreaseStockFy = increaseDecreaseStockFy;
		}
		public Double getIncreaseDecreaseStockSy() {
			return increaseDecreaseStockSy;
		}
		public void setIncreaseDecreaseStockSy(Double increaseDecreaseStockSy) {
			this.increaseDecreaseStockSy = increaseDecreaseStockSy;
		}
		public Double getIncreaseDecreaseStockTy() {
			return increaseDecreaseStockTy;
		}
		public void setIncreaseDecreaseStockTy(Double increaseDecreaseStockTy) {
			this.increaseDecreaseStockTy = increaseDecreaseStockTy;
		}
		public Double getRawMaterialConsumedFy() {
			return rawMaterialConsumedFy;
		}
		public void setRawMaterialConsumedFy(Double rawMaterialConsumedFy) {
			this.rawMaterialConsumedFy = rawMaterialConsumedFy;
		}
		public Double getRawMaterialConsumedSy() {
			return rawMaterialConsumedSy;
		}
		public void setRawMaterialConsumedSy(Double rawMaterialConsumedSy) {
			this.rawMaterialConsumedSy = rawMaterialConsumedSy;
		}
		public Double getRawMaterialConsumedTy() {
			return rawMaterialConsumedTy;
		}
		public void setRawMaterialConsumedTy(Double rawMaterialConsumedTy) {
			this.rawMaterialConsumedTy = rawMaterialConsumedTy;
		}
		public Double getPowerAndFuelCostFy() {
			return powerAndFuelCostFy;
		}
		public void setPowerAndFuelCostFy(Double powerAndFuelCostFy) {
			this.powerAndFuelCostFy = powerAndFuelCostFy;
		}
		public Double getPowerAndFuelCostSy() {
			return powerAndFuelCostSy;
		}
		public void setPowerAndFuelCostSy(Double powerAndFuelCostSy) {
			this.powerAndFuelCostSy = powerAndFuelCostSy;
		}
		public Double getPowerAndFuelCostTy() {
			return powerAndFuelCostTy;
		}
		public void setPowerAndFuelCostTy(Double powerAndFuelCostTy) {
			this.powerAndFuelCostTy = powerAndFuelCostTy;
		}
		public Double getEmployeeCostFy() {
			return employeeCostFy;
		}
		public void setEmployeeCostFy(Double employeeCostFy) {
			this.employeeCostFy = employeeCostFy;
		}
		public Double getEmployeeCostSy() {
			return employeeCostSy;
		}
		public void setEmployeeCostSy(Double employeeCostSy) {
			this.employeeCostSy = employeeCostSy;
		}
		public Double getEmployeeCostTy() {
			return employeeCostTy;
		}
		public void setEmployeeCostTy(Double employeeCostTy) {
			this.employeeCostTy = employeeCostTy;
		}
		public Double getGeneralAndAdminExpeFy() {
			return generalAndAdminExpeFy;
		}
		public void setGeneralAndAdminExpeFy(Double generalAndAdminExpeFy) {
			this.generalAndAdminExpeFy = generalAndAdminExpeFy;
		}
		public Double getGeneralAndAdminExpeSy() {
			return generalAndAdminExpeSy;
		}
		public void setGeneralAndAdminExpeSy(Double generalAndAdminExpeSy) {
			this.generalAndAdminExpeSy = generalAndAdminExpeSy;
		}
		public Double getGeneralAndAdminExpeTy() {
			return generalAndAdminExpeTy;
		}
		public void setGeneralAndAdminExpeTy(Double generalAndAdminExpeTy) {
			this.generalAndAdminExpeTy = generalAndAdminExpeTy;
		}
		public Double getSellingAndDistriExpeFy() {
			return sellingAndDistriExpeFy;
		}
		public void setSellingAndDistriExpeFy(Double sellingAndDistriExpeFy) {
			this.sellingAndDistriExpeFy = sellingAndDistriExpeFy;
		}
		public Double getSellingAndDistriExpeSy() {
			return sellingAndDistriExpeSy;
		}
		public void setSellingAndDistriExpeSy(Double sellingAndDistriExpeSy) {
			this.sellingAndDistriExpeSy = sellingAndDistriExpeSy;
		}
		public Double getSellingAndDistriExpeTy() {
			return sellingAndDistriExpeTy;
		}
		public void setSellingAndDistriExpeTy(Double sellingAndDistriExpeTy) {
			this.sellingAndDistriExpeTy = sellingAndDistriExpeTy;
		}
		public Double getMiscelExpeFy() {
			return miscelExpeFy;
		}
		public void setMiscelExpeFy(Double miscelExpeFy) {
			this.miscelExpeFy = miscelExpeFy;
		}
		public Double getMiscelExpeSy() {
			return miscelExpeSy;
		}
		public void setMiscelExpeSy(Double miscelExpeSy) {
			this.miscelExpeSy = miscelExpeSy;
		}
		public Double getMiscelExpeTy() {
			return miscelExpeTy;
		}
		public void setMiscelExpeTy(Double miscelExpeTy) {
			this.miscelExpeTy = miscelExpeTy;
		}
		public Double getLessExpeCapitaFy() {
			return lessExpeCapitaFy;
		}
		public void setLessExpeCapitaFy(Double lessExpeCapitaFy) {
			this.lessExpeCapitaFy = lessExpeCapitaFy;
		}
		public Double getLessExpeCapitaSy() {
			return lessExpeCapitaSy;
		}
		public void setLessExpeCapitaSy(Double lessExpeCapitaSy) {
			this.lessExpeCapitaSy = lessExpeCapitaSy;
		}
		public Double getLessExpeCapitaTy() {
			return lessExpeCapitaTy;
		}
		public void setLessExpeCapitaTy(Double lessExpeCapitaTy) {
			this.lessExpeCapitaTy = lessExpeCapitaTy;
		}
		public Double getTotalExpenditureFy() {
			return totalExpenditureFy;
		}
		public void setTotalExpenditureFy(Double totalExpenditureFy) {
			this.totalExpenditureFy = totalExpenditureFy;
		}
		public Double getTotalExpenditureSy() {
			return totalExpenditureSy;
		}
		public void setTotalExpenditureSy(Double totalExpenditureSy) {
			this.totalExpenditureSy = totalExpenditureSy;
		}
		public Double getTotalExpenditureTy() {
			return totalExpenditureTy;
		}
		public void setTotalExpenditureTy(Double totalExpenditureTy) {
			this.totalExpenditureTy = totalExpenditureTy;
		}
		public Double getOperatingProfitExclOiFy() {
			return operatingProfitExclOiFy;
		}
		public void setOperatingProfitExclOiFy(Double operatingProfitExclOiFy) {
			this.operatingProfitExclOiFy = operatingProfitExclOiFy;
		}
		public Double getOperatingProfitExclOiSy() {
			return operatingProfitExclOiSy;
		}
		public void setOperatingProfitExclOiSy(Double operatingProfitExclOiSy) {
			this.operatingProfitExclOiSy = operatingProfitExclOiSy;
		}
		public Double getOperatingProfitExclOiTy() {
			return operatingProfitExclOiTy;
		}
		public void setOperatingProfitExclOiTy(Double operatingProfitExclOiTy) {
			this.operatingProfitExclOiTy = operatingProfitExclOiTy;
		}
		public Double getOtherIncomeFy() {
			return otherIncomeFy;
		}
		public void setOtherIncomeFy(Double otherIncomeFy) {
			this.otherIncomeFy = otherIncomeFy;
		}
		public Double getOtherIncomeSy() {
			return otherIncomeSy;
		}
		public void setOtherIncomeSy(Double otherIncomeSy) {
			this.otherIncomeSy = otherIncomeSy;
		}
		public Double getOtherIncomeTy() {
			return otherIncomeTy;
		}
		public void setOtherIncomeTy(Double otherIncomeTy) {
			this.otherIncomeTy = otherIncomeTy;
		}
		public Double getOperatingProfitEbitadOiFy() {
			return operatingProfitEbitadOiFy;
		}
		public void setOperatingProfitEbitadOiFy(Double operatingProfitEbitadOiFy) {
			this.operatingProfitEbitadOiFy = operatingProfitEbitadOiFy;
		}
		public Double getOperatingProfitEbitadOiSy() {
			return operatingProfitEbitadOiSy;
		}
		public void setOperatingProfitEbitadOiSy(Double operatingProfitEbitadOiSy) {
			this.operatingProfitEbitadOiSy = operatingProfitEbitadOiSy;
		}
		public Double getOperatingProfitEbitadOiTy() {
			return operatingProfitEbitadOiTy;
		}
		public void setOperatingProfitEbitadOiTy(Double operatingProfitEbitadOiTy) {
			this.operatingProfitEbitadOiTy = operatingProfitEbitadOiTy;
		}
		public Double getInterestFy() {
			return interestFy;
		}
		public void setInterestFy(Double interestFy) {
			this.interestFy = interestFy;
		}
		public Double getInterestSy() {
			return interestSy;
		}
		public void setInterestSy(Double interestSy) {
			this.interestSy = interestSy;
		}
		public Double getInterestTy() {
			return interestTy;
		}
		public void setInterestTy(Double interestTy) {
			this.interestTy = interestTy;
		}
		public Double getPbdtFy() {
			return pbdtFy;
		}
		public void setPbdtFy(Double pbdtFy) {
			this.pbdtFy = pbdtFy;
		}
		public Double getPbdtSy() {
			return pbdtSy;
		}
		public void setPbdtSy(Double pbdtSy) {
			this.pbdtSy = pbdtSy;
		}
		public Double getPbdtTy() {
			return pbdtTy;
		}
		public void setPbdtTy(Double pbdtTy) {
			this.pbdtTy = pbdtTy;
		}
		public Double getDepriciationFy() {
			return depriciationFy;
		}
		public void setDepriciationFy(Double depriciationFy) {
			this.depriciationFy = depriciationFy;
		}
		public Double getDepriciationSy() {
			return depriciationSy;
		}
		public void setDepriciationSy(Double depriciationSy) {
			this.depriciationSy = depriciationSy;
		}
		public Double getDepriciationTy() {
			return depriciationTy;
		}
		public void setDepriciationTy(Double depriciationTy) {
			this.depriciationTy = depriciationTy;
		}
		public Double getProfitBeforeTaxationFy() {
			return profitBeforeTaxationFy;
		}
		public void setProfitBeforeTaxationFy(Double profitBeforeTaxationFy) {
			this.profitBeforeTaxationFy = profitBeforeTaxationFy;
		}
		public Double getProfitBeforeTaxationSy() {
			return profitBeforeTaxationSy;
		}
		public void setProfitBeforeTaxationSy(Double profitBeforeTaxationSy) {
			this.profitBeforeTaxationSy = profitBeforeTaxationSy;
		}
		public Double getProfitBeforeTaxationTy() {
			return profitBeforeTaxationTy;
		}
		public void setProfitBeforeTaxationTy(Double profitBeforeTaxationTy) {
			this.profitBeforeTaxationTy = profitBeforeTaxationTy;
		}
		public Double getExceptionalIncomeFy() {
			return exceptionalIncomeFy;
		}
		public void setExceptionalIncomeFy(Double exceptionalIncomeFy) {
			this.exceptionalIncomeFy = exceptionalIncomeFy;
		}
		public Double getExceptionalIncomeSy() {
			return exceptionalIncomeSy;
		}
		public void setExceptionalIncomeSy(Double exceptionalIncomeSy) {
			this.exceptionalIncomeSy = exceptionalIncomeSy;
		}
		public Double getExceptionalIncomeTy() {
			return exceptionalIncomeTy;
		}
		public void setExceptionalIncomeTy(Double exceptionalIncomeTy) {
			this.exceptionalIncomeTy = exceptionalIncomeTy;
		}
		public Double getProfitBeforeTaxFy() {
			return profitBeforeTaxFy;
		}
		public void setProfitBeforeTaxFy(Double profitBeforeTaxFy) {
			this.profitBeforeTaxFy = profitBeforeTaxFy;
		}
		public Double getProfitBeforeTaxSy() {
			return profitBeforeTaxSy;
		}
		public void setProfitBeforeTaxSy(Double profitBeforeTaxSy) {
			this.profitBeforeTaxSy = profitBeforeTaxSy;
		}
		public Double getProfitBeforeTaxTy() {
			return profitBeforeTaxTy;
		}
		public void setProfitBeforeTaxTy(Double profitBeforeTaxTy) {
			this.profitBeforeTaxTy = profitBeforeTaxTy;
		}
		public Double getProvisionForTaxFy() {
			return provisionForTaxFy;
		}
		public void setProvisionForTaxFy(Double provisionForTaxFy) {
			this.provisionForTaxFy = provisionForTaxFy;
		}
		public Double getProvisionForTaxSy() {
			return provisionForTaxSy;
		}
		public void setProvisionForTaxSy(Double provisionForTaxSy) {
			this.provisionForTaxSy = provisionForTaxSy;
		}
		public Double getProvisionForTaxTy() {
			return provisionForTaxTy;
		}
		public void setProvisionForTaxTy(Double provisionForTaxTy) {
			this.provisionForTaxTy = provisionForTaxTy;
		}
		public Double getProfitAfterTaxFy() {
			return profitAfterTaxFy;
		}
		public void setProfitAfterTaxFy(Double profitAfterTaxFy) {
			this.profitAfterTaxFy = profitAfterTaxFy;
		}
		public Double getProfitAfterTaxSy() {
			return profitAfterTaxSy;
		}
		public void setProfitAfterTaxSy(Double profitAfterTaxSy) {
			this.profitAfterTaxSy = profitAfterTaxSy;
		}
		public Double getProfitAfterTaxTy() {
			return profitAfterTaxTy;
		}
		public void setProfitAfterTaxTy(Double profitAfterTaxTy) {
			this.profitAfterTaxTy = profitAfterTaxTy;
		}
		public Double getDividendPayOutFy() {
			return dividendPayOutFy;
		}
		public void setDividendPayOutFy(Double dividendPayOutFy) {
			this.dividendPayOutFy = dividendPayOutFy;
		}
		public Double getDividendPayOutSy() {
			return dividendPayOutSy;
		}
		public void setDividendPayOutSy(Double dividendPayOutSy) {
			this.dividendPayOutSy = dividendPayOutSy;
		}
		public Double getDividendPayOutTy() {
			return dividendPayOutTy;
		}
		public void setDividendPayOutTy(Double dividendPayOutTy) {
			this.dividendPayOutTy = dividendPayOutTy;
		}
		public Double getEquityDividendFy() {
			return equityDividendFy;
		}
		public void setEquityDividendFy(Double equityDividendFy) {
			this.equityDividendFy = equityDividendFy;
		}
		public Double getEquityDividendSy() {
			return equityDividendSy;
		}
		public void setEquityDividendSy(Double equityDividendSy) {
			this.equityDividendSy = equityDividendSy;
		}
		public Double getEquityDividendTy() {
			return equityDividendTy;
		}
		public void setEquityDividendTy(Double equityDividendTy) {
			this.equityDividendTy = equityDividendTy;
		}
		public Double getEarningPerShareFy() {
			return earningPerShareFy;
		}
		public void setEarningPerShareFy(Double earningPerShareFy) {
			this.earningPerShareFy = earningPerShareFy;
		}
		public Double getEarningPerShareSy() {
			return earningPerShareSy;
		}
		public void setEarningPerShareSy(Double earningPerShareSy) {
			this.earningPerShareSy = earningPerShareSy;
		}
		public Double getEarningPerShareTy() {
			return earningPerShareTy;
		}
		public void setEarningPerShareTy(Double earningPerShareTy) {
			this.earningPerShareTy = earningPerShareTy;
		}
		public Double getShareCapitalFy() {
			return shareCapitalFy;
		}
		public void setShareCapitalFy(Double shareCapitalFy) {
			this.shareCapitalFy = shareCapitalFy;
		}
		public Double getShareCapitalSy() {
			return shareCapitalSy;
		}
		public void setShareCapitalSy(Double shareCapitalSy) {
			this.shareCapitalSy = shareCapitalSy;
		}
		public Double getShareCapitalTy() {
			return shareCapitalTy;
		}
		public void setShareCapitalTy(Double shareCapitalTy) {
			this.shareCapitalTy = shareCapitalTy;
		}
		public Double getShareWarrantOutstandingsFy() {
			return shareWarrantOutstandingsFy;
		}
		public void setShareWarrantOutstandingsFy(Double shareWarrantOutstandingsFy) {
			this.shareWarrantOutstandingsFy = shareWarrantOutstandingsFy;
		}
		public Double getShareWarrantOutstandingsSy() {
			return shareWarrantOutstandingsSy;
		}
		public void setShareWarrantOutstandingsSy(Double shareWarrantOutstandingsSy) {
			this.shareWarrantOutstandingsSy = shareWarrantOutstandingsSy;
		}
		public Double getShareWarrantOutstandingsTy() {
			return shareWarrantOutstandingsTy;
		}
		public void setShareWarrantOutstandingsTy(Double shareWarrantOutstandingsTy) {
			this.shareWarrantOutstandingsTy = shareWarrantOutstandingsTy;
		}
		public Double getRevalationReserveFy() {
			return revalationReserveFy;
		}
		public void setRevalationReserveFy(Double revalationReserveFy) {
			this.revalationReserveFy = revalationReserveFy;
		}
		public Double getRevalationReserveSy() {
			return revalationReserveSy;
		}
		public void setRevalationReserveSy(Double revalationReserveSy) {
			this.revalationReserveSy = revalationReserveSy;
		}
		public Double getRevalationReserveTy() {
			return revalationReserveTy;
		}
		public void setRevalationReserveTy(Double revalationReserveTy) {
			this.revalationReserveTy = revalationReserveTy;
		}
		public Double getOtherReserveAndSurplusFy() {
			return otherReserveAndSurplusFy;
		}
		public void setOtherReserveAndSurplusFy(Double otherReserveAndSurplusFy) {
			this.otherReserveAndSurplusFy = otherReserveAndSurplusFy;
		}
		public Double getOtherReserveAndSurplusSy() {
			return otherReserveAndSurplusSy;
		}
		public void setOtherReserveAndSurplusSy(Double otherReserveAndSurplusSy) {
			this.otherReserveAndSurplusSy = otherReserveAndSurplusSy;
		}
		public Double getOtherReserveAndSurplusTy() {
			return otherReserveAndSurplusTy;
		}
		public void setOtherReserveAndSurplusTy(Double otherReserveAndSurplusTy) {
			this.otherReserveAndSurplusTy = otherReserveAndSurplusTy;
		}
		public Double getShareHolderFundsFy() {
			return shareHolderFundsFy;
		}
		public void setShareHolderFundsFy(Double shareHolderFundsFy) {
			this.shareHolderFundsFy = shareHolderFundsFy;
		}
		public Double getShareHolderFundsSy() {
			return shareHolderFundsSy;
		}
		public void setShareHolderFundsSy(Double shareHolderFundsSy) {
			this.shareHolderFundsSy = shareHolderFundsSy;
		}
		public Double getShareHolderFundsTy() {
			return shareHolderFundsTy;
		}
		public void setShareHolderFundsTy(Double shareHolderFundsTy) {
			this.shareHolderFundsTy = shareHolderFundsTy;
		}
		public Double getMinorityInterestFy() {
			return minorityInterestFy;
		}
		public void setMinorityInterestFy(Double minorityInterestFy) {
			this.minorityInterestFy = minorityInterestFy;
		}
		public Double getMinorityInterestSy() {
			return minorityInterestSy;
		}
		public void setMinorityInterestSy(Double minorityInterestSy) {
			this.minorityInterestSy = minorityInterestSy;
		}
		public Double getMinorityInterestTy() {
			return minorityInterestTy;
		}
		public void setMinorityInterestTy(Double minorityInterestTy) {
			this.minorityInterestTy = minorityInterestTy;
		}
		public Double getSecuredLoansFy() {
			return securedLoansFy;
		}
		public void setSecuredLoansFy(Double securedLoansFy) {
			this.securedLoansFy = securedLoansFy;
		}
		public Double getSecuredLoansSy() {
			return securedLoansSy;
		}
		public void setSecuredLoansSy(Double securedLoansSy) {
			this.securedLoansSy = securedLoansSy;
		}
		public Double getSecuredLoansTy() {
			return securedLoansTy;
		}
		public void setSecuredLoansTy(Double securedLoansTy) {
			this.securedLoansTy = securedLoansTy;
		}
		public Double getUnsecuredLoansPromotersFy() {
			return unsecuredLoansPromotersFy;
		}
		public void setUnsecuredLoansPromotersFy(Double unsecuredLoansPromotersFy) {
			this.unsecuredLoansPromotersFy = unsecuredLoansPromotersFy;
		}
		public Double getUnsecuredLoansPromotersSy() {
			return unsecuredLoansPromotersSy;
		}
		public void setUnsecuredLoansPromotersSy(Double unsecuredLoansPromotersSy) {
			this.unsecuredLoansPromotersSy = unsecuredLoansPromotersSy;
		}
		public Double getUnsecuredLoansPromotersTy() {
			return unsecuredLoansPromotersTy;
		}
		public void setUnsecuredLoansPromotersTy(Double unsecuredLoansPromotersTy) {
			this.unsecuredLoansPromotersTy = unsecuredLoansPromotersTy;
		}
		public Double getUnsecuredLoansOthersFy() {
			return unsecuredLoansOthersFy;
		}
		public void setUnsecuredLoansOthersFy(Double unsecuredLoansOthersFy) {
			this.unsecuredLoansOthersFy = unsecuredLoansOthersFy;
		}
		public Double getUnsecuredLoansOthersSy() {
			return unsecuredLoansOthersSy;
		}
		public void setUnsecuredLoansOthersSy(Double unsecuredLoansOthersSy) {
			this.unsecuredLoansOthersSy = unsecuredLoansOthersSy;
		}
		public Double getUnsecuredLoansOthersTy() {
			return unsecuredLoansOthersTy;
		}
		public void setUnsecuredLoansOthersTy(Double unsecuredLoansOthersTy) {
			this.unsecuredLoansOthersTy = unsecuredLoansOthersTy;
		}
		public Double getDeferredTaxLiablitiesFy() {
			return deferredTaxLiablitiesFy;
		}
		public void setDeferredTaxLiablitiesFy(Double deferredTaxLiablitiesFy) {
			this.deferredTaxLiablitiesFy = deferredTaxLiablitiesFy;
		}
		public Double getDeferredTaxLiablitiesSy() {
			return deferredTaxLiablitiesSy;
		}
		public void setDeferredTaxLiablitiesSy(Double deferredTaxLiablitiesSy) {
			this.deferredTaxLiablitiesSy = deferredTaxLiablitiesSy;
		}
		public Double getDeferredTaxLiablitiesTy() {
			return deferredTaxLiablitiesTy;
		}
		public void setDeferredTaxLiablitiesTy(Double deferredTaxLiablitiesTy) {
			this.deferredTaxLiablitiesTy = deferredTaxLiablitiesTy;
		}
		public Double getOtherLongTermLiablitiesFy() {
			return otherLongTermLiablitiesFy;
		}
		public void setOtherLongTermLiablitiesFy(Double otherLongTermLiablitiesFy) {
			this.otherLongTermLiablitiesFy = otherLongTermLiablitiesFy;
		}
		public Double getOtherLongTermLiablitiesSy() {
			return otherLongTermLiablitiesSy;
		}
		public void setOtherLongTermLiablitiesSy(Double otherLongTermLiablitiesSy) {
			this.otherLongTermLiablitiesSy = otherLongTermLiablitiesSy;
		}
		public Double getOtherLongTermLiablitiesTy() {
			return otherLongTermLiablitiesTy;
		}
		public void setOtherLongTermLiablitiesTy(Double otherLongTermLiablitiesTy) {
			this.otherLongTermLiablitiesTy = otherLongTermLiablitiesTy;
		}
		public Double getOtherBorrowingFy() {
			return otherBorrowingFy;
		}
		public void setOtherBorrowingFy(Double otherBorrowingFy) {
			this.otherBorrowingFy = otherBorrowingFy;
		}
		public Double getOtherBorrowingSy() {
			return otherBorrowingSy;
		}
		public void setOtherBorrowingSy(Double otherBorrowingSy) {
			this.otherBorrowingSy = otherBorrowingSy;
		}
		public Double getOtherBorrowingTy() {
			return otherBorrowingTy;
		}
		public void setOtherBorrowingTy(Double otherBorrowingTy) {
			this.otherBorrowingTy = otherBorrowingTy;
		}
		public Double getLongTermProvisionFy() {
			return longTermProvisionFy;
		}
		public void setLongTermProvisionFy(Double longTermProvisionFy) {
			this.longTermProvisionFy = longTermProvisionFy;
		}
		public Double getLongTermProvisionSy() {
			return longTermProvisionSy;
		}
		public void setLongTermProvisionSy(Double longTermProvisionSy) {
			this.longTermProvisionSy = longTermProvisionSy;
		}
		public Double getLongTermProvisionTy() {
			return longTermProvisionTy;
		}
		public void setLongTermProvisionTy(Double longTermProvisionTy) {
			this.longTermProvisionTy = longTermProvisionTy;
		}
		public Double getTotalNoncurruntLiablitiesFy() {
			return totalNoncurruntLiablitiesFy;
		}
		public void setTotalNoncurruntLiablitiesFy(Double totalNoncurruntLiablitiesFy) {
			this.totalNoncurruntLiablitiesFy = totalNoncurruntLiablitiesFy;
		}
		public Double getTotalNoncurruntLiablitiesSy() {
			return totalNoncurruntLiablitiesSy;
		}
		public void setTotalNoncurruntLiablitiesSy(Double totalNoncurruntLiablitiesSy) {
			this.totalNoncurruntLiablitiesSy = totalNoncurruntLiablitiesSy;
		}
		public Double getTotalNoncurruntLiablitiesTy() {
			return totalNoncurruntLiablitiesTy;
		}
		public void setTotalNoncurruntLiablitiesTy(Double totalNoncurruntLiablitiesTy) {
			this.totalNoncurruntLiablitiesTy = totalNoncurruntLiablitiesTy;
		}
		public Double getTradePayablesFy() {
			return tradePayablesFy;
		}
		public void setTradePayablesFy(Double tradePayablesFy) {
			this.tradePayablesFy = tradePayablesFy;
		}
		public Double getTradePayablesSy() {
			return tradePayablesSy;
		}
		public void setTradePayablesSy(Double tradePayablesSy) {
			this.tradePayablesSy = tradePayablesSy;
		}
		public Double getTradePayablesTy() {
			return tradePayablesTy;
		}
		public void setTradePayablesTy(Double tradePayablesTy) {
			this.tradePayablesTy = tradePayablesTy;
		}
		public Double getOtherCurruntLiablitiesFy() {
			return otherCurruntLiablitiesFy;
		}
		public void setOtherCurruntLiablitiesFy(Double otherCurruntLiablitiesFy) {
			this.otherCurruntLiablitiesFy = otherCurruntLiablitiesFy;
		}
		public Double getOtherCurruntLiablitiesSy() {
			return otherCurruntLiablitiesSy;
		}
		public void setOtherCurruntLiablitiesSy(Double otherCurruntLiablitiesSy) {
			this.otherCurruntLiablitiesSy = otherCurruntLiablitiesSy;
		}
		public Double getOtherCurruntLiablitiesTy() {
			return otherCurruntLiablitiesTy;
		}
		public void setOtherCurruntLiablitiesTy(Double otherCurruntLiablitiesTy) {
			this.otherCurruntLiablitiesTy = otherCurruntLiablitiesTy;
		}
		public Double getShortTermProvisionFy() {
			return shortTermProvisionFy;
		}
		public void setShortTermProvisionFy(Double shortTermProvisionFy) {
			this.shortTermProvisionFy = shortTermProvisionFy;
		}
		public Double getShortTermProvisionSy() {
			return shortTermProvisionSy;
		}
		public void setShortTermProvisionSy(Double shortTermProvisionSy) {
			this.shortTermProvisionSy = shortTermProvisionSy;
		}
		public Double getShortTermProvisionTy() {
			return shortTermProvisionTy;
		}
		public void setShortTermProvisionTy(Double shortTermProvisionTy) {
			this.shortTermProvisionTy = shortTermProvisionTy;
		}
		public Double getTotalCurruntLiablitiesFy() {
			return totalCurruntLiablitiesFy;
		}
		public void setTotalCurruntLiablitiesFy(Double totalCurruntLiablitiesFy) {
			this.totalCurruntLiablitiesFy = totalCurruntLiablitiesFy;
		}
		public Double getTotalCurruntLiablitiesSy() {
			return totalCurruntLiablitiesSy;
		}
		public void setTotalCurruntLiablitiesSy(Double totalCurruntLiablitiesSy) {
			this.totalCurruntLiablitiesSy = totalCurruntLiablitiesSy;
		}
		public Double getTotalCurruntLiablitiesTy() {
			return totalCurruntLiablitiesTy;
		}
		public void setTotalCurruntLiablitiesTy(Double totalCurruntLiablitiesTy) {
			this.totalCurruntLiablitiesTy = totalCurruntLiablitiesTy;
		}
		public Double getTotalLiablitiesFy() {
			return totalLiablitiesFy;
		}
		public void setTotalLiablitiesFy(Double totalLiablitiesFy) {
			this.totalLiablitiesFy = totalLiablitiesFy;
		}
		public Double getTotalLiablitiesSy() {
			return totalLiablitiesSy;
		}
		public void setTotalLiablitiesSy(Double totalLiablitiesSy) {
			this.totalLiablitiesSy = totalLiablitiesSy;
		}
		public Double getTotalLiablitiesTy() {
			return totalLiablitiesTy;
		}
		public void setTotalLiablitiesTy(Double totalLiablitiesTy) {
			this.totalLiablitiesTy = totalLiablitiesTy;
		}
		public Double getGrossBlockFy() {
			return grossBlockFy;
		}
		public void setGrossBlockFy(Double grossBlockFy) {
			this.grossBlockFy = grossBlockFy;
		}
		public Double getGrossBlockSy() {
			return grossBlockSy;
		}
		public void setGrossBlockSy(Double grossBlockSy) {
			this.grossBlockSy = grossBlockSy;
		}
		public Double getGrossBlockTy() {
			return grossBlockTy;
		}
		public void setGrossBlockTy(Double grossBlockTy) {
			this.grossBlockTy = grossBlockTy;
		}
		public Double getLessAccumulatedDepreFy() {
			return lessAccumulatedDepreFy;
		}
		public void setLessAccumulatedDepreFy(Double lessAccumulatedDepreFy) {
			this.lessAccumulatedDepreFy = lessAccumulatedDepreFy;
		}
		public Double getLessAccumulatedDepreSy() {
			return lessAccumulatedDepreSy;
		}
		public void setLessAccumulatedDepreSy(Double lessAccumulatedDepreSy) {
			this.lessAccumulatedDepreSy = lessAccumulatedDepreSy;
		}
		public Double getLessAccumulatedDepreTy() {
			return lessAccumulatedDepreTy;
		}
		public void setLessAccumulatedDepreTy(Double lessAccumulatedDepreTy) {
			this.lessAccumulatedDepreTy = lessAccumulatedDepreTy;
		}
		public Double getImpairmentofAssetFy() {
			return impairmentofAssetFy;
		}
		public void setImpairmentofAssetFy(Double impairmentofAssetFy) {
			this.impairmentofAssetFy = impairmentofAssetFy;
		}
		public Double getImpairmentofAssetSy() {
			return impairmentofAssetSy;
		}
		public void setImpairmentofAssetSy(Double impairmentofAssetSy) {
			this.impairmentofAssetSy = impairmentofAssetSy;
		}
		public Double getImpairmentofAssetTy() {
			return impairmentofAssetTy;
		}
		public void setImpairmentofAssetTy(Double impairmentofAssetTy) {
			this.impairmentofAssetTy = impairmentofAssetTy;
		}
		public Double getNetBlockFy() {
			return netBlockFy;
		}
		public void setNetBlockFy(Double netBlockFy) {
			this.netBlockFy = netBlockFy;
		}
		public Double getNetBlockSy() {
			return netBlockSy;
		}
		public void setNetBlockSy(Double netBlockSy) {
			this.netBlockSy = netBlockSy;
		}
		public Double getNetBlockTy() {
			return netBlockTy;
		}
		public void setNetBlockTy(Double netBlockTy) {
			this.netBlockTy = netBlockTy;
		}
		public Double getCapitalWorkInProgressFy() {
			return capitalWorkInProgressFy;
		}
		public void setCapitalWorkInProgressFy(Double capitalWorkInProgressFy) {
			this.capitalWorkInProgressFy = capitalWorkInProgressFy;
		}
		public Double getCapitalWorkInProgressSy() {
			return capitalWorkInProgressSy;
		}
		public void setCapitalWorkInProgressSy(Double capitalWorkInProgressSy) {
			this.capitalWorkInProgressSy = capitalWorkInProgressSy;
		}
		public Double getCapitalWorkInProgressTy() {
			return capitalWorkInProgressTy;
		}
		public void setCapitalWorkInProgressTy(Double capitalWorkInProgressTy) {
			this.capitalWorkInProgressTy = capitalWorkInProgressTy;
		}
		public Double getIntengibleAssetsFy() {
			return intengibleAssetsFy;
		}
		public void setIntengibleAssetsFy(Double intengibleAssetsFy) {
			this.intengibleAssetsFy = intengibleAssetsFy;
		}
		public Double getIntengibleAssetsSy() {
			return intengibleAssetsSy;
		}
		public void setIntengibleAssetsSy(Double intengibleAssetsSy) {
			this.intengibleAssetsSy = intengibleAssetsSy;
		}
		public Double getIntengibleAssetsTy() {
			return intengibleAssetsTy;
		}
		public void setIntengibleAssetsTy(Double intengibleAssetsTy) {
			this.intengibleAssetsTy = intengibleAssetsTy;
		}
		public Double getPreOperativeExpeFy() {
			return preOperativeExpeFy;
		}
		public void setPreOperativeExpeFy(Double preOperativeExpeFy) {
			this.preOperativeExpeFy = preOperativeExpeFy;
		}
		public Double getPreOperativeExpeSy() {
			return preOperativeExpeSy;
		}
		public void setPreOperativeExpeSy(Double preOperativeExpeSy) {
			this.preOperativeExpeSy = preOperativeExpeSy;
		}
		public Double getPreOperativeExpeTy() {
			return preOperativeExpeTy;
		}
		public void setPreOperativeExpeTy(Double preOperativeExpeTy) {
			this.preOperativeExpeTy = preOperativeExpeTy;
		}
		public Double getAssetInTransitFy() {
			return assetInTransitFy;
		}
		public void setAssetInTransitFy(Double assetInTransitFy) {
			this.assetInTransitFy = assetInTransitFy;
		}
		public Double getAssetInTransitSy() {
			return assetInTransitSy;
		}
		public void setAssetInTransitSy(Double assetInTransitSy) {
			this.assetInTransitSy = assetInTransitSy;
		}
		public Double getAssetInTransitTy() {
			return assetInTransitTy;
		}
		public void setAssetInTransitTy(Double assetInTransitTy) {
			this.assetInTransitTy = assetInTransitTy;
		}
		public Double getInvestmentInSubsidiariesFy() {
			return investmentInSubsidiariesFy;
		}
		public void setInvestmentInSubsidiariesFy(Double investmentInSubsidiariesFy) {
			this.investmentInSubsidiariesFy = investmentInSubsidiariesFy;
		}
		public Double getInvestmentInSubsidiariesSy() {
			return investmentInSubsidiariesSy;
		}
		public void setInvestmentInSubsidiariesSy(Double investmentInSubsidiariesSy) {
			this.investmentInSubsidiariesSy = investmentInSubsidiariesSy;
		}
		public Double getInvestmentInSubsidiariesTy() {
			return investmentInSubsidiariesTy;
		}
		public void setInvestmentInSubsidiariesTy(Double investmentInSubsidiariesTy) {
			this.investmentInSubsidiariesTy = investmentInSubsidiariesTy;
		}
		public Double getOtherInvestmentFy() {
			return otherInvestmentFy;
		}
		public void setOtherInvestmentFy(Double otherInvestmentFy) {
			this.otherInvestmentFy = otherInvestmentFy;
		}
		public Double getOtherInvestmentSy() {
			return otherInvestmentSy;
		}
		public void setOtherInvestmentSy(Double otherInvestmentSy) {
			this.otherInvestmentSy = otherInvestmentSy;
		}
		public Double getOtherInvestmentTy() {
			return otherInvestmentTy;
		}
		public void setOtherInvestmentTy(Double otherInvestmentTy) {
			this.otherInvestmentTy = otherInvestmentTy;
		}
		public Double getLongTermLoansAndAdvaFy() {
			return longTermLoansAndAdvaFy;
		}
		public void setLongTermLoansAndAdvaFy(Double longTermLoansAndAdvaFy) {
			this.longTermLoansAndAdvaFy = longTermLoansAndAdvaFy;
		}
		public Double getLongTermLoansAndAdvaSy() {
			return longTermLoansAndAdvaSy;
		}
		public void setLongTermLoansAndAdvaSy(Double longTermLoansAndAdvaSy) {
			this.longTermLoansAndAdvaSy = longTermLoansAndAdvaSy;
		}
		public Double getLongTermLoansAndAdvaTy() {
			return longTermLoansAndAdvaTy;
		}
		public void setLongTermLoansAndAdvaTy(Double longTermLoansAndAdvaTy) {
			this.longTermLoansAndAdvaTy = longTermLoansAndAdvaTy;
		}
		public Double getOtheNonCurruntAssetFy() {
			return otheNonCurruntAssetFy;
		}
		public void setOtheNonCurruntAssetFy(Double otheNonCurruntAssetFy) {
			this.otheNonCurruntAssetFy = otheNonCurruntAssetFy;
		}
		public Double getOtheNonCurruntAssetSy() {
			return otheNonCurruntAssetSy;
		}
		public void setOtheNonCurruntAssetSy(Double otheNonCurruntAssetSy) {
			this.otheNonCurruntAssetSy = otheNonCurruntAssetSy;
		}
		public Double getOtheNonCurruntAssetTy() {
			return otheNonCurruntAssetTy;
		}
		public void setOtheNonCurruntAssetTy(Double otheNonCurruntAssetTy) {
			this.otheNonCurruntAssetTy = otheNonCurruntAssetTy;
		}
		public Double getTotalNonCurruntAssetFy() {
			return totalNonCurruntAssetFy;
		}
		public void setTotalNonCurruntAssetFy(Double totalNonCurruntAssetFy) {
			this.totalNonCurruntAssetFy = totalNonCurruntAssetFy;
		}
		public Double getTotalNonCurruntAssetSy() {
			return totalNonCurruntAssetSy;
		}
		public void setTotalNonCurruntAssetSy(Double totalNonCurruntAssetSy) {
			this.totalNonCurruntAssetSy = totalNonCurruntAssetSy;
		}
		public Double getTotalNonCurruntAssetTy() {
			return totalNonCurruntAssetTy;
		}
		public void setTotalNonCurruntAssetTy(Double totalNonCurruntAssetTy) {
			this.totalNonCurruntAssetTy = totalNonCurruntAssetTy;
		}
		public Double getContingentLiablitiesTy() {
			return contingentLiablitiesTy;
		}
		public void setContingentLiablitiesTy(Double contingentLiablitiesTy) {
			this.contingentLiablitiesTy = contingentLiablitiesTy;
		}
		public Double getInventoriesFy() {
			return inventoriesFy;
		}
		public void setInventoriesFy(Double inventoriesFy) {
			this.inventoriesFy = inventoriesFy;
		}
		public Double getInventoriesSy() {
			return inventoriesSy;
		}
		public void setInventoriesSy(Double inventoriesSy) {
			this.inventoriesSy = inventoriesSy;
		}
		public Double getInventoriesTy() {
			return inventoriesTy;
		}
		public void setInventoriesTy(Double inventoriesTy) {
			this.inventoriesTy = inventoriesTy;
		}
		public Double getSundryDebtorsFy() {
			return sundryDebtorsFy;
		}
		public void setSundryDebtorsFy(Double sundryDebtorsFy) {
			this.sundryDebtorsFy = sundryDebtorsFy;
		}
		public Double getSundryDebtorsSy() {
			return sundryDebtorsSy;
		}
		public void setSundryDebtorsSy(Double sundryDebtorsSy) {
			this.sundryDebtorsSy = sundryDebtorsSy;
		}
		public Double getSundryDebtorsTy() {
			return sundryDebtorsTy;
		}
		public void setSundryDebtorsTy(Double sundryDebtorsTy) {
			this.sundryDebtorsTy = sundryDebtorsTy;
		}
		public Double getCashAndBankFy() {
			return cashAndBankFy;
		}
		public void setCashAndBankFy(Double cashAndBankFy) {
			this.cashAndBankFy = cashAndBankFy;
		}
		public Double getCashAndBankSy() {
			return cashAndBankSy;
		}
		public void setCashAndBankSy(Double cashAndBankSy) {
			this.cashAndBankSy = cashAndBankSy;
		}
		public Double getCashAndBankTy() {
			return cashAndBankTy;
		}
		public void setCashAndBankTy(Double cashAndBankTy) {
			this.cashAndBankTy = cashAndBankTy;
		}
		public Double getOtherCurruntAssetFy() {
			return otherCurruntAssetFy;
		}
		public void setOtherCurruntAssetFy(Double otherCurruntAssetFy) {
			this.otherCurruntAssetFy = otherCurruntAssetFy;
		}
		public Double getOtherCurruntAssetSy() {
			return otherCurruntAssetSy;
		}
		public void setOtherCurruntAssetSy(Double otherCurruntAssetSy) {
			this.otherCurruntAssetSy = otherCurruntAssetSy;
		}
		public Double getOtherCurruntAssetTy() {
			return otherCurruntAssetTy;
		}
		public void setOtherCurruntAssetTy(Double otherCurruntAssetTy) {
			this.otherCurruntAssetTy = otherCurruntAssetTy;
		}
		public Double getShortTermLoansAdvancesFy() {
			return shortTermLoansAdvancesFy;
		}
		public void setShortTermLoansAdvancesFy(Double shortTermLoansAdvancesFy) {
			this.shortTermLoansAdvancesFy = shortTermLoansAdvancesFy;
		}
		public Double getShortTermLoansAdvancesSy() {
			return shortTermLoansAdvancesSy;
		}
		public void setShortTermLoansAdvancesSy(Double shortTermLoansAdvancesSy) {
			this.shortTermLoansAdvancesSy = shortTermLoansAdvancesSy;
		}
		public Double getShortTermLoansAdvancesTy() {
			return shortTermLoansAdvancesTy;
		}
		public void setShortTermLoansAdvancesTy(Double shortTermLoansAdvancesTy) {
			this.shortTermLoansAdvancesTy = shortTermLoansAdvancesTy;
		}
		public Double getTotalCurruntAssetFy() {
			return totalCurruntAssetFy;
		}
		public void setTotalCurruntAssetFy(Double totalCurruntAssetFy) {
			this.totalCurruntAssetFy = totalCurruntAssetFy;
		}
		public Double getTotalCurruntAssetSy() {
			return totalCurruntAssetSy;
		}
		public void setTotalCurruntAssetSy(Double totalCurruntAssetSy) {
			this.totalCurruntAssetSy = totalCurruntAssetSy;
		}
		public Double getTotalCurruntAssetTy() {
			return totalCurruntAssetTy;
		}
		public void setTotalCurruntAssetTy(Double totalCurruntAssetTy) {
			this.totalCurruntAssetTy = totalCurruntAssetTy;
		}
		public Double getTotalAssetFy() {
			return totalAssetFy;
		}
		public void setTotalAssetFy(Double totalAssetFy) {
			this.totalAssetFy = totalAssetFy;
		}
		public Double getTotalAssetSy() {
			return totalAssetSy;
		}
		public void setTotalAssetSy(Double totalAssetSy) {
			this.totalAssetSy = totalAssetSy;
		}
		public Double getTotalAssetTy() {
			return totalAssetTy;
		}
		public void setTotalAssetTy(Double totalAssetTy) {
			this.totalAssetTy = totalAssetTy;
		}
		public Double getContingentLiablitiesFy() {
			return contingentLiablitiesFy;
		}
		public void setContingentLiablitiesFy(Double contingentLiablitiesFy) {
			this.contingentLiablitiesFy = contingentLiablitiesFy;
		}
		public Double getContingentLiablitiesSy() {
			return contingentLiablitiesSy;
		}
		public void setContingentLiablitiesSy(Double contingentLiablitiesSy) {
			this.contingentLiablitiesSy = contingentLiablitiesSy;
		}
		public Double getContingentLiablitiestTy() {
			return contingentLiablitiesTy;
		}
		public void setContingentLiablitiestTy(Double contingentLiablitiesTy) {
			this.contingentLiablitiesTy = contingentLiablitiesTy;
		}
		public Double getBookValueFy() {
			return bookValueFy;
		}
		public void setBookValueFy(Double bookValueFy) {
			this.bookValueFy = bookValueFy;
		}
		public Double getBookValueSy() {
			return bookValueSy;
		}
		public void setBookValueSy(Double bookValueSy) {
			this.bookValueSy = bookValueSy;
		}
		public Double getBookValueTy() {
			return bookValueTy;
		}
		public void setBookValueTy(Double bookValueTy) {
			this.bookValueTy = bookValueTy;
		}
		public Double getEbitdaFy() {
			return ebitdaFy;
		}
		public void setEbitdaFy(Double ebitdaFy) {
			this.ebitdaFy = ebitdaFy;
		}
		public Double getEbitdaSy() {
			return ebitdaSy;
		}
		public void setEbitdaSy(Double ebitdaSy) {
			this.ebitdaSy = ebitdaSy;
		}
		public Double getInterestPaidFy() {
			return interestPaidFy;
		}
		public void setInterestPaidFy(Double interestPaidFy) {
			this.interestPaidFy = interestPaidFy;
		}
		public Double getInterestPaidSy() {
			return interestPaidSy;
		}
		public void setInterestPaidSy(Double interestPaidSy) {
			this.interestPaidSy = interestPaidSy;
		}
		public Double getIncreaseWorkingCapitalFy() {
			return increaseWorkingCapitalFy;
		}
		public void setIncreaseWorkingCapitalFy(Double increaseWorkingCapitalFy) {
			this.increaseWorkingCapitalFy = increaseWorkingCapitalFy;
		}
		public Double getIncreaseWorkingCapitalSy() {
			return increaseWorkingCapitalSy;
		}
		public void setIncreaseWorkingCapitalSy(Double increaseWorkingCapitalSy) {
			this.increaseWorkingCapitalSy = increaseWorkingCapitalSy;
		}
		public Double getTaxPaidFy() {
			return taxPaidFy;
		}
		public void setTaxPaidFy(Double taxPaidFy) {
			this.taxPaidFy = taxPaidFy;
		}
		public Double getTaxPaidSy() {
			return taxPaidSy;
		}
		public void setTaxPaidSy(Double taxPaidSy) {
			this.taxPaidSy = taxPaidSy;
		}
		public Double getCashFromOperatingFy() {
			return cashFromOperatingFy;
		}
		public void setCashFromOperatingFy(Double cashFromOperatingFy) {
			this.cashFromOperatingFy = cashFromOperatingFy;
		}
		public Double getCashFromOperatingSy() {
			return cashFromOperatingSy;
		}
		public void setCashFromOperatingSy(Double cashFromOperatingSy) {
			this.cashFromOperatingSy = cashFromOperatingSy;
		}
		public Double getEbitadPercentageFy() {
			return ebitadPercentageFy;
		}
		public void setEbitadPercentageFy(Double ebitadPercentageFy) {
			this.ebitadPercentageFy = ebitadPercentageFy;
		}
		public Double getEbitadPercentageSy() {
			return ebitadPercentageSy;
		}
		public void setEbitadPercentageSy(Double ebitadPercentageSy) {
			this.ebitadPercentageSy = ebitadPercentageSy;
		}
		public Double getEbitadPercentageTy() {
			return ebitadPercentageTy;
		}
		public void setEbitadPercentageTy(Double ebitadPercentageTy) {
			this.ebitadPercentageTy = ebitadPercentageTy;
		}
		public Double getPatmFy() {
			return patmFy;
		}
		public void setPatmFy(Double patmFy) {
			this.patmFy = patmFy;
		}
		public Double getPatmSy() {
			return patmSy;
		}
		public void setPatmSy(Double patmSy) {
			this.patmSy = patmSy;
		}
		public Double getPatmTy() {
			return patmTy;
		}
		public void setPatmTy(Double patmTy) {
			this.patmTy = patmTy;
		}
		public Double getRoceFy() {
			return roceFy;
		}
		public void setRoceFy(Double roceFy) {
			this.roceFy = roceFy;
		}
		public Double getRoceSy() {
			return roceSy;
		}
		public void setRoceSy(Double roceSy) {
			this.roceSy = roceSy;
		}
		public Double getAssetTurnoverFy() {
			return assetTurnoverFy;
		}
		public void setAssetTurnoverFy(Double assetTurnoverFy) {
			this.assetTurnoverFy = assetTurnoverFy;
		}
		public Double getAssetTurnoverSy() {
			return assetTurnoverSy;
		}
		public void setAssetTurnoverSy(Double assetTurnoverSy) {
			this.assetTurnoverSy = assetTurnoverSy;
		}
		public Double getAssetTurnoverTy() {
			return assetTurnoverTy;
		}
		public void setAssetTurnoverTy(Double assetTurnoverTy) {
			this.assetTurnoverTy = assetTurnoverTy;
		}
		public Double getInventoryTurnOverFy() {
			return inventoryTurnOverFy;
		}
		public void setInventoryTurnOverFy(Double inventoryTurnOverFy) {
			this.inventoryTurnOverFy = inventoryTurnOverFy;
		}
		public Double getInventoryTurnOverSy() {
			return inventoryTurnOverSy;
		}
		public void setInventoryTurnOverSy(Double inventoryTurnOverSy) {
			this.inventoryTurnOverSy = inventoryTurnOverSy;
		}
		public Double getInventoryTurnOverTy() {
			return inventoryTurnOverTy;
		}
		public void setInventoryTurnOverTy(Double inventoryTurnOverTy) {
			this.inventoryTurnOverTy = inventoryTurnOverTy;
		}
		public Double getDebtorsTurnoverFy() {
			return debtorsTurnoverFy;
		}
		public void setDebtorsTurnoverFy(Double debtorsTurnoverFy) {
			this.debtorsTurnoverFy = debtorsTurnoverFy;
		}
		public Double getDebtorsTurnoverSy() {
			return debtorsTurnoverSy;
		}
		public void setDebtorsTurnoverSy(Double debtorsTurnoverSy) {
			this.debtorsTurnoverSy = debtorsTurnoverSy;
		}
		public Double getDebtorsTurnoverTy() {
			return debtorsTurnoverTy;
		}
		public void setDebtorsTurnoverTy(Double debtorsTurnoverTy) {
			this.debtorsTurnoverTy = debtorsTurnoverTy;
		}
		public Double getCreditorsTurnoverFy() {
			return creditorsTurnoverFy;
		}
		public void setCreditorsTurnoverFy(Double creditorsTurnoverFy) {
			this.creditorsTurnoverFy = creditorsTurnoverFy;
		}
		public Double getCreditorsTurnoverSy() {
			return creditorsTurnoverSy;
		}
		public void setCreditorsTurnoverSy(Double creditorsTurnoverSy) {
			this.creditorsTurnoverSy = creditorsTurnoverSy;
		}
		public Double getCreditorsTurnoverTy() {
			return creditorsTurnoverTy;
		}
		public void setCreditorsTurnoverTy(Double creditorsTurnoverTy) {
			this.creditorsTurnoverTy = creditorsTurnoverTy;
		}
		public Double getSalesWorkingCapitalFy() {
			return salesWorkingCapitalFy;
		}
		public void setSalesWorkingCapitalFy(Double salesWorkingCapitalFy) {
			this.salesWorkingCapitalFy = salesWorkingCapitalFy;
		}
		public Double getSalesWorkingCapitalSy() {
			return salesWorkingCapitalSy;
		}
		public void setSalesWorkingCapitalSy(Double salesWorkingCapitalSy) {
			this.salesWorkingCapitalSy = salesWorkingCapitalSy;
		}
		public Double getSalesWorkingCapitalTy() {
			return salesWorkingCapitalTy;
		}
		public void setSalesWorkingCapitalTy(Double salesWorkingCapitalTy) {
			this.salesWorkingCapitalTy = salesWorkingCapitalTy;
		}
		public Double getNetSalesGrowthCapitalFy() {
			return netSalesGrowthCapitalFy;
		}
		public void setNetSalesGrowthCapitalFy(Double netSalesGrowthCapitalFy) {
			this.netSalesGrowthCapitalFy = netSalesGrowthCapitalFy;
		}
		public Double getNetSalesGrowthCapitalSy() {
			return netSalesGrowthCapitalSy;
		}
		public void setNetSalesGrowthCapitalSy(Double netSalesGrowthCapitalSy) {
			this.netSalesGrowthCapitalSy = netSalesGrowthCapitalSy;
		}
		public Double getPatGrowthCapitalFy() {
			return patGrowthCapitalFy;
		}
		public void setPatGrowthCapitalFy(Double patGrowthCapitalFy) {
			this.patGrowthCapitalFy = patGrowthCapitalFy;
		}
		public Double getPatGrowthCapitalSy() {
			return patGrowthCapitalSy;
		}
		public void setPatGrowthCapitalSy(Double patGrowthCapitalSy) {
			this.patGrowthCapitalSy = patGrowthCapitalSy;
		}
		public Double getAdjustedTotalDebtEquityFy() {
			return adjustedTotalDebtEquityFy;
		}
		public void setAdjustedTotalDebtEquityFy(Double adjustedTotalDebtEquityFy) {
			this.adjustedTotalDebtEquityFy = adjustedTotalDebtEquityFy;
		}
		public Double getAdjustedTotalDebtEquitySy() {
			return adjustedTotalDebtEquitySy;
		}
		public void setAdjustedTotalDebtEquitySy(Double adjustedTotalDebtEquitySy) {
			this.adjustedTotalDebtEquitySy = adjustedTotalDebtEquitySy;
		}
		public Double getAdjustedTotalDebtEquityTy() {
			return adjustedTotalDebtEquityTy;
		}
		public void setAdjustedTotalDebtEquityTy(Double adjustedTotalDebtEquityTy) {
			this.adjustedTotalDebtEquityTy = adjustedTotalDebtEquityTy;
		}
		public Double getGrowthDebtEquityFy() {
			return growthDebtEquityFy;
		}
		public void setGrowthDebtEquityFy(Double growthDebtEquityFy) {
			this.growthDebtEquityFy = growthDebtEquityFy;
		}
		public Double getGrowthDebtEquitySy() {
			return growthDebtEquitySy;
		}
		public void setGrowthDebtEquitySy(Double growthDebtEquitySy) {
			this.growthDebtEquitySy = growthDebtEquitySy;
		}
		public Double getCurruntRatioXFy() {
			return curruntRatioXFy;
		}
		public void setCurruntRatioXFy(Double curruntRatioXFy) {
			this.curruntRatioXFy = curruntRatioXFy;
		}
		public Double getCurruntRatioXSy() {
			return curruntRatioXSy;
		}
		public void setCurruntRatioXSy(Double curruntRatioXSy) {
			this.curruntRatioXSy = curruntRatioXSy;
		}
		public Double getCurruntRatioXTy() {
			return curruntRatioXTy;
		}
		public void setCurruntRatioXTy(Double curruntRatioXTy) {
			this.curruntRatioXTy = curruntRatioXTy;
		}
		public Double getQuickRatioXFy() {
			return quickRatioXFy;
		}
		public void setQuickRatioXFy(Double quickRatioXFy) {
			this.quickRatioXFy = quickRatioXFy;
		}
		public Double getQuickRatioSSy() {
			return quickRatioSSy;
		}
		public void setQuickRatioSSy(Double quickRatioSSy) {
			this.quickRatioSSy = quickRatioSSy;
		}
		public Double getQuickRatioTTy() {
			return quickRatioTTy;
		}
		public void setQuickRatioTTy(Double quickRatioTTy) {
			this.quickRatioTTy = quickRatioTTy;
		}
		public Double getInterestCoverFy() {
			return interestCoverFy;
		}
		public void setInterestCoverFy(Double interestCoverFy) {
			this.interestCoverFy = interestCoverFy;
		}
		public Double getInterestCoverSy() {
			return interestCoverSy;
		}
		public void setInterestCoverSy(Double interestCoverSy) {
			this.interestCoverSy = interestCoverSy;
		}
		public Double getInterestCoverTy() {
			return interestCoverTy;
		}
		public void setInterestCoverTy(Double interestCoverTy) {
			this.interestCoverTy = interestCoverTy;
		}
		public Double getDebtEbitadFy() {
			return debtEbitadFy;
		}
		public void setDebtEbitadFy(Double debtEbitadFy) {
			this.debtEbitadFy = debtEbitadFy;
		}
		public Double getDebtEbitadSy() {
			return debtEbitadSy;
		}
		public void setDebtEbitadSy(Double debtEbitadSy) {
			this.debtEbitadSy = debtEbitadSy;
		}
		public Double getDebtEbitadTy() {
			return debtEbitadTy;
		}
		public void setDebtEbitadTy(Double debtEbitadTy) {
			this.debtEbitadTy = debtEbitadTy;
		}
		public Double getFreeReserveEquityFy() {
			return freeReserveEquityFy;
		}
		public void setFreeReserveEquityFy(Double freeReserveEquityFy) {
			this.freeReserveEquityFy = freeReserveEquityFy;
		}
		public Double getFreeReserveEquitySy() {
			return freeReserveEquitySy;
		}
		public void setFreeReserveEquitySy(Double freeReserveEquitySy) {
			this.freeReserveEquitySy = freeReserveEquitySy;
		}
		public Double getFreeReserveEquityTy() {
			return freeReserveEquityTy;
		}
		public void setFreeReserveEquityTy(Double freeReserveEquityTy) {
			this.freeReserveEquityTy = freeReserveEquityTy;
		}
		public Double getCfoMargineFy() {
			return cfoMargineFy;
		}
		public void setCfoMargineFy(Double cfoMargineFy) {
			this.cfoMargineFy = cfoMargineFy;
		}
		public Double getCfoMargineSy() {
			return cfoMargineSy;
		}
		public void setCfoMargineSy(Double cfoMargineSy) {
			this.cfoMargineSy = cfoMargineSy;
		}
		public Double getGrowthCfoMargineFy() {
			return growthCfoMargineFy;
		}
		public void setGrowthCfoMargineFy(Double growthCfoMargineFy) {
			this.growthCfoMargineFy = growthCfoMargineFy;
		}
		public Double getGrowthCfoMargineSy() {
			return growthCfoMargineSy;
		}
		public void setGrowthCfoMargineSy(Double growthCfoMargineSy) {
			this.growthCfoMargineSy = growthCfoMargineSy;
		}
		public String getRatioAnalysisFyFullDate() {
			return ratioAnalysisFyFullDate;
		}
		public void setRatioAnalysisFyFullDate(String ratioAnalysisFyFullDate) {
			this.ratioAnalysisFyFullDate = ratioAnalysisFyFullDate;
		}
		
		
		@Override
		public String toString() {
			return "FinancialInputSheetServ [companyName=" + companyName + ", industryName=" + industryName
					+ ", shareFaceValue=" + shareFaceValue + ", noOfMonthFy=" + noOfMonthFy + ", noOfMonthSy="
					+ noOfMonthSy + ", noOfMonthTy=" + noOfMonthTy + ", grossSalesFy=" + grossSalesFy
					+ ", grossSalesSy=" + grossSalesSy + ", grossSalesTy=" + grossSalesTy + ", lessExciseDuityFy="
					+ lessExciseDuityFy + ", lessExciseDuitySy=" + lessExciseDuitySy + ", lessExciseDuityTy="
					+ lessExciseDuityTy + ", netSaleFy=" + netSaleFy + ", netSaleSy=" + netSaleSy + ", netSaleTy="
					+ netSaleTy + ", increaseDecreaseStockFy=" + increaseDecreaseStockFy + ", increaseDecreaseStockSy="
					+ increaseDecreaseStockSy + ", increaseDecreaseStockTy=" + increaseDecreaseStockTy
					+ ", rawMaterialConsumedFy=" + rawMaterialConsumedFy + ", rawMaterialConsumedSy="
					+ rawMaterialConsumedSy + ", rawMaterialConsumedTy=" + rawMaterialConsumedTy
					+ ", powerAndFuelCostFy=" + powerAndFuelCostFy + ", powerAndFuelCostSy=" + powerAndFuelCostSy
					+ ", powerAndFuelCostTy=" + powerAndFuelCostTy + ", employeeCostFy=" + employeeCostFy
					+ ", employeeCostSy=" + employeeCostSy + ", employeeCostTy=" + employeeCostTy
					+ ", generalAndAdminExpeFy=" + generalAndAdminExpeFy + ", generalAndAdminExpeSy="
					+ generalAndAdminExpeSy + ", generalAndAdminExpeTy=" + generalAndAdminExpeTy
					+ ", sellingAndDistriExpeFy=" + sellingAndDistriExpeFy + ", sellingAndDistriExpeSy="
					+ sellingAndDistriExpeSy + ", sellingAndDistriExpeTy=" + sellingAndDistriExpeTy + ", miscelExpeFy="
					+ miscelExpeFy + ", miscelExpeSy=" + miscelExpeSy + ", miscelExpeTy=" + miscelExpeTy
					+ ", lessExpeCapitaFy=" + lessExpeCapitaFy + ", lessExpeCapitaSy=" + lessExpeCapitaSy
					+ ", lessExpeCapitaTy=" + lessExpeCapitaTy + ", totalExpenditureFy=" + totalExpenditureFy
					+ ", totalExpenditureSy=" + totalExpenditureSy + ", totalExpenditureTy=" + totalExpenditureTy
					+ ", operatingProfitExclOiFy=" + operatingProfitExclOiFy + ", operatingProfitExclOiSy="
					+ operatingProfitExclOiSy + ", operatingProfitExclOiTy=" + operatingProfitExclOiTy
					+ ", otherIncomeFy=" + otherIncomeFy + ", otherIncomeSy=" + otherIncomeSy + ", otherIncomeTy="
					+ otherIncomeTy + ", operatingProfitEbitadOiFy=" + operatingProfitEbitadOiFy
					+ ", operatingProfitEbitadOiSy=" + operatingProfitEbitadOiSy + ", operatingProfitEbitadOiTy="
					+ operatingProfitEbitadOiTy + ", interestFy=" + interestFy + ", interestSy=" + interestSy
					+ ", interestTy=" + interestTy + ", pbdtFy=" + pbdtFy + ", pbdtSy=" + pbdtSy + ", pbdtTy=" + pbdtTy
					+ ", depriciationFy=" + depriciationFy + ", depriciationSy=" + depriciationSy + ", depriciationTy="
					+ depriciationTy + ", profitBeforeTaxationFy=" + profitBeforeTaxationFy
					+ ", profitBeforeTaxationSy=" + profitBeforeTaxationSy + ", profitBeforeTaxationTy="
					+ profitBeforeTaxationTy + ", exceptionalIncomeFy=" + exceptionalIncomeFy + ", exceptionalIncomeSy="
					+ exceptionalIncomeSy + ", exceptionalIncomeTy=" + exceptionalIncomeTy + ", profitBeforeTaxFy="
					+ profitBeforeTaxFy + ", profitBeforeTaxSy=" + profitBeforeTaxSy + ", profitBeforeTaxTy="
					+ profitBeforeTaxTy + ", provisionForTaxFy=" + provisionForTaxFy + ", provisionForTaxSy="
					+ provisionForTaxSy + ", provisionForTaxTy=" + provisionForTaxTy + ", profitAfterTaxFy="
					+ profitAfterTaxFy + ", profitAfterTaxSy=" + profitAfterTaxSy + ", profitAfterTaxTy="
					+ profitAfterTaxTy + ", dividendPayOutFy=" + dividendPayOutFy + ", dividendPayOutSy="
					+ dividendPayOutSy + ", dividendPayOutTy=" + dividendPayOutTy + ", equityDividendFy="
					+ equityDividendFy + ", equityDividendSy=" + equityDividendSy + ", equityDividendTy="
					+ equityDividendTy + ", earningPerShareFy=" + earningPerShareFy + ", earningPerShareSy="
					+ earningPerShareSy + ", earningPerShareTy=" + earningPerShareTy + ", shareCapitalFy="
					+ shareCapitalFy + ", shareCapitalSy=" + shareCapitalSy + ", shareCapitalTy=" + shareCapitalTy
					+ ", shareWarrantOutstandingsFy=" + shareWarrantOutstandingsFy + ", shareWarrantOutstandingsSy="
					+ shareWarrantOutstandingsSy + ", shareWarrantOutstandingsTy=" + shareWarrantOutstandingsTy
					+ ", revalationReserveFy=" + revalationReserveFy + ", revalationReserveSy=" + revalationReserveSy
					+ ", revalationReserveTy=" + revalationReserveTy + ", otherReserveAndSurplusFy="
					+ otherReserveAndSurplusFy + ", otherReserveAndSurplusSy=" + otherReserveAndSurplusSy
					+ ", otherReserveAndSurplusTy=" + otherReserveAndSurplusTy + ", shareHolderFundsFy="
					+ shareHolderFundsFy + ", shareHolderFundsSy=" + shareHolderFundsSy + ", shareHolderFundsTy="
					+ shareHolderFundsTy + ", minorityInterestFy=" + minorityInterestFy + ", minorityInterestSy="
					+ minorityInterestSy + ", minorityInterestTy=" + minorityInterestTy + ", securedLoansFy="
					+ securedLoansFy + ", securedLoansSy=" + securedLoansSy + ", securedLoansTy=" + securedLoansTy
					+ ", unsecuredLoansPromotersFy=" + unsecuredLoansPromotersFy + ", unsecuredLoansPromotersSy="
					+ unsecuredLoansPromotersSy + ", unsecuredLoansPromotersTy=" + unsecuredLoansPromotersTy
					+ ", unsecuredLoansOthersFy=" + unsecuredLoansOthersFy + ", unsecuredLoansOthersSy="
					+ unsecuredLoansOthersSy + ", unsecuredLoansOthersTy=" + unsecuredLoansOthersTy
					+ ", deferredTaxLiablitiesFy=" + deferredTaxLiablitiesFy + ", deferredTaxLiablitiesSy="
					+ deferredTaxLiablitiesSy + ", deferredTaxLiablitiesTy=" + deferredTaxLiablitiesTy
					+ ", otherLongTermLiablitiesFy=" + otherLongTermLiablitiesFy + ", otherLongTermLiablitiesSy="
					+ otherLongTermLiablitiesSy + ", otherLongTermLiablitiesTy=" + otherLongTermLiablitiesTy
					+ ", otherBorrowingFy=" + otherBorrowingFy + ", otherBorrowingSy=" + otherBorrowingSy
					+ ", otherBorrowingTy=" + otherBorrowingTy + ", longTermProvisionFy=" + longTermProvisionFy
					+ ", longTermProvisionSy=" + longTermProvisionSy + ", longTermProvisionTy=" + longTermProvisionTy
					+ ", totalNoncurruntLiablitiesFy=" + totalNoncurruntLiablitiesFy + ", totalNoncurruntLiablitiesSy="
					+ totalNoncurruntLiablitiesSy + ", totalNoncurruntLiablitiesTy=" + totalNoncurruntLiablitiesTy
					+ ", tradePayablesFy=" + tradePayablesFy + ", tradePayablesSy=" + tradePayablesSy
					+ ", tradePayablesTy=" + tradePayablesTy + ", otherCurruntLiablitiesFy=" + otherCurruntLiablitiesFy
					+ ", otherCurruntLiablitiesSy=" + otherCurruntLiablitiesSy + ", otherCurruntLiablitiesTy="
					+ otherCurruntLiablitiesTy + ", shortTermProvisionFy=" + shortTermProvisionFy
					+ ", shortTermProvisionSy=" + shortTermProvisionSy + ", shortTermProvisionTy="
					+ shortTermProvisionTy + ", totalCurruntLiablitiesFy=" + totalCurruntLiablitiesFy
					+ ", totalCurruntLiablitiesSy=" + totalCurruntLiablitiesSy + ", totalCurruntLiablitiesTy="
					+ totalCurruntLiablitiesTy + ", totalLiablitiesFy=" + totalLiablitiesFy + ", totalLiablitiesSy="
					+ totalLiablitiesSy + ", totalLiablitiesTy=" + totalLiablitiesTy + ", grossBlockFy=" + grossBlockFy
					+ ", grossBlockSy=" + grossBlockSy + ", grossBlockTy=" + grossBlockTy + ", lessAccumulatedDepreFy="
					+ lessAccumulatedDepreFy + ", lessAccumulatedDepreSy=" + lessAccumulatedDepreSy
					+ ", lessAccumulatedDepreTy=" + lessAccumulatedDepreTy + ", impairmentofAssetFy="
					+ impairmentofAssetFy + ", impairmentofAssetSy=" + impairmentofAssetSy + ", impairmentofAssetTy="
					+ impairmentofAssetTy + ", netBlockFy=" + netBlockFy + ", netBlockSy=" + netBlockSy
					+ ", netBlockTy=" + netBlockTy + ", capitalWorkInProgressFy=" + capitalWorkInProgressFy
					+ ", capitalWorkInProgressSy=" + capitalWorkInProgressSy + ", capitalWorkInProgressTy="
					+ capitalWorkInProgressTy + ", intengibleAssetsFy=" + intengibleAssetsFy + ", intengibleAssetsSy="
					+ intengibleAssetsSy + ", intengibleAssetsTy=" + intengibleAssetsTy + ", preOperativeExpeFy="
					+ preOperativeExpeFy + ", preOperativeExpeSy=" + preOperativeExpeSy + ", preOperativeExpeTy="
					+ preOperativeExpeTy + ", assetInTransitFy=" + assetInTransitFy + ", assetInTransitSy="
					+ assetInTransitSy + ", assetInTransitTy=" + assetInTransitTy + ", investmentInSubsidiariesFy="
					+ investmentInSubsidiariesFy + ", investmentInSubsidiariesSy=" + investmentInSubsidiariesSy
					+ ", investmentInSubsidiariesTy=" + investmentInSubsidiariesTy + ", otherInvestmentFy="
					+ otherInvestmentFy + ", otherInvestmentSy=" + otherInvestmentSy + ", otherInvestmentTy="
					+ otherInvestmentTy + ", longTermLoansAndAdvaFy=" + longTermLoansAndAdvaFy
					+ ", longTermLoansAndAdvaSy=" + longTermLoansAndAdvaSy + ", longTermLoansAndAdvaTy="
					+ longTermLoansAndAdvaTy + ", otheNonCurruntAssetFy=" + otheNonCurruntAssetFy
					+ ", otheNonCurruntAssetSy=" + otheNonCurruntAssetSy + ", otheNonCurruntAssetTy="
					+ otheNonCurruntAssetTy + ", totalNonCurruntAssetFy=" + totalNonCurruntAssetFy
					+ ", totalNonCurruntAssetSy=" + totalNonCurruntAssetSy + ", totalNonCurruntAssetTy="
					+ totalNonCurruntAssetTy + ", inventoriesFy=" + inventoriesFy + ", inventoriesSy=" + inventoriesSy
					+ ", inventoriesTy=" + inventoriesTy + ", sundryDebtorsFy=" + sundryDebtorsFy + ", sundryDebtorsSy="
					+ sundryDebtorsSy + ", sundryDebtorsTy=" + sundryDebtorsTy + ", cashAndBankFy=" + cashAndBankFy
					+ ", cashAndBankSy=" + cashAndBankSy + ", cashAndBankTy=" + cashAndBankTy + ", otherCurruntAssetFy="
					+ otherCurruntAssetFy + ", otherCurruntAssetSy=" + otherCurruntAssetSy + ", otherCurruntAssetTy="
					+ otherCurruntAssetTy + ", shortTermLoansAdvancesFy=" + shortTermLoansAdvancesFy
					+ ", shortTermLoansAdvancesSy=" + shortTermLoansAdvancesSy + ", shortTermLoansAdvancesTy="
					+ shortTermLoansAdvancesTy + ", totalCurruntAssetFy=" + totalCurruntAssetFy
					+ ", totalCurruntAssetSy=" + totalCurruntAssetSy + ", totalCurruntAssetTy=" + totalCurruntAssetTy
					+ ", totalAssetFy=" + totalAssetFy + ", totalAssetSy=" + totalAssetSy + ", totalAssetTy="
					+ totalAssetTy + ", contingentLiablitiesFy=" + contingentLiablitiesFy + ", contingentLiablitiesSy="
					+ contingentLiablitiesSy + ", contingentLiablitiesTy=" + contingentLiablitiesTy + ", bookValueFy="
					+ bookValueFy + ", bookValueSy=" + bookValueSy + ", bookValueTy=" + bookValueTy + ", ebitdaFy="
					+ ebitdaFy + ", ebitdaSy=" + ebitdaSy + ", interestPaidFy=" + interestPaidFy + ", interestPaidSy="
					+ interestPaidSy + ", increaseWorkingCapitalFy=" + increaseWorkingCapitalFy
					+ ", increaseWorkingCapitalSy=" + increaseWorkingCapitalSy + ", taxPaidFy=" + taxPaidFy
					+ ", taxPaidSy=" + taxPaidSy + ", cashFromOperatingFy=" + cashFromOperatingFy
					+ ", cashFromOperatingSy=" + cashFromOperatingSy + ", ratioAnalysisFyFullDate="
					+ ratioAnalysisFyFullDate + ", ebitadPercentageFy=" + ebitadPercentageFy + ", ebitadPercentageSy="
					+ ebitadPercentageSy + ", ebitadPercentageTy=" + ebitadPercentageTy + ", patmFy=" + patmFy
					+ ", patmSy=" + patmSy + ", patmTy=" + patmTy + ", roceFy=" + roceFy + ", roceSy=" + roceSy
					+ ", assetTurnoverFy=" + assetTurnoverFy + ", assetTurnoverSy=" + assetTurnoverSy
					+ ", assetTurnoverTy=" + assetTurnoverTy + ", inventoryTurnOverFy=" + inventoryTurnOverFy
					+ ", inventoryTurnOverSy=" + inventoryTurnOverSy + ", inventoryTurnOverTy=" + inventoryTurnOverTy
					+ ", debtorsTurnoverFy=" + debtorsTurnoverFy + ", debtorsTurnoverSy=" + debtorsTurnoverSy
					+ ", debtorsTurnoverTy=" + debtorsTurnoverTy + ", creditorsTurnoverFy=" + creditorsTurnoverFy
					+ ", creditorsTurnoverSy=" + creditorsTurnoverSy + ", creditorsTurnoverTy=" + creditorsTurnoverTy
					+ ", salesWorkingCapitalFy=" + salesWorkingCapitalFy + ", salesWorkingCapitalSy="
					+ salesWorkingCapitalSy + ", salesWorkingCapitalTy=" + salesWorkingCapitalTy
					+ ", netSalesGrowthCapitalFy=" + netSalesGrowthCapitalFy + ", netSalesGrowthCapitalSy="
					+ netSalesGrowthCapitalSy + ", patGrowthCapitalFy=" + patGrowthCapitalFy + ", patGrowthCapitalSy="
					+ patGrowthCapitalSy + ", adjustedTotalDebtEquityFy=" + adjustedTotalDebtEquityFy
					+ ", adjustedTotalDebtEquitySy=" + adjustedTotalDebtEquitySy + ", adjustedTotalDebtEquityTy="
					+ adjustedTotalDebtEquityTy + ", growthDebtEquityFy=" + growthDebtEquityFy + ", growthDebtEquitySy="
					+ growthDebtEquitySy + ", curruntRatioXFy=" + curruntRatioXFy + ", curruntRatioXSy="
					+ curruntRatioXSy + ", curruntRatioXTy=" + curruntRatioXTy + ", quickRatioXFy=" + quickRatioXFy
					+ ", quickRatioSSy=" + quickRatioSSy + ", quickRatioTTy=" + quickRatioTTy + ", interestCoverFy="
					+ interestCoverFy + ", interestCoverSy=" + interestCoverSy + ", interestCoverTy=" + interestCoverTy
					+ ", debtEbitadFy=" + debtEbitadFy + ", debtEbitadSy=" + debtEbitadSy + ", debtEbitadTy="
					+ debtEbitadTy + ", freeReserveEquityFy=" + freeReserveEquityFy + ", freeReserveEquitySy="
					+ freeReserveEquitySy + ", freeReserveEquityTy=" + freeReserveEquityTy + ", cfoMargineFy="
					+ cfoMargineFy + ", cfoMargineSy=" + cfoMargineSy + ", growthCfoMargineFy=" + growthCfoMargineFy
					+ ", growthCfoMargineSy=" + growthCfoMargineSy + "]";
		}
		
}
