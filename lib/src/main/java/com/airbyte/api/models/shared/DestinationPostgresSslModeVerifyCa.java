package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeVerifyCa
 * Verify-ca SSL mode.
**/
public class DestinationPostgresSslModeVerifyCa {
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public DestinationPostgresSslModeVerifyCa withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;
    public DestinationPostgresSslModeVerifyCa withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonProperty("mode")
    public DestinationPostgresSslModeVerifyCaModeEnum mode;
    public DestinationPostgresSslModeVerifyCa withMode(DestinationPostgresSslModeVerifyCaModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
