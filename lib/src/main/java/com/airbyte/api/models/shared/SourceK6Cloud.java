package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceK6Cloud
 * The values required to configure the source.
**/
public class SourceK6Cloud {
    @JsonProperty("airbyte-source-name")
    public SourceK6CloudK6CloudEnum airbyteSourceName;
    public SourceK6Cloud withAirbyteSourceName(SourceK6CloudK6CloudEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceK6Cloud withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
}
