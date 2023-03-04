package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSendinblueSendinblueEnum {
    SENDINBLUE("sendinblue");

    @JsonValue
    public final String value;

    private SourceSendinblueSendinblueEnum(String value) {
        this.value = value;
    }
}
