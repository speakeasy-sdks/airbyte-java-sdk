package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderSFTPSecureFileTransferProtocolStorageEnum {
    SFTP("SFTP");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderSFTPSecureFileTransferProtocolStorageEnum(String value) {
        this.value = value;
    }
}
