package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethodEnum {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    public final String value;

    private DestinationMongodbTunnelMethodPasswordAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}
