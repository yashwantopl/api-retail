package com.opl.retail.api.model.loans.corporate;

public class ProductParameterMappingRequest {
	
    private Long id;
    private Long fpProductId;
    private Long parameterId;
    private Boolean isMandatory;
    private Boolean isOptional;
    private Boolean isActive;
    
	public ProductParameterMappingRequest() {
		super();
	}
	public ProductParameterMappingRequest(Long id, Long fpProductId, Long parameterId, Boolean isMandatory, Boolean isOptional) {
		super();
		this.id = id;
		this.fpProductId = fpProductId;
		this.parameterId = parameterId;
		this.isMandatory = isMandatory;
		this.isOptional = isOptional;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFpProductId() {
		return fpProductId;
	}
	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}
	public Long getParameterId() {
		return parameterId;
	}
	public void setParameterId(Long parameterId) {
		this.parameterId = parameterId;
	}
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public Boolean getIsOptional() {
		return isOptional;
	}
	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

