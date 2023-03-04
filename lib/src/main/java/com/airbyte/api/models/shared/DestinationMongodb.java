package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationMongodb {
    @JsonProperty("airbyte-destination-name")
    public DestinationMongodbMongodbEnum airbyteDestinationName;
    public DestinationMongodb withAirbyteDestinationName(DestinationMongodbMongodbEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("auth_type")
    public java.util.Map<String, Object> authType;
    public DestinationMongodb withAuthType(java.util.Map<String, Object> authType) {
        this.authType = authType;
        return this;
    }
    
    @JsonProperty("database")
    public String database;
    public DestinationMongodb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_type")
    public java.util.Map<String, Object> instanceType;
    public DestinationMongodb withInstanceType(java.util.Map<String, Object> instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public java.util.Map<String, Object> tunnelMethod;
    public DestinationMongodb withTunnelMethod(java.util.Map<String, Object> tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
