package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationGcsCredentialHMACKeyCredentialTypeEnum {
    HMAC_KEY("HMAC_KEY");

    @JsonValue
    public final String value;

    private DestinationGcsCredentialHMACKeyCredentialTypeEnum(String value) {
        this.value = value;
    }
}
