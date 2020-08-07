package com.opl.retail.api.model.fraudanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class McaRegisteredCompanyData {

	@JsonProperty("mca_master_india")
	private List<RegisteredComapnyData> registeredComapnyDatas;

	public List<RegisteredComapnyData> getRegisteredComapnyDatas() {
		return registeredComapnyDatas;
	}

	public void setRegisteredComapnyDatas(List<RegisteredComapnyData> registeredComapnyDatas) {
		this.registeredComapnyDatas = registeredComapnyDatas;
	}
	
}
