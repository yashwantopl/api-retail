package com.opl.retail.api.model.eligibility;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MobileApiResponse implements Serializable{

private static final long serialVersionUID = 1L;
	
	private String success;
	private Object data;
	@JsonProperty("response_code")
	private Long responseCode;
	@JsonProperty("response_code_message")
	private String responseCodeMessage;
	private String message;
	
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Long getResponseCode() {
		return responseCode;
	}
	public String getResponseCodeMessage() {
		return responseCodeMessage;
	}
	public void setResponseCodeMessage(String responseCodeMessage) {
		this.responseCodeMessage = responseCodeMessage;
	}
	public void setResponseCode(Long responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MobileApiResponse(String success, Object data, Long responseCode, String responseCodeMessage, String message) {
		super();
		this.success = success;
		this.data = data;
		this.responseCode = responseCode;
		this.message = message;
		this.responseCodeMessage = responseCodeMessage;
	}
	public MobileApiResponse(String success, Long responseCode, String responseCodeMessage, String message) {
		super();
		this.success = success;
		this.responseCode = responseCode;
		this.responseCodeMessage = responseCodeMessage;
		this.message = message;
	}
	
	public MobileApiResponse() {
		super();
	}
}
