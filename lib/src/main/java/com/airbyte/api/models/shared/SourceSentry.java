package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSentry {
    @JsonProperty("airbyte-source-name")
    public SourceSentrySentryEnum airbyteSourceName;
    public SourceSentry withAirbyteSourceName(SourceSentrySentryEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("auth_token")
    public String authToken;
    public SourceSentry withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discover_fields")
    public Object[] discoverFields;
    public SourceSentry withDiscoverFields(Object[] discoverFields) {
        this.discoverFields = discoverFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostname")
    public String hostname;
    public SourceSentry withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public SourceSentry withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("project")
    public String project;
    public SourceSentry withProject(String project) {
        this.project = project;
        return this;
    }
    
}
