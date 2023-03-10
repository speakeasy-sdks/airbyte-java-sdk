package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedisSslModeDisable
 * Disable SSL.
**/
public class DestinationRedisSslModeDisable {
    @JsonProperty("mode")
    public DestinationRedisSslModeDisableModeEnum mode;
    public DestinationRedisSslModeDisable withMode(DestinationRedisSslModeDisableModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
