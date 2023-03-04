package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePocketContentTypeEnum {
    ARTICLE("article"),
    VIDEO("video"),
    IMAGE("image");

    @JsonValue
    public final String value;

    private SourcePocketContentTypeEnum(String value) {
        this.value = value;
    }
}
