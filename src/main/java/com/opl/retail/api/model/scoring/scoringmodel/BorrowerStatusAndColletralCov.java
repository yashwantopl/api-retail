/**
 * 
 */
package com.opl.retail.api.model.scoring.scoringmodel;

import java.util.List;

/**
 * @author sanket.devare
 *
 */
public class BorrowerStatusAndColletralCov {
	
	private List<BorrowerStatus> borrowerStatusList;
	private List<RiskGradingReqRes> colletralCoverageList;
	public List<BorrowerStatus> getBorrowerStatusList() {
		return borrowerStatusList;
	}
	public void setBorrowerStatusList(List<BorrowerStatus> borrowerStatusList) {
		this.borrowerStatusList = borrowerStatusList;
	}
	public List<RiskGradingReqRes> getColletralCoverageList() {
		return colletralCoverageList;
	}
	public void setColletralCoverageList(List<RiskGradingReqRes> colletralCoverageList) {
		this.colletralCoverageList = colletralCoverageList;
	}
	
	

}
