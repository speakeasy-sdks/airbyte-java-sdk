package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceMssqlTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public SourceMssqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourceMssqlTunnelMethodNoTunnel withTunnelMethod(SourceMssqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
