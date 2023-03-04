package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceHubplanner {
    @JsonProperty("airbyte-source-name")
    public SourceHubplannerHubplannerEnum airbyteSourceName;
    public SourceHubplanner withAirbyteSourceName(SourceHubplannerHubplannerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceHubplanner withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
