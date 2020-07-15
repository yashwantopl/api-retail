package com.opl.retail.api.model.scoring;

import java.util.List;
import java.util.Map;

import com.opl.retail.api.model.scoring.scoringmodel.ScoreParameterNTBRequest;

public class ScoringRequest {

	private List<FundSeekerInputRequest> dataList;
	
	private Long scoringModelId;
	
	private Long fsDigit;

	private Long fpProductId;

	private Long applicationId;
	
	private Long coAppId;
	
	private Long loanPurposeModelId;

	private Long directorId;

	private Long businessTypeId;

	private Integer financialTypeId;

	private Long userId;

	private Integer versionId;

	private Double eligibleLoanAmountCircular;
	
	private Map<String, Object> map = null;

	private Double eligibleTenure;

	private Double emi;

	private Double foir;

	private ScoringParameterRequest scoringParameterRequest;

	private ScoreParameterNTBRequest scoreParameterNTBRequest;

	private ScoreParameterRetailRequest scoreParameterRetailRequest;

	private ScoreParameterMFIRequest scoreParameterMFIRequest ;

	private Boolean isTestingApiCall=false;

	private Boolean isMatchesCall=false;

	Integer minBankRelationshipInMonths;

	private Integer accountType;
	
	
	//LOGIC FOR CONCESSION RATE OF INTEREST
    private Boolean isBorrowersHavingAccounts;
    private  Boolean isBorrowersAvailingLoans;
    private Boolean isBorrowersHavingSalaryAccounts;
    private Boolean isBorrowersAvailingCreaditCards;
    private Boolean isWomenApplicant;
    private Boolean isBorrowersAvailingSpecificLoans;

    // ENDS HERE

    // LOGIC FOR CHECK OFF RELATED ISSUE
    private Boolean isCheckOffDirectPayEmi;
    private Boolean isCheckOffAgreetoPayOutstanding;
    private Boolean isCheckOffShiftSalAcc;
    private Boolean isCheckOffPayOutstndAmount;
    private Boolean isCheckOffNotChangeSalAcc;
    // ENDS HERE CHECK OFF
    
	// CIBIL BASED CONCESSION RATE  OF INTEREST
	private Boolean isCreaditHisotryGreaterSixMonths;  
	private Boolean isCreaditHisotryLessThenSixMonths;
	private Boolean isNoCreaditHistory;
	private Double cibilActualScore;
	private Double cibilActualScoreVersion2;
	// ENDS HERE 						
	
	private List<String> loanTypeList;
	
	private String cmrScore;
	
	private Double assetCoverage;

	
	//LOGIC FOR {CONCESSION_PF}::::::::::::: 
    private Boolean isBorrowersHavingAccountsConcessPf;
    private  Boolean isBorrowersAvailingLoansConcessPf;
    private Boolean isBorrowersHavingSalaryAccountsConcessPf;
    private Boolean isBorrowersAvailingCreaditCardsConcessPf;
    private Boolean isWomenApplicantConcessPf;
    
    private Boolean isBorrowersAvailingSpecificLoansConcessPf;

    // ENDS HERE

    // LOGIC FOR CHECK OFF RELATED ISSUE
    private Boolean isCheckOffDirectPayEmiConcessPf;
    private Boolean isCheckOffAgreetoPayOutstandingConcessPf;
    private Boolean isCheckOffShiftSalAccConcessPf;
    private Boolean isCheckOffPayOutstndAmountConcessPf;
    private Boolean isCheckOffNotChangeSalAccConcessPf;
    // ENDS HERE CHECK OFF
    
	// CIBIL BASED CONCESSION RATE  OF INTEREST
	private Boolean isCreaditHisotryGreaterSixMonthsConcessPf;  
	private Boolean isCreaditHisotryLessThenSixMonthsConcessPf;
	private Boolean isNoCreaditHistoryConcessPf;
	// ENDS HERE 						
	private List<String> loanTypeListConcessPf;
	
	
	
	
	
	public Boolean getIsBorrowersAvailingSpecificLoans() {
		return isBorrowersAvailingSpecificLoans;
	}

	public void setIsBorrowersAvailingSpecificLoans(Boolean isBorrowersAvailingSpecificLoans) {
		this.isBorrowersAvailingSpecificLoans = isBorrowersAvailingSpecificLoans;
	}

	public Boolean getIsBorrowersHavingAccountsConcessPf() {
		return isBorrowersHavingAccountsConcessPf;
	}

