package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssqlTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationMssqlTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationMssqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationMssqlTunnelMethodNoTunnel withTunnelMethod(DestinationMssqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
