
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
    "alerts",
    "isValid",
    "organization",
    "person"
})
public class EmailParameters {

    @JsonProperty("alerts")
    private Boolean alerts;
    @JsonProperty("isValid")
    private Boolean isValid;
    @JsonProperty("organization")
    private Organization organization;
    @JsonProperty("person")
    private Person person;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alerts")
    public Boolean getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(Boolean alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("isValid")
    public Boolean getIsValid() {
        return isValid;
    }

    @JsonProperty("isValid")
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
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
