package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceXkcd {
    @JsonProperty("airbyte-source-name")
    public SourceXkcdXkcdEnum airbyteSourceName;
    public SourceXkcd withAirbyteSourceName(SourceXkcdXkcdEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
