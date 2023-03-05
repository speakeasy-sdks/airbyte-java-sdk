package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMixpanelCredentialsServiceAccountOptionTitleEnum {
    SERVICE_ACCOUNT("Service Account");

    @JsonValue
    public final String value;

    private SourceMixpanelCredentialsServiceAccountOptionTitleEnum(String value) {
        this.value = value;
    }
}
