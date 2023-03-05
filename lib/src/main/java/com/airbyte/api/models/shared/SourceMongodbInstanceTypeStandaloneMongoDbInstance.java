package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMongodbInstanceTypeStandaloneMongoDbInstance
 * The MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
**/
public class SourceMongodbInstanceTypeStandaloneMongoDbInstance {
    @JsonProperty("host")
    public String host;
    public SourceMongodbInstanceTypeStandaloneMongoDbInstance withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonProperty("instance")
    public SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance;
    public SourceMongodbInstanceTypeStandaloneMongoDbInstance withInstance(SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceMongodbInstanceTypeStandaloneMongoDbInstance withPort(Long port) {
        this.port = port;
        return this;
    }
    
}
