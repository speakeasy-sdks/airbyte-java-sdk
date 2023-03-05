package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlTunnelMethodNoTunnel
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceMysqlTunnelMethodNoTunnel {
    @JsonProperty("tunnel_method")
    public SourceMysqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public SourceMysqlTunnelMethodNoTunnel withTunnelMethod(SourceMysqlTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
