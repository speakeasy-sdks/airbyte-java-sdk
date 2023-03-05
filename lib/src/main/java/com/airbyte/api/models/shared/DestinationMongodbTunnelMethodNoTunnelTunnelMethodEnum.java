package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMongodbTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationMongodbTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
