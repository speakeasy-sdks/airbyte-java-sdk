package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSftpSftpEnum {
    SFTP("sftp");

    @JsonValue
    public final String value;

    private SourceSftpSftpEnum(String value) {
        this.value = value;
    }
}
