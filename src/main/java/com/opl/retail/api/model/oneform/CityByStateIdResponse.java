package com.opl.retail.api.model.oneform;

import java.util.List;

import com.opl.retail.api.model.oneform.MasterResponse;

/**
 * @author Sanket
 *
 */
public class CityByStateIdResponse {
	
	private MasterResponse stateId;

	private List<MasterResponse> cityIdList;

	public MasterResponse getStateId() {
		return stateId;
	}

	public List<MasterResponse> getCityIdList() {
		return cityIdList;
	}

	public void setStateId(MasterResponse stateId) {
		this.stateId = stateId;
	}

	public void setCityIdList(List<MasterResponse> cityIdList) {
		this.cityIdList = cityIdList;
	}
	
	

}
