
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
    "isLatest",
    "isUnique",
    "matchName",
    "result"
})
public class NameLookup_ {

    @JsonProperty("isLatest")
    private Boolean isLatest;
    @JsonProperty("isUnique")
    private Boolean isUnique;
    @JsonProperty("matchName")
    private String matchName;
    @JsonProperty("result")
    private Boolean result;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isLatest")
    public Boolean getIsLatest() {
        return isLatest;
    }

    @JsonProperty("isLatest")
    public void setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
    }

    @JsonProperty("isUnique")
    public Boolean getIsUnique() {
        return isUnique;
    }

    @JsonProperty("isUnique")
    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    @JsonProperty("matchName")
    public String getMatchName() {
        return matchName;
    }

    @JsonProperty("matchName")
    public void setMatchName(String matchName) {
        this.matchName = matchName;
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
