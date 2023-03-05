package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum {
    EXISTING_AND_NEW("Existing and New"),
    NEW_CHANGES_ONLY("New Changes Only");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodLogicalReplicationCDCDataToSyncEnum(String value) {
        this.value = value;
    }
}
