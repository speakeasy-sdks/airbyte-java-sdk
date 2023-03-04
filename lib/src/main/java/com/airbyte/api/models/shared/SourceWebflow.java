package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceWebflow {
    @JsonProperty("airbyte-source-name")
    public SourceWebflowWebflowEnum airbyteSourceName;
    public SourceWebflow withAirbyteSourceName(SourceWebflowWebflowEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceWebflow withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("site_id")
    public String siteId;
    public SourceWebflow withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    
}
