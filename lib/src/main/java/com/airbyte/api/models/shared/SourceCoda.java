package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceCoda {
    @JsonProperty("airbyte-source-name")
    public SourceCodaCodaEnum airbyteSourceName;
    public SourceCoda withAirbyteSourceName(SourceCodaCodaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("auth_token")
    public String authToken;
    public SourceCoda withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
}
