package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGitlabGitlabEnum {
    GITLAB("gitlab");

    @JsonValue
    public final String value;

    private SourceGitlabGitlabEnum(String value) {
        this.value = value;
    }
}
