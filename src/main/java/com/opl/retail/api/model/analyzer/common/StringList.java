package com.opl.retail.api.model.analyzer.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StringList {
private List<String> passList;

public List<String> getPassList() {
	return passList;
}

public void setPassList(List<String> passList) {
	this.passList = passList;
}




}
