package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderSFTPSecureFileTransferProtocol
 * The storage Provider or Location of the file(s) which should be replicated.
**/
public class SourceFileSecureProviderSFTPSecureFileTransferProtocol {
    @JsonProperty("host")
    public String host;
    public SourceFileSecureProviderSFTPSecureFileTransferProtocol withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceFileSecureProviderSFTPSecureFileTransferProtocol withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public String port;
    public SourceFileSecureProviderSFTPSecureFileTransferProtocol withPort(String port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("storage")
    public SourceFileSecureProviderSFTPSecureFileTransferProtocolStorageEnum storage;
    public SourceFileSecureProviderSFTPSecureFileTransferProtocol withStorage(SourceFileSecureProviderSFTPSecureFileTransferProtocolStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
    @JsonProperty("user")
    public String user;
    public SourceFileSecureProviderSFTPSecureFileTransferProtocol withUser(String user) {
        this.user = user;
        return this;
    }
    
}
