package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGetlago
 * The values required to configure the source.
**/
public class SourceGetlago {
    @JsonProperty("airbyte-source-name")
    public SourceGetlagoGetlagoEnum airbyteSourceName;
    public SourceGetlago withAirbyteSourceName(SourceGetlagoGetlagoEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGetlago withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
