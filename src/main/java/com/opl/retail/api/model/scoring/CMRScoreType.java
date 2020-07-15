package com.opl.retail.api.model.scoring;

public enum CMRScoreType {
	
	CMR_1(1,"1"),
	CMR_2(2,"2"),
	CMR_3(3,"3"),
	CMR_4(4,"4"),
	CMR_5(5,"5"),
	CMR_6(6,"6"),
	CMR_7(7,"7"),
	CMR_8(8,"8"),
	CMR_9(9,"9"),
	CMR_10(10,"10"),
	NO_CMR(0,"No CMR");
	
	Integer id;
    String value;
    
    CMRScoreType(Integer id, String value){
    	this.id = id;
    	this.value = value;
    }

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
	
	static public CMRScoreType getByValue(String value) {

        for (CMRScoreType c : CMRScoreType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        return null;
	}

}