	public void setIsBorrowersHavingAccountsConcessPf(Boolean isBorrowersHavingAccountsConcessPf) {
		this.isBorrowersHavingAccountsConcessPf = isBorrowersHavingAccountsConcessPf;
	}

	public Boolean getIsBorrowersAvailingLoansConcessPf() {
		return isBorrowersAvailingLoansConcessPf;
	}

	public void setIsBorrowersAvailingLoansConcessPf(Boolean isBorrowersAvailingLoansConcessPf) {
		this.isBorrowersAvailingLoansConcessPf = isBorrowersAvailingLoansConcessPf;
	}

	public Boolean getIsBorrowersHavingSalaryAccountsConcessPf() {
		return isBorrowersHavingSalaryAccountsConcessPf;
	}

	public void setIsBorrowersHavingSalaryAccountsConcessPf(Boolean isBorrowersHavingSalaryAccountsConcessPf) {
		this.isBorrowersHavingSalaryAccountsConcessPf = isBorrowersHavingSalaryAccountsConcessPf;
	}

	public Boolean getIsBorrowersAvailingCreaditCardsConcessPf() {
		return isBorrowersAvailingCreaditCardsConcessPf;
	}

	public void setIsBorrowersAvailingCreaditCardsConcessPf(Boolean isBorrowersAvailingCreaditCardsConcessPf) {
		this.isBorrowersAvailingCreaditCardsConcessPf = isBorrowersAvailingCreaditCardsConcessPf;
	}

	public Boolean getIsWomenApplicantConcessPf() {
		return isWomenApplicantConcessPf;
	}

	public void setIsWomenApplicantConcessPf(Boolean isWomenApplicantConcessPf) {
		this.isWomenApplicantConcessPf = isWomenApplicantConcessPf;
	}

	public Boolean getIsBorrowersAvailingSpecificLoansConcessPf() {
		return isBorrowersAvailingSpecificLoansConcessPf;
	}

	public void setIsBorrowersAvailingSpecificLoansConcessPf(Boolean isBorrowersAvailingSpecificLoansConcessPf) {
		this.isBorrowersAvailingSpecificLoansConcessPf = isBorrowersAvailingSpecificLoansConcessPf;
	}

	public Boolean getIsCheckOffDirectPayEmiConcessPf() {
		return isCheckOffDirectPayEmiConcessPf;
	}

	public void setIsCheckOffDirectPayEmiConcessPf(Boolean isCheckOffDirectPayEmiConcessPf) {
		this.isCheckOffDirectPayEmiConcessPf = isCheckOffDirectPayEmiConcessPf;
	}

	public Boolean getIsCheckOffAgreetoPayOutstandingConcessPf() {
		return isCheckOffAgreetoPayOutstandingConcessPf;
	}

	public void setIsCheckOffAgreetoPayOutstandingConcessPf(Boolean isCheckOffAgreetoPayOutstandingConcessPf) {
		this.isCheckOffAgreetoPayOutstandingConcessPf = isCheckOffAgreetoPayOutstandingConcessPf;
	}

	public Boolean getIsCheckOffShiftSalAccConcessPf() {
		return isCheckOffShiftSalAccConcessPf;
	}

	public void setIsCheckOffShiftSalAccConcessPf(Boolean isCheckOffShiftSalAccConcessPf) {
		this.isCheckOffShiftSalAccConcessPf = isCheckOffShiftSalAccConcessPf;
	}

	public Boolean getIsCheckOffPayOutstndAmountConcessPf() {
		return isCheckOffPayOutstndAmountConcessPf;
	}

	public void setIsCheckOffPayOutstndAmountConcessPf(Boolean isCheckOffPayOutstndAmountConcessPf) {
		this.isCheckOffPayOutstndAmountConcessPf = isCheckOffPayOutstndAmountConcessPf;
	}

	public Boolean getIsCheckOffNotChangeSalAccConcessPf() {
		return isCheckOffNotChangeSalAccConcessPf;
	}

	public void setIsCheckOffNotChangeSalAccConcessPf(Boolean isCheckOffNotChangeSalAccConcessPf) {
		this.isCheckOffNotChangeSalAccConcessPf = isCheckOffNotChangeSalAccConcessPf;
	}

	public Boolean getIsCreaditHisotryGreaterSixMonthsConcessPf() {
		return isCreaditHisotryGreaterSixMonthsConcessPf;
	}

	public void setIsCreaditHisotryGreaterSixMonthsConcessPf(Boolean isCreaditHisotryGreaterSixMonthsConcessPf) {
		this.isCreaditHisotryGreaterSixMonthsConcessPf = isCreaditHisotryGreaterSixMonthsConcessPf;
	}

