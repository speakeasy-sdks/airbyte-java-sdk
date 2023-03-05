package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodb
 * The values required to configure the destination.
**/
public class DestinationMongodb {
    @JsonProperty("airbyte-destination-name")
    public DestinationMongodbMongodbEnum airbyteDestinationName;
    public DestinationMongodb withAirbyteDestinationName(DestinationMongodbMongodbEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("auth_type")
    public Object authType;
    public DestinationMongodb withAuthType(Object authType) {
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
    public Object instanceType;
    public DestinationMongodb withInstanceType(Object instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public DestinationMongodb withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
