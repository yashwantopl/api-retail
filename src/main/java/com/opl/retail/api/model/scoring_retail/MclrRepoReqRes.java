package com.opl.retail.api.model.scoring_retail;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MclrRepoReqRes  implements Serializable {

    private static final long serialVersionUID = -93321449016462267L;

    Long id;

    Double mclr;
    
    Double repo;

//    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    Date effectiveFromDate;

//    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd MMMM yyyy hh:mm aaa")
    Date effectiveTillDate;

    Integer status;

    Long jobId;

    Long orgId;

    Object workFlowData;

    List<Long> roleIds;

    Long userId;

    Integer scoringModelBasedOn;

    private Long createdBy;

    private Long modifiedBy;

    private Boolean isApproved;

    private Boolean isEdit;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date approvedDate;
    
    private Date createdDate;
    
    private Date modifiedDate;

    private Integer businessTypeId;
    
    private List<RoiRange> roiRanges;
    
    private Long oldMclrId;
    
    private String reason;
    
    private MclrRepoReqRes oldMclrRepo;
    
    private Long oldRepoId;
    
    private List<String> actionTakenBy;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMclr() {
        return mclr;
    }

    public void setMclr(Double mclr) {
        this.mclr = mclr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Object getWorkFlowData() {
        return workFlowData;
    }

    public void setWorkFlowData(Object workFlowData) {
        this.workFlowData = workFlowData;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean approved) {
        isApproved = approved;
    }

    public Boolean getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Boolean edit) {
        isEdit = edit;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(Integer businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public Integer getScoringModelBasedOn() {
        return scoringModelBasedOn;
    }

    public void setScoringModelBasedOn(Integer scoringModelBasedOn) {
        this.scoringModelBasedOn = scoringModelBasedOn;
    }

	public List<RoiRange> getRoiRanges() {
		return roiRanges;
	}

	public void setRoiRanges(List<RoiRange> roiRanges) {
		this.roiRanges = roiRanges;
	}

	public Date getEffectiveFromDate() {
		return effectiveFromDate;
	}

	public void setEffectiveFromDate(Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public Date getEffectiveTillDate() {
		return effectiveTillDate;
	}

	public void setEffectiveTillDate(Date effectiveTillDate) {
		this.effectiveTillDate = effectiveTillDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getOldMclrId() {
		return oldMclrId;
	}

	public void setOldMclrId(Long oldMclrId) {
		this.oldMclrId = oldMclrId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<String> getActionTakenBy() {
		return actionTakenBy;
	}

	public void setActionTakenBy(List<String> actionTakenBy) {
		this.actionTakenBy = actionTakenBy;
	}

	public MclrRepoReqRes getOldMclrRepo() {
		return oldMclrRepo;
	}

	public void setOldMclrRepo(MclrRepoReqRes oldMclrRepo) {
		this.oldMclrRepo = oldMclrRepo;
	}

	public Double getRepo() {
		return repo;
	}

	public void setRepo(Double repo) {
		this.repo = repo;
	}

	public Long getOldRepoId() {
		return oldRepoId;
	}

	public void setOldRepoId(Long oldRepoId) {
		this.oldRepoId = oldRepoId;
	}
    
	
    
}
