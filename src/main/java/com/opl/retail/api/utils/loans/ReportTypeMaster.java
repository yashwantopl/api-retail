package com.opl.retail.api.utils.loans;
/**
 * @Author : Maaz Shaikh
 * Time :  6:07:36 pm
 **/
public enum ReportTypeMaster {
	
	PRIMARY_CAM_REPORT(1,"Primary Cam report"),
	FINAL_CAM_REPORT(2,"Final Cam Report"),
	OFFLINE_CAM_REPORT(3,"Offline Cam Report"),
	PL_APPLICATION_FORM_REPORT(4,"Personal Loan Applicatino Form");
	
	Integer reportId;
	String reportName;
	
	private ReportTypeMaster(Integer reportId, String reportName) {
		this.reportId = reportId;
		this.reportName = reportName;
	}
	
	public Integer getReportId() {
		return this.reportId;
	}
	
	public String getReportName() {
		return this.reportName;
	}

}
