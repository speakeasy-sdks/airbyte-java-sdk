package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethodEnum {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    public final String value;

    private DestinationPostgresTunnelMethodSSHKeyAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}
