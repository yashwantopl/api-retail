/**
 * 
 */
package com.opl.retail.api.model.gst;

import java.util.List;

/**
 * @author nilay.darji
 *
 */
public class BifurcateByGstInType {
	
	private List<GstinDetailsResponse> regularGstList;
	
	private List<GstinDetailsResponse> compositionGstList;

	public List<GstinDetailsResponse> getRegularGstList() {
		return regularGstList;
	}

	public void setRegularGstList(List<GstinDetailsResponse> regularGstList) {
		this.regularGstList = regularGstList;
	}

	public List<GstinDetailsResponse> getCompositionGstList() {
		return compositionGstList;
	}

	public void setCompositionGstList(List<GstinDetailsResponse> compositionGstList) {
		this.compositionGstList = compositionGstList;
	}
}
