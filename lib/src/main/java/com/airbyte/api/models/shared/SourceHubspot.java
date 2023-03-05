package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceHubspot
 * The values required to configure the source.
**/
public class SourceHubspot {
    @JsonProperty("airbyte-source-name")
    public SourceHubspotHubspotEnum airbyteSourceName;
    public SourceHubspot withAirbyteSourceName(SourceHubspotHubspotEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials")
    public Object credentials;
    public SourceHubspot withCredentials(Object credentials) {
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
