package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceGitlab {
    @JsonProperty("airbyte-source-name")
    public SourceGitlabGitlabEnum airbyteSourceName;
    public SourceGitlab withAirbyteSourceName(SourceGitlabGitlabEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_url")
    public String apiUrl;
    public SourceGitlab withApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }
    
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceGitlab withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groups")
    public String groups;
    public SourceGitlab withGroups(String groups) {
        this.groups = groups;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects")
    public String projects;
    public SourceGitlab withProjects(String projects) {
        this.projects = projects;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceGitlab withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
