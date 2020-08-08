
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
    "companyInfo",
    "individualMatch",
    "spamRecord",
    "whoisInfo"
})
public class AdditionalInfo {

    @JsonProperty("companyInfo")
    private CompanyInfo companyInfo;
    @JsonProperty("individualMatch")
    private List<IndividualMatch> individualMatch = new ArrayList<IndividualMatch>();
    @JsonProperty("spamRecord")
    private SpamRecord spamRecord;
    @JsonProperty("whoisInfo")
    private WhoisInfo whoisInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("companyInfo")
    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    @JsonProperty("companyInfo")
    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }

    @JsonProperty("individualMatch")
    public List<IndividualMatch> getIndividualMatch() {
        return individualMatch;
    }

    @JsonProperty("individualMatch")
    public void setIndividualMatch(List<IndividualMatch> individualMatch) {
        this.individualMatch = individualMatch;
    }

    @JsonProperty("spamRecord")
    public SpamRecord getSpamRecord() {
        return spamRecord;
    }

    @JsonProperty("spamRecord")
    public void setSpamRecord(SpamRecord spamRecord) {
        this.spamRecord = spamRecord;
    }

    @JsonProperty("whoisInfo")
    public WhoisInfo getWhoisInfo() {
        return whoisInfo;
    }

    @JsonProperty("whoisInfo")
    public void setWhoisInfo(WhoisInfo whoisInfo) {
        this.whoisInfo = whoisInfo;
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
