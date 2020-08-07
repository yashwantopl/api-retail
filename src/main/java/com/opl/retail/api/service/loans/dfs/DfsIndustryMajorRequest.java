package com.opl.retail.api.service.loans.dfs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DfsIndustryMajorRequest implements Serializable{

	private static final long serialVersionUID = 5672340182165958402L;

	private Long id;
	
	private String name;
	
	private String code;
	
	private String adminName;
	
	private String mobile;
	
	private String email;
	
	private String gstNumber;
	
	private Double creditPeriodMaxLimitYear;
	
	private Double creditPeriodMaxLimitMonth;
	
	private Double loanAmount;
	
	private Double adhocLimit;
	
	private Boolean isSecurity;
	
	private BigDecimal collateralPercentage;
	
	private String rmBank;
	
	private String rmMobile;
	
	private String rmEmail;
	
	private Boolean isActive;
	
	private Long userOrganizatinId;
	
	private Long createdBy;
	
	private Date createdDateTime;
	
	private Long modifiedBy;
	
	private Date modifiedDateTime;
	
	private Long businessTypeId;

	private Long userOrgId;
	
	private Object workflowData;
	
	private Long jobId;
	
	private Boolean isProposalActive;
	 
	private Boolean isSendBack;
	
	private Boolean isGst;
	
	private Boolean status;
	
	private String reason;
	
	private String loanAmountStr;
	
	private String creditPeriodMaxLimitYearStr;
	
	private String adhocLimitStr;
	
	private String collateralPercentageStr;
	
	private Boolean bulkUpload;
	
	public Boolean getIsGst() {
		return isGst;
	}

	public void setIsGst(Boolean isGst) {
		this.isGst = isGst;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public Double getCreditPeriodMaxLimitYear() {
		return creditPeriodMaxLimitYear;
	}

	public void setCreditPeriodMaxLimitYear(Double creditPeriodMaxLimitYear) {
		this.creditPeriodMaxLimitYear = creditPeriodMaxLimitYear;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getAdhocLimit() {
		return adhocLimit;
	}

	public void setAdhocLimit(Double adhocLimit) {
		this.adhocLimit = adhocLimit;
	}

	public Boolean getIsSecurity() {
		return isSecurity;
	}

	public void setIsSecurity(Boolean isSecurity) {
		this.isSecurity = isSecurity;
	}

	public BigDecimal getCollateralPercentage() {
		return collateralPercentage;
	}

	public void setCollateralPercentage(BigDecimal collateralPercentage) {
		this.collateralPercentage = collateralPercentage;
	}

	public String getRmBank() {
		return rmBank;
	}

	public void setRmBank(String rmBank) {
		this.rmBank = rmBank;
	}

	public String getRmMobile() {
		return rmMobile;
	}

	public void setRmMobile(String rmMobile) {
		this.rmMobile = rmMobile;
	}

	public String getRmEmail() {
		return rmEmail;
	}

	public void setRmEmail(String rmEmail) {
		this.rmEmail = rmEmail;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Long getUserOrganizatinId() {
		return userOrganizatinId;
	}

	public void setUserOrganizatinId(Long userOrganizatinId) {
		this.userOrganizatinId = userOrganizatinId;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Date modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DfsIndustryMajor [id=" + id + ", name=" + name + ", code=" + code + ", adminName=" + adminName
				+ ", mobile=" + mobile + ", email=" + email + ", gstNumber=" + gstNumber + ", creditPeriodMaxLimitYear="
				+ creditPeriodMaxLimitYear + ", loanAmount=" + loanAmount + ", adhocLimit=" + adhocLimit + ", isSecurity="
				+ isSecurity + ", collateralPercentage=" + collateralPercentage + ", rmBank=" + rmBank + ", rmMobile="
				+ rmMobile + ", rmEmail=" + rmEmail + ", isActive=" + isActive + ", userOrganizatinId="
				+ userOrganizatinId + ", createdBy=" + createdBy + ", createdDateTime=" + createdDateTime
				+ ", modifiedBy=" + modifiedBy + ", modifiedDateTime=" + modifiedDateTime + ", creditPeriodMaxLimitMonth=" + creditPeriodMaxLimitMonth 
				+ ", status=" + status + ", reason=" + reason
				+ ", isGst="+ isGst + "]";
	}

	public Long getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public Long getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Long userOrgId) {
		this.userOrgId = userOrgId;
	}

	public Object getWorkflowData() {
		return workflowData;
	}

	public void setWorkflowData(Object workflowData) {
		this.workflowData = workflowData;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Boolean getIsProposalActive() {
		return isProposalActive;
	}

	public void setIsProposalActive(Boolean isProposalActive) {
		this.isProposalActive = isProposalActive;
	}

	public Boolean getIsSendBack() {
		return isSendBack;
	}

	public void setIsSendBack(Boolean isSendBack) {
		this.isSendBack = isSendBack;
	}

	public Double getCreditPeriodMaxLimitMonth() {
		return creditPeriodMaxLimitMonth;
	}

	public void setCreditPeriodMaxLimitMonth(Double creditPeriodMaxLimitMonth) {
		this.creditPeriodMaxLimitMonth = creditPeriodMaxLimitMonth;
	}

	public DfsIndustryMajorRequest(Long id) {
		super();
		this.id = id;
	}

	public DfsIndustryMajorRequest() {
		// TODO Auto-generated constructor stub
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLoanAmountStr() {
		return loanAmountStr;
	}

	public void setLoanAmountStr(String loanAmountStr) {
		this.loanAmountStr = loanAmountStr;
	}

	public String getCreditPeriodMaxLimitYearStr() {
		return creditPeriodMaxLimitYearStr;
	}

	public void setCreditPeriodMaxLimitYearStr(String creditPeriodMaxLimitYearStr) {
		this.creditPeriodMaxLimitYearStr = creditPeriodMaxLimitYearStr;
	}

	public String getAdhocLimitStr() {
		return adhocLimitStr;
	}

	public void setAdhocLimitStr(String adhocLimitStr) {
		this.adhocLimitStr = adhocLimitStr;
	}

	public String getCollateralPercentageStr() {
		return collateralPercentageStr;
	}

	public void setCollateralPercentageStr(String collateralPercentageStr) {
		this.collateralPercentageStr = collateralPercentageStr;
	}

	public Boolean getBulkUpload() {
		return bulkUpload;
	}

	public void setBulkUpload(Boolean bulkUpload) {
		this.bulkUpload = bulkUpload;
	}
	
	

}
