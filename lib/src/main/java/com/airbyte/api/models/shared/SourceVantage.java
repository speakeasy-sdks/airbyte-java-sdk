package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceVantage {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceVantage withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceVantageVantageEnum airbyteSourceName;
    public SourceVantage withAirbyteSourceName(SourceVantageVantageEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
