package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum {
    ENCRYPTED_TRUST_SERVER_CERTIFICATE("encrypted_trust_server_certificate");

    @JsonValue
    public final String value;

    private SourceMssqlSslMethodEncryptedTrustServerCertificateSslMethodEnum(String value) {
        this.value = value;
    }
}
