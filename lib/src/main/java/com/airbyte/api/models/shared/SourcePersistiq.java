package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePersistiq {
    @JsonProperty("airbyte-source-name")
    public SourcePersistiqPersistiqEnum airbyteSourceName;
    public SourcePersistiq withAirbyteSourceName(SourcePersistiqPersistiqEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourcePersistiq withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
