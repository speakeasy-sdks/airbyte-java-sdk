package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssqlSslMethodEncryptedTrustServerCertificate
 * Use the certificate provided by the server without verification. (For testing purposes only!)
**/
public class DestinationMssqlSslMethodEncryptedTrustServerCertificate {
    @JsonProperty("ssl_method")
    public DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum sslMethod;
    public DestinationMssqlSslMethodEncryptedTrustServerCertificate withSslMethod(DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
}
