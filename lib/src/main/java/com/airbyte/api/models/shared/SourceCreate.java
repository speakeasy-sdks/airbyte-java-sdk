package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceCreate {
    @JsonProperty("connectionConfiguration")
    public Object connectionConfiguration;
    public SourceCreate withConnectionConfiguration(Object connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public SourceCreate withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;
    public SourceCreate withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
}
