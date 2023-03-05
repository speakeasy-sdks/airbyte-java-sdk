package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAuth0
 * The values required to configure the source.
**/
public class SourceAuth0 {
    @JsonProperty("airbyte-source-name")
    public SourceAuth0Auth0Enum airbyteSourceName;
    public SourceAuth0 withAirbyteSourceName(SourceAuth0Auth0Enum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("base_url")
    public String baseUrl;
    public SourceAuth0 withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    
    @JsonProperty("credentials")
    public Object credentials;
    public SourceAuth0 withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
