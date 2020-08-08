
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
    "DEC-18",
    "NOV-18",
    "OCT-18"
})
public class EpfHistory_ {

    @JsonProperty("DEC-18")
    private Boolean dEC18;
    @JsonProperty("NOV-18")
    private Boolean nOV18;
    @JsonProperty("OCT-18")
    private Boolean oCT18;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DEC-18")
    public Boolean getDEC18() {
        return dEC18;
    }

    @JsonProperty("DEC-18")
    public void setDEC18(Boolean dEC18) {
        this.dEC18 = dEC18;
    }

    @JsonProperty("NOV-18")
    public Boolean getNOV18() {
        return nOV18;
    }

    @JsonProperty("NOV-18")
    public void setNOV18(Boolean nOV18) {
        this.nOV18 = nOV18;
    }

    @JsonProperty("OCT-18")
    public Boolean getOCT18() {
        return oCT18;
    }

    @JsonProperty("OCT-18")
    public void setOCT18(Boolean oCT18) {
        this.oCT18 = oCT18;
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
