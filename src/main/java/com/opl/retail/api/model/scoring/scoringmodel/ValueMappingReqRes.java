package com.opl.retail.api.model.scoring.scoringmodel;

import java.io.Serializable;

/**
 * Created by pooja.patel on 03-03-2020.
 */
public class ValueMappingReqRes implements Serializable{

    private Long id;

    private ScoringModelReqRes scoringMasterTempId;

    private Integer parameterId;

    private Integer type;

    private Boolean isActive;

    private String newBorrowersAvailingSpecificLoans;
    
    
    private String newBorrowersAvailingLoansConcessPf;

    private String value;
    
    
    
    

    public String getNewBorrowersAvailingLoansConcessPf() {
		return newBorrowersAvailingLoansConcessPf;
	}

	public void setNewBorrowersAvailingLoansConcessPf(String newBorrowersAvailingLoansConcessPf) {
		this.newBorrowersAvailingLoansConcessPf = newBorrowersAvailingLoansConcessPf;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScoringModelReqRes getScoringMasterTempId() {
        return scoringMasterTempId;
    }

    public void setScoringMasterTempId(ScoringModelReqRes scoringMasterTempId) {
        this.scoringMasterTempId = scoringMasterTempId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNewBorrowersAvailingSpecificLoans() {
        return newBorrowersAvailingSpecificLoans;
    }

    public void setNewBorrowersAvailingSpecificLoans(String newBorrowersAvailingSpecificLoans) {
        this.newBorrowersAvailingSpecificLoans = newBorrowersAvailingSpecificLoans;
    }
}
