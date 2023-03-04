package com.airbyte.api.models.operations;



public class CancelJobRequest {
    public CancelJobPathParams pathParams;
    public CancelJobRequest withPathParams(CancelJobPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
}
