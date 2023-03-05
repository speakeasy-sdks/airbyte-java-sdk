package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
