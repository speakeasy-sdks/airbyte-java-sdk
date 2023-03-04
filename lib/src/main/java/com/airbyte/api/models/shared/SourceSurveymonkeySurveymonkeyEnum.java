package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSurveymonkeySurveymonkeyEnum {
    SURVEYMONKEY("surveymonkey");

    @JsonValue
    public final String value;

    private SourceSurveymonkeySurveymonkeyEnum(String value) {
        this.value = value;
    }
}
