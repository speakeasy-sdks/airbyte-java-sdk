package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationCreate {
    @JsonProperty("connectionConfiguration")
    public Object connectionConfiguration;
    public DestinationCreate withConnectionConfiguration(Object connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public DestinationCreate withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;
    public DestinationCreate withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
}
