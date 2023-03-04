package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CreateSourceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.SourceCreate request;
    public CreateSourceRequest withRequest(com.airbyte.api.models.shared.SourceCreate request) {
        this.request = request;
        return this;
    }
    
}
