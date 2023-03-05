package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft
 * Choose how to authenticate to Microsoft
**/
public class SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum authType;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withAuthType(SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoftAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("tenant_id")
    public String tenantId;
    public SourceMicrosoftTeamsCredentialsAuthenticateViaMicrosoft withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    
}
