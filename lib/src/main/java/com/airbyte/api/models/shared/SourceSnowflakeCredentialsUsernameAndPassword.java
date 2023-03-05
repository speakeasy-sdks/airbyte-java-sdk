package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSnowflakeCredentialsUsernameAndPassword {
    @JsonProperty("auth_type")
    public SourceSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType;
    public SourceSnowflakeCredentialsUsernameAndPassword withAuthType(SourceSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceSnowflakeCredentialsUsernameAndPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceSnowflakeCredentialsUsernameAndPassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
