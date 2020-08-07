package com.opl.retail.api.model.cibil;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opl.retail.api.utils.cibil.CibilUtils.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TelephoneTypeRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3470045296913007764L;

	private TelephoneTypeEnum typeEnum;
	private String value;

	public TelephoneTypeEnum getTypeEnum() {
		return typeEnum;
	}

	public void setTypeEnum(TelephoneTypeEnum typeEnum) {
		this.typeEnum = typeEnum;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
