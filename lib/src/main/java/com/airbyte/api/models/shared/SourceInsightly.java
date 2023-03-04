package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceInsightly {
    @JsonProperty("airbyte-source-name")
    public SourceInsightlyInsightlyEnum airbyteSourceName;
    public SourceInsightly withAirbyteSourceName(SourceInsightlyInsightlyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceInsightly withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceInsightly withToken(String token) {
        this.token = token;
        return this;
    }
    
}
