package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceClickhouseTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private SourceClickhouseTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
