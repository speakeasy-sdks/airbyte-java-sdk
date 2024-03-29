package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class GetJobRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=jobId")
    public Long jobId;
    public GetJobRequest withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    
}
