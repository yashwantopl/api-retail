package com.opl.retail.api.model.oneform;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndustrySectorSubSectorTeaserRequest {
	
	List<Long> industryList;
	List<Long> sectorList;
	List<Long> subSectorList;
	public List<Long> getIndustryList() {
		return industryList;
	}
	public void setIndustryList(List<Long> industryList) {
		this.industryList = industryList;
	}
	public List<Long> getSectorList() {
		return sectorList;
	}
	public void setSectorList(List<Long> sectorList) {
		this.sectorList = sectorList;
	}
	public List<Long> getSubSectorList() {
		return subSectorList;
	}
	public void setSubSectorList(List<Long> subSectorList) {
		this.subSectorList = subSectorList;
	}
	
	
	

}
