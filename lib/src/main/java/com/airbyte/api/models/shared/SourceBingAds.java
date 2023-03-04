package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourceBingAds {
    @JsonProperty("airbyte-source-name")
    public SourceBingAdsBingAdsEnum airbyteSourceName;
    public SourceBingAds withAirbyteSourceName(SourceBingAdsBingAdsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceBingAdsAuthMethodEnum authMethod;
    public SourceBingAds withAuthMethod(SourceBingAdsAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceBingAds withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceBingAds withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("developer_token")
    public String developerToken;
    public SourceBingAds withDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceBingAds withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("reports_start_date")
    public LocalDate reportsStartDate;
    public SourceBingAds withReportsStartDate(LocalDate reportsStartDate) {
        this.reportsStartDate = reportsStartDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tenant_id")
    public String tenantId;
    public SourceBingAds withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    
}
