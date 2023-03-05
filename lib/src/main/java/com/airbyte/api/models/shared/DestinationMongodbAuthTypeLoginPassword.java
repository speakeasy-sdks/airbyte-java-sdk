package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbAuthTypeLoginPassword
 * Login/Password.
**/
public class DestinationMongodbAuthTypeLoginPassword {
    @JsonProperty("authorization")
    public DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum authorization;
    public DestinationMongodbAuthTypeLoginPassword withAuthorization(DestinationMongodbAuthTypeLoginPasswordAuthorizationEnum authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationMongodbAuthTypeLoginPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationMongodbAuthTypeLoginPassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
