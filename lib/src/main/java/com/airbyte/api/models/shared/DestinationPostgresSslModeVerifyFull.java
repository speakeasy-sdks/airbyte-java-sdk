package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeVerifyFull
 * Verify-full SSL mode.
**/
public class DestinationPostgresSslModeVerifyFull {
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public DestinationPostgresSslModeVerifyFull withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    @JsonProperty("client_certificate")
    public String clientCertificate;
    public DestinationPostgresSslModeVerifyFull withClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    
    @JsonProperty("client_key")
    public String clientKey;
    public DestinationPostgresSslModeVerifyFull withClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;
    public DestinationPostgresSslModeVerifyFull withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonProperty("mode")
    public DestinationPostgresSslModeVerifyFullModeEnum mode;
    public DestinationPostgresSslModeVerifyFull withMode(DestinationPostgresSslModeVerifyFullModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
