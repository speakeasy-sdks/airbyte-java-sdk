package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class GetJobResponse {
    public String contentType;
    public GetJobResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.JobResponse jobResponse;
    public GetJobResponse withJobResponse(com.airbyte.api.models.shared.JobResponse jobResponse) {
        this.jobResponse = jobResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetJobResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetJobResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
