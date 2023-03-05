package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbInstanceTypeMongoDBAtlas
 * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
**/
public class DestinationMongodbInstanceTypeMongoDBAtlas {
    @JsonProperty("cluster_url")
    public String clusterUrl;
    public DestinationMongodbInstanceTypeMongoDBAtlas withClusterUrl(String clusterUrl) {
        this.clusterUrl = clusterUrl;
        return this;
    }
    
    @JsonProperty("instance")
    public DestinationMongodbInstanceTypeMongoDBAtlasInstanceEnum instance;
    public DestinationMongodbInstanceTypeMongoDBAtlas withInstance(DestinationMongodbInstanceTypeMongoDBAtlasInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
}
