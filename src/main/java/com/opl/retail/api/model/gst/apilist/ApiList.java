
package com.opl.retail.api.model.gst.apilist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vijay.chauhan
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ApiList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("apilist")
	private List<Api> apilist = new ArrayList<>();

	@JsonProperty("apilist")
	public List<Api> getApilist() {
		return apilist;
	}

	@JsonProperty("apilist")
	public void setApilist(List<Api> apilist) {
		this.apilist = apilist;
	}

	
}
