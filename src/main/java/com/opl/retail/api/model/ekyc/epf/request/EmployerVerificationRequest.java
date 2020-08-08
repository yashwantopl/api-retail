/**
 * 
 */
package com.opl.retail.api.model.ekyc.epf.request;

/**
 * @author sanket
 *
 */
public class EmployerVerificationRequest {
	
	/**
	 * 
	 */
	public EmployerVerificationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param entityId
	 * @param employerName
	 * @param employeeName
	 * @param mobile
	 * @param emailId
	 */
	public EmployerVerificationRequest(String entityId, String employerName, String employeeName, String mobile,
			String emailId) {
		super();
		this.entityId = entityId;
		this.employerName = employerName;
		this.employeeName = employeeName;
		this.mobile = mobile;
		this.emailId = emailId;
	}
	private String entityId;
	private String employerName;
	private String employeeName;
	private String mobile;
	private String emailId;
	/**
	 * @return the entityId
	 */
	public String getEntityId() {
		return entityId;
	}
	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	/**
	 * @return the employerName
	 */
	public String getEmployerName() {
		return employerName;
	}
	/**
	 * @param employerName the employerName to set
	 */
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	

}
