package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMicrosoftTeams
 * The values required to configure the source.
**/
public class SourceMicrosoftTeams {
    @JsonProperty("airbyte-source-name")
    public SourceMicrosoftTeamsMicrosoftTeamsEnum airbyteSourceName;
    public SourceMicrosoftTeams withAirbyteSourceName(SourceMicrosoftTeamsMicrosoftTeamsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceMicrosoftTeams withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("period")
    public String period;
    public SourceMicrosoftTeams withPeriod(String period) {
        this.period = period;
        return this;
    }
    
}
