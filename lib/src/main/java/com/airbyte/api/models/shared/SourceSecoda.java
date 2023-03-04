package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSecoda {
    @JsonProperty("airbyte-source-name")
    public SourceSecodaSecodaEnum airbyteSourceName;
    public SourceSecoda withAirbyteSourceName(SourceSecodaSecodaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSecoda withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
