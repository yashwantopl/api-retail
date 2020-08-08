
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
    "ipBlacklist",
    "reportCount",
    "spamEmail"
})
public class SpamRecord {

    @JsonProperty("ipBlacklist")
    private Boolean ipBlacklist;
    @JsonProperty("reportCount")
    private Integer reportCount;
    @JsonProperty("spamEmail")
    private Boolean spamEmail;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ipBlacklist")
    public Boolean getIpBlacklist() {
        return ipBlacklist;
    }

    @JsonProperty("ipBlacklist")
    public void setIpBlacklist(Boolean ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
    }

    @JsonProperty("reportCount")
    public Integer getReportCount() {
        return reportCount;
    }

    @JsonProperty("reportCount")
    public void setReportCount(Integer reportCount) {
        this.reportCount = reportCount;
    }

    @JsonProperty("spamEmail")
    public Boolean getSpamEmail() {
        return spamEmail;
    }

    @JsonProperty("spamEmail")
    public void setSpamEmail(Boolean spamEmail) {
        this.spamEmail = spamEmail;
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
