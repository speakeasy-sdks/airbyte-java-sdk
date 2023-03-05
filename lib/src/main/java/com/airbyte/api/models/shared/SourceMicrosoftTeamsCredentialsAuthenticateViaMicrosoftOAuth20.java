package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20
 * Choose how to authenticate to Microsoft
**/
public class SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthTypeEnum authType;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 withAuthType(SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("tenant_id")
    public String tenantId;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftOAuth20 withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    
}
