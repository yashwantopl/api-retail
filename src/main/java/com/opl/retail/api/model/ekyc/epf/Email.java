
package com.opl.retail.api.model.ekyc.epf;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalInfo",
    "data",
    "result"
})
public class Email {

    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("result")
    private Boolean result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
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
