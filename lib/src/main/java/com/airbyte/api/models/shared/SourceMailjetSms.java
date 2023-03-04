package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMailjetSms {
    @JsonProperty("airbyte-source-name")
    public SourceMailjetSmsMailjetSmsEnum airbyteSourceName;
    public SourceMailjetSms withAirbyteSourceName(SourceMailjetSmsMailjetSmsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public Long endDate;
    public SourceMailjetSms withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public Long startDate;
    public SourceMailjetSms withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceMailjetSms withToken(String token) {
        this.token = token;
        return this;
    }
    
}
