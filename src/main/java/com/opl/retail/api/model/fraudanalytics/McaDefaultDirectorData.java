package com.opl.retail.api.model.fraudanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class McaDefaultDirectorData {

	@JsonProperty("defaultDirectordata")
	private List<DefaultDirectorData> defaultDirectorData;

	public List<DefaultDirectorData> getDefaultDirectorData() {
		return defaultDirectorData;
	}

	public void setDefaultDirectorData(List<DefaultDirectorData> defaultDirectorData) {
		this.defaultDirectorData = defaultDirectorData;
	}
	
	
}
