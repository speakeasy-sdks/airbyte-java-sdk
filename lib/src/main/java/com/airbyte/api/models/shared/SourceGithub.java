package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGithub {
    @JsonProperty("airbyte-source-name")
    public SourceGithubGithubEnum airbyteSourceName;
    public SourceGithub withAirbyteSourceName(SourceGithubGithubEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;
    public SourceGithub withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceGithub withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_for_large_streams")
    public Long pageSizeForLargeStreams;
    public SourceGithub withPageSizeForLargeStreams(Long pageSizeForLargeStreams) {
        this.pageSizeForLargeStreams = pageSizeForLargeStreams;
        return this;
    }
    
    @JsonProperty("repository")
    public String repository;
    public SourceGithub withRepository(String repository) {
        this.repository = repository;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceGithub withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
