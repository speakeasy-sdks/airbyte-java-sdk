package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSftpCredentialsSSHKeyAuthentication
 * The server authentication method
**/
public class SourceSftpCredentialsSSHKeyAuthentication {
    @JsonProperty("auth_method")
    public SourceSftpCredentialsSSHKeyAuthenticationAuthMethodEnum authMethod;
    public SourceSftpCredentialsSSHKeyAuthentication withAuthMethod(SourceSftpCredentialsSSHKeyAuthenticationAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    @JsonProperty("auth_ssh_key")
    public String authSshKey;
    public SourceSftpCredentialsSSHKeyAuthentication withAuthSshKey(String authSshKey) {
        this.authSshKey = authSshKey;
        return this;
    }
    
}
