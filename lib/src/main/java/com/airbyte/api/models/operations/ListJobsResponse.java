package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class ListJobsResponse {
    public String contentType;
    public ListJobsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.JobsResponse jobsResponse;
    public ListJobsResponse withJobsResponse(com.airbyte.api.models.shared.JobsResponse jobsResponse) {
        this.jobsResponse = jobsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListJobsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ListJobsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
