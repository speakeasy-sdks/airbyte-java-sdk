package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedisTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationRedisTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public DestinationRedisTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationRedisTunnelMethodNoTunnel withTunnelMethod(DestinationRedisTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
