package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
