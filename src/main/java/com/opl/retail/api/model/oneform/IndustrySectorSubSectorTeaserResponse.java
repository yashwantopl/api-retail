package com.opl.retail.api.model.oneform;

import java.util.List;

import com.opl.retail.api.model.oneform.MasterResponse;

public class IndustrySectorSubSectorTeaserResponse {
	MasterResponse industry;

	MasterResponse sector;
	private List<MasterResponse> subSectorList;
	public MasterResponse getIndustry() {
		return industry;
	}
	public void setIndustry(MasterResponse industry) {
		this.industry = industry;
	}
	public MasterResponse getSector() {
		return sector;
	}
	public void setSector(MasterResponse sector) {
		this.sector = sector;
	}
	public List<MasterResponse> getSubSectorList() {
		return subSectorList;
	}
	public void setSubSectorList(List<MasterResponse> subSectorList) {
		this.subSectorList = subSectorList;
	}
		
}
