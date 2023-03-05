package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum {
    SNAPSHOT("Snapshot"),
    READ_COMMITTED("Read Committed");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevelEnum(String value) {
        this.value = value;
    }
}
