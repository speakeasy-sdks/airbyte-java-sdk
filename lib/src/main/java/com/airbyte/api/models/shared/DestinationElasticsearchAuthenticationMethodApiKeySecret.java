package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationElasticsearchAuthenticationMethodApiKeySecret
 * Use a api key and secret combination to authenticate
**/
public class DestinationElasticsearchAuthenticationMethodApiKeySecret {
    @JsonProperty("apiKeyId")
    public String apiKeyId;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    
    @JsonProperty("apiKeySecret")
    public String apiKeySecret;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withApiKeySecret(String apiKeySecret) {
        this.apiKeySecret = apiKeySecret;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum method;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withMethod(DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
