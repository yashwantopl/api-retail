package com.opl.retail.api.utils.matches;

/**
 * @author rahul.meena
 *
 */
public enum MatchHomeLoanDisplayEnum {
	
	    PURPOSE_OF_LOAN("PURPOSE_OF_LOAN", "Purpose of loan"),
	    LOAN_AMOUNT("LOAN_AMOUNT", "Loan amount"),
	    BORROWER_TYPE("BORROWER_TYPE", "Borrower type"),
	    NET_MONTHLY_INCOME("NET_MONTHLY_INCOME", "Net monthly income"),
	    GROSS_MONTHLY_INCOM("GROSS_MONTHLY_INCOM", "Gross monthly income"),
	    MINIMUM_NET_TAKE_HOME_INCOME("MINIMUM_NET_TAKE_HOME_INCOME", "minimum Net Take Home Income"),
	    MINIMUM_BUREAU_SCORE("MINIMUM_BUREAU_SCORE", "Minimum bureau score"),
	    BUREAU_DPD_LAST_TWELVE_MONTHS("BUREAU_DPD_LAST_TWELVE_MONTHS", "Bureau Dpds Last 12 Months"),
	    TENURE("TENURE", "Tenure"),
	    GEOGRAPHICAL_MARKET_FOCUS("GEOGRAPHICAL_MARKET_FOCUS", "Geographical market focus"),
	    AGE_OF_APPLICANT("AGE_OF_APPLICANT", "Age of applicant"),
	    TOTAL_WORK_EXPERIENCE("TOTAL_WORK_EXPERIENCE", "Total work experience"),
	    CURRENT_EMPLOYMENT_STATUS("CURRENT_EMPLOYMENT_STATUS", "Current employment Status"),
	    RESIDENTIAL_STATUS("RESIDENTIAL_STATUS", "Residential status"),
	    BANK_RELATIONSHIP("BANK_RELATIONSHIP", "Bank relationship"),
	    MODE_OF_SALARY("MODE_OF_SALARY", "Mode of salary"),
	    LOAN_TO_VALUE_LTV("LOAN_TO_VALUE_LTV", "Loan to Value"),//17
	    ////Salaried
	    ELIGIBLE_EMPLOYER("ELIGIBLE_EMPLOYER", "Eligible employer"),
	    SAL_AC_OF_BORROWER("SAL_AC_OF_BORROWER", "Salary account of borrower"),
	    CURRENT_JOB_EXP("CURRENT_JOB_EXP", "Current job experience"),
	    RISK_SCORE("RISK_SCORE", "Risk score applicant"),
	    RISK_CO_SCORE("RISK_CO_SCORE", "Risk score co-applicant"),//22
	    //Other Than Salaried
	    ELIGIBLE_PROFESSIONAL("ELIGIBLE_PROFESSIONAL", "Eligible professional"),
	    RISK_SCORE_OTHER_THAN_SALARIED("RISK_SCORE_OTHER_THAN_SALARIED", "Risk score other than salaried"),
	    RISK_CO_SCORE_OTHER_THAN_SALARIED("RISK_CO_SCORE_OTHER_THAN_SALARIED", "Risk co score other than salaried");//25

	    String key, value;

	    MatchHomeLoanDisplayEnum(String key, String value) {
	        this.key = key;
	        this.value = value;
	    }

	    public static MatchHomeLoanDisplayEnum getByKey(String key) {

	        if(key.equalsIgnoreCase("PURPOSE_OF_LOAN")){
	            return PURPOSE_OF_LOAN;
	        }else if(key.equalsIgnoreCase("LOAN_AMOUNT")){
	            return LOAN_AMOUNT;
	        }else if(key.equalsIgnoreCase("BORROWER_TYPE")){
	            return BORROWER_TYPE;
	        }else if(key.equalsIgnoreCase("NET_MONTHLY_INCOME")){
	            return NET_MONTHLY_INCOME;
	        }else if(key.equalsIgnoreCase("GROSS_MONTHLY_INCOM")){
	            return GROSS_MONTHLY_INCOM;
	        }else if(key.equalsIgnoreCase("MINIMUM_NET_TAKE_HOME_INCOME")){
	            return MINIMUM_NET_TAKE_HOME_INCOME;
	        }else if(key.equalsIgnoreCase("MINIMUM_BUREAU_SCORE")){
	            return MINIMUM_BUREAU_SCORE;
	        }else if(key.equalsIgnoreCase("BUREAU_DPD_LAST_TWELVE_MONTHS")){
	            return BUREAU_DPD_LAST_TWELVE_MONTHS;
	        }else if(key.equalsIgnoreCase("TENURE")){
	            return TENURE;
	        }else if(key.equalsIgnoreCase("GEOGRAPHICAL_MARKET_FOCUS")){
	            return GEOGRAPHICAL_MARKET_FOCUS;
	        }else if(key.equalsIgnoreCase("AGE_OF_APPLICANT")){
	            return AGE_OF_APPLICANT;
	        }else if(key.equalsIgnoreCase("TOTAL_WORK_EXPERIENCE")){
	            return TOTAL_WORK_EXPERIENCE;
	        }else if(key.equalsIgnoreCase("CURRENT_EMPLOYMENT_STATUS")){
	            return CURRENT_EMPLOYMENT_STATUS;
	        }else if(key.equalsIgnoreCase("RESIDENTIAL_STATUS")){
	            return RESIDENTIAL_STATUS;
	        }else if(key.equalsIgnoreCase("BANK_RELATIONSHIP")){
	            return BANK_RELATIONSHIP;
	        }else if(key.equalsIgnoreCase("MODE_OF_SALARY")){
	            return MODE_OF_SALARY;
	        }else if(key.equalsIgnoreCase("LOAN_TO_VALUE_LTV")){
	            return LOAN_TO_VALUE_LTV;
	            //  Salaried
	        }else if(key.equalsIgnoreCase("ELIGIBLE_EMPLOYER")){
	            return ELIGIBLE_EMPLOYER;
	        }else if(key.equalsIgnoreCase("SAL_AC_OF_BORROWER")){
	            return SAL_AC_OF_BORROWER;
	        }else if(key.equalsIgnoreCase("CURRENT_JOB_EXP")){
	            return CURRENT_JOB_EXP;
	        }else if(key.equalsIgnoreCase("RISK_SCORE")){
	            return RISK_SCORE;
	        }else if(key.equalsIgnoreCase("RISK_CO_SCORE")){
	            return RISK_CO_SCORE;
	          ////Other Than Salaried
	            
	        }else if(key.equalsIgnoreCase("ELIGIBLE_PROFESSIONAL")){
	            return ELIGIBLE_PROFESSIONAL;
	        }else if(key.equalsIgnoreCase("RISK_SCORE_OTHER_THAN_SALARIED")){
	            return RISK_SCORE_OTHER_THAN_SALARIED;
	        }else if(key.equalsIgnoreCase("RISK_CO_SCORE_OTHER_THAN_SALARIED")){
	            return RISK_CO_SCORE_OTHER_THAN_SALARIED;  //25 PARAMETER
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
