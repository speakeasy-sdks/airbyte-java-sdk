package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethodEnum {
    ENCRYPTED_VERIFY_CERTIFICATE("encrypted_verify_certificate");

    @JsonValue
    public final String value;

    private SourceOracleEncryptionTLSEncryptedVerifyCertificateEncryptionMethodEnum(String value) {
        this.value = value;
    }
}
