/**
 * 
 */
package com.opl.retail.api.model.gst.yuva.response.gstr2ab2b;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author nilay
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class B2b implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cfs;
	private String ctin;
	
	@JsonProperty("inv")
	private Inv[] inv;

	/**
	 * @return the cfs
	 */
	public String getCfs() {
		return cfs;
	}

	/**
	 * @param cfs the cfs to set
	 */
	public void setCfs(String cfs) {
		this.cfs = cfs;
	}

	/**
	 * @return the ctin
	 */
	public String getCtin() {
		return ctin;
	}

	/**
	 * @param ctin the ctin to set
	 */
	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	/**
	 * @return the inv
	 */
	public Inv[] getInv() {
		return inv;
	}

	/**
	 * @param inv the inv to set
	 */
	public void setInv(Inv[] inv) {
		this.inv = inv;
	}

	public B2b() {
		this.cfs = "";
		this.ctin = "";
		this.inv = new Inv[0];
	}
}
