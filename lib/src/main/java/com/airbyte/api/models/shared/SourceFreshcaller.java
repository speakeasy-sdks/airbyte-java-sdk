package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceFreshcaller {
    @JsonProperty("airbyte-source-name")
    public SourceFreshcallerFreshcallerEnum airbyteSourceName;
    public SourceFreshcaller withAirbyteSourceName(SourceFreshcallerFreshcallerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceFreshcaller withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("domain")
    public String domain;
    public SourceFreshcaller withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_minute")
    public Long requestsPerMinute;
    public SourceFreshcaller withRequestsPerMinute(Long requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        return this;
    }
    
    @JsonProperty("start_date")
    public Object startDate;
    public SourceFreshcaller withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sync_lag_minutes")
    public Long syncLagMinutes;
    public SourceFreshcaller withSyncLagMinutes(Long syncLagMinutes) {
        this.syncLagMinutes = syncLagMinutes;
        return this;
    }
    
}
