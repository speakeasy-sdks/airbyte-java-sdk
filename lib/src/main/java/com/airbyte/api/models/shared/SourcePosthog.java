package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePosthog
 * The values required to configure the source.
**/
public class SourcePosthog {
    @JsonProperty("airbyte-source-name")
    public SourcePosthogPosthogEnum airbyteSourceName;
    public SourcePosthog withAirbyteSourceName(SourcePosthogPosthogEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourcePosthog withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base_url")
    public String baseUrl;
    public SourcePosthog withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourcePosthog withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
