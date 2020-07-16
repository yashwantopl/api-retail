package com.opl.retail.api.utils.matches;

/**
 * @author rahul.meena
 *
 */
public enum MatchPersonalLoanDisplayEnum {
	
    LOAN_AMOUNT("LOAN_AMOUNT", "Loan amount"),
    GROSS_MONTHLY_INCOME("GROSS_MONTHLY_INCOME", "Gross monthly income"),
    NET_MONTHLY_INCOME("NET_MONTHLY_INCOME", "Net monthly income"),
    AGE_OF_APPLICANT("AGE_OF_APPLICANT", "Age of applicant"),
    TENURE("TENURE", "Tenure"),
    GEOGRAPHICAL_MARKET_FOCUS("GEOGRAPHICAL_MARKET_FOCUS", "Geographical market focus"),
    MINIMUM_BUREAU_SCORE("MINIMUM_BUREAU_SCORE", "Minimum bureau score"),
    BUREAU_DPD_LAST_TWELVE_MONTHS("BUREAU_DPD_LAST_TWELVE_MONTHS", "Bureau Dpds Last 12 Months"),
    RISK_SCORE("RISK_SCORE", "Risk score applicant"), 
    ELIGIBLE_EMPLOYER("ELIGIBLE_EMPLOYER", "Eligible employer"),
    TOTAL_JOB_EXPERIENCE("TOTAL_JOB_EXPERIENCE", "Total Job experience"),
    CURRENT_JOB_EXP("CURRENT_JOB_EXP", "Current job experience"), 
    CURRENT_EMPLOYMENT_STATUS("CURRENT_EMPLOYMENT_STATUS", "Current employment Status"),
    BANK_RELATIONSHIP("BANK_RELATIONSHIP", "Bank relationship"),
    MODE_OF_SALARY("MODE_OF_SALARY", "Mode of salary"),
    SAL_AC_OF_BORROWER("SAL_AC_OF_BORROWER", "Salary account of borrower"),
    MINIMUM_NET_TAKE_HOME_INCOME("MINIMUM_NET_TAKE_HOME_INCOME", "minimum Net Take Home Income"); //17
	
	String key, value;

	MatchPersonalLoanDisplayEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
	
	 public static MatchPersonalLoanDisplayEnum getByKey(String key) {

	        if(key.equalsIgnoreCase("LOAN_AMOUNT")){
	            return LOAN_AMOUNT;
	        }else if(key.equalsIgnoreCase("GROSS_MONTHLY_INCOME")){
	            return GROSS_MONTHLY_INCOME;
	        }else if(key.equalsIgnoreCase("NET_MONTHLY_INCOME")){
	            return NET_MONTHLY_INCOME;
	        }else if(key.equalsIgnoreCase("AGE_OF_APPLICANT")){
	            return AGE_OF_APPLICANT;
	        }else if(key.equalsIgnoreCase("TENURE")){
	            return TENURE;
	        }else if(key.equalsIgnoreCase("GEOGRAPHICAL_MARKET_FOCUS")){
	            return GEOGRAPHICAL_MARKET_FOCUS;
	        }else if(key.equalsIgnoreCase("MINIMUM_BUREAU_SCORE")){
	            return MINIMUM_BUREAU_SCORE;
	        }else if(key.equalsIgnoreCase("BUREAU_DPD_LAST_TWELVE_MONTHS")){
	            return BUREAU_DPD_LAST_TWELVE_MONTHS;
	        }else if(key.equalsIgnoreCase("RISK_SCORE")){
	            return RISK_SCORE;
	        }else if(key.equalsIgnoreCase("ELIGIBLE_EMPLOYER")){
	            return ELIGIBLE_EMPLOYER;
	        }else if(key.equalsIgnoreCase("TOTAL_JOB_EXPERIENCE")){
	            return TOTAL_JOB_EXPERIENCE;
	        }else if(key.equalsIgnoreCase("CURRENT_JOB_EXP")){
	            return CURRENT_JOB_EXP;
	        }else if(key.equalsIgnoreCase("CURRENT_EMPLOYMENT_STATUS")){
	            return CURRENT_EMPLOYMENT_STATUS;
	        }else if(key.equalsIgnoreCase("BANK_RELATIONSHIP")){
	            return BANK_RELATIONSHIP;
	        }else if(key.equalsIgnoreCase("MODE_OF_SALARY")){
	            return MODE_OF_SALARY;
	        }else if(key.equalsIgnoreCase("SAL_AC_OF_BORROWER")){
	            return SAL_AC_OF_BORROWER;
	        }else if(key.equalsIgnoreCase("MINIMUM_NET_TAKE_HOME_INCOME")){
	            return MINIMUM_NET_TAKE_HOME_INCOME;
	        }else{
	            return null;
	        }
	    }

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
