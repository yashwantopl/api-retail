package com.opl.retail.api.model.ekyc;

import java.io.Serializable;

public class EkycResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	private Integer hStatus;
	private Object data;
	private String privateData;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer gethStatus() {
		return hStatus;
	}
	public void sethStatus(Integer hStatus) {
		this.hStatus = hStatus;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	public String getPrivateData() {
		return privateData;
	}

	public void setPrivateData(String privateData) {
		this.privateData = privateData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param message
	 * @param hStatus
	 */
	public EkycResponse(String message, Integer hStatus) {
		super();
		this.message = message;
		this.hStatus = hStatus;
	}
	
	
	
	public EkycResponse(String message, Integer hStatus, Object data) {
		super();
		this.message = message;
		this.hStatus = hStatus;
		this.data = data;
	}
	public EkycResponse() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EkycResponse [message=" + message + ", hStatus=" + hStatus + "]";
	}

	
	

}
