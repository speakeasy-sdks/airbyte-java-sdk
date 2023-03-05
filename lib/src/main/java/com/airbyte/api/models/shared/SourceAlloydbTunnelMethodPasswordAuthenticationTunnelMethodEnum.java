package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethodEnum {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    public final String value;

    private SourceAlloydbTunnelMethodPasswordAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}
