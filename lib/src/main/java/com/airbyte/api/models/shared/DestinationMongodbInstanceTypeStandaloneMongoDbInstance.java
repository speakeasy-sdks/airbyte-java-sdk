package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbInstanceTypeStandaloneMongoDbInstance
 * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
**/
public class DestinationMongodbInstanceTypeStandaloneMongoDbInstance {
    @JsonProperty("host")
    public String host;
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonProperty("instance")
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance;
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withInstance(DestinationMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationMongodbInstanceTypeStandaloneMongoDbInstance withPort(Long port) {
        this.port = port;
        return this;
    }
    
}
