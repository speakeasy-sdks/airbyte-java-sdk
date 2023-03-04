package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSquare {
    @JsonProperty("airbyte-source-name")
    public SourceSquareSquareEnum airbyteSourceName;
    public SourceSquare withAirbyteSourceName(SourceSquareSquareEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceSquare withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted_objects")
    public Boolean includeDeletedObjects;
    public SourceSquare withIncludeDeletedObjects(Boolean includeDeletedObjects) {
        this.includeDeletedObjects = includeDeletedObjects;
        return this;
    }
    
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceSquare withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceSquare withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
