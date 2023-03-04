package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceRecruiteeRecruiteeEnum {
    RECRUITEE("recruitee");

    @JsonValue
    public final String value;

    private SourceRecruiteeRecruiteeEnum(String value) {
        this.value = value;
    }
}
