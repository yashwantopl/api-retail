
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
    "companyEmail",
    "match",
    "orgName",
    "source"
})
public class OrgEmailMatch {

    @JsonProperty("companyEmail")
    private String companyEmail;
    @JsonProperty("match")
    private Boolean match;
    @JsonProperty("orgName")
    private String orgName;
    @JsonProperty("source")
    private String source;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("companyEmail")
    public String getCompanyEmail() {
        return companyEmail;
    }

    @JsonProperty("companyEmail")
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    @JsonProperty("match")
    public Boolean getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(Boolean match) {
        this.match = match;
    }

    @JsonProperty("orgName")
    public String getOrgName() {
        return orgName;
    }

    @JsonProperty("orgName")
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
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
