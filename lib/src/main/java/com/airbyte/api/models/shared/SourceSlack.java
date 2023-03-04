package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSlack {
    @JsonProperty("airbyte-source-name")
    public SourceSlackSlackEnum airbyteSourceName;
    public SourceSlack withAirbyteSourceName(SourceSlackSlackEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel_filter")
    public String[] channelFilter;
    public SourceSlack withChannelFilter(String[] channelFilter) {
        this.channelFilter = channelFilter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceSlack withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("join_channels")
    public Boolean joinChannels;
    public SourceSlack withJoinChannels(Boolean joinChannels) {
        this.joinChannels = joinChannels;
        return this;
    }
    
    @JsonProperty("lookback_window")
    public Long lookbackWindow;
    public SourceSlack withLookbackWindow(Long lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceSlack withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
