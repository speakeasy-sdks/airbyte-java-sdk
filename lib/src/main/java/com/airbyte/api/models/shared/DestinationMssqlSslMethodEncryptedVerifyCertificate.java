package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssqlSslMethodEncryptedVerifyCertificate
 * Verify and use the certificate provided by the server.
**/
public class DestinationMssqlSslMethodEncryptedVerifyCertificate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostNameInCertificate")
    public String hostNameInCertificate;
    public DestinationMssqlSslMethodEncryptedVerifyCertificate withHostNameInCertificate(String hostNameInCertificate) {
        this.hostNameInCertificate = hostNameInCertificate;
        return this;
    }
    
    @JsonProperty("ssl_method")
    public DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum sslMethod;
    public DestinationMssqlSslMethodEncryptedVerifyCertificate withSslMethod(DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
}
