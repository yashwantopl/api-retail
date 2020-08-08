package com.opl.retail.api.model.bodmas;

public class BodmasResponse {

	
	private String message;
	private Integer status;
	private Object data;
	
	
	public BodmasResponse() {
	}
		
	public BodmasResponse(String message, Integer status) {
		this.message = message;
		this.status = status;
	}
	
	public BodmasResponse(String message, Integer status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	
}
