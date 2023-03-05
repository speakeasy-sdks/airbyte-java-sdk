package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFileSecureProviderSCPSecureCopyProtocolStorageEnum {
    SCP("SCP");

    @JsonValue
    public final String value;

    private SourceFileSecureProviderSCPSecureCopyProtocolStorageEnum(String value) {
        this.value = value;
    }
}
