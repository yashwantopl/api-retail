package com.opl.retail.api.enums.oneform;

public enum TypeOfActivity {
    MANUFACTURING(1,"Manufacturing","Manufacturing"),
    SERVICES(2,"Services","Services"),
    RETAIL(3,"Retail Trade","Retail Trade");
    
    private final Integer id;
    private final String value;
    private final String description;
    
    TypeOfActivity(Integer id, String value, String description) {
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
    public static TypeOfActivity getById(Integer id) {
        switch (id) {
            case 1:
                return MANUFACTURING;
            case 2:
                return SERVICES;
            case 3:
            	return RETAIL;
            default:
                return null;
        }
    }
    public static TypeOfActivity[] getAll() {
        return TypeOfActivity.values();

    }

}
