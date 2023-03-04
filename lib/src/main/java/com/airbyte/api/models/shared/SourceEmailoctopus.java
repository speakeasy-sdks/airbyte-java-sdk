package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceEmailoctopus {
    @JsonProperty("airbyte-source-name")
    public SourceEmailoctopusEmailoctopusEnum airbyteSourceName;
    public SourceEmailoctopus withAirbyteSourceName(SourceEmailoctopusEmailoctopusEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceEmailoctopus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
