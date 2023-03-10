package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceJiraJiraEnum {
    JIRA("jira");

    @JsonValue
    public final String value;

    private SourceJiraJiraEnum(String value) {
        this.value = value;
    }
}
