
package com.opl.retail.api.model.ekyc.epf;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "formatted_wage_month",
    "totalAmount",
    "totalMembers",
    "wageMonth"
})
public class EpfHistory {

    @JsonProperty("formatted_wage_month")
    private String formattedWageMonth;
    @JsonProperty("totalAmount")
    private Integer totalAmount;
    @JsonProperty("totalMembers")
    private Integer totalMembers;
    @JsonProperty("wageMonth")
    private String wageMonth;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("formatted_wage_month")
    public String getFormattedWageMonth() {
        return formattedWageMonth;
    }

    @JsonProperty("formatted_wage_month")
    public void setFormattedWageMonth(String formattedWageMonth) {
        this.formattedWageMonth = formattedWageMonth;
    }

    @JsonProperty("totalAmount")
    public Integer getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount")
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("totalMembers")
    public Integer getTotalMembers() {
        return totalMembers;
    }

    @JsonProperty("totalMembers")
    public void setTotalMembers(Object totalMembers) {
    	try {
    		if(totalMembers instanceof Integer)
    			this.totalMembers = (Integer) totalMembers;
    		this.totalMembers = Integer.parseInt(totalMembers.toString());
    	}catch (NumberFormatException e) {
    		this.totalMembers = null;
    	}
    }

    @JsonProperty("wageMonth")
    public String getWageMonth() {
        return wageMonth;
    }

    @JsonProperty("wageMonth")
    public void setWageMonth(String wageMonth) {
        this.wageMonth = wageMonth;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
