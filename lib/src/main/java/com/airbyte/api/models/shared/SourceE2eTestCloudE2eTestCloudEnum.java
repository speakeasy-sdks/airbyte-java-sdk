package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceE2eTestCloudE2eTestCloudEnum {
    E2E_TEST_CLOUD("e2e-test-cloud");

    @JsonValue
    public final String value;

    private SourceE2eTestCloudE2eTestCloudEnum(String value) {
        this.value = value;
    }
}
