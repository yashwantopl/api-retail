package com.opl.retail.api.model.bodmas;

public class FormulaReqRes {

    Long formulaId;

    String formulaString;

    String formulaValString;

    Double formulaAnswer;

    public Long getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Long formulaId) {
        this.formulaId = formulaId;
    }

    public String getFormulaString() {
        return formulaString;
    }

    public void setFormulaString(String formulaString) {
        this.formulaString = formulaString;
    }

    public String getFormulaValString() {
        return formulaValString;
    }

    public void setFormulaValString(String formulaValString) {
        this.formulaValString = formulaValString;
    }

    public Double getFormulaAnswer() {
        return formulaAnswer;
    }

    public void setFormulaAnswer(Double formulaAnswer) {
        this.formulaAnswer = formulaAnswer;
    }
}
