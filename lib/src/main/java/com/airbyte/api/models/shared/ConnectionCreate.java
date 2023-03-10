package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionCreate {
    @JsonProperty("destinationId")
    public String destinationId;
    public ConnectionCreate withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public ConnectionCreate withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("sourceId")
    public String sourceId;
    public ConnectionCreate withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
}
