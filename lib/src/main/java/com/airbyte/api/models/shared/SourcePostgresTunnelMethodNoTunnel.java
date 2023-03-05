package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgresTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourcePostgresTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public SourcePostgresTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourcePostgresTunnelMethodNoTunnel withTunnelMethod(SourcePostgresTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
