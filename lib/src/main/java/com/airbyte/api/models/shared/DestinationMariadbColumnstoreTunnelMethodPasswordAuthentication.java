package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication {
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod;
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication withTunnelMethod(DestinationMariadbColumnstoreTunnelMethodPasswordAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;
    public DestinationMariadbColumnstoreTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    
}
