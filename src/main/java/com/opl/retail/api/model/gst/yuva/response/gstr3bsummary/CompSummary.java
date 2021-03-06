package com.opl.retail.api.model.gst.yuva.response.gstr3bsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class CompSummary {

	private Map<String, Object> compSummary;

	public Map<String, Object> getCompSummary() {
		return compSummary;
	}

	public void setCompSummary(Map<String, Object> compSummary) {
		this.compSummary = compSummary;
	}

	public CompSummary() {
		this.compSummary = new HashMap<>();
	}
}
