package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlTunnelMethodSSHKeyAuthentication
 * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
**/
public class SourceMssqlTunnelMethodSSHKeyAuthentication {
    @JsonProperty("ssh_key")
    public String sshKey;
    public SourceMssqlTunnelMethodSSHKeyAuthentication withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public SourceMssqlTunnelMethodSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    @JsonProperty("tunnel_method")
    public SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod;
    public SourceMssqlTunnelMethodSSHKeyAuthentication withTunnelMethod(SourceMssqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public SourceMssqlTunnelMethodSSHKeyAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public SourceMssqlTunnelMethodSSHKeyAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
}
