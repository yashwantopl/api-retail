
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
    "currentEmployer",
    "matchScore",
    "result",
    "uanNameMatch"
})
public class UanLookup {

    @JsonProperty("currentEmployer")
    private String currentEmployer;
    @JsonProperty("matchScore")
    private Integer matchScore;
    @JsonProperty("result")
    private Boolean result;
    @JsonProperty("uanNameMatch")
    private Boolean uanNameMatch;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currentEmployer")
    public String getCurrentEmployer() {
        return currentEmployer;
    }

    @JsonProperty("currentEmployer")
    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    @JsonProperty("matchScore")
    public Integer getMatchScore() {
        return matchScore;
    }

    @JsonProperty("matchScore")
    public void setMatchScore(Integer matchScore) {
        this.matchScore = matchScore;
    }

    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    @JsonProperty("uanNameMatch")
    public Boolean getUanNameMatch() {
        return uanNameMatch;
    }

    @JsonProperty("uanNameMatch")
    public void setUanNameMatch(Boolean uanNameMatch) {
        this.uanNameMatch = uanNameMatch;
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
