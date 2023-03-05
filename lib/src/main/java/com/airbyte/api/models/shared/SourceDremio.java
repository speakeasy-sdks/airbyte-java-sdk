package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceDremio
 * The values required to configure the source.
**/
public class SourceDremio {
    @JsonProperty("airbyte-source-name")
    public SourceDremioDremioEnum airbyteSourceName;
    public SourceDremio withAirbyteSourceName(SourceDremioDremioEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceDremio withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("base_url")
    public String baseUrl;
    public SourceDremio withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    
}
