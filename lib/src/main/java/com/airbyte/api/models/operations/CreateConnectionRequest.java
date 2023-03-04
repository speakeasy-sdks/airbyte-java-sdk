package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CreateConnectionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.ConnectionCreate request;
    public CreateConnectionRequest withRequest(com.airbyte.api.models.shared.ConnectionCreate request) {
        this.request = request;
        return this;
    }
    
}
