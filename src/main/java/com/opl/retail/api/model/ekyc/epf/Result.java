
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
    "email",
    "nameLookup",
    "summary",
    "uan"
})
public class Result {

    @JsonProperty("email")
    private Email email;
    @JsonProperty("nameLookup")
    private NameLookup nameLookup;
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("uan")
    private List<Uan> uan = new ArrayList<Uan>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    @JsonProperty("nameLookup")
    public NameLookup getNameLookup() {
        return nameLookup;
    }

    @JsonProperty("nameLookup")
    public void setNameLookup(NameLookup nameLookup) {
        this.nameLookup = nameLookup;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("uan")
    public List<Uan> getUan() {
        return uan;
    }

    @JsonProperty("uan")
    public void setUan(List<Uan> uan) {
        this.uan = uan;
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
