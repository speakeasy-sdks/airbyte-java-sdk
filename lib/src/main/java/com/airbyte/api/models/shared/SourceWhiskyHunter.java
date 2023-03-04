package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceWhiskyHunter {
    @JsonProperty("airbyte-source-name")
    public SourceWhiskyHunterWhiskyHunterEnum airbyteSourceName;
    public SourceWhiskyHunter withAirbyteSourceName(SourceWhiskyHunterWhiskyHunterEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
