package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTempo
 * The values required to configure the source.
**/
public class SourceTempo {
    @JsonProperty("airbyte-source-name")
    public SourceTempoTempoEnum airbyteSourceName;
    public SourceTempo withAirbyteSourceName(SourceTempoTempoEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceTempo withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
}
