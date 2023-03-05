package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethodEnum {
    CLIENT_NNE("client_nne");

    @JsonValue
    public final String value;

    private SourceOracleEncryptionNativeNetworkEncryptionNNEEncryptionMethodEnum(String value) {
        this.value = value;
    }
}
