/**
 * 
 */
package com.opl.retail.api.model.gst.yuva.response.gstr2ab2b;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.opl.retail.api.model.gst.yuva.response.gstr1summary.GSTDataResponse;

import java.io.Serializable;

/**
 * @author nilay
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class Gstr2AB2b  extends GSTDataResponse implements Serializable  {
	
	@JsonProperty("b2b")
	private B2b[] b2b;

	/**
	 * @return the b2b
	 */
	public B2b[] getB2b() {
		return b2b;
	}

	/**
	 * @param b2b the b2b to set
	 */
	public void setB2b(B2b[] b2b) {
		this.b2b = b2b;
	}


	public Gstr2AB2b() {
		this.b2b = new B2b[0];
	}
}
