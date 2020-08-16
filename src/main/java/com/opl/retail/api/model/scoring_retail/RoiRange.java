package com.opl.retail.api.model.scoring_retail;

public class RoiRange {

	private Long productId;
	private String productName;
	private Float minRoi;
	private Float maxRoi;
	
	
	public RoiRange() {}
	
	public RoiRange(Long productId, String productName, Float min, Float max) {
		super();
		this.productId = productId;
		this.productName= productName;
		this.minRoi = min;
		this.maxRoi = max;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Float getMinRoi() {
		return minRoi;
	}

	public void setMinRoi(Float minRoi) {
		this.minRoi = minRoi;
	}

	public Float getMaxRoi() {
		return maxRoi;
	}

	public void setMaxRoi(Float maxRoi) {
		this.maxRoi = maxRoi;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
	
	
}
