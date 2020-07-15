package com.opl.retail.api.model.scoring.scoringmodel;

import java.util.List;

public class BankDetailAcc {

    List<BankAcc> bankAcc;
    List<RiskGradingReqRes> cibilRanges;

    public List<BankAcc> getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(List<BankAcc> bankAcc) {
        this.bankAcc = bankAcc;
    }

    public List<RiskGradingReqRes> getCibilRanges() {
        return cibilRanges;
    }

    public void setCibilRanges(List<RiskGradingReqRes> cibilRanges) {
        this.cibilRanges = cibilRanges;
    }

    @Override
    public String toString() {
        return "BankDetailAcc{" +
                "bankAcc=" + bankAcc +
                ", cibilRanges=" + cibilRanges +
                '}';
    }
}
