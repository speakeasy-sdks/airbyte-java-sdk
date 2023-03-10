package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeRequire
 * Require SSL mode.
**/
public class DestinationPostgresSslModeRequire {
    @JsonProperty("mode")
    public DestinationPostgresSslModeRequireModeEnum mode;
    public DestinationPostgresSslModeRequire withMode(DestinationPostgresSslModeRequireModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
