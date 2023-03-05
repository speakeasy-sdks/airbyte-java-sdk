package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceUsCensus
 * The values required to configure the source.
**/
public class SourceUsCensus {
    @JsonProperty("airbyte-source-name")
    public SourceUsCensusUsCensusEnum airbyteSourceName;
    public SourceUsCensus withAirbyteSourceName(SourceUsCensusUsCensusEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceUsCensus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_params")
    public String queryParams;
    public SourceUsCensus withQueryParams(String queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @JsonProperty("query_path")
    public String queryPath;
    public SourceUsCensus withQueryPath(String queryPath) {
        this.queryPath = queryPath;
        return this;
    }
    
}
