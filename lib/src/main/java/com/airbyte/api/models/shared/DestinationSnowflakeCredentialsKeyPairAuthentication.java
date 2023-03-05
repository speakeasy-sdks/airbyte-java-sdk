package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationSnowflakeCredentialsKeyPairAuthentication {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public DestinationSnowflakeCredentialsKeyPairAuthenticationAuthTypeEnum authType;
    public DestinationSnowflakeCredentialsKeyPairAuthentication withAuthType(DestinationSnowflakeCredentialsKeyPairAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("private_key")
    public String privateKey;
    public DestinationSnowflakeCredentialsKeyPairAuthentication withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("private_key_password")
    public String privateKeyPassword;
    public DestinationSnowflakeCredentialsKeyPairAuthentication withPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
        return this;
    }
    
}
