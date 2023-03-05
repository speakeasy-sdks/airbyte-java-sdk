package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMeilisearch
 * The values required to configure the destination.
**/
public class DestinationMeilisearch {
    @JsonProperty("airbyte-destination-name")
    public DestinationMeilisearchMeilisearchEnum airbyteDestinationName;
    public DestinationMeilisearch withAirbyteDestinationName(DestinationMeilisearchMeilisearchEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_key")
    public String apiKey;
    public DestinationMeilisearch withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public DestinationMeilisearch withHost(String host) {
        this.host = host;
        return this;
    }
    
}
