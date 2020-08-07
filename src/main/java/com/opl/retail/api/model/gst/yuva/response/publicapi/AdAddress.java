package com.opl.retail.api.model.gst.yuva.response.publicapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanket
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class AdAddress {
	
	private Address addr;
	
	private List<String> ntr;

	/**
	 * @return the addr
	 */
	public Address getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	/**
	 * @return the ntr
	 */
	public List<String> getNtr() {
		return ntr;
	}

	/**
	 * @param ntr the ntr to set
	 */
	public void setNtr(List<String> ntr) {
		this.ntr = ntr;
	}


	public AdAddress() {
		this.addr = new Address();
		this.ntr = new ArrayList<>();
	}
}
