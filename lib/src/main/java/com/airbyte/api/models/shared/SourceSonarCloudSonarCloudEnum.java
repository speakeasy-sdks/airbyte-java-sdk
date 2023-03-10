package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSonarCloudSonarCloudEnum {
    SONAR_CLOUD("sonar-cloud");

    @JsonValue
    public final String value;

    private SourceSonarCloudSonarCloudEnum(String value) {
        this.value = value;
    }
}
