package com.opl.retail.api.model.scoring;

import java.util.Arrays;
import java.util.Optional;

public enum SalaryPackageType {


    DSP(1, "Defence Salary Package", "DSP"),
    PMSP(2, "Para Military Salary Package", "PMSP"),
    ICGSP(3, "Indian Coast Guard Salary Package", "ICGSP"),
    CGSP(4, "Central Governent Salary Package", "CGSP"),
    SGSP(5, "State Government Salary Package", "SGSP"),
    CSP(6, "Corporate Salary Package", "CSP"),
    PSP(7, "Police Salary Package", "PSP"),
    RSP(8, "Railway Salary Package", "RSP"),
    SSUP(9, "Salary Start Up Package", "SSUP"),
    AOBAT(10, "All other bank account types", "AOBAT");
    Integer type;
    String desc;
    String code;

    SalaryPackageType(Integer type, String desc, String code) {
        this.type = type;
        this.desc = desc;
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    static public SalaryPackageType getById(Integer id) {

        switch (id) {
            case 1:
                return DSP;
            case 2:
                return PMSP;
            case 3:
                return ICGSP;
            case 4:
                return CGSP;
            case 5:
                return SGSP;
            case 6:
                return CSP;
            case 7:
                return PSP;
            case 8:
                return RSP;
            case 9:
                return SSUP;
            case 10:
                return AOBAT;
            default:
                return null;
        }
    }

    static public SalaryPackageType getByFullName(String fullAccName) {

        String[] nameParts = fullAccName.split("-");
        if(nameParts !=null && nameParts.length > 0 ){
            for(String namePart : nameParts){
                if(DSP.getCode().equals(namePart)){
                    return DSP;
                }else if(PMSP.getCode().equals(namePart)){
                    return PMSP;
                }else if(ICGSP.getCode().equals(namePart)){
                    return ICGSP;
                }else if(CGSP.getCode().equals(namePart)){
                    return CGSP;
                }else if(SGSP.getCode().equals(namePart)){
                    return SGSP;
                }else if(CSP.getCode().equals(namePart)){
                    return CSP;
                }else if(PSP.getCode().equals(namePart)){
                    return PSP;
                }else if(RSP.getCode().equals(namePart)){
                    return RSP;
                }else if(SSUP.getCode().equals(namePart)){
                    return SSUP;
                }
            }
        }
        /*Optional<SalaryPackageType> salaryPackageType = Arrays.stream(SalaryPackageType.values()).filter(a->a.getCode().contains(fullAccName)).findAny();
        if(salaryPackageType !=null) {
            return salaryPackageType.get();
        }*/
        return null;
    }

    static public SalaryPackageType getByCode(String code) {

                if(DSP.getCode().equals(code)){
                    return DSP;
                }else if(PMSP.getCode().equals(code)){
                    return PMSP;
                }else if(ICGSP.getCode().equals(code)){
                    return ICGSP;
                }else if(CGSP.getCode().equals(code)){
                    return CGSP;
                }else if(SGSP.getCode().equals(code)){
                    return SGSP;
                }else if(CSP.getCode().equals(code)){
                    return CSP;
                }else if(PSP.getCode().equals(code)){
                    return PSP;
                }else if(RSP.getCode().equals(code)){
                    return RSP;
                }else if(SSUP.getCode().equals(code)) {
                    return SSUP;
                }else if(AOBAT.getCode().equals(code)){
                	return AOBAT;
                }

        return null;
    }
}
