package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceZuora
 * The values required to configure the source.
**/
public class SourceZuora {
    @JsonProperty("airbyte-source-name")
    public SourceZuoraZuoraEnum airbyteSourceName;
    public SourceZuora withAirbyteSourceName(SourceZuoraZuoraEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceZuora withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceZuora withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceZuora withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceZuora withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;
    public SourceZuora withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
}
