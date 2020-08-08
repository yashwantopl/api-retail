
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
    "acceptAll",
    "disposable",
    "email",
    "genericEmail",
    "mxRecords",
    "regexp",
    "result",
    "smtpCheck",
    "webmail"
})
public class Data {

    @JsonProperty("acceptAll")
    private Boolean acceptAll;
    @JsonProperty("disposable")
    private Boolean disposable;
    @JsonProperty("email")
    private String email;
    @JsonProperty("genericEmail")
    private Boolean genericEmail;
    @JsonProperty("mxRecords")
    private Boolean mxRecords;
    @JsonProperty("regexp")
    private Boolean regexp;
    @JsonProperty("result")
    private Boolean result;
    @JsonProperty("smtpCheck")
    private Boolean smtpCheck;
    @JsonProperty("webmail")
    private Boolean webmail;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("acceptAll")
    public Boolean getAcceptAll() {
        return acceptAll;
    }

    @JsonProperty("acceptAll")
    public void setAcceptAll(Boolean acceptAll) {
        this.acceptAll = acceptAll;
    }

    @JsonProperty("disposable")
    public Boolean getDisposable() {
        return disposable;
    }

    @JsonProperty("disposable")
    public void setDisposable(Boolean disposable) {
        this.disposable = disposable;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("genericEmail")
    public Boolean getGenericEmail() {
        return genericEmail;
    }

    @JsonProperty("genericEmail")
    public void setGenericEmail(Boolean genericEmail) {
        this.genericEmail = genericEmail;
    }

    @JsonProperty("mxRecords")
    public Boolean getMxRecords() {
        return mxRecords;
    }

    @JsonProperty("mxRecords")
    public void setMxRecords(Boolean mxRecords) {
        this.mxRecords = mxRecords;
    }

    @JsonProperty("regexp")
    public Boolean getRegexp() {
        return regexp;
    }

    @JsonProperty("regexp")
    public void setRegexp(Boolean regexp) {
        this.regexp = regexp;
    }

    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    @JsonProperty("smtpCheck")
    public Boolean getSmtpCheck() {
        return smtpCheck;
    }

    @JsonProperty("smtpCheck")
    public void setSmtpCheck(Boolean smtpCheck) {
        this.smtpCheck = smtpCheck;
    }

    @JsonProperty("webmail")
    public Boolean getWebmail() {
        return webmail;
    }

    @JsonProperty("webmail")
    public void setWebmail(Boolean webmail) {
        this.webmail = webmail;
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
