package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleWorkspaceAdminReports {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum airbyteSourceName;
    public SourceGoogleWorkspaceAdminReports withAirbyteSourceName(SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public SourceGoogleWorkspaceAdminReports withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceGoogleWorkspaceAdminReports withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback")
    public Long lookback;
    public SourceGoogleWorkspaceAdminReports withLookback(Long lookback) {
        this.lookback = lookback;
        return this;
    }
    
}
