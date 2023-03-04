package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceInstatus {
    @JsonProperty("airbyte-source-name")
    public SourceInstatusInstatusEnum airbyteSourceName;
    public SourceInstatus withAirbyteSourceName(SourceInstatusInstatusEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceInstatus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
