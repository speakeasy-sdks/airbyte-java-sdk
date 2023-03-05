package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbTunnelMethodSSHKeyAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class DestinationMongodbTunnelMethodSSHKeyAuthentication {
    @JsonProperty("ssh_key")
    public String sshKey;
    public DestinationMongodbTunnelMethodSSHKeyAuthentication withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public DestinationMongodbTunnelMethodSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod;
    public DestinationMongodbTunnelMethodSSHKeyAuthentication withTunnelMethod(DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public DestinationMongodbTunnelMethodSSHKeyAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public DestinationMongodbTunnelMethodSSHKeyAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
}
