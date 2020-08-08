package com.opl.retail.api.model.ekyc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EkycAadharRequest extends EkycRequest {
	
	private static final long serialVersionUID = 1L;
	
	private String aadhaarId;
	private String dobValue;
	private String format;
	private String nameValue;
	private String matchingStrategy;
	
	/********************************V1 API REQUEST OBJECT************************************/
	private String name;
	@JsonProperty("aadhar_no")
	private String aadhaarNo;
	private String dob;
	private String pincode;
	private String state;
	
	/********************************V1 API REQUEST OBJECT************************************/
	
	/**
	 * @return the aadhaarId
	 */
	public String getAadhaarId() {
		return aadhaarId;
	}
	/**
	 * @param aadhaarId the aadhaarId to set
	 */
	public void setAadhaarId(String aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	/**
	 * @return the dobValue
	 */
	public String getDobValue() {
		return dobValue;
	}
	/**
	 * @param dobValue the dobValue to set
	 */
	public void setDobValue(String dobValue) {
		this.dobValue = dobValue;
	}
	
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the nameValue
	 */
	public String getNameValue() {
		return nameValue;
	}
	/**
	 * @param nameValue the nameValue to set
	 */
	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}
	/**
	 * @return the matchingStrategy
	 */
	public String getMatchingStrategy() {
		return matchingStrategy;
	}
	/**
	 * @param matchingStrategy the matchingStrategy to set
	 */
	public void setMatchingStrategy(String matchingStrategy) {
		this.matchingStrategy = matchingStrategy;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	/**
	 * @param aadhaarNo the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
