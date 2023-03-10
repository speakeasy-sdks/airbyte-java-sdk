package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlTunnelMethodPasswordAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceMysqlTunnelMethodPasswordAuthentication {
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public SourceMysqlTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod;
    public SourceMysqlTunnelMethodPasswordAuthentication withTunnelMethod(SourceMysqlTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public SourceMysqlTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public SourceMysqlTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;
    public SourceMysqlTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    
}
