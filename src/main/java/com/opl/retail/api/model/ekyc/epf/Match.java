
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
    "confidence",
    "epfHistory",
    "estId",
    "name"
})
public class Match {

    @JsonProperty("confidence")
    private Integer confidence;
    @JsonProperty("epfHistory")
    private EpfHistory_ epfHistory;
    @JsonProperty("estId")
    private String estId;
    @JsonProperty("name")
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("confidence")
    public Integer getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("epfHistory")
    public EpfHistory_ getEpfHistory() {
        return epfHistory;
    }

    @JsonProperty("epfHistory")
    public void setEpfHistory(EpfHistory_ epfHistory) {
        this.epfHistory = epfHistory;
    }

    @JsonProperty("estId")
    public String getEstId() {
        return estId;
    }

    @JsonProperty("estId")
    public void setEstId(String estId) {
        this.estId = estId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
