package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceRecurly {
    @JsonProperty("airbyte-source-name")
    public SourceRecurlyRecurlyEnum airbyteSourceName;
    public SourceRecurly withAirbyteSourceName(SourceRecurlyRecurlyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceRecurly withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("begin_time")
    public String beginTime;
    public SourceRecurly withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_time")
    public String endTime;
    public SourceRecurly withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    
}
