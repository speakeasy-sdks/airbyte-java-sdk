package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceJira {
    @JsonProperty("airbyte-source-name")
    public SourceJiraJiraEnum airbyteSourceName;
    public SourceJira withAirbyteSourceName(SourceJiraJiraEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceJira withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("domain")
    public String domain;
    public SourceJira withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceJira withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_experimental_streams")
    public Boolean enableExperimentalStreams;
    public SourceJira withEnableExperimentalStreams(Boolean enableExperimentalStreams) {
        this.enableExperimentalStreams = enableExperimentalStreams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expand_issue_changelog")
    public Boolean expandIssueChangelog;
    public SourceJira withExpandIssueChangelog(Boolean expandIssueChangelog) {
        this.expandIssueChangelog = expandIssueChangelog;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects")
    public String[] projects;
    public SourceJira withProjects(String[] projects) {
        this.projects = projects;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_fields")
    public Boolean renderFields;
    public SourceJira withRenderFields(Boolean renderFields) {
        this.renderFields = renderFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceJira withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
