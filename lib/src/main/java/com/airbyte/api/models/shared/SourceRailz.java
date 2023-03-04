package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceRailz {
    @JsonProperty("airbyte-source-name")
    public SourceRailzRailzEnum airbyteSourceName;
    public SourceRailz withAirbyteSourceName(SourceRailzRailzEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceRailz withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("secret_key")
    public String secretKey;
    public SourceRailz withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceRailz withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
