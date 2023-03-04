package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceLemlist {
    @JsonProperty("airbyte-source-name")
    public SourceLemlistLemlistEnum airbyteSourceName;
    public SourceLemlist withAirbyteSourceName(SourceLemlistLemlistEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceLemlist withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
