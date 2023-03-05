package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceIntercom
 * The values required to configure the source.
**/
public class SourceIntercom {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceIntercom withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceIntercomIntercomEnum airbyteSourceName;
    public SourceIntercom withAirbyteSourceName(SourceIntercomIntercomEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceIntercom withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
