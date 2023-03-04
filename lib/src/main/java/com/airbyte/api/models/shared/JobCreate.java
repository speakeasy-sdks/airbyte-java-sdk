package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobCreate
 * Creates a new Job from the configuration provided in the request body
**/
public class JobCreate {
    @JsonProperty("connectionId")
    public String connectionId;
    public JobCreate withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonProperty("jobType")
    public JobTypeEnum jobType;
    public JobCreate withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    
}
