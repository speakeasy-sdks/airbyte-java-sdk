package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationOracleTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationOracleTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationOracleTunnelMethodNoTunnel withTunnelMethod(DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
