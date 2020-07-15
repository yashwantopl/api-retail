package com.opl.retail.api.model.scoring.scoringmodel;

public class RiskGradingReqRes {

    private Long id;

    private Double minScore;

    private Double maxScore;
    
    private Double minSubScore;
    
    private Double maxSubScore;

    private Double scale;

    private String interpretation;

    private Double foir;

    private Double roi;

    private Double tenure;

    private Double pf;
    
    private Double minPf; // MINIMUM PROCESSING FEES
    private Double maxPf; // MAXIMUM PROCESSING FEES
    
    private Double ltv;
    private Double cibilConcessionRoi;
    private String cibilBankAccountText;
    private String cmrScore;
    private Double loanAmount;
    private String borrowerStatus;
    
    
    /*private Double creditHistoryGreterThenROI;
    private Double creditHistoryLessThenROI;
    private Double noCreditHistoryROI;
   */
    private Double cibilConcessionRoiConcessPf;
    
    private Double foirInRs;
    

	public Double getCibilConcessionRoiConcessPf() {
		return cibilConcessionRoiConcessPf;
	}

	public void setCibilConcessionRoiConcessPf(Double cibilConcessionRoiConcessPf) {
		this.cibilConcessionRoiConcessPf = cibilConcessionRoiConcessPf;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getCibilConcessionRoi() {
		return cibilConcessionRoi;
	}

	public void setCibilConcessionRoi(Double cibilConcessionRoi) {
		this.cibilConcessionRoi = cibilConcessionRoi;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMinScore() {
        return minScore;
    }

    public void setMinScore(Double minScore) {
        this.minScore = minScore;
    }

    public Double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public Double getFoir() {
        return foir;
    }

    public void setFoir(Double foir) {
        this.foir = foir;
    }

    public Double getRoi() {
        return roi;
    }

    public void setRoi(Double roi) {
        this.roi = roi;
    }

    public Double getTenure() {
        return tenure;
    }

    public void setTenure(Double tenure) {
        this.tenure = tenure;
    }

    public Double getPf() {
        return pf;
    }

    public void setPf(Double pf) {
        this.pf = pf;
    }

	public Double getLtv() {
		return ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	public Double getMinPf() {
		return minPf;
	}

	public void setMinPf(Double minPf) {
		this.minPf = minPf;
	}

	public Double getMaxPf() {
		return maxPf;
	}

	public void setMaxPf(Double maxPf) {
		this.maxPf = maxPf;
	}

	public Double getMinSubScore() {
		return minSubScore;
	}

	public void setMinSubScore(Double minSubScore) {
		this.minSubScore = minSubScore;
	}

	public Double getMaxSubScore() {
		return maxSubScore;
	}

	public void setMaxSubScore(Double maxSubScore) {
		this.maxSubScore = maxSubScore;
	}

    public String getCibilBankAccountText() {
        return cibilBankAccountText;
    }

    public void setCibilBankAccountText(String cibilBankAccountText) {
        this.cibilBankAccountText = cibilBankAccountText;
    }

	public String getCmrScore() {
		return cmrScore;
	}

	public void setCmrScore(String cmrScore) {
		this.cmrScore = cmrScore;
	}

	public Double getFoirInRs() {
		return foirInRs;
	}

	public void setFoirInRs(Double foirInRs) {
		this.foirInRs = foirInRs;
	}

	public String getBorrowerStatus() {
		return borrowerStatus;
	}

	public void setBorrowerStatus(String borrowerStatus) {
		this.borrowerStatus = borrowerStatus;
	}
	
	
}
