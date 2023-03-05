package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationClickhouseTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationClickhouseTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
