package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePaypalTransaction
 * The values required to configure the source.
**/
public class SourcePaypalTransaction {
    @JsonProperty("airbyte-source-name")
    public SourcePaypalTransactionPaypalTransactionEnum airbyteSourceName;
    public SourcePaypalTransaction withAirbyteSourceName(SourcePaypalTransactionPaypalTransactionEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;
    public SourcePaypalTransaction withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourcePaypalTransaction withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourcePaypalTransaction withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourcePaypalTransaction withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourcePaypalTransaction withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
