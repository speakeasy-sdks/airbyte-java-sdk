package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationId {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destinationId")
    public String destinationId;
    public DestinationId withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
}
