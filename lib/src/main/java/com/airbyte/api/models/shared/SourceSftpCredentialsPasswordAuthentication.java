package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSftpCredentialsPasswordAuthentication
 * The server authentication method
**/
public class SourceSftpCredentialsPasswordAuthentication {
    @JsonProperty("auth_method")
    public SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum authMethod;
    public SourceSftpCredentialsPasswordAuthentication withAuthMethod(SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("auth_user_password")
    public String authUserPassword;
    public SourceSftpCredentialsPasswordAuthentication withAuthUserPassword(String authUserPassword) {
        this.authUserPassword = authUserPassword;
        return this;
    }
    
}
