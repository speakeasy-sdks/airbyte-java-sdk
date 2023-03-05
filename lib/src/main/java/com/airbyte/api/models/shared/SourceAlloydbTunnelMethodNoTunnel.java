package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAlloydbTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceAlloydbTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public SourceAlloydbTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourceAlloydbTunnelMethodNoTunnel withTunnelMethod(SourceAlloydbTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
