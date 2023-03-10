package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveymonkeySurveyMonkeyAuthorizationMethod
 * The authorization method to use to retrieve data from SurveyMonkey
**/
public class SourceSurveymonkeySurveyMonkeyAuthorizationMethod {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethodEnum authMethod;
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withAuthMethod(SourceSurveymonkeySurveyMonkeyAuthorizationMethodAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
}
