package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CancelJobRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=jobId")
    public Long jobId;
    public CancelJobRequest withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    
}
