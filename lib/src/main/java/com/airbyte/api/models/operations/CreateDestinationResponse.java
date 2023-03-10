package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class CreateDestinationResponse {
    public String contentType;
    public CreateDestinationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.airbyte.api.models.shared.DestinationId destinationId;
    public CreateDestinationResponse withDestinationId(com.airbyte.api.models.shared.DestinationId destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    public Integer statusCode;
    public CreateDestinationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateDestinationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
