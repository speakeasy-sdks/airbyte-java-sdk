package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceFreshdesk {
    @JsonProperty("airbyte-source-name")
    public SourceFreshdeskFreshdeskEnum airbyteSourceName;
    public SourceFreshdesk withAirbyteSourceName(SourceFreshdeskFreshdeskEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceFreshdesk withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("domain")
    public String domain;
    public SourceFreshdesk withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_minute")
    public Long requestsPerMinute;
    public SourceFreshdesk withRequestsPerMinute(Long requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFreshdesk withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
