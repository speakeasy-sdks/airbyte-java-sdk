package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationCassandra
 * The values required to configure the destination.
**/
public class DestinationCassandra {
    @JsonProperty("address")
    public String address;
    public DestinationCassandra withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationCassandraCassandraEnum airbyteDestinationName;
    public DestinationCassandra withAirbyteDestinationName(DestinationCassandraCassandraEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datacenter")
    public String datacenter;
    public DestinationCassandra withDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    
    @JsonProperty("keyspace")
    public String keyspace;
    public DestinationCassandra withKeyspace(String keyspace) {
        this.keyspace = keyspace;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public DestinationCassandra withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public DestinationCassandra withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication")
    public Long replication;
    public DestinationCassandra withReplication(Long replication) {
        this.replication = replication;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public DestinationCassandra withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
