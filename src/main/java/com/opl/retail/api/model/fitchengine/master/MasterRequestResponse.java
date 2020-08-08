package com.opl.retail.api.model.fitchengine.master;

import java.util.ArrayList;
import java.util.List;

public class MasterRequestResponse {

	private Long id;

	private Integer status;

	private String message;

	private Object data;
	
	private Integer businessTypeId;
	
	private Long qualitativeInputTypeId;
	
	private Long lookupInputTypeId;
	
	private List<QualitativeInput> qualitativeInputList=new ArrayList<QualitativeInput>();
	
	private List<LookupInput> lookupInputList=new ArrayList<LookupInput>();
	
	private List<RiskWeight> riskWeightList=new ArrayList<RiskWeight>();
	
	private List<Industry> industriesList=new ArrayList<Industry>();
	
	
	public List<Industry> getIndustriesList() {
		return industriesList;
	}

	public void setIndustriesList(List<Industry> industriesList) {
		this.industriesList = industriesList;
	}

	public MasterRequestResponse() {
		
	}

	public MasterRequestResponse(String message,Integer status) {
		super();
		this.status = status;
		this.message = message;
	}

	public List<RiskWeight> getRiskWeightList() {
		return riskWeightList;
	}

	public void setRiskWeightList(List<RiskWeight> riskWeightList) {
		this.riskWeightList = riskWeightList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Integer businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public Long  getQualitativeInputTypeId() {
		return qualitativeInputTypeId;
	}

	public void setQualitativeInputTypeId(Long qualitativeInputTypeId) {
		this.qualitativeInputTypeId = qualitativeInputTypeId;
	}

	public Long getLookupInputTypeId() {
		return lookupInputTypeId;
	}

	public void setLookupInputTypeId(Long lookupInputTypeId) {
		this.lookupInputTypeId = lookupInputTypeId;
	}

	public List<QualitativeInput> getQualitativeInputList() {
		return qualitativeInputList;
	}

	public void setQualitativeInputList(List<QualitativeInput> qualitativeInputList) {
		this.qualitativeInputList = qualitativeInputList;
	}

	public List<LookupInput> getLookupInputList() {
		return lookupInputList;
	}

	public void setLookupInputList(List<LookupInput> lookupInputList) {
		this.lookupInputList = lookupInputList;
	}
	
	
}
