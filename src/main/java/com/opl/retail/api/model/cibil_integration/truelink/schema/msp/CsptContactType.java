
package com.opl.retail.api.model.cibil_integration.truelink.schema.msp;


import com.opl.retail.api.model.cibil_integration.truelink.schema.database.tcps.enumerations.CommEventMediumType;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for CsptContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsptContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Contact" type="{com/truelink/schema/database/tcps/enumerations}CommEventMediumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsptContactType", propOrder = {
    "count",
    "contact"
})
public class CsptContactType {

    @XmlElement(name = "Count", required = true)
    protected BigInteger count;
    @XmlElement(name = "Contact", required = true)
    @XmlSchemaType(name = "string")
    protected CommEventMediumType contact;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link CommEventMediumType }
     *     
     */
    public CommEventMediumType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommEventMediumType }
     *     
     */
    public void setContact(CommEventMediumType value) {
        this.contact = value;
    }

}
