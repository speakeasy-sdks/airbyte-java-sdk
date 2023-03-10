package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderSCPSecureCopyProtocol
 * The storage Provider or Location of the file(s) which should be replicated.
**/
public class SourceFileSecureProviderSCPSecureCopyProtocol {
    @JsonProperty("host")
    public String host;
    public SourceFileSecureProviderSCPSecureCopyProtocol withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceFileSecureProviderSCPSecureCopyProtocol withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public String port;
    public SourceFileSecureProviderSCPSecureCopyProtocol withPort(String port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("storage")
    public SourceFileSecureProviderSCPSecureCopyProtocolStorageEnum storage;
    public SourceFileSecureProviderSCPSecureCopyProtocol withStorage(SourceFileSecureProviderSCPSecureCopyProtocolStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
    @JsonProperty("user")
    public String user;
    public SourceFileSecureProviderSCPSecureCopyProtocol withUser(String user) {
        this.user = user;
        return this;
    }
    
}
