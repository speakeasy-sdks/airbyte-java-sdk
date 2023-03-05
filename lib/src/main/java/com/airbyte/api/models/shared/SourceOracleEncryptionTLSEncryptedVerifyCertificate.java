package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracleEncryptionTLSEncryptedVerifyCertificate
 * Verify and use the certificate provided by the server.
**/
public class SourceOracleEncryptionTLSEncryptedVerifyCertificate {
    @JsonProperty("encryption_method")
    public SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethodEnum encryptionMethod;
    public SourceOracleEncryptionTLSEncryptedVerifyCertificate withEncryptionMethod(SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }
    
    @JsonProperty("ssl_certificate")
    public String sslCertificate;
    public SourceOracleEncryptionTLSEncryptedVerifyCertificate withSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }
    
}
