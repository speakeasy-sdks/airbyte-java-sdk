package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAlloydbTunnelMethodPasswordAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceAlloydbTunnelMethodPasswordAuthentication {
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public SourceAlloydbTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod;
    public SourceAlloydbTunnelMethodPasswordAuthentication withTunnelMethod(SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public SourceAlloydbTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public SourceAlloydbTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;
    public SourceAlloydbTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    
}
