package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class CreateSourceResponse {
    public String contentType;
    public CreateSourceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.SourceId sourceId;
    public CreateSourceResponse withSourceId(com.airbyte.api.models.shared.SourceId sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    public Integer statusCode;
    public CreateSourceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateSourceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
