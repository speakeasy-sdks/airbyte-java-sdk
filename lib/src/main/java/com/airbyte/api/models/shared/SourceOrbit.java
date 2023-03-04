package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOrbit {
    @JsonProperty("airbyte-source-name")
    public SourceOrbitOrbitEnum airbyteSourceName;
    public SourceOrbit withAirbyteSourceName(SourceOrbitOrbitEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceOrbit withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceOrbit withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("workspace")
    public String workspace;
    public SourceOrbit withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    
}
