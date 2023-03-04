package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum {
    USA("USA"),
    EUROPE("Europe"),
    CANADA("Canada");

    @JsonValue
    public final String value;

    private SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum(String value) {
        this.value = value;
    }
}
