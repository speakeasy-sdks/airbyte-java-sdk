package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderSSHSecureShellStorageEnum {
    SSH("SSH");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderSSHSecureShellStorageEnum(String value) {
        this.value = value;
    }
}
