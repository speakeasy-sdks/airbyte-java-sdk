package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceKustomerSinger
 * The values required to configure the source.
**/
public class SourceKustomerSinger {
    @JsonProperty("airbyte-source-name")
    public SourceKustomerSingerKustomerSingerEnum airbyteSourceName;
    public SourceKustomerSinger withAirbyteSourceName(SourceKustomerSingerKustomerSingerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceKustomerSinger withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceKustomerSinger withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
