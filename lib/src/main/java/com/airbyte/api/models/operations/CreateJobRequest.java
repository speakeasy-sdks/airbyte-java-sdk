package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CreateJobRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.JobCreate request;
    public CreateJobRequest withRequest(com.airbyte.api.models.shared.JobCreate request) {
        this.request = request;
        return this;
    }
    
}
