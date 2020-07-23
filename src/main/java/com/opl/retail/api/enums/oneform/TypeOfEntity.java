package com.opl.retail.api.enums.oneform;

public enum TypeOfEntity {
    MICRO(1,"Micro","Micro"),
    SMALL(2,"Small","Small"),
    OTHER_BUSINESS_ENTERPRISES(3,"Other Business Enterprises","Other Business Enterprises"),
    MEDIUM(4,"Medium","Medium");
    
    private final Integer id;
    private final String value;
    private final String description;
    
    TypeOfEntity(Integer id, String value, String description) {
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
    public static TypeOfEntity getById(Integer id) {
        switch (id) {
            case 1:
                return MICRO;
            case 2:
                return SMALL;
            case 3:
            	return OTHER_BUSINESS_ENTERPRISES;
            case 4:
            	return MEDIUM;
            default:
                return null;
        }
    }
    public static TypeOfEntity[] getAll() {
        return TypeOfEntity.values();

    }

}
