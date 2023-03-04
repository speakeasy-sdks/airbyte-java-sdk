package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceHubspot {
    @JsonProperty("airbyte-source-name")
    public SourceHubspotHubspotEnum airbyteSourceName;
    public SourceHubspot withAirbyteSourceName(SourceHubspotHubspotEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceHubspot withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceHubspot withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
