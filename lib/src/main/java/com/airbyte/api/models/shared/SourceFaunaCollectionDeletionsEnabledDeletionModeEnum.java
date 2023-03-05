package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFaunaCollectionDeletionsEnabledDeletionModeEnum {
    DELETED_FIELD("deleted_field");

    @JsonValue
    public final String value;

    private SourceFaunaCollectionDeletionsEnabledDeletionModeEnum(String value) {
        this.value = value;
    }
}
