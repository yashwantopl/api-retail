package com.opl.retail.api.model.pincode;

import java.io.Serializable;

/**
 * @author Sanket
 *
 */
public class PincodeMasterVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String pincode;
	private String city;
	private String state;
	private String country;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public PincodeMasterVO(Long id, String pincode, String city, String state, String country) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public PincodeMasterVO(){
		
	}
	
	
	
	
	
	
}
