package com.opl.retail.api.model.loans.CAM;

import java.util.Date;
 

/**
 * @Author : Maaz Shaikh
 * Time :  6:22:00 pm
 **/
public class ReportsPrimarySubIndexRequest implements Comparable<ReportsPrimarySubIndexRequest>{
	
	
private static final long serialVersionUID = 1L;
	
    private Long id;

    private String subHeading;
	
    private Boolean isActive;
    
    private Integer indexNumber;
	
    private Date createdDate;
	
    private Long createdBy;
	
    private Date modifiedDate;
	
    private Long modifiedBy;

    private ReportsMasterIndexRequest master;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(Integer indexNumber) {
		this.indexNumber = indexNumber;
	}

	public String getSubHeading() {
		return subHeading;
	}

	public void setSubHeading(String subHeading) {
		this.subHeading = subHeading;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public ReportsMasterIndexRequest getMaster() {
		return master;
	}

	public void setMaster(ReportsMasterIndexRequest master) {
		this.master = master;
	}

	@Override
	public int compareTo(ReportsPrimarySubIndexRequest o2) {
		return this.indexNumber.compareTo(o2.getIndexNumber());
	}
	
	

}
