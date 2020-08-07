/**
 * 
 */
package com.opl.retail.api.model.gst.yuva.response.gstr2acdn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.opl.retail.api.model.gst.yuva.response.gstr1summary.GSTDataResponse;

import java.io.Serializable;

/**
 * @author nilay
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class Gstr2ACdn  extends GSTDataResponse implements Serializable {
	
	
	private Cdn[] cdn;

	/**
	 * @return the cdn
	 */
	public Cdn[] getCdn() {
		return cdn;
	}

	/**
	 * @param cdn the cdn to set
	 */
	public void setCdn(Cdn[] cdn) {
		this.cdn = cdn;
	}

	public Gstr2ACdn() {
		this.cdn = new Cdn[0];
	}
}