	public Boolean getIsCreaditHisotryLessThenSixMonthsConcessPf() {
		return isCreaditHisotryLessThenSixMonthsConcessPf;
	}

	public void setIsCreaditHisotryLessThenSixMonthsConcessPf(Boolean isCreaditHisotryLessThenSixMonthsConcessPf) {
		this.isCreaditHisotryLessThenSixMonthsConcessPf = isCreaditHisotryLessThenSixMonthsConcessPf;
	}

	public Boolean getIsNoCreaditHistoryConcessPf() {
		return isNoCreaditHistoryConcessPf;
	}

	public void setIsNoCreaditHistoryConcessPf(Boolean isNoCreaditHistoryConcessPf) {
		this.isNoCreaditHistoryConcessPf = isNoCreaditHistoryConcessPf;
	}

	public List<String> getLoanTypeListConcessPf() {
		return loanTypeListConcessPf;
	}

	public void setLoanTypeListConcessPf(List<String> loanTypeListConcessPf) {
		this.loanTypeListConcessPf = loanTypeListConcessPf;
	}

	public Boolean getIsBorrowersHavingAccounts() {
		return isBorrowersHavingAccounts;
	}

	public Double getCibilActualScore() {
		return cibilActualScore;
	}

	public void setCibilActualScore(Double cibilActualScore) {
		this.cibilActualScore = cibilActualScore;
	}

	public Boolean getIsCreaditHisotryGreaterSixMonths() {
		return isCreaditHisotryGreaterSixMonths;
	}

	public void setIsCreaditHisotryGreaterSixMonths(Boolean isCreaditHisotryGreaterSixMonths) {
		this.isCreaditHisotryGreaterSixMonths = isCreaditHisotryGreaterSixMonths;
	}

	public Boolean getIsCreaditHisotryLessThenSixMonths() {
		return isCreaditHisotryLessThenSixMonths;
	}

	public void setIsCreaditHisotryLessThenSixMonths(Boolean isCreaditHisotryLessThenSixMonths) {
		this.isCreaditHisotryLessThenSixMonths = isCreaditHisotryLessThenSixMonths;
	}

	public Boolean getIsNoCreaditHistory() {
		return isNoCreaditHistory;
	}

	public void setIsNoCreaditHistory(Boolean isNoCreaditHistory) {
		this.isNoCreaditHistory = isNoCreaditHistory;
	}

	public Boolean getIsCheckOffDirectPayEmi() {
		return isCheckOffDirectPayEmi;
	}

	public void setIsCheckOffDirectPayEmi(Boolean isCheckOffDirectPayEmi) {
		this.isCheckOffDirectPayEmi = isCheckOffDirectPayEmi;
	}

	public Boolean getIsCheckOffAgreetoPayOutstanding() {
		return isCheckOffAgreetoPayOutstanding;
	}

	public void setIsCheckOffAgreetoPayOutstanding(Boolean isCheckOffAgreetoPayOutstanding) {
		this.isCheckOffAgreetoPayOutstanding = isCheckOffAgreetoPayOutstanding;
	}

	public Boolean getIsCheckOffShiftSalAcc() {
		return isCheckOffShiftSalAcc;
	}

	public void setIsCheckOffShiftSalAcc(Boolean isCheckOffShiftSalAcc) {
		this.isCheckOffShiftSalAcc = isCheckOffShiftSalAcc;
	}

	public Boolean getIsCheckOffPayOutstndAmount() {
		return isCheckOffPayOutstndAmount;
	}

	public void setIsCheckOffPayOutstndAmount(Boolean isCheckOffPayOutstndAmount) {
		this.isCheckOffPayOutstndAmount = isCheckOffPayOutstndAmount;
	}

	public Boolean getIsCheckOffNotChangeSalAcc() {
		return isCheckOffNotChangeSalAcc;
	}

	public void setIsCheckOffNotChangeSalAcc(Boolean isCheckOffNotChangeSalAcc) {
		this.isCheckOffNotChangeSalAcc = isCheckOffNotChangeSalAcc;
	}

	public void setIsBorrowersHavingAccounts(Boolean isBorrowersHavingAccounts) {
		this.isBorrowersHavingAccounts = isBorrowersHavingAccounts;
	}

	public Boolean getIsBorrowersAvailingLoans() {
		return isBorrowersAvailingLoans;
	}

