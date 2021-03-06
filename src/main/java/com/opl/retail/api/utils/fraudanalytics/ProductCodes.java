//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.19 at 12:14:41 PM IST 
//

package  com.opl.retail.api.utils.fraudanalytics;

public enum ProductCodes {

	WORKING_CAPITAL(1, "WC_NI_IND", "WC_NI_IND"), TERM_LOAN(2, "TL_NI_IND", "TL_NI_IND"), NTB(3,"N2B_IND","N2B_IND");

	private final Integer id;
	private final String value;
	private final String description;

	ProductCodes(Integer id, String value, String description) {
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

	public static ProductCodes getById(Integer id) {
		switch (id) {
		case 1:
			return TERM_LOAN;
		case 2:
			return WORKING_CAPITAL;
		case 16:
			return TERM_LOAN;

			default:
				break;
		}
		return null;
	}

	public static ProductCodes[] getAll() {
		return ProductCodes.values();

	}

}
