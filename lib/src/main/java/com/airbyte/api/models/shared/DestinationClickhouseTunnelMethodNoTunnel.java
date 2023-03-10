package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationClickhouseTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationClickhouseTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationClickhouseTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationClickhouseTunnelMethodNoTunnel withTunnelMethod(DestinationClickhouseTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
