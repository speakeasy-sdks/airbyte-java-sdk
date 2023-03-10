package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlSslModePreferred
 * Automatically attempt SSL connection. If the MySQL server does not support SSL, continue with a regular connection.
**/
public class SourceMysqlSslModePreferred {
    @JsonProperty("mode")
    public SourceMysqlSslModePreferredModeEnum mode;
    public SourceMysqlSslModePreferred withMode(SourceMysqlSslModePreferredModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
