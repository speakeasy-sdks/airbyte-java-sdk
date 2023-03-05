package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlSslMethodEncryptedVerifyCertificate
 * Verify and use the certificate provided by the server.
**/
public class SourceMssqlSslMethodEncryptedVerifyCertificate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostNameInCertificate")
    public String hostNameInCertificate;
    public SourceMssqlSslMethodEncryptedVerifyCertificate withHostNameInCertificate(String hostNameInCertificate) {
        this.hostNameInCertificate = hostNameInCertificate;
        return this;
    }
    
    @JsonProperty("ssl_method")
    public SourceMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum sslMethod;
    public SourceMssqlSslMethodEncryptedVerifyCertificate withSslMethod(SourceMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
}
