package com.opl.retail.api.model.fitchengine;

import com.opl.retail.api.model.fitchengine.manufacturing.FitchOutputManu;
import com.opl.retail.api.model.fitchengine.service.FitchOutputServ;
import com.opl.retail.api.model.fitchengine.trading.FitchOutputTrad;

public class FitchResponse {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long id;

	private Integer status;

	private String message;

	private FitchOutputManu fitchOutputManu;
	
	private FitchOutputServ fitchOutputServ;
	
	private FitchOutputTrad fitchOutputTrad;
	

	public FitchOutputTrad getFitchOutputTrad() {
		return fitchOutputTrad;
	}

	public void setFitchOutputTrad(FitchOutputTrad fitchOutputTrad) {
		this.fitchOutputTrad = fitchOutputTrad;
	}

	public FitchResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FitchResponse(String message,Integer status) {
		super();
		this.status = status;
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public FitchOutputManu getFitchOutputManu() {
		return fitchOutputManu;
	}

	public void setFitchOutputManu(FitchOutputManu fitchOutputManu) {
		this.fitchOutputManu = fitchOutputManu;
	}

	public FitchOutputServ getFitchOutputServ() {
		return fitchOutputServ;
	}

	public void setFitchOutputServ(FitchOutputServ fitchOutputServ) {
		this.fitchOutputServ = fitchOutputServ;
	}
	
}