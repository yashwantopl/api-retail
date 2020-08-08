
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
    "emailParameters",
    "emailValid",
    "nameLookup",
    "uanLookup",
    "waiveFi"
})
public class Summary {

    @JsonProperty("emailParameters")
    private EmailParameters emailParameters;
    @JsonProperty("emailValid")
    private Boolean emailValid;
    @JsonProperty("nameLookup")
    private NameLookup_ nameLookup;
    @JsonProperty("uanLookup")
    private UanLookup uanLookup;
    @JsonProperty("waiveFi")
    private Boolean waiveFi;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emailParameters")
    public EmailParameters getEmailParameters() {
        return emailParameters;
    }

    @JsonProperty("emailParameters")
    public void setEmailParameters(EmailParameters emailParameters) {
        this.emailParameters = emailParameters;
    }

    @JsonProperty("emailValid")
    public Boolean getEmailValid() {
        return emailValid;
    }

    @JsonProperty("emailValid")
    public void setEmailValid(Boolean emailValid) {
        this.emailValid = emailValid;
    }

    @JsonProperty("nameLookup")
    public NameLookup_ getNameLookup() {
        return nameLookup;
    }

    @JsonProperty("nameLookup")
    public void setNameLookup(NameLookup_ nameLookup) {
        this.nameLookup = nameLookup;
    }

    @JsonProperty("uanLookup")
    public UanLookup getUanLookup() {
        return uanLookup;
    }

    @JsonProperty("uanLookup")
    public void setUanLookup(UanLookup uanLookup) {
        this.uanLookup = uanLookup;
    }

    @JsonProperty("waiveFi")
    public Boolean getWaiveFi() {
        return waiveFi;
    }

    @JsonProperty("waiveFi")
    public void setWaiveFi(Boolean waiveFi) {
        this.waiveFi = waiveFi;
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
