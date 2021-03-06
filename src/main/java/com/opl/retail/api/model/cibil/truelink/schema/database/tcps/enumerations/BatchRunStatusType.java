
package com.opl.retail.api.model.cibil.truelink.schema.database.tcps.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchRunStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchRunStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProcessHadErrors"/>
 *     &lt;enumeration value="ProcessRunning"/>
 *     &lt;enumeration value="ProcessSuccessful"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchRunStatusType", namespace = "com/truelink/schema/database/tcps/enumerations")
@XmlEnum
public enum BatchRunStatusType {

    @XmlEnumValue("ProcessHadErrors")
    PROCESS_HAD_ERRORS("ProcessHadErrors"),
    @XmlEnumValue("ProcessRunning")
    PROCESS_RUNNING("ProcessRunning"),
    @XmlEnumValue("ProcessSuccessful")
    PROCESS_SUCCESSFUL("ProcessSuccessful");
    private final String value;

    BatchRunStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchRunStatusType fromValue(String v) {
        for (BatchRunStatusType c: BatchRunStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
