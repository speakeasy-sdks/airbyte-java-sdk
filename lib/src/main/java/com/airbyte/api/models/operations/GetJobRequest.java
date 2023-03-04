package com.airbyte.api.models.operations;



public class GetJobRequest {
    public GetJobPathParams pathParams;
    public GetJobRequest withPathParams(GetJobPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
}
