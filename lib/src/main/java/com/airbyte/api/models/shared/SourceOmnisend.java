package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOmnisend
 * The values required to configure the source.
**/
public class SourceOmnisend {
    @JsonProperty("airbyte-source-name")
    public SourceOmnisendOmnisendEnum airbyteSourceName;
    public SourceOmnisend withAirbyteSourceName(SourceOmnisendOmnisendEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceOmnisend withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
