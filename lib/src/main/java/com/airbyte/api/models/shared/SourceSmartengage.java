package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSmartengage
 * The values required to configure the source.
**/
public class SourceSmartengage {
    @JsonProperty("airbyte-source-name")
    public SourceSmartengageSmartengageEnum airbyteSourceName;
    public SourceSmartengage withAirbyteSourceName(SourceSmartengageSmartengageEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSmartengage withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
