package com.opl.retail.api.model.analyzer.finbit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by ravina.panchal on 14-09-2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class MonthwiseSummary {

    @JsonProperty("bank_account")
    private BankAccount bankAccount;
    @JsonProperty("monthWiseAnlaysis")
    private Summary summary;
    @JsonProperty("missingMonths")
    private List<String> missingMonths;


    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<String> getMissingMonths() {
        return missingMonths;
    }

    public void setMissingMonths(List<String> missingMonths) {
        this.missingMonths = missingMonths;
    }


    @Override
    public String toString() {
        return "MonthwiseSummary{" +
                "bankAccount=" + bankAccount +
                ", summary=" + summary +
                ", missingMonths=" + missingMonths +
                '}';
    }
}
