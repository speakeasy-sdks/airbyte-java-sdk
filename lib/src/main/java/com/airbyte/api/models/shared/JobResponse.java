package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobResponse
 * Provides details of a single job.
**/
public class JobResponse {
    @JsonProperty("jobId")
    public Long jobId;
    public JobResponse withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    
    @JsonProperty("jobType")
    public JobTypeEnum jobType;
    public JobResponse withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    
    @JsonProperty("status")
    public JobStatusEnum status;
    public JobResponse withStatus(JobStatusEnum status) {
        this.status = status;
        return this;
    }
    
}
