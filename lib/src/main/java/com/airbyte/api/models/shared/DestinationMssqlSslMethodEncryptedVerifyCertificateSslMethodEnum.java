package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum {
    ENCRYPTED_VERIFY_CERTIFICATE("encrypted_verify_certificate");

    @JsonValue
    public final String value;

    private DestinationMssqlSslMethodEncryptedVerifyCertificateSslMethodEnum(String value) {
        this.value = value;
    }
}
