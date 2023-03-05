package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTiktokMarketingCredentialsSandboxAccessToken
 * Authentication method
**/
public class SourceTiktokMarketingCredentialsSandboxAccessToken {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceTiktokMarketingCredentialsSandboxAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("advertiser_id")
    public String advertiserId;
    public SourceTiktokMarketingCredentialsSandboxAccessToken withAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceTiktokMarketingCredentialsSandboxAccessTokenAuthTypeEnum authType;
    public SourceTiktokMarketingCredentialsSandboxAccessToken withAuthType(SourceTiktokMarketingCredentialsSandboxAccessTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
