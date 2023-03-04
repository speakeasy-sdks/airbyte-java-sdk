package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceYoutubeAnalyticsBusiness {
    @JsonProperty("airbyte-source-name")
    public SourceYoutubeAnalyticsBusinessYoutubeAnalyticsBusinessEnum airbyteSourceName;
    public SourceYoutubeAnalyticsBusiness withAirbyteSourceName(SourceYoutubeAnalyticsBusinessYoutubeAnalyticsBusinessEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceYoutubeAnalyticsBusiness withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
