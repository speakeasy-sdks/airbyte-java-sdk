package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceAmazonAds {
    @JsonProperty("airbyte-source-name")
    public SourceAmazonAdsAmazonAdsEnum airbyteSourceName;
    public SourceAmazonAds withAirbyteSourceName(SourceAmazonAdsAmazonAdsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceAmazonAdsAuthTypeEnum authType;
    public SourceAmazonAds withAuthType(SourceAmazonAdsAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceAmazonAds withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceAmazonAds withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("look_back_window")
    public Long lookBackWindow;
    public SourceAmazonAds withLookBackWindow(Long lookBackWindow) {
        this.lookBackWindow = lookBackWindow;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    public Long[] profiles;
    public SourceAmazonAds withProfiles(Long[] profiles) {
        this.profiles = profiles;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceAmazonAds withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public SourceAmazonAdsRegionEnum region;
    public SourceAmazonAds withRegion(SourceAmazonAdsRegionEnum region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceAmazonAds withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_filter")
    public SourceAmazonAdsStateFilterEnum[] stateFilter;
    public SourceAmazonAds withStateFilter(SourceAmazonAdsStateFilterEnum[] stateFilter) {
        this.stateFilter = stateFilter;
        return this;
    }
    
}
