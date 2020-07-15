package com.opl.retail.api.model.loans;

public class CamIndexRequest {
	
	public Integer productId;
	public Long typeId;

	public CamIndexRequest() {
		
	}
	
	public CamIndexRequest(Integer productId, Long typeId) {
		this.productId = productId;
		this.typeId = typeId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}	

}
