/**
 * 
 */
package com.opl.retail.api.model.eligibility;

/**
 * @author sanket
 *
 */
public class MultiGstList {
	
	private Long applicationId;
	
	private String gstin;
	
	private Boolean isGstNotApplicable;
	
	private String pan;

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

	/**
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}

	/**
	 * @param gstin the gstin to set
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	/**
	 * @return the isGstNotApplicable
	 */
	public Boolean getIsGstNotApplicable() {
		return isGstNotApplicable;
	}

	/**
	 * @param isGstNotApplicable the isGstNotApplicable to set
	 */
	public void setIsGstNotApplicable(Boolean isGstNotApplicable) {
		this.isGstNotApplicable = isGstNotApplicable;
	}

	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 * @param applicationId
	 * @param gstin
	 * @param isGstNotApplicable
	 * @param pan
	 */
	public MultiGstList(Long applicationId, String gstin, String pan, Boolean isGstNotApplicable) {
		super();
		this.applicationId = applicationId;
		this.gstin = gstin;
		this.isGstNotApplicable = isGstNotApplicable;
		this.pan = pan;
	}
	
	
	

}
