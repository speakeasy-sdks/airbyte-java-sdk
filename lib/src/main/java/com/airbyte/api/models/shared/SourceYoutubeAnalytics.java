package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceYoutubeAnalytics {
    @JsonProperty("airbyte-source-name")
    public SourceYoutubeAnalyticsYoutubeAnalyticsEnum airbyteSourceName;
    public SourceYoutubeAnalytics withAirbyteSourceName(SourceYoutubeAnalyticsYoutubeAnalyticsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceYoutubeAnalytics withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
