
package com.opl.retail.api.model.cibil_integration.truelink.schema.database.tcps.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurveyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InitialTCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurveyType", namespace = "com/truelink/schema/database/tcps/enumerations")
@XmlEnum
public enum SurveyType {

    @XmlEnumValue("InitialTCS")
    INITIAL_TCS("InitialTCS");
    private final String value;

    SurveyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyType fromValue(String v) {
        for (SurveyType c: SurveyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
