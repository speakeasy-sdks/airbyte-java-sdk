package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeDisable
 * Disable SSL.
**/
public class DestinationPostgresSslModeDisable {
    @JsonProperty("mode")
    public DestinationPostgresSslModeDisableModeEnum mode;
    public DestinationPostgresSslModeDisable withMode(DestinationPostgresSslModeDisableModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
