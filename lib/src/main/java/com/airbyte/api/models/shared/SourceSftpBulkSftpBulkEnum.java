package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSftpBulkSftpBulkEnum {
    SFTP_BULK("sftp-bulk");

    @JsonValue
    public final String value;

    private SourceSftpBulkSftpBulkEnum(String value) {
        this.value = value;
    }
}
