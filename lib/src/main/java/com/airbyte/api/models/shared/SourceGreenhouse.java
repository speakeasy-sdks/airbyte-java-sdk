package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGreenhouse
 * The values required to configure the source.
**/
public class SourceGreenhouse {
    @JsonProperty("airbyte-source-name")
    public SourceGreenhouseGreenhouseEnum airbyteSourceName;
    public SourceGreenhouse withAirbyteSourceName(SourceGreenhouseGreenhouseEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGreenhouse withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
