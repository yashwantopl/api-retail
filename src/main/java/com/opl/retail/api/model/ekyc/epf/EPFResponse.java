
package com.opl.retail.api.model.ekyc.epf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request_id",
    "result",
    "status-code"
})
public class EPFResponse {

    @JsonProperty("request_id")
    private String requestId;
    @JsonProperty("result")
    private Object result;
    @JsonProperty("status-code")
    private String statusCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request_id")
    public String getRequestId() {
        return requestId;
    }

    @JsonProperty("request_id")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("result")
    public Object getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Object result) {
        this.result = result;
    }

    @JsonProperty("status-code")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("status-code")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
