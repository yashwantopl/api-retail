
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
    "ageYear",
    "creationDate",
    "expirationDate",
    "expired",
    "updateDate",
    "whoisEmailDomainMatch",
    "whoisEmailMatch",
    "whoisIndvName",
    "whoisOrgName"
})
public class WhoisInfo {

    @JsonProperty("ageYear")
    private Double ageYear;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("expirationDate")
    private Object expirationDate;
    @JsonProperty("expired")
    private Object expired;
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonProperty("whoisEmailDomainMatch")
    private List<WhoisEmailDomainMatch> whoisEmailDomainMatch = new ArrayList<WhoisEmailDomainMatch>();
    @JsonProperty("whoisEmailMatch")
    private List<WhoisEmailMatch> whoisEmailMatch = new ArrayList<WhoisEmailMatch>();
    @JsonProperty("whoisIndvName")
    private List<WhoisIndvName> whoisIndvName = new ArrayList<WhoisIndvName>();
    @JsonProperty("whoisOrgName")
    private List<WhoisOrgName> whoisOrgName = new ArrayList<WhoisOrgName>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ageYear")
    public Double getAgeYear() {
        return ageYear;
    }

    @JsonProperty("ageYear")
    public void setAgeYear(Double ageYear) {
        this.ageYear = ageYear;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("expirationDate")
    public Object getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("expired")
    public Object getExpired() {
        return expired;
    }

    @JsonProperty("expired")
    public void setExpired(Object expired) {
        this.expired = expired;
    }

    @JsonProperty("updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("updateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @JsonProperty("whoisEmailDomainMatch")
    public List<WhoisEmailDomainMatch> getWhoisEmailDomainMatch() {
        return whoisEmailDomainMatch;
    }

    @JsonProperty("whoisEmailDomainMatch")
    public void setWhoisEmailDomainMatch(List<WhoisEmailDomainMatch> whoisEmailDomainMatch) {
        this.whoisEmailDomainMatch = whoisEmailDomainMatch;
    }

    @JsonProperty("whoisEmailMatch")
    public List<WhoisEmailMatch> getWhoisEmailMatch() {
        return whoisEmailMatch;
    }

    @JsonProperty("whoisEmailMatch")
    public void setWhoisEmailMatch(List<WhoisEmailMatch> whoisEmailMatch) {
        this.whoisEmailMatch = whoisEmailMatch;
    }

    @JsonProperty("whoisIndvName")
    public List<WhoisIndvName> getWhoisIndvName() {
        return whoisIndvName;
    }

    @JsonProperty("whoisIndvName")
    public void setWhoisIndvName(List<WhoisIndvName> whoisIndvName) {
        this.whoisIndvName = whoisIndvName;
    }

    @JsonProperty("whoisOrgName")
    public List<WhoisOrgName> getWhoisOrgName() {
        return whoisOrgName;
    }

    @JsonProperty("whoisOrgName")
    public void setWhoisOrgName(List<WhoisOrgName> whoisOrgName) {
        this.whoisOrgName = whoisOrgName;
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
