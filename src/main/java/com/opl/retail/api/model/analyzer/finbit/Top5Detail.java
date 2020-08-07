package com.opl.retail.api.model.analyzer.finbit;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"amount",
"description",
"no_of_transactions",
"month"
})
public class Top5Detail {

@JsonProperty("amount")
private Double amount;
@JsonProperty("description")
private String description;
@JsonProperty("no_of_transactions")
private Double noOfTransactions;
@JsonProperty("month")
private String month;
@JsonProperty("category")
private String category;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("amount")
public Double getAmount() {
return amount;
}

@JsonProperty("amount")
public void setAmount(Double amount) {
this.amount = amount;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("no_of_transactions")
public Double getNoOfTransactions() {
return noOfTransactions;
}

@JsonProperty("no_of_transactions")
public void setNoOfTransactions(Double noOfTransactions) {
this.noOfTransactions = noOfTransactions;
}

@JsonProperty("month")
public String getMonth() {
return month;
}

@JsonProperty("month")
public void setMonth(String month) {
this.month = month;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
@JsonProperty("category")
public String getCategory() {
	return category;
}
@JsonProperty("category")
public void setCategory(String category) {
	this.category = category;
}



}
