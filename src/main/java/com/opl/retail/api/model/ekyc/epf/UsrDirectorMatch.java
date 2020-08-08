
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
    "name",
    "orgName",
    "score"
})
public class UsrDirectorMatch {

    @JsonProperty("match")
    private Boolean match;
    @JsonProperty("name")
    private String name;
    @JsonProperty("orgName")
    private String orgName;
    @JsonProperty("score")
    private Integer score;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match")
    public Boolean getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(Boolean match) {
        this.match = match;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("orgName")
    public String getOrgName() {
        return orgName;
    }

    @JsonProperty("orgName")
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
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
