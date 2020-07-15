package com.opl.retail.api.model.scoring.scoringmodel;

public class BankAcc {

    Integer id;
    String value;
    String code;
    Integer minScore;
    Integer maxScore;
    Boolean isChecked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public void setMinScore(Integer minScore) {
        this.minScore = minScore;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", code='" + code + '\'' +
                ", minScore=" + minScore +
                ", maxScore=" + maxScore +
                ", isChecked=" + isChecked +
                '}';
    }
}
