package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationSnowflakeCredentialsUsernameAndPassword {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType;
    public DestinationSnowflakeCredentialsUsernameAndPassword withAuthType(DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationSnowflakeCredentialsUsernameAndPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
}
