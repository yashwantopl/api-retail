/**
 * 
 */
package com.opl.retail.api.model.eligibility;

/**
 * @author sanket
 *
 */
public class GstCamTeaserData {
	
	private Double projectedSales ;
	private Double growthCalculatedFromSales;
	private Double  growthSetByBank ;
	private Double  projectedSalesOfPreviousFyear ;
	private Double salesOfCurrentFyear ;
	private Boolean ishistoric ;
	private Boolean isGrowth ;
	private Double sales1  ;
	private Boolean isApril ;
	private Double sales3 ;
	private Double sales2;
	private Double sales;

	private Double borrowerDcldProjectedSales; // One Form Declared Projected Sales
	private Double finalConsiderProjSales;
	private Boolean isNewProSalesCompute;
	
	private Double actualGrowthConsiderLowerOf;
	private Double actualSalesLastTwelveMonths;
	
	private Double finalConsiderAllProjSalesTotal;
	
	
	public Double getActualSalesLastTwelveMonths() {
		return actualSalesLastTwelveMonths;
	}
	public void setActualSalesLastTwelveMonths(Double actualSalesLastTwelveMonths) {
		this.actualSalesLastTwelveMonths = actualSalesLastTwelveMonths;
	}
	public Double getActualGrowthConsiderLowerOf() {
		return actualGrowthConsiderLowerOf;
	}
	public void setActualGrowthConsiderLowerOf(Double actualGrowthConsiderLowerOf) {
		this.actualGrowthConsiderLowerOf = actualGrowthConsiderLowerOf;
	}
	public GstCamTeaserData() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the projectedSales
	 */
	
