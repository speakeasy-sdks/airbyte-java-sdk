package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbAuthTypeNone
 * None.
**/
public class DestinationMongodbAuthTypeNone {
    @JsonProperty("authorization")
    public DestinationMongodbAuthTypeNoneAuthorizationEnum authorization;
    public DestinationMongodbAuthTypeNone withAuthorization(DestinationMongodbAuthTypeNoneAuthorizationEnum authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
