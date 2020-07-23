package com.opl.retail.api.enums.oneform;

public enum SalaryAccountTypeMst {
	DSP(1, "Defence Salary Account Package", "DSP"),
    PMSP(2, "Para Military Salary Account Package", "PMSP"),
    ICGSP(3, "Indian Coast Guard Salary Account Package", "ICGSP"),
    CGSP(4, "Central Governent Salary Account Package", "CGSP"),
    SGSP(5, "State Government Salary Account Package", "SGSP"),
    CSA(6, "Corporate Salary Account Package", "CSA"),
    PSP(7, "Police Salary Account Package", "PSP"),
    RSP(8, "Railway Salary Account Package", "RSP"),
    SSUP(9, "Salary Start Up Account Package", "START UP"),
    AOBAT(10, "All other bank account types", "AOBAT");
	
	private final Integer id;
	private final String value;
	private final String description;
	
	SalaryAccountTypeMst(Integer id, String value, String description) {
		this.id = id;
		this.value = value;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}
	
	public static SalaryAccountTypeMst getById(Integer id) {
		switch (id) {
		case 1:
			return SalaryAccountTypeMst.DSP;
		case 2:
			return SalaryAccountTypeMst.PMSP;
		case 3:
			return SalaryAccountTypeMst.ICGSP;
		case 4:
			return SalaryAccountTypeMst.CGSP;
		case 5:
			return SalaryAccountTypeMst.SGSP;
		case 6:
			return SalaryAccountTypeMst.CSA;
		case 7:
			return SalaryAccountTypeMst.PSP;
		case 8:
			return SalaryAccountTypeMst.RSP;
		case 9:
			return SalaryAccountTypeMst.SSUP;
		case 10:
			return SalaryAccountTypeMst.AOBAT;
		default:
			return null;
		}
	}
	
	static public SalaryAccountTypeMst getByValue(String value) {

        String[] nameParts = value.split("-");
        if(nameParts !=null && nameParts.length > 0 ){
            for(String namePart : nameParts){
                if(DSP.getDescription().equals(namePart)){
                    return DSP;
                }else if(PMSP.getDescription().equals(namePart)){
                    return PMSP;
                }else if(ICGSP.getDescription().equals(namePart)){
                    return ICGSP;
                }else if(CGSP.getDescription().equals(namePart)){
                    return CGSP;
                }else if(SGSP.getDescription().equals(namePart)){
                    return SGSP;
                }else if(CSA.getDescription().equals(namePart)){
                    return CSA;
                }else if(PSP.getDescription().equals(namePart)){
                    return PSP;
                }else if(RSP.getDescription().equals(namePart)){
                    return RSP;
                }else if(SSUP.getDescription().equals(namePart)){
                    return SSUP;
                }
            }
        }
       
        return null;
    }
	
	public static SalaryAccountTypeMst[] getAll() {
		return SalaryAccountTypeMst.values();

	}
}