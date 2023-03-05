package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationScylla
 * The values required to configure the destination.
**/
public class DestinationScylla {
    @JsonProperty("address")
    public String address;
    public DestinationScylla withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationScyllaScyllaEnum airbyteDestinationName;
    public DestinationScylla withAirbyteDestinationName(DestinationScyllaScyllaEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("keyspace")
    public String keyspace;
    public DestinationScylla withKeyspace(String keyspace) {
        this.keyspace = keyspace;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationScylla withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationScylla withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication")
    public Long replication;
    public DestinationScylla withReplication(Long replication) {
        this.replication = replication;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationScylla withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
