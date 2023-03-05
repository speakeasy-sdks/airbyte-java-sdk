package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSalesforceSinger
 * The values required to configure the source.
**/
public class SourceSalesforceSinger {
    @JsonProperty("airbyte-source-name")
    public SourceSalesforceSingerSalesforceSingerEnum airbyteSourceName;
    public SourceSalesforceSinger withAirbyteSourceName(SourceSalesforceSingerSalesforceSingerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_type")
    public SourceSalesforceSingerApiTypeEnum apiType;
    public SourceSalesforceSinger withApiType(SourceSalesforceSingerApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceSalesforceSinger withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSalesforceSinger withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceSalesforceSinger withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quota_percent_per_run")
    public Double quotaPercentPerRun;
    public SourceSalesforceSinger withQuotaPercentPerRun(Double quotaPercentPerRun) {
        this.quotaPercentPerRun = quotaPercentPerRun;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quota_percent_total")
    public Double quotaPercentTotal;
    public SourceSalesforceSinger withQuotaPercentTotal(Double quotaPercentTotal) {
        this.quotaPercentTotal = quotaPercentTotal;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSalesforceSinger withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceSalesforceSinger withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
