package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class CreateJobResponse {
    public String contentType;
    public CreateJobResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.JobResponse jobResponse;
    public CreateJobResponse withJobResponse(com.airbyte.api.models.shared.JobResponse jobResponse) {
        this.jobResponse = jobResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateJobResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateJobResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
