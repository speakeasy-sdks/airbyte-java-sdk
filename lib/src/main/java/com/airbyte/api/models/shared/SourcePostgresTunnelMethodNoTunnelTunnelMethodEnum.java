package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePostgresTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private SourcePostgresTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
