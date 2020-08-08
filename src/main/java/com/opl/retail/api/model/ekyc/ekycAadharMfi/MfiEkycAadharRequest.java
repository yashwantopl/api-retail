package com.opl.retail.api.model.ekyc.ekycAadharMfi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author jaimin.darji
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class MfiEkycAadharRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String grand_type;
    private String aadharNo;
    private String otp;
    private String transactionID;
    private String privateKey;
    private Long userId;
    private Long applicationId;
    private Long coAppId;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrand_type() {
        return grand_type;
    }

    public void setGrand_type(String grand_type) {
        this.grand_type = grand_type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getCoAppId() {
        return coAppId;
    }

    public void setCoAppId(Long coAppId) {
        this.coAppId = coAppId;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String toString() {
        return "MfiEkycAadharRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", grand_type='" + grand_type + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", otp='" + otp + '\'' +
                ", TransactionID='" + transactionID + '\'' +
                ", userId=" + userId +
                ", applicationId=" + applicationId +
                ", coAppId=" + coAppId +
                '}';
    }
}
