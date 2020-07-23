package com.opl.retail.api.model.oneform;

import java.util.List;

import com.opl.retail.api.model.oneform.MasterResponse;

/**
 * @author Sanket
 *
 */
public class StateByCountryIdResponse {
	
	private MasterResponse countryId;

	private List<MasterResponse> stateIdList;

	public MasterResponse getCountryId() {
		return countryId;
	}

	public List<MasterResponse> getStateIdList() {
		return stateIdList;
	}

	public void setCountryId(MasterResponse countryId) {
		this.countryId = countryId;
	}

	public void setStateIdList(List<MasterResponse> stateIdList) {
		this.stateIdList = stateIdList;
	}
	
	

}
