package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSurveySparrowSurveySparrowEnum {
    SURVEY_SPARROW("survey-sparrow");

    @JsonValue
    public final String value;

    private SourceSurveySparrowSurveySparrowEnum(String value) {
        this.value = value;
    }
}
