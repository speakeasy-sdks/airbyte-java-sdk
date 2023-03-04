package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class CreateConnectionResponse {
    public com.airbyte.api.models.shared.ConnectionId connectionId;
    public CreateConnectionResponse withConnectionId(com.airbyte.api.models.shared.ConnectionId connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public String contentType;
    public CreateConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CreateConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
