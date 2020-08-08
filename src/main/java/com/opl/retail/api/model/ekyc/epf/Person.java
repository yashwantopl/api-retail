
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
    "match",
    "matchScore"
})
public class Person {

    @JsonProperty("match")
    private Boolean match;
    @JsonProperty("matchScore")
    private Double matchScore;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match")
    public Boolean getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(Boolean match) {
        this.match = match;
    }

    @JsonProperty("matchScore")
    public Double getMatchScore() {
        return matchScore;
    }

    @JsonProperty("matchScore")
    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
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
