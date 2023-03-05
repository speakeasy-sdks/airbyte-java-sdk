package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMariadbColumnstoreTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationMariadbColumnstoreTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationMariadbColumnstoreTunnelMethodNoTunnel withTunnelMethod(DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