	public Double getProjectedSales() {
		return projectedSales;
	}
	public Boolean getIsNewProSalesCompute() {
		return isNewProSalesCompute;
	}
	public void setIsNewProSalesCompute(Boolean isNewProSalesCompute) {
		this.isNewProSalesCompute = isNewProSalesCompute;
	}
	/**
	 * @param projectedSales the projectedSales to set
	 */
	public void setProjectedSales(Double projectedSales) {
		this.projectedSales = projectedSales;
	}
	/**
	 * @return the growthCalculatedFromSales
	 */
	public Double getGrowthCalculatedFromSales() {
		return growthCalculatedFromSales;
	}
	/**
	 * @param growthCalculatedFromSales the growthCalculatedFromSales to set
	 */
	public void setGrowthCalculatedFromSales(Double growthCalculatedFromSales) {
		this.growthCalculatedFromSales = growthCalculatedFromSales;
	}
	/**
	 * @return the growthSetByBank
	 */
	public Double getGrowthSetByBank() {
		return growthSetByBank;
	}
	/**
	 * @param growthSetByBank the growthSetByBank to set
	 */
	public void setGrowthSetByBank(Double growthSetByBank) {
		this.growthSetByBank = growthSetByBank;
	}
	/**
	 * @return the projectedSalesOfPreviousFyear
	 */
	public Double getProjectedSalesOfPreviousFyear() {
		return projectedSalesOfPreviousFyear;
	}
	/**
	 * @param projectedSalesOfPreviousFyear the projectedSalesOfPreviousFyear to set
	 */
	public void setProjectedSalesOfPreviousFyear(Double projectedSalesOfPreviousFyear) {
		this.projectedSalesOfPreviousFyear = projectedSalesOfPreviousFyear;
	}
	/**
	 * @return the salesOfCurrentFyear
	 */
	public Double getSalesOfCurrentFyear() {
		return salesOfCurrentFyear;
	}
	/**
	 * @param salesOfCurrentFyear the salesOfCurrentFyear to set
	 */
	public void setSalesOfCurrentFyear(Double salesOfCurrentFyear) {
		this.salesOfCurrentFyear = salesOfCurrentFyear;
	}
	/**
	 * @return the ishistoric
	 */
	public Boolean getIshistoric() {
		return ishistoric;
	}
	/**
	 * @param ishistoric the ishistoric to set
	 */
	public void setIshistoric(Boolean ishistoric) {
		this.ishistoric = ishistoric;
	}
	/**
	 * @return the isGrowth
	 */
	public Boolean getIsGrowth() {
		return isGrowth;
	}
	/**
	 * @param isGrowth the isGrowth to set
	 */
	public void setIsGrowth(Boolean isGrowth) {
		this.isGrowth = isGrowth;
	}
	/**
	 * @return the sales1
	 */
	public Double getSales1() {
		return sales1;
	}
	/**
	 * @param sales1 the sales1 to set
	 */
	public void setSales1(Double sales1) {
		this.sales1 = sales1;
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
	
	public Double getSales() {
		return sales;
	}
	public void setSales(Double sales) {
		this.sales = sales;
	}
	
	public Double getFinalConsiderProjSales() {
		return finalConsiderProjSales;
	}
	public void setFinalConsiderProjSales(Double finalConsiderProjSales) {
		this.finalConsiderProjSales = finalConsiderProjSales;
	}
	public Double getBorrowerDcldProjectedSales() {
		return borrowerDcldProjectedSales;
	}
	public void setBorrowerDcldProjectedSales(Double borrowerDcldProjectedSales) {
		this.borrowerDcldProjectedSales = borrowerDcldProjectedSales;
	}
	
	public Double getFinalConsiderAllProjSalesTotal() {
		return finalConsiderAllProjSalesTotal;
	}
	public void setFinalConsiderAllProjSalesTotal(Double finalConsiderAllProjSalesTotal) {
		this.finalConsiderAllProjSalesTotal = finalConsiderAllProjSalesTotal;
	}
	/**
	 * @param projectedSales
	 * @param growthCalculatedFromSales
	 * @param growthSetByBank
	 * @param projectedSalesOfPreviousFyear
	 * @param salesOfCurrentFyear
	 * @param ishistoric
	 * @param isGrowth
	 * @param sales1
	 * @param isApril
	 * @param sales3
	 * @param sales2
	 */
	public GstCamTeaserData(Double projectedSales, Double growthCalculatedFromSales, Double growthSetByBank,
			Double projectedSalesOfPreviousFyear, Double salesOfCurrentFyear, Boolean ishistoric, Boolean isGrowth,
			Double sales1, Boolean isApril, Double sales3, Double sales2,Double sales,Double borrowerDcldProjectedSales,Double finalConsiderProjSales,Boolean isNewProSalesCompute,Double actualGrowthConsiderLowerOf,Double actualSalesLastTwelveMonths,Double finalConsiderAllProjSalesTotal) {
		super();
		this.projectedSales = projectedSales;
		this.growthCalculatedFromSales = growthCalculatedFromSales;
		this.growthSetByBank = growthSetByBank;
		this.projectedSalesOfPreviousFyear = projectedSalesOfPreviousFyear;
		this.salesOfCurrentFyear = salesOfCurrentFyear;
		this.ishistoric = ishistoric;
		this.isGrowth = isGrowth;
		this.sales1 = sales1;
		this.isApril = isApril;
		this.sales3 = sales3;
		this.sales2 = sales2;
		this.sales = sales;
		this.borrowerDcldProjectedSales = borrowerDcldProjectedSales;
		this.finalConsiderProjSales = finalConsiderProjSales; 
		this.isNewProSalesCompute = isNewProSalesCompute;
		this.actualGrowthConsiderLowerOf = actualGrowthConsiderLowerOf;
		this.actualSalesLastTwelveMonths = actualSalesLastTwelveMonths;
		this.finalConsiderAllProjSalesTotal = finalConsiderAllProjSalesTotal;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GstCamTeaserData [projectedSales=" + projectedSales + ", growthCalculatedFromSales="
				+ growthCalculatedFromSales + ", growthSetByBank=" + growthSetByBank
				+ ", projectedSalesOfPreviousFyear=" + projectedSalesOfPreviousFyear + ", salesOfCurrentFyear="
				+ salesOfCurrentFyear + ", ishistoric=" + ishistoric + ", isGrowth=" + isGrowth + ", sales1=" + sales1
				+ ", isApril=" + isApril + ", sales3=" + sales3 + ", sales2=" + sales2 + ", sales=" + sales
				+ ", borrowerDcldProjectedSales=" + borrowerDcldProjectedSales + ", finalConsiderProjSales="
				+ finalConsiderProjSales + ", isNewProSalesCompute=" + isNewProSalesCompute
				+ ", actualGrowthConsiderLowerOf=" + actualGrowthConsiderLowerOf + ", actualSalesLastTwelveMonths="
				+ actualSalesLastTwelveMonths + ", finalConsiderAllProjSalesTotal=" + finalConsiderAllProjSalesTotal
				+ "]";
	}
}
