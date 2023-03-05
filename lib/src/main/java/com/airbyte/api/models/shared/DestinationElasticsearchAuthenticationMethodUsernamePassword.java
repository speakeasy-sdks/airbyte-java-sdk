package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationElasticsearchAuthenticationMethodUsernamePassword
 * Basic auth header with a username and password
**/
public class DestinationElasticsearchAuthenticationMethodUsernamePassword {
    @JsonProperty("method")
    public DestinationElasticsearchAuthenticationMethodUsernamePasswordMethodEnum method;
    public DestinationElasticsearchAuthenticationMethodUsernamePassword withMethod(DestinationElasticsearchAuthenticationMethodUsernamePasswordMethodEnum method) {
        this.method = method;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationElasticsearchAuthenticationMethodUsernamePassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationElasticsearchAuthenticationMethodUsernamePassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
