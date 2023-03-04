package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationSftpJsonSftpJsonEnum {
    SFTP_JSON("sftp-json");

    @JsonValue
    public final String value;

    private DestinationSftpJsonSftpJsonEnum(String value) {
        this.value = value;
    }
}
