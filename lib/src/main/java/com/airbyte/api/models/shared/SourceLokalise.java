package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceLokalise {
    @JsonProperty("airbyte-source-name")
    public SourceLokaliseLokaliseEnum airbyteSourceName;
    public SourceLokalise withAirbyteSourceName(SourceLokaliseLokaliseEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceLokalise withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public SourceLokalise withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
