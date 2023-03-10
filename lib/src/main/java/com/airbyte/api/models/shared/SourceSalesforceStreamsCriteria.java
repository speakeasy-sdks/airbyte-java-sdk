package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSalesforceStreamsCriteria {
    @JsonProperty("criteria")
    public SourceSalesforceStreamsCriteriaSearchCriteriaEnum criteria;
    public SourceSalesforceStreamsCriteria withCriteria(SourceSalesforceStreamsCriteriaSearchCriteriaEnum criteria) {
        this.criteria = criteria;
        return this;
    }
    
    @JsonProperty("value")
    public String value;
    public SourceSalesforceStreamsCriteria withValue(String value) {
        this.value = value;
        return this;
    }
    
}
