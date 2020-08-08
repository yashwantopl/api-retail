
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
    "orgDomainMatch",
    "orgEmailMatch",
    "usrDirectorMatch"
})
public class CompanyInfo {

    @JsonProperty("orgDomainMatch")
    private List<OrgDomainMatch> orgDomainMatch = new ArrayList<OrgDomainMatch>();
    @JsonProperty("orgEmailMatch")
    private List<OrgEmailMatch> orgEmailMatch = new ArrayList<OrgEmailMatch>();
    @JsonProperty("usrDirectorMatch")
    private List<UsrDirectorMatch> usrDirectorMatch = new ArrayList<UsrDirectorMatch>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orgDomainMatch")
    public List<OrgDomainMatch> getOrgDomainMatch() {
        return orgDomainMatch;
    }

    @JsonProperty("orgDomainMatch")
    public void setOrgDomainMatch(List<OrgDomainMatch> orgDomainMatch) {
        this.orgDomainMatch = orgDomainMatch;
    }

    @JsonProperty("orgEmailMatch")
    public List<OrgEmailMatch> getOrgEmailMatch() {
        return orgEmailMatch;
    }

    @JsonProperty("orgEmailMatch")
    public void setOrgEmailMatch(List<OrgEmailMatch> orgEmailMatch) {
        this.orgEmailMatch = orgEmailMatch;
    }

    @JsonProperty("usrDirectorMatch")
    public List<UsrDirectorMatch> getUsrDirectorMatch() {
        return usrDirectorMatch;
    }

    @JsonProperty("usrDirectorMatch")
    public void setUsrDirectorMatch(List<UsrDirectorMatch> usrDirectorMatch) {
        this.usrDirectorMatch = usrDirectorMatch;
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
