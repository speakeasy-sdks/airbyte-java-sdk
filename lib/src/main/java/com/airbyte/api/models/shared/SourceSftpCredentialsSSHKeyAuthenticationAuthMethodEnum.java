package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSftpCredentialsSSHKeyAuthenticationAuthMethodEnum {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    public final String value;

    private SourceSftpCredentialsSSHKeyAuthenticationAuthMethodEnum(String value) {
        this.value = value;
    }
}
