package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateEligibililityRequest extends EligibililityRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double projectedSalesCurrentFinancialYear;
	private Double workingCapitalGapPreviousYear;
	private Double projectedSales;
	private Double workingCapitalGap;
	private Double cashAccrualsYearly;
	private Double gstSales;
	private Double numberOfMonths;
	private Double patOfPreviousYear;
	private Double depreciationOfPreviousYear;
	private Double interestOfPreviousYear;

	private Double debtorsOfPreviousYear;
	private Double inventoriesOfPreviousYear;
	private Double advanceToSuppliersCustomersOfPreviousYear;
	private Double salesOfPreviousYear;
	private Double monthly;
	private Double perlakhEMI;

	public CorporateEligibililityRequest() {
		super();
	}

	public Double getProjectedSalesCurrentFinancialYear() {
		return projectedSalesCurrentFinancialYear;
	}

	public void setProjectedSalesCurrentFinancialYear(Double projectedSalesCurrentFinancialYear) {
		this.projectedSalesCurrentFinancialYear = projectedSalesCurrentFinancialYear;
	}

	public Double getWorkingCapitalGapPreviousYear() {
		return workingCapitalGapPreviousYear;
	}

	public void setWorkingCapitalGapPreviousYear(Double workingCapitalGapPreviousYear) {
		this.workingCapitalGapPreviousYear = workingCapitalGapPreviousYear;
	}

	public Double getProjectedSales() {
		return projectedSales;
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

	public Double getCashAccrualsYearly() {
		return cashAccrualsYearly;
	}

	public void setCashAccrualsYearly(Double cashAccrualsYearly) {
		this.cashAccrualsYearly = cashAccrualsYearly;
	}

	public Double getGstSales() {
		return gstSales;
	}

	public void setGstSales(Double gstSales) {
		this.gstSales = gstSales;
	}

	public Double getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(Double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public Double getDebtorsOfPreviousYear() {
		return debtorsOfPreviousYear;
	}

	public void setDebtorsOfPreviousYear(Double debtorsOfPreviousYear) {
		this.debtorsOfPreviousYear = debtorsOfPreviousYear;
	}

	public Double getInventoriesOfPreviousYear() {
		return inventoriesOfPreviousYear;
	}

	public void setInventoriesOfPreviousYear(Double inventoriesOfPreviousYear) {
		this.inventoriesOfPreviousYear = inventoriesOfPreviousYear;
	}

	public Double getAdvanceToSuppliersCustomersOfPreviousYear() {
		return advanceToSuppliersCustomersOfPreviousYear;
	}

	public void setAdvanceToSuppliersCustomersOfPreviousYear(Double advanceToSuppliersCustomersOfPreviousYear) {
		this.advanceToSuppliersCustomersOfPreviousYear = advanceToSuppliersCustomersOfPreviousYear;
	}

	public Double getSalesOfPreviousYear() {
		return salesOfPreviousYear;
	}

	public void setSalesOfPreviousYear(Double salesOfPreviousYear) {
		this.salesOfPreviousYear = salesOfPreviousYear;
	}

	public Double getMonthly() {
		return monthly;
	}

	public void setMonthly(Double monthly) {
		this.monthly = monthly;
	}

	public Double getPerlakhEMI() {
		return perlakhEMI;
	}

	public void setPerlakhEMI(Double perlakhEMI) {
		this.perlakhEMI = perlakhEMI;
	}

	public Double getPatOfPreviousYear() {
		return patOfPreviousYear;
	}

	public void setPatOfPreviousYear(Double patOfPreviousYear) {
		this.patOfPreviousYear = patOfPreviousYear;
	}

	public Double getDepreciationOfPreviousYear() {
		return depreciationOfPreviousYear;
	}

	public void setDepreciationOfPreviousYear(Double depreciationOfPreviousYear) {
		this.depreciationOfPreviousYear = depreciationOfPreviousYear;
	}

	public Double getInterestOfPreviousYear() {
		return interestOfPreviousYear;
	}

	public void setInterestOfPreviousYear(Double interestOfPreviousYear) {
		this.interestOfPreviousYear = interestOfPreviousYear;
	}

	@Override
	public String toString() {
		return "CorporateEligibililityRequest [projectedSalesCurrentFinancialYear=" + projectedSalesCurrentFinancialYear
				+ ", workingCapitalGapPreviousYear=" + workingCapitalGapPreviousYear + ", projectedSales="
				+ projectedSales + ", workingCapitalGap=" + workingCapitalGap + ", cashAccrualsYearly="
				+ cashAccrualsYearly + ", gstSales=" + gstSales + ", numberOfMonths=" + numberOfMonths
				+ ", patOfPreviousYear=" + patOfPreviousYear + ", depreciationOfPreviousYear="
				+ depreciationOfPreviousYear + ", interestOfPreviousYear=" + interestOfPreviousYear
				+ ", DebtorsOfPreviousYear=" + debtorsOfPreviousYear + ", InventoriesOfPreviousYear="
				+ inventoriesOfPreviousYear + ", advanceToSuppliersCustomersOfPreviousYear="
				+ advanceToSuppliersCustomersOfPreviousYear + ", salesOfPreviousYear=" + salesOfPreviousYear
				+ ", monthly=" + monthly + ", perlakhEMI=" + perlakhEMI + "]";
	}

}