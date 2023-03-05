package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum {
    HMAC_KEY("HMAC_KEY");

    @JsonValue
    public final String value;

    private DestinationBigqueryLoadingMethodGCSStagingCredentialHMACKeyCredentialTypeEnum(String value) {
        this.value = value;
    }
}
