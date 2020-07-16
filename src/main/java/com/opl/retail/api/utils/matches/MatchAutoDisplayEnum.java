package com.opl.retail.api.utils.matches;

public enum MatchAutoDisplayEnum {

    PURPOSE_OF_LOAN("PURPOSE_OF_LOAN", "Purpose of loan"),
    NET_MONTHLY_INCOME("NET_MONTHLY_INCOME", "Net monthly income"),
    GROSS_MONTHLY_INCOM("GROSS_MONTHLY_INCOM", "Gross monthly income"),
    AGE_OF_APPLICANT("AGE_OF_APPLICANT", "Age of applicant"),
    GEOGRAPHICAL_MARKET_FOCUS("GEOGRAPHICAL_MARKET_FOCUS", "Geographical market focus"),
    MINIMUM_BUREAU_SCORE("MINIMUM_BUREAU_SCORE", "Minimum bureau score"),
    TOTAL_WORK_EXPERIENCE("TOTAL_WORK_EXPERIENCE", "Total work experience"),
    ELIGIBLE_EMPLOYER("ELIGIBLE_EMPLOYER", "Eligible employer"),
    SAL_AC_OF_BORROWER("SAL_AC_OF_BORROWER", "Salary account of borrower"),
    CURRENT_JOB_EXP("CURRENT_JOB_EXP", "Current job experience"),
    RISK_SCORE("RISK_SCORE", "Risk score applicant"),
    RISK_CO_SCORE("RISK_CO_SCORE", "Risk score co-applicant"),
    ELIGIBLE_PROFESSIONAL("ELIGIBLE_PROFESSIONAL", "Eligible professional"),
    RISK_SCORE_OTHER_THAN_SALARIED("RISK_SCORE_OTHER_THAN_SALARIED", "Risk score other than salaried"),
    RISK_CO_SCORE_OTHER_THAN_SALARIED("RISK_CO_SCORE_OTHER_THAN_SALARIED", "Risk co score other than salaried"),
    BORROWER_TYPE("BORROWER_TYPE", "Borrower type"),
    CURRENT_EMPLOYMENT("CURRENT_EMPLOYMENT", "Current employment"),
    RESIDENTIAL_STATUS("RESIDENTIAL_STATUS", "Residential status"),
    BANK_RELATIONSHIP("BANK_RELATIONSHIP", "Bank relationship"),
    MODE_OF_SALARY("MODE_OF_SALARY", "Mode of salary"),
    MODE_OF_REPAYMENT("MODE_OF_REPAYMENT", "Mode of repayment"),
    BUREAU_DPD("BUREAU_DPD", "Bureau DPDs"),
    TENURE("TENURE", "Tenure"),
    LOAN_AMOUNT("LOAN_AMOUNT", "Loan amount"),
    AGE_OF_VEHICLE("AGE_OF_VEHICLE", "Age of vehicle"),
    COLLATERAL_SECURITY("COLLATERAL_SECURITY", "Collateral Security"),
    DSCR("DSCR", "DSCR"),
    EMI_NMI("EMI_NMI", "Emi/NMI"),
    TANGIBLE_NET_WORTH("TANGIBLE_NET_WORTH", "Tengible net worth to loan radio"),
    NET_TAKE_HOME_PAY("NET_TAKE_HOME_PAY", "Net Take Home Pay");

    String key, value;

    MatchAutoDisplayEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static MatchAutoDisplayEnum getByKey(String key) {

        if(key.equalsIgnoreCase("PURPOSE_OF_LOAN")){
            return PURPOSE_OF_LOAN;
        }else if(key.equalsIgnoreCase("NET_MONTHLY_INCOME")){
            return NET_MONTHLY_INCOME;
        }else if(key.equalsIgnoreCase("GROSS_MONTHLY_INCOM")){
            return GROSS_MONTHLY_INCOM;
        }else if(key.equalsIgnoreCase("AGE_OF_APPLICANT")){
            return AGE_OF_APPLICANT;
        }else if(key.equalsIgnoreCase("GEOGRAPHICAL_MARKET_FOCUS")){
            return GEOGRAPHICAL_MARKET_FOCUS;
        }else if(key.equalsIgnoreCase("MINIMUM_BUREAU_SCORE")){
            return MINIMUM_BUREAU_SCORE;
        }else if(key.equalsIgnoreCase("TOTAL_WORK_EXPERIENCE")){
            return TOTAL_WORK_EXPERIENCE;
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
        }else if(key.equalsIgnoreCase("ELIGIBLE_PROFESSIONAL")){
            return ELIGIBLE_PROFESSIONAL;
        }else if(key.equalsIgnoreCase("RISK_SCORE_OTHER_THAN_SALARIED")){
            return RISK_SCORE_OTHER_THAN_SALARIED;
        }else if(key.equalsIgnoreCase("RISK_CO_SCORE_OTHER_THAN_SALARIED")){
            return RISK_CO_SCORE_OTHER_THAN_SALARIED;
        }else if(key.equalsIgnoreCase("BORROWER_TYPE")){
            return BORROWER_TYPE;
        }else if(key.equalsIgnoreCase("CURRENT_EMPLOYMENT")){
            return CURRENT_EMPLOYMENT;
        }else if(key.equalsIgnoreCase("RESIDENTIAL_STATUS")){
            return RESIDENTIAL_STATUS;
        }else if(key.equalsIgnoreCase("BANK_RELATIONSHIP")){
            return BANK_RELATIONSHIP;
        }else if(key.equalsIgnoreCase("MODE_OF_SALARY")){
            return MODE_OF_SALARY;
        }else if(key.equalsIgnoreCase("MODE_OF_REPAYMENT")){
            return MODE_OF_REPAYMENT;
        }else if(key.equalsIgnoreCase("BUREAU_DPD")){
            return BUREAU_DPD;
        }else if(key.equalsIgnoreCase("TENURE")){
            return TENURE;
        }else if(key.equalsIgnoreCase("LOAN_AMOUNT")){
            return LOAN_AMOUNT;
        }else if(key.equalsIgnoreCase("AGE_OF_VEHICLE")){
            return AGE_OF_VEHICLE;
        }else if(key.equalsIgnoreCase("COLLATERAL_SECURITY")){
            return COLLATERAL_SECURITY;
        }else if(key.equalsIgnoreCase("DSCR")){
            return DSCR;
        }else if(key.equalsIgnoreCase("EMI_NMI")){
            return EMI_NMI;
        }else if(key.equalsIgnoreCase("TANGIBLE_NET_WORTH")){
            return TANGIBLE_NET_WORTH;
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
