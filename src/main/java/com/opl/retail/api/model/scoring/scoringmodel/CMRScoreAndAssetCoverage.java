package com.opl.retail.api.model.scoring.scoringmodel;

import java.util.List;

public class CMRScoreAndAssetCoverage {

	private List<CMRSCore> cmrScoreList;
	private List<RiskGradingReqRes> assetCoverageList;
    
	public List<CMRSCore> getCmrScoreList() {
		return cmrScoreList;
	}
	public void setCmrScoreList(List<CMRSCore> cmrScoreList) {
		this.cmrScoreList = cmrScoreList;
	}
	public List<RiskGradingReqRes> getAssetCoverageList() {
		return assetCoverageList;
	}
	public void setAssetCoverageList(List<RiskGradingReqRes> assetCoverageList) {
		this.assetCoverageList = assetCoverageList;
	}
    
    
}
