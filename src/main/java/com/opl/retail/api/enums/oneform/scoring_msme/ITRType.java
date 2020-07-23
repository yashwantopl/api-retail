package com.opl.retail.api.enums.oneform.scoring_msme;

public enum ITRType {
	AUDITED_LESS_THAN_THREE_YEAR(1, "Audited less then 3 years", "AUDITED LESS THAN THREE YEAR"),
	AUDITED_THREE_YEAR(3, "Audited 3 years", "AUDITED THREE YEAR"),
	PRESUMPTIVE(4, "Presumptive", "PRESUMPTIVE");

	private final Integer id;
	private final String value;
	private final String description;

	ITRType(Integer id, String value, String description) {
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

	public static ITRType getById(Integer id) {
		switch (id) {
		case 1:
			return AUDITED_LESS_THAN_THREE_YEAR;
		case 3:
			return AUDITED_THREE_YEAR;
		case 4:
			return PRESUMPTIVE;
		default:
			return null;
		}
	}

	public static ITRType[] getAll() {
		return ITRType.values();

	}
}