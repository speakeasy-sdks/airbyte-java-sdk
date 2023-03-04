package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGridly {
    @JsonProperty("airbyte-source-name")
    public SourceGridlyGridlyEnum airbyteSourceName;
    public SourceGridly withAirbyteSourceName(SourceGridlyGridlyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGridly withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("grid_id")
    public String gridId;
    public SourceGridly withGridId(String gridId) {
        this.gridId = gridId;
        return this;
    }
    
}
