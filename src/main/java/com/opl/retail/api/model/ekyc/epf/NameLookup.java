
package com.opl.retail.api.model.ekyc.epf;

import java.util.ArrayList;
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
    "employeeName",
    "epfHistory",
    "estInfo",
    "isEmployed",
    "isNameExact",
    "isNameUnique",
    "isRecent",
    "matches",
    "organizationName"
})
public class NameLookup {

    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("epfHistory")
    private List<EpfHistory> epfHistory = new ArrayList<EpfHistory>();
    @JsonProperty("estInfo")
    private List<EstInfo> estInfo = new ArrayList<EstInfo>();
    @JsonProperty("isEmployed")
    private Boolean isEmployed;
    @JsonProperty("isNameExact")
    private Boolean isNameExact;
    @JsonProperty("isNameUnique")
    private Boolean isNameUnique;
    @JsonProperty("isRecent")
    private Boolean isRecent;
    @JsonProperty("matches")
    private List<Match> matches = new ArrayList<Match>();
    @JsonProperty("organizationName")
    private String organizationName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("employeeName")
    public String getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employeeName")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("epfHistory")
    public List<EpfHistory> getEpfHistory() {
        return epfHistory;
    }

    @JsonProperty("epfHistory")
    public void setEpfHistory(List<EpfHistory> epfHistory) {
        this.epfHistory = epfHistory;
    }

    @JsonProperty("estInfo")
    public List<EstInfo> getEstInfo() {
        return estInfo;
    }

    @JsonProperty("estInfo")
    public void setEstInfo(List<EstInfo> estInfo) {
        this.estInfo = estInfo;
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

    @JsonProperty("matches")
    public List<Match> getMatches() {
        return matches;
    }

    @JsonProperty("matches")
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @JsonProperty("organizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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
