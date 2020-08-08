package com.opl.retail.api.model.ekyc.epf.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author dharmendra.chudasama
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class EmployerRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private EmployerVerificationRequest employerVerificationRequest;
	
	private EmployerSearchRequest employerSearchRequest;
	
	private EmployerDefaulterRequest employerDefaulterRequest;
	
	private Long applicationId;
	
	private Long coAppId;
	
	
	

	public Long getCoAppId() {
		return coAppId;
	}

	public void setCoAppId(Long coAppId) {
		this.coAppId = coAppId;
	}

	/**
	 * @return the employerVerificationRequest
	 */
	public EmployerVerificationRequest getEmployerVerificationRequest() {
		return employerVerificationRequest;
	}

	/**
	 * @param employerVerificationRequest the employerVerificationRequest to set
	 */
	public void setEmployerVerificationRequest(EmployerVerificationRequest employerVerificationRequest) {
		this.employerVerificationRequest = employerVerificationRequest;
	}

	/**
	 * @return the employerSearchRequest
	 */
	public EmployerSearchRequest getEmployerSearchRequest() {
		return employerSearchRequest;
	}

	/**
	 * @param employerSearchRequest the employerSearchRequest to set
	 */
	public void setEmployerSearchRequest(EmployerSearchRequest employerSearchRequest) {
		this.employerSearchRequest = employerSearchRequest;
	}

	/**
	 * @return the employerDefaulterRequest
	 */
	public EmployerDefaulterRequest getEmployerDefaulterRequest() {
		return employerDefaulterRequest;
	}

	/**
	 * @param employerDefaulterRequest the employerDefaulterRequest to set
	 */
	public void setEmployerDefaulterRequest(EmployerDefaulterRequest employerDefaulterRequest) {
		this.employerDefaulterRequest = employerDefaulterRequest;
	}

	/**
	 * @return the applicationId
	 */
	public Long getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	
}
