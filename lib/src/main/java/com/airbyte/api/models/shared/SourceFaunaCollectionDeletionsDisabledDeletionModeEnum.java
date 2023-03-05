package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFaunaCollectionDeletionsDisabledDeletionModeEnum {
    IGNORE("ignore");

    @JsonValue
    public final String value;

    private SourceFaunaCollectionDeletionsDisabledDeletionModeEnum(String value) {
        this.value = value;
    }
}
