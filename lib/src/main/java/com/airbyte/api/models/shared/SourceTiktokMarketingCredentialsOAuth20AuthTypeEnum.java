package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTiktokMarketingCredentialsOAuth20AuthTypeEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceTiktokMarketingCredentialsOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}
