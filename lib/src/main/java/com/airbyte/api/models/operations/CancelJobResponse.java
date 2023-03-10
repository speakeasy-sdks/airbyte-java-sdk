package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class CancelJobResponse {
    public String contentType;
    public CancelJobResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.JobResponse jobResponse;
    public CancelJobResponse withJobResponse(com.airbyte.api.models.shared.JobResponse jobResponse) {
        this.jobResponse = jobResponse;
        return this;
    }
    
    public Integer statusCode;
    public CancelJobResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CancelJobResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
