package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceClickhouseTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceClickhouseTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public SourceClickhouseTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourceClickhouseTunnelMethodNoTunnel withTunnelMethod(SourceClickhouseTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
