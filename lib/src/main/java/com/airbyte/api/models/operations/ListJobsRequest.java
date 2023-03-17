package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class ListJobsRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionId")
    public String connectionId;
    public ListJobsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=jobType")
    public com.airbyte.api.models.shared.JobTypeEnum jobType;
    public ListJobsRequest withJobType(com.airbyte.api.models.shared.JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;
    public ListJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Integer offset;
    public ListJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    
}
