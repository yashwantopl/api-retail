package com.opl.retail.api.model.fraudanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class McaDefaultCompanyData {
	
	@JsonProperty("defaultCompanydata")
	private List<DefaultCompanyData> defaultCompanyData;

	public List<DefaultCompanyData> getDefaultCompanyData() {
		return defaultCompanyData;
	}

	public void setDefaultCompanyData(List<DefaultCompanyData> defaultCompanyData) {
		this.defaultCompanyData = defaultCompanyData;
	}
	
	

}
