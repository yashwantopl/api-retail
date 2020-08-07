
package com.opl.retail.api.model.analyzer.finbit;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BankAccount {

    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("bankName")
    private String bankName;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("IFSC")
    private String iFSC;
    @JsonProperty("statementUpload")
    private String statementUpload;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("pan")
    private String pan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    @JsonProperty("bankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("IFSC")
    public String getIFSC() {
        return iFSC;
    }

    @JsonProperty("IFSC")
    public void setIFSC(String iFSC) {
        this.iFSC = iFSC;
    }

    @JsonProperty("statementUpload")
    public String getStatementUpload() {
        return statementUpload;
    }

    @JsonProperty("statementUpload")
    public void setStatementUpload(String statementUpload) {
        this.statementUpload = statementUpload;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("pan")
    public String getPan() {
        return pan;
    }

    @JsonProperty("pan")
    public void setPan(String pan) {
        this.pan = pan;
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
