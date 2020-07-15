/**
 * 
 */
package com.opl.retail.api.model.scoring;

/**
 * @author sanket.devare
 *
 */
public enum BorrowerStatusType {
	
	Micro(1,"Micro"),
	Small(2,"Small"),
	Medium(3,"Medium");

	
	Integer id;
    String value;
    
    BorrowerStatusType(Integer id, String value){
    	this.id = id;
    	this.value = value;
    }

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
	
	static public BorrowerStatusType getByValue(String value) {

        for (BorrowerStatusType c : BorrowerStatusType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        return null;
	}

}
