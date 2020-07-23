package com.opl.retail.api.enums.oneform;

public enum VehicleEngineVolume {

	UPTO_1800_CC(1,"Upto 1800 CC","UPTO_1800_CC",2),
	MORE_THAN_1800_CC(2,"More than 1800 CC","MORE_THAN_1800_CC",2),
	//addition
	LESS_THAN_200_CC(3, "Less than 200 CC", "LESS_THAN_200_CC",1),
	_200_CC_TO_300_CC(4, "200 CC to 300 CC", "200_CC_TO_300_CC",1),
	MORE_THAN_300_CC(5, "More than 300 CC", "MORE_THAN_300_CC",1);
	
	private final Integer id;
	private final String value;
	private final String description;
	private final Integer vehicleCategory;

	VehicleEngineVolume(Integer id, String value, String description, Integer vehicleCategory) {
		this.id = id;
		this.value = value;
		this.description = description;
		this.vehicleCategory = vehicleCategory;
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
	
	public Integer getVehicleCategory() {
		return vehicleCategory;
	}

	public static VehicleEngineVolume getById(Integer id) {
		switch (id) {
		case 1:
			return UPTO_1800_CC;
		case 2:
			return MORE_THAN_1800_CC;
		case 3:
			return LESS_THAN_200_CC;	
		case 4:
			return _200_CC_TO_300_CC;	
		case 5:
			return MORE_THAN_300_CC;	

		default:
			return null;
		}
	}

	public static VehicleEngineVolume[] getAll() {
		return VehicleEngineVolume.values();
	}
}
