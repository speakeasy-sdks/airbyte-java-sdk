package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOracleTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private SourceOracleTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
