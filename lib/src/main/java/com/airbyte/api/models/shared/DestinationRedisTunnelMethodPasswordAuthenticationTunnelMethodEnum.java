package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethodEnum {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    public final String value;

    private DestinationRedisTunnelMethodPasswordAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}
