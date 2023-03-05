package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceAlloydbTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private SourceAlloydbTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
