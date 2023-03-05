package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceDockerhub
 * The values required to configure the source.
**/
public class SourceDockerhub {
    @JsonProperty("airbyte-source-name")
    public SourceDockerhubDockerhubEnum airbyteSourceName;
    public SourceDockerhub withAirbyteSourceName(SourceDockerhubDockerhubEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("docker_username")
    public String dockerUsername;
    public SourceDockerhub withDockerUsername(String dockerUsername) {
        this.dockerUsername = dockerUsername;
        return this;
    }
    
}
