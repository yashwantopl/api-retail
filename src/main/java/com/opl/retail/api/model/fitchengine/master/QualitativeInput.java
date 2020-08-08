package com.opl.retail.api.model.fitchengine.master;

public class QualitativeInput {

	private Long id;

	private String value = " ";
	
	private Double weight=0.0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
}
