package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePypi {
    @JsonProperty("airbyte-source-name")
    public SourcePypiPypiEnum airbyteSourceName;
    public SourcePypi withAirbyteSourceName(SourcePypiPypiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("project_name")
    public String projectName;
    public SourcePypi withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;
    public SourcePypi withVersion(String version) {
        this.version = version;
        return this;
    }
    
}
