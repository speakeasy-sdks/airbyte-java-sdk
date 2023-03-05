package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSnowflakeCredentialsKeyPairAuthenticationAuthTypeEnum {
    KEY_PAIR_AUTHENTICATION("Key Pair Authentication");

    @JsonValue
    public final String value;

    private DestinationSnowflakeCredentialsKeyPairAuthenticationAuthTypeEnum(String value) {
        this.value = value;
    }
}