	public void setIsBorrowersAvailingLoans(Boolean isBorrowersAvailingLoans) {
		this.isBorrowersAvailingLoans = isBorrowersAvailingLoans;
	}

	public Boolean getIsBorrowersHavingSalaryAccounts() {
		return isBorrowersHavingSalaryAccounts;
	}

	public void setIsBorrowersHavingSalaryAccounts(Boolean isBorrowersHavingSalaryAccounts) {
		this.isBorrowersHavingSalaryAccounts = isBorrowersHavingSalaryAccounts;
	}

	public Boolean getIsBorrowersAvailingCreaditCards() {
		return isBorrowersAvailingCreaditCards;
	}

	public void setIsBorrowersAvailingCreaditCards(Boolean isBorrowersAvailingCreaditCards) {
		this.isBorrowersAvailingCreaditCards = isBorrowersAvailingCreaditCards;
	}

	public Boolean getIsMatchesCall() {
		return isMatchesCall;
	}

	public void setIsMatchesCall(Boolean matchesCall) {
		isMatchesCall = matchesCall;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public ScoreParameterRetailRequest getScoreParameterRetailRequest() {
		return scoreParameterRetailRequest;
	}

	public void setScoreParameterRetailRequest(ScoreParameterRetailRequest scoreParameterRetailRequest) {
		this.scoreParameterRetailRequest = scoreParameterRetailRequest;
	}

	public Boolean getTestingApiCall() {
		return isTestingApiCall;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setTestingApiCall(Boolean testingApiCall) {
		isTestingApiCall = testingApiCall;
	}


	public ScoreParameterNTBRequest getScoreParameterNTBRequest() {
		return scoreParameterNTBRequest;
	}

	public void setScoreParameterNTBRequest(ScoreParameterNTBRequest scoreParameterNTBRequest) {
		this.scoreParameterNTBRequest = scoreParameterNTBRequest;
	}

	public Integer getFinancialTypeId() {
		return financialTypeId;
	}

	public void setFinancialTypeId(Integer financialTypeId) {
		this.financialTypeId = financialTypeId;
	}

	public Double getEligibleLoanAmountCircular() {
		return eligibleLoanAmountCircular;
	}

	public void setEligibleLoanAmountCircular(Double eligibleLoanAmountCircular) {
		this.eligibleLoanAmountCircular = eligibleLoanAmountCircular;
	}

	public Long getDirectorId() {
		return directorId;
	}

	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}

	public ScoringParameterRequest getScoringParameterRequest() {
		return scoringParameterRequest;
	}

	public void setScoringParameterRequest(ScoringParameterRequest scoringParameterRequest) {
		this.scoringParameterRequest = scoringParameterRequest;
	}

	public List<FundSeekerInputRequest> getDataList() {
		return dataList;
	}


	public Long getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public void setDataList(List<FundSeekerInputRequest> dataList) {
		this.dataList = dataList;
	}

	public Long getScoringModelId() {
		return scoringModelId;
	}

	public void setScoringModelId(Long scoringModelId) {
		this.scoringModelId = scoringModelId;
	}

	public Long getFsDigit() {
		return fsDigit;
	}

	public void setFsDigit(Long fsDigit) {
		this.fsDigit = fsDigit;
	}

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Long getLoanPurposeModelId() {
		return loanPurposeModelId;
	}

	public void setLoanPurposeModelId(Long loanPurposeModelId) {
		this.loanPurposeModelId = loanPurposeModelId;
	}

	public Long getCoAppId() {
		return coAppId;
	}

	public void setCoAppId(Long coAppId) {
		this.coAppId = coAppId;
	}

	public Boolean getIsWomenApplicant() {
		return isWomenApplicant;
	}

	public void setIsWomenApplicant(Boolean isWomenApplicant) {
		this.isWomenApplicant = isWomenApplicant;
	}

	public Double getEligibleTenure() {
		return eligibleTenure;
	}

	public void setEligibleTenure(Double eligibleTenure) {
		this.eligibleTenure = eligibleTenure;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Boolean getMatchesCall() {
		return isMatchesCall;
	}

	public void setMatchesCall(Boolean matchesCall) {
		isMatchesCall = matchesCall;
	}

	public Boolean getBorrowersHavingAccounts() {
		return isBorrowersHavingAccounts;
	}

	public void setBorrowersHavingAccounts(Boolean borrowersHavingAccounts) {
		isBorrowersHavingAccounts = borrowersHavingAccounts;
	}

	public Boolean getBorrowersAvailingLoans() {
		return isBorrowersAvailingLoans;
	}

	public void setBorrowersAvailingLoans(Boolean borrowersAvailingLoans) {
		isBorrowersAvailingLoans = borrowersAvailingLoans;
	}

	public Boolean getBorrowersHavingSalaryAccounts() {
		return isBorrowersHavingSalaryAccounts;
	}

	public void setBorrowersHavingSalaryAccounts(Boolean borrowersHavingSalaryAccounts) {
		isBorrowersHavingSalaryAccounts = borrowersHavingSalaryAccounts;
	}

	public Boolean getBorrowersAvailingCreaditCards() {
		return isBorrowersAvailingCreaditCards;
	}

	public void setBorrowersAvailingCreaditCards(Boolean borrowersAvailingCreaditCards) {
		isBorrowersAvailingCreaditCards = borrowersAvailingCreaditCards;
	}

	public Boolean getWomenApplicant() {
		return isWomenApplicant;
	}

	public void setWomenApplicant(Boolean womenApplicant) {
		isWomenApplicant = womenApplicant;
	}

	public Boolean getCheckOffDirectPayEmi() {
		return isCheckOffDirectPayEmi;
	}

	public void setCheckOffDirectPayEmi(Boolean checkOffDirectPayEmi) {
		isCheckOffDirectPayEmi = checkOffDirectPayEmi;
	}

	public Boolean getCheckOffAgreetoPayOutstanding() {
		return isCheckOffAgreetoPayOutstanding;
	}

	public void setCheckOffAgreetoPayOutstanding(Boolean checkOffAgreetoPayOutstanding) {
		isCheckOffAgreetoPayOutstanding = checkOffAgreetoPayOutstanding;
	}

	public Boolean getCheckOffShiftSalAcc() {
		return isCheckOffShiftSalAcc;
	}

	public void setCheckOffShiftSalAcc(Boolean checkOffShiftSalAcc) {
		isCheckOffShiftSalAcc = checkOffShiftSalAcc;
	}

	public Boolean getCheckOffPayOutstndAmount() {
		return isCheckOffPayOutstndAmount;
	}

	public void setCheckOffPayOutstndAmount(Boolean checkOffPayOutstndAmount) {
		isCheckOffPayOutstndAmount = checkOffPayOutstndAmount;
	}

	public Boolean getCheckOffNotChangeSalAcc() {
		return isCheckOffNotChangeSalAcc;
	}

	public void setCheckOffNotChangeSalAcc(Boolean checkOffNotChangeSalAcc) {
		isCheckOffNotChangeSalAcc = checkOffNotChangeSalAcc;

	}

	public Integer getMinBankRelationshipInMonths() {
		return minBankRelationshipInMonths;
	}

	public void setMinBankRelationshipInMonths(Integer minBankRelationshipInMonths) {
		this.minBankRelationshipInMonths = minBankRelationshipInMonths;
	}

	public ScoreParameterMFIRequest getScoreParameterMFIRequest() {
		return scoreParameterMFIRequest;
	}

	public void setScoreParameterMFIRequest(ScoreParameterMFIRequest scoreParameterMFIRequest) {
		this.scoreParameterMFIRequest = scoreParameterMFIRequest;
	}

	public Double getCibilActualScoreVersion2() {
		return cibilActualScoreVersion2;
	}

	public void setCibilActualScoreVersion2(Double cibilActualScoreVersion2) {
		this.cibilActualScoreVersion2 = cibilActualScoreVersion2;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Boolean getBorrowersAvailingSpecificLoans() {
		return isBorrowersAvailingSpecificLoans;
	}

	public void setBorrowersAvailingSpecificLoans(Boolean borrowersAvailingSpecificLoans) {
		isBorrowersAvailingSpecificLoans = borrowersAvailingSpecificLoans;
	}

	public List<String> getLoanTypeList() {
		return loanTypeList;
	}

	public void setLoanTypeList(List<String> loanTypeList) {
		this.loanTypeList = loanTypeList;
	}

	public String getCmrScore() {
		return cmrScore;
	}

	public void setCmrScore(String cmrScore) {
		this.cmrScore = cmrScore;
	}

	public Double getAssetCoverage() {
		return assetCoverage;
	}

	public void setAssetCoverage(Double assetCoverage) {
		this.assetCoverage = assetCoverage;
	}

	@Override
	public String toString() {
		return "ScoringRequest [dataList=" + dataList + ", scoringModelId=" + scoringModelId + ", fsDigit=" + fsDigit
				+ ", fpProductId=" + fpProductId + ", applicationId=" + applicationId + ", coAppId=" + coAppId
				+ ", loanPurposeModelId=" + loanPurposeModelId + ", directorId=" + directorId + ", businessTypeId="
				+ businessTypeId + ", financialTypeId=" + financialTypeId + ", userId=" + userId + ", versionId="
				+ versionId + ", eligibleLoanAmountCircular=" + eligibleLoanAmountCircular + ", map=" + map
				+ ", eligibleTenure=" + eligibleTenure + ", emi=" + emi + ", foir=" + foir
				+ ", scoringParameterRequest=" + scoringParameterRequest + ", scoreParameterNTBRequest="
				+ scoreParameterNTBRequest + ", scoreParameterRetailRequest=" + scoreParameterRetailRequest
				+ ", scoreParameterMFIRequest=" + scoreParameterMFIRequest + ", isTestingApiCall=" + isTestingApiCall
				+ ", isMatchesCall=" + isMatchesCall + ", minBankRelationshipInMonths=" + minBankRelationshipInMonths
				+ ", accountType=" + accountType + ", isBorrowersHavingAccounts=" + isBorrowersHavingAccounts
				+ ", isBorrowersAvailingLoans=" + isBorrowersAvailingLoans + ", isBorrowersHavingSalaryAccounts="
				+ isBorrowersHavingSalaryAccounts + ", isBorrowersAvailingCreaditCards="
				+ isBorrowersAvailingCreaditCards + ", isWomenApplicant=" + isWomenApplicant
				+ ", isBorrowersAvailingSpecificLoans=" + isBorrowersAvailingSpecificLoans + ", isCheckOffDirectPayEmi="
				+ isCheckOffDirectPayEmi + ", isCheckOffAgreetoPayOutstanding=" + isCheckOffAgreetoPayOutstanding
				+ ", isCheckOffShiftSalAcc=" + isCheckOffShiftSalAcc + ", isCheckOffPayOutstndAmount="
				+ isCheckOffPayOutstndAmount + ", isCheckOffNotChangeSalAcc=" + isCheckOffNotChangeSalAcc
				+ ", isCreaditHisotryGreaterSixMonths=" + isCreaditHisotryGreaterSixMonths
				+ ", isCreaditHisotryLessThenSixMonths=" + isCreaditHisotryLessThenSixMonths + ", isNoCreaditHistory="
				+ isNoCreaditHistory + ", cibilActualScore=" + cibilActualScore + ", cibilActualScoreVersion2="
				+ cibilActualScoreVersion2 + ", loanTypeList=" + loanTypeList + ", cmrScore=" + cmrScore
				+ ", assetCoverage=" + assetCoverage + ", isBorrowersHavingAccountsConcessPf="
				+ isBorrowersHavingAccountsConcessPf + ", isBorrowersAvailingLoansConcessPf="
				+ isBorrowersAvailingLoansConcessPf + ", isBorrowersHavingSalaryAccountsConcessPf="
				+ isBorrowersHavingSalaryAccountsConcessPf + ", isBorrowersAvailingCreaditCardsConcessPf="
				+ isBorrowersAvailingCreaditCardsConcessPf + ", isWomenApplicantConcessPf=" + isWomenApplicantConcessPf
				+ ", isBorrowersAvailingSpecificLoansConcessPf=" + isBorrowersAvailingSpecificLoansConcessPf
				+ ", isCheckOffDirectPayEmiConcessPf=" + isCheckOffDirectPayEmiConcessPf
				+ ", isCheckOffAgreetoPayOutstandingConcessPf=" + isCheckOffAgreetoPayOutstandingConcessPf
				+ ", isCheckOffShiftSalAccConcessPf=" + isCheckOffShiftSalAccConcessPf
				+ ", isCheckOffPayOutstndAmountConcessPf=" + isCheckOffPayOutstndAmountConcessPf
				+ ", isCheckOffNotChangeSalAccConcessPf=" + isCheckOffNotChangeSalAccConcessPf
				+ ", isCreaditHisotryGreaterSixMonthsConcessPf=" + isCreaditHisotryGreaterSixMonthsConcessPf
				+ ", isCreaditHisotryLessThenSixMonthsConcessPf=" + isCreaditHisotryLessThenSixMonthsConcessPf
				+ ", isNoCreaditHistoryConcessPf=" + isNoCreaditHistoryConcessPf + ", loanTypeListConcessPf="
				+ loanTypeListConcessPf + "]";
	}
	
	
}
