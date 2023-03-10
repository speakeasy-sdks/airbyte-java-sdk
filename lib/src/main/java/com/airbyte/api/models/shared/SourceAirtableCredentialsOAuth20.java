package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceAirtableCredentialsOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceAirtableCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceAirtableCredentialsOAuth20AuthMethodEnum authMethod;
    public SourceAirtableCredentialsOAuth20 withAuthMethod(SourceAirtableCredentialsOAuth20AuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceAirtableCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceAirtableCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceAirtableCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("token_expiry_date")
    public OffsetDateTime tokenExpiryDate;
    public SourceAirtableCredentialsOAuth20 withTokenExpiryDate(OffsetDateTime tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
        return this;
    }
    
}
