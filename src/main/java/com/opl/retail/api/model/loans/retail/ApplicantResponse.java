package com.opl.retail.api.model.loans.retail;

/**
 * Created by dhaval.panchal on 13-Mar-20.
 */
public class ApplicantResponse {
    private Integer tenure;
    private Integer tenureChangedCount;
    private Integer coApplicantChangedCount;
    private Integer numberOfCoApplicant;
    private Long applicationId;

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    public Integer getTenureChangedCount() {
        return tenureChangedCount;
    }

    public void setTenureChangedCount(Integer tenureChangedCount) {
        this.tenureChangedCount = tenureChangedCount;
    }

    public Integer getCoApplicantChangedCount() {
        return coApplicantChangedCount;
    }

    public void setCoApplicantChangedCount(Integer coApplicantChangedCount) {
        this.coApplicantChangedCount = coApplicantChangedCount;
    }

    public Integer getNumberOfCoApplicant() {
        return numberOfCoApplicant;
    }

    public void setNumberOfCoApplicant(Integer numberOfCoApplicant) {
        this.numberOfCoApplicant = numberOfCoApplicant;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
