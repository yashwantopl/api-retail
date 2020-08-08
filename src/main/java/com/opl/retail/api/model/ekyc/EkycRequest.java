package com.opl.retail.api.model.ekyc;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)

public class EkycRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private Long applicantType;
	private Long applicationId;
	private Long clientId;
	private Long verificationType;
	private Long applicantsId;
	private int docType;
	private String spOrgName;
	private String consent;
	
	public String getSpOrgName() {
		return spOrgName;
	}

	public void setSpOrgName(String spOrgName) {
		this.spOrgName = spOrgName;
	}

	public int getDocType() {
		return docType;
	}

	public void setDocType(int docType) {
		this.docType = docType;
	}

	public Long getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(Long applicantType) {
		this.applicantType = applicantType;
	}

	public Long getApplicantsId() {
		return applicantsId;
	}

	public void setApplicantsId(Long applicantsId) {
		this.applicantsId = applicantsId;
	}

	public Long getVerificationType() {
		return verificationType;
	}

	public void setVerificationType(Long verificationType) {
		this.verificationType = verificationType;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getConsent() {
		return consent;
	}

	public void setConsent(String consent) {
		this.consent = consent;
	}

	@Override
	public String toString() {
		return "EkycRequest [userId=" + userId + ", applicantType=" + applicantType + ", applicationId=" + applicationId
				+ ", clientId=" + clientId + ", verificationType=" + verificationType + ", applicantsId=" + applicantsId
				+ ", docType=" + docType + ", spOrgName=" + spOrgName + ", consent=" + consent + "]";
	}
	
	


}
