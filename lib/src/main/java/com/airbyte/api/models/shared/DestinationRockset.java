package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationRockset {
    @JsonProperty("airbyte-destination-name")
    public DestinationRocksetRocksetEnum airbyteDestinationName;
    public DestinationRockset withAirbyteDestinationName(DestinationRocksetRocksetEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public DestinationRockset withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_server")
    public String apiServer;
    public DestinationRockset withApiServer(String apiServer) {
        this.apiServer = apiServer;
        return this;
    }
    
    @JsonProperty("workspace")
    public String workspace;
    public DestinationRockset withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    
}
