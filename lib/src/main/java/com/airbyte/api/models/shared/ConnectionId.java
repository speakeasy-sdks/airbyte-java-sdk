package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectionId {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectionId")
    public String connectionId;
    public ConnectionId withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
}
