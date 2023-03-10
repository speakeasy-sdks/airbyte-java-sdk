package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGlassfrog
 * The values required to configure the source.
**/
public class SourceGlassfrog {
    @JsonProperty("airbyte-source-name")
    public SourceGlassfrogGlassfrogEnum airbyteSourceName;
    public SourceGlassfrog withAirbyteSourceName(SourceGlassfrogGlassfrogEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGlassfrog withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
