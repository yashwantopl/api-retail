package com.opl.retail.api.model.bodmas;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by KushalCW on 26-02-2019.
 */
public class CalculationReqRes implements Serializable{

    private Long userId;
    private Long applicationId;
    private String gstNo;
    private String gstin;
    private String panNo; 
    private String message;
    private Map<Long, FormulaReqRes> formulaMap;
    private Map operands;
    
    
    public CalculationReqRes() {
		// TODO Auto-generated constructor stub
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Map<Long, FormulaReqRes> getFormulaMap() {
		return formulaMap;
	}

	public void setFormulaMap(Map<Long, FormulaReqRes> formulaMap) {
		this.formulaMap = formulaMap;
	}

	public Map getOperands() {
		return operands;
	}

	public void setOperands(Map operands) {
		this.operands = operands;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}