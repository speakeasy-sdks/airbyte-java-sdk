package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMixpanelCredentialsProjectSecretOptionTitleEnum {
    PROJECT_SECRET("Project Secret");

    @JsonValue
    public final String value;

    private SourceMixpanelCredentialsProjectSecretOptionTitleEnum(String value) {
        this.value = value;
    }
}
