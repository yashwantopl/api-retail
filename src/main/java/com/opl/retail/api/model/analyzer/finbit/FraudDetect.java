package com.opl.retail.api.model.analyzer.finbit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FraudDetect {
	
    @JsonProperty("result")
    private List<Result> result = null;
    @JsonProperty("status")
    private String status;

    @JsonProperty("result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }
    
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "FraudDetect [result=" + result + ", status=" + status + "]";
	}
    
    
}
