package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSendinblue
 * The values required to configure the source.
**/
public class SourceSendinblue {
    @JsonProperty("airbyte-source-name")
    public SourceSendinblueSendinblueEnum airbyteSourceName;
    public SourceSendinblue withAirbyteSourceName(SourceSendinblueSendinblueEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSendinblue withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
