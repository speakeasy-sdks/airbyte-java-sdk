package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlSslModeRequired
 * Always connect with SSL. If the MySQL server doesn’t support SSL, the connection will not be established. Certificate Authority (CA) and Hostname are not verified.
**/
public class SourceMysqlSslModeRequired {
    @JsonProperty("mode")
    public SourceMysqlSslModeRequiredModeEnum mode;
    public SourceMysqlSslModeRequired withMode(SourceMysqlSslModeRequiredModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
