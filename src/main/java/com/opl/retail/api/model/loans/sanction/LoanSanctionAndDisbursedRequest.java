package com.opl.retail.api.model.loans.sanction;

import java.io.Serializable;

import java.util.List;

import com.opl.retail.api.model.loans.LoanDisbursementRequest;
import com.opl.retail.api.model.loans.LoanSanctionRequest;
import com.opl.retail.api.model.loans.common.AuditActivityRequest;



public class LoanSanctionAndDisbursedRequest extends AuditActivityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5423868378542598022L;
	private LoanSanctionRequest loanSanctionRequest;
	private List<LoanDisbursementRequest> loanDisbursementRequestsList;
	private Long applicationId;
	private String userName;
	private String password;

	public LoanSanctionRequest getLoanSanctionRequest() {
		return loanSanctionRequest;
	}

	public void setLoanSanctionRequest(LoanSanctionRequest loanSanctionRequest) {
		this.loanSanctionRequest = loanSanctionRequest;
	}

	public List<LoanDisbursementRequest> getLoanDisbursementRequestsList() {
		return loanDisbursementRequestsList;
	}

	public void setLoanDisbursementRequestsList(List<LoanDisbursementRequest> loanDisbursementRequestsList) {
		this.loanDisbursementRequestsList = loanDisbursementRequestsList;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoanSanctionAndDisbursedRequest [loanSanctionRequest=" + loanSanctionRequest
				+ ", loanDisbursementRequestsList=" + loanDisbursementRequestsList + ", applicationId=" + applicationId
				+ ", userName=" + userName + "]";
	}

}
