package com.airbyte.api.models.operations;



public class ListJobsRequest {
    public ListJobsQueryParams queryParams;
    public ListJobsRequest withQueryParams(ListJobsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
