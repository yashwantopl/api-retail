package com.opl.retail.api.model.bodmas;

import java.io.Serializable;

public class FormulaMasterRequest implements Serializable {

    private Long id;

    private String formulaName;

    private String formula;

    private Long folderId;

    private Integer formulaMainType; // INDIVIDUAL , FINAL

    private Boolean isGST;

    private Boolean isITR;
    
    private String formulaJson;
    
    private String formulaMap;
    
    private Long createdBy; 

    public Integer getFormulaMainType() {
        return formulaMainType;
    }

    public void setFormulaMainType(Integer formulaMainType) {
        this.formulaMainType = formulaMainType;
    }

    public Boolean getIsGST() {
        return isGST;
    }

    public void setIsGST(Boolean GST) {
        isGST = GST;
    }

    public Boolean getIsITR() {
        return isITR;
    }

    public void setIsITR(Boolean ITR) {
        isITR = ITR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormulaName() {
        return formulaName;
    }

    public void setFormulaName(String formulaName) {
        this.formulaName = formulaName;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

	public String getFormulaJson() {
		return formulaJson;
	}

	public void setFormulaJson(String formulaJson) {
		this.formulaJson = formulaJson;
	}

	public String getFormulaMap() {
		return formulaMap;
	}

	public void setFormulaMap(String formulaMap) {
		this.formulaMap = formulaMap;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

}
