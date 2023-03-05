package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlSslModeVerifyIdentity
 * Always connect with SSL. Verify both CA and Hostname.
**/
public class SourceMysqlSslModeVerifyIdentity {
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public SourceMysqlSslModeVerifyIdentity withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_certificate")
    public String clientCertificate;
    public SourceMysqlSslModeVerifyIdentity withClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key")
    public String clientKey;
    public SourceMysqlSslModeVerifyIdentity withClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;
    public SourceMysqlSslModeVerifyIdentity withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonProperty("mode")
    public SourceMysqlSslModeVerifyIdentityModeEnum mode;
    public SourceMysqlSslModeVerifyIdentity withMode(SourceMysqlSslModeVerifyIdentityModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
