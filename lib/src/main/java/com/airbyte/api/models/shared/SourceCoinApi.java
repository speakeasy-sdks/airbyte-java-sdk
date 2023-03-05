package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceCoinApi
 * The values required to configure the source.
**/
public class SourceCoinApi {
    @JsonProperty("airbyte-source-name")
    public SourceCoinApiCoinApiEnum airbyteSourceName;
    public SourceCoinApi withAirbyteSourceName(SourceCoinApiCoinApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceCoinApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceCoinApi withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("environment")
    public SourceCoinApiEnvironmentEnum environment;
    public SourceCoinApi withEnvironment(SourceCoinApiEnvironmentEnum environment) {
        this.environment = environment;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public SourceCoinApi withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonProperty("period")
    public String period;
    public SourceCoinApi withPeriod(String period) {
        this.period = period;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceCoinApi withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("symbol_id")
    public String symbolId;
    public SourceCoinApi withSymbolId(String symbolId) {
        this.symbolId = symbolId;
        return this;
    }
    
}
