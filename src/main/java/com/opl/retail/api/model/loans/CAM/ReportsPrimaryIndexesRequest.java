package com.opl.retail.api.model.loans.CAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 

/**
 * @Author : Maaz Shaikh
 * Time :  11:58:01 AM
 **/
public class ReportsPrimaryIndexesRequest implements Comparable<ReportsPrimaryIndexesRequest>{
	
	private static final long serialVersionUID = 1L;
	
    private Long id;
	
	private ReportsMasterIndexRequest masterId;	

	private List<ReportsPrimarySubIndexRequest> subHeading;
	
    private String headingName;
	
    private Integer productId;
    
    private Integer indexNumber;
    
    private Boolean isActive;
	
    private Date createdDate;
	
    private Long createdBy;
	
    private Date modifiedDate;
	
    private Long modifiedBy;

    
    
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(Integer indexNumber) {
		this.indexNumber = indexNumber;
	}

	public List<ReportsPrimarySubIndexRequest> getSubHeading() {
		if(subHeading == null) {
			subHeading = new ArrayList<ReportsPrimarySubIndexRequest>();
		}
		return subHeading;
	}

	public void putSubHeading(ReportsPrimarySubIndexRequest subHeading) {
		if(subHeading != null) {
			if(this.subHeading == null) {
				this.subHeading = new ArrayList<ReportsPrimarySubIndexRequest>();
			}
			this.subHeading.add(subHeading);
		}
	}
	
	public void setSubHeading(List<ReportsPrimarySubIndexRequest> subHeading) {
		this.subHeading = subHeading;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ReportsMasterIndexRequest getMasterId() {
		return masterId;
	}

	public void setMasterId(ReportsMasterIndexRequest masterId) {
		this.masterId = masterId;
	}

	public String getHeadingName() {
		return headingName;
	}

	public void setHeadingName(String headingName) {
		this.headingName = headingName;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(ReportsPrimaryIndexesRequest o2) {
		return this.getIndexNumber().compareTo(o2.getIndexNumber());
	}
 
 

}
