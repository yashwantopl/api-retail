
package com.opl.retail.api.model.ekyc.epf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "employer",
    "uan"
})
public class Uan {

    @JsonProperty("employer")
    private List<Employer> employer = new ArrayList<Employer>();
    @JsonProperty("uan")
    private String uan;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("employer")
    public List<Employer> getEmployer() {
        return employer;
    }

    @JsonProperty("employer")
    public void setEmployer(List<Employer> employer) {
        this.employer = employer;
    }

    @JsonProperty("uan")
    public String getUan() {
        return uan;
    }

    @JsonProperty("uan")
    public void setUan(String uan) {
        this.uan = uan;
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
