package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithmEnum {
    AES256("AES256"),
    RC456("RC4_56"),
    THREE_DES168("3DES168");

    @JsonValue
    public final String value;

    private SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionAlgorithmEnum(String value) {
        this.value = value;
    }
}
