
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
    "emplrScore",
    "isEmployed",
    "isNameExact",
    "isNameUnique",
    "isRecent",
    "lastMonth",
    "matchName",
    "memberId",
    "name",
    "nameConfidence",
    "settled",
    "uanNameMatch"
})
public class Employer {

    @JsonProperty("emplrScore")
    private Double emplrScore;
    @JsonProperty("isEmployed")
    private Boolean isEmployed;
    @JsonProperty("isNameExact")
    private Boolean isNameExact;
    @JsonProperty("isNameUnique")
    private Boolean isNameUnique;
    @JsonProperty("isRecent")
    private Boolean isRecent;
    @JsonProperty("lastMonth")
    private String lastMonth;
    @JsonProperty("matchName")
    private String matchName;
    @JsonProperty("memberId")
    private String memberId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameConfidence")
    private Integer nameConfidence;
    @JsonProperty("settled")
    private Boolean settled;
    @JsonProperty("uanNameMatch")
    private Boolean uanNameMatch;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emplrScore")
    public Double getEmplrScore() {
        return emplrScore;
    }

    @JsonProperty("emplrScore")
    public void setEmplrScore(Double emplrScore) {
        this.emplrScore = emplrScore;
    }

    @JsonProperty("isEmployed")
    public Boolean getIsEmployed() {
        return isEmployed;
    }

    @JsonProperty("isEmployed")
    public void setIsEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    @JsonProperty("isNameExact")
    public Boolean getIsNameExact() {
        return isNameExact;
    }

    @JsonProperty("isNameExact")
    public void setIsNameExact(Boolean isNameExact) {
        this.isNameExact = isNameExact;
    }

    @JsonProperty("isNameUnique")
    public Boolean getIsNameUnique() {
        return isNameUnique;
    }

    @JsonProperty("isNameUnique")
    public void setIsNameUnique(Boolean isNameUnique) {
        this.isNameUnique = isNameUnique;
    }

    @JsonProperty("isRecent")
    public Boolean getIsRecent() {
        return isRecent;
    }

    @JsonProperty("isRecent")
    public void setIsRecent(Boolean isRecent) {
        this.isRecent = isRecent;
    }

    @JsonProperty("lastMonth")
    public String getLastMonth() {
        return lastMonth;
    }

    @JsonProperty("lastMonth")
    public void setLastMonth(String lastMonth) {
        this.lastMonth = lastMonth;
    }

    @JsonProperty("matchName")
    public String getMatchName() {
        return matchName;
    }

    @JsonProperty("matchName")
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    @JsonProperty("memberId")
    public String getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameConfidence")
    public Integer getNameConfidence() {
        return nameConfidence;
    }

    @JsonProperty("nameConfidence")
    public void setNameConfidence(Integer nameConfidence) {
        this.nameConfidence = nameConfidence;
    }

    @JsonProperty("settled")
    public Boolean getSettled() {
        return settled;
    }

    @JsonProperty("settled")
    public void setSettled(Boolean settled) {
        this.settled = settled;
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
