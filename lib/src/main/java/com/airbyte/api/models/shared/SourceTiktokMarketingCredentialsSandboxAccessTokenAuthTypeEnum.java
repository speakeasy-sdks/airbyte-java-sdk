package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTiktokMarketingCredentialsSandboxAccessTokenAuthTypeEnum {
    SANDBOX_ACCESS_TOKEN("sandbox_access_token");

    @JsonValue
    public final String value;

    private SourceTiktokMarketingCredentialsSandboxAccessTokenAuthTypeEnum(String value) {
        this.value = value;
    }
}
