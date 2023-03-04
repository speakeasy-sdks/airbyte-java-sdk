package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceDixa {
    @JsonProperty("airbyte-source-name")
    public SourceDixaDixaEnum airbyteSourceName;
    public SourceDixa withAirbyteSourceName(SourceDixaDixaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceDixa withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public Long batchSize;
    public SourceDixa withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceDixa withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
