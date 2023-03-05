package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleTunnelMethodPasswordAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceOracleTunnelMethodPasswordAuthentication {
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public SourceOracleTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public SourceOracleTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod;
    public SourceOracleTunnelMethodPasswordAuthentication withTunnelMethod(SourceOracleTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public SourceOracleTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public SourceOracleTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;
    public SourceOracleTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    
}
