package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModePrefer
 * Prefer SSL mode.
**/
public class DestinationPostgresSslModePrefer {
    @JsonProperty("mode")
    public DestinationPostgresSslModePreferModeEnum mode;
    public DestinationPostgresSslModePrefer withMode(DestinationPostgresSslModePreferModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
