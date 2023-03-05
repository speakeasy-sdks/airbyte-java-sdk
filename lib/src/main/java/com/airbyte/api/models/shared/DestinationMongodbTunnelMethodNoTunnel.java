package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationMongodbTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationMongodbTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationMongodbTunnelMethodNoTunnel withTunnelMethod(DestinationMongodbTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
