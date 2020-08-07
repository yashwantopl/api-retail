package com.opl.retail.api.service.loans.dfs;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DfsDealerRequestResponse implements Serializable{

	private static final long serialVersionUID = -3462046308331535141L;

	private Long id;
	
	private DfsIndustryMajorRequest dfsImId;
	
	private String name;
	
	private String code;
	
	private String gstNumber;
	
	private String panNumber;
	
	private String mobile;
	
	private String email;
	
	private Boolean isActive;
	
	private Long createdBy;
	
	private Date createdDateTime;
	
	private Long modifiedBy;
	
	private Date modifiedDateTime;
	
	private String salesTurnover;
	   
    private String estimatedSales;
   
    private String recommendedLimit;
   
    private String year;
   
    private String month;
	
	private Long applicationId;
	
	private Object data;
	
	private List<?> listData = Collections.emptyList();
	
	private String success;
	
	private Long response_code;
	
	private String response_code_message;
	
	private Integer status;
	
	private String message;
	
	private byte[] contentInBytes;
	
	private Map<String ,Map<String, Object>> mapData;
	
	private Map map;
	
	private Boolean flag;
	
	private Double adhocLimit;
	
	private Long jobId;
	
	private Long businessTypeId;
	
	private Object workflowData;

	private Boolean isProposalActive;
	 
	private Boolean isSendBack;
	
	private Double associationImYear;
	
	private Double associationImMonth;
	
	private Long branchId;
	
	private Long nodelUserId;
	 
	private Integer assignedStatus;

	private Long roleId;
	
	private Long stateId;
	
	private Long cityId;
	
	private Boolean isBranchAssignedbyNodal;
	
	private Long dfsIndustyMajorId;
	
	private String adhocLimitStr;
	
	private String associationImYearStr;
	
	private String associationImMonthStr;
	
	private String dfsIMCode;
	
	private String creditPeriodDays;
	
	private Boolean processStatus;
	
	private String reason;
	
	private Boolean bulkUpload;
	
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Double getAssociationImYear() {
		return associationImYear;
	}

	public void setAssociationImYear(Double associationImYear) {
		this.associationImYear = associationImYear;
	}

	public Double getAssociationImMonth() {
		return associationImMonth;
	}

	public void setAssociationImMonth(Double associationImMonth) {
		this.associationImMonth = associationImMonth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DfsIndustryMajorRequest getDfsImId() {
		return dfsImId;
	}

	public void setDfsImId(DfsIndustryMajorRequest dfsImId) {
		this.dfsImId = dfsImId;
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

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
	
	public String getSalesTurnover() {
		return salesTurnover;
	}

	public void setSalesTurnover(String salesTurnover) {
		this.salesTurnover = salesTurnover;
	}

	public String getEstimatedSales() {
		return estimatedSales;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public void setEstimatedSales(String estimatedSales) {
		this.estimatedSales = estimatedSales;
	}

	public String getRecommendedLimit() {
		return recommendedLimit;
	}

	public void setRecommendedLimit(String recommendedLimit) {
		this.recommendedLimit = recommendedLimit;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<?> getListData() {
		return listData;
	}

	public void setListData(List<?> listData) {
		this.listData = listData;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getResponse_code() {
		return response_code;
	}

	public void setResponse_code(Long response_code) {
		this.response_code = response_code;
	}

	public String getResponse_code_message() {
		return response_code_message;
	}

	public void setResponse_code_message(String response_code_message) {
		this.response_code_message = response_code_message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public byte[] getContentInBytes() {
		return contentInBytes;
	}

	public void setContentInBytes(byte[] contentInBytes) {
		this.contentInBytes = contentInBytes;
	}

	public Map<String, Map<String, Object>> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, Map<String, Object>> mapData) {
		this.mapData = mapData;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public DfsDealerRequestResponse(String code, Object data, List<?> listData, String success, Long response_code,
			String response_code_message, Integer status) {
		super();
		this.code = code;
		this.data = data;
		this.listData = listData;
		this.success = success;
		this.response_code = response_code;
		this.response_code_message = response_code_message;
		this.status = status;
	}
	
	public DfsDealerRequestResponse(Long id,String message, Integer status) {
		super();
		this.id = id;
		this.status = status;
		this.message = message;
	}

	public DfsDealerRequestResponse(String message) {
		super();
		this.message = message;
	}
	
	public DfsDealerRequestResponse(String message, Integer status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public DfsDealerRequestResponse(String message, Integer status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}
	
	public DfsDealerRequestResponse(String message, Integer status, byte[] contentInBytes) {
		super();
		this.message = message;
		this.status = status;
		this.contentInBytes = contentInBytes;
	}
	
	public DfsDealerRequestResponse(String success, Object data, Long response_code, String response_code_message, String message) {
		super();
		this.success = success;
		this.data = data;
		this.response_code = response_code;
		this.message = message;
		this.response_code_message = response_code_message;
	}
	public DfsDealerRequestResponse(String success, Long response_code, String response_code_message, String message) {
		super();
		this.success = success;
		this.response_code = response_code;
		this.response_code_message = response_code_message;
		this.message = message;
	}
	

	public DfsDealerRequestResponse(Integer status, String message, Object data, Map<String, Object> map) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.map = map;
	}
	
	public DfsDealerRequestResponse(Integer status, String message, Map<String, Object> map) {
		super();
		this.status = status;
		this.message = message;
		this.map = map;
	}
	public DfsDealerRequestResponse(Integer status, String message,List listData) {
		super();
		this.status = status;
		this.message = message;
		this.listData = listData;
	}
	

	@Override
	public String toString() {
		return "DfsDealerRequest [id=" + id + ", dfsImId=" + dfsImId + ", name=" + name + ", code=" + code
				+ ", gstNumber=" + gstNumber + ", panNumber=" + panNumber + ", mobile=" + mobile + ", email=" + email
				+ ", isActive=" + isActive + ", createdBy=" + createdBy + ", createdDateTime=" + createdDateTime
				+ ", modifiedBy=" + modifiedBy + ", modifiedDateTime=" + modifiedDateTime + ", salesTurnover="
				+ salesTurnover + ", estimatedSales=" + estimatedSales + ", recommendedLimit=" + recommendedLimit
				+ ", year=" + year + ", month=" + month + ", applicationId=" + applicationId + "]";
	}

	 public DfsDealerRequestResponse() {
	        //constructor Code
	    }

	public Double getAdhocLimit() {
		return adhocLimit;
	}

	public void setAdhocLimit(Double adhocLimit) {
		this.adhocLimit = adhocLimit;
	}

	public Long getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public Object getWorkflowData() {
		return workflowData;
	}

	public void setWorkflowData(Object workflowData) {
		this.workflowData = workflowData;
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

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Long getNodelUserId() {
		return nodelUserId;
	}

	public void setNodelUserId(Long nodelUserId) {
		this.nodelUserId = nodelUserId;
	}

	public Integer getAssignedStatus() {
		return assignedStatus;
	}

	public void setAssignedStatus(Integer assignedStatus) {
		this.assignedStatus = assignedStatus;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Boolean getIsBranchAssignedbyNodal() {
		return isBranchAssignedbyNodal;
	}

	public void setIsBranchAssignedbyNodal(Boolean isBranchAssignedbyNodal) {
		this.isBranchAssignedbyNodal = isBranchAssignedbyNodal;
	}

	public Long getDfsIndustyMajorId() {
		return dfsIndustyMajorId;
	}

	public void setDfsIndustyMajorId(Long dfsIndustyMajorId) {
		this.dfsIndustyMajorId = dfsIndustyMajorId;
	}

	public String getAdhocLimitStr() {
		return adhocLimitStr;
	}

	public void setAdhocLimitStr(String adhocLimitStr) {
		this.adhocLimitStr = adhocLimitStr;
	}

	public String getAssociationImMonthStr() {
		return associationImMonthStr;
	}

	public void setAssociationImMonthStr(String associationImMonthStr) {
		this.associationImMonthStr = associationImMonthStr;
	}

	public String getDfsIMCode() {
		return dfsIMCode;
	}

	public void setDfsIMCode(String dfsIMCode) {
		this.dfsIMCode = dfsIMCode;
	}

	public String getCreditPeriodDays() {
		return creditPeriodDays;
	}

	public void setCreditPeriodDays(String creditPeriodDays) {
		this.creditPeriodDays = creditPeriodDays;
	}

	public Boolean getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Boolean processStatus) {
		this.processStatus = processStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAssociationImYearStr() {
		return associationImYearStr;
	}

	public void setAssociationImYearStr(String associationImYearStr) {
		this.associationImYearStr = associationImYearStr;
	}

	public Boolean getBulkUpload() {
		return bulkUpload;
	}

	public void setBulkUpload(Boolean bulkUpload) {
		this.bulkUpload = bulkUpload;
	}
}
