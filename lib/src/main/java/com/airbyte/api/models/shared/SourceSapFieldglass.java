package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSapFieldglass
 * The values required to configure the source.
**/
public class SourceSapFieldglass {
    @JsonProperty("airbyte-source-name")
    public SourceSapFieldglassSapFieldglassEnum airbyteSourceName;
    public SourceSapFieldglass withAirbyteSourceName(SourceSapFieldglassSapFieldglassEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSapFieldglass withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
