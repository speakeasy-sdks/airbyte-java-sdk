package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbInstanceTypeReplicaSet
 * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
**/
public class DestinationMongodbInstanceTypeReplicaSet {
    @JsonProperty("instance")
    public DestinationMongodbInstanceTypeReplicaSetInstanceEnum instance;
    public DestinationMongodbInstanceTypeReplicaSet withInstance(DestinationMongodbInstanceTypeReplicaSetInstanceEnum instance) {
        this.instance = instance;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replica_set")
    public String replicaSet;
    public DestinationMongodbInstanceTypeReplicaSet withReplicaSet(String replicaSet) {
        this.replicaSet = replicaSet;
        return this;
    }
    
    @JsonProperty("server_addresses")
    public String serverAddresses;
    public DestinationMongodbInstanceTypeReplicaSet withServerAddresses(String serverAddresses) {
        this.serverAddresses = serverAddresses;
        return this;
    }
    
}
