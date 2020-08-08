package com.opl.retail.api.model.bodmas;

public class DropDownValueRequest {

    private Long id;

    private String name;
    
    private Boolean isLast ; 


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public Boolean getIsLast() {
		return isLast;
	}

	public void setIsLast(Boolean isLast) {
		this.isLast = isLast;
	}

	@Override
    public String toString() {
        return "DropDownValueRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
