package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CreateDestinationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.DestinationCreate request;
    public CreateDestinationRequest withRequest(com.airbyte.api.models.shared.DestinationCreate request) {
        this.request = request;
        return this;
    }
    
}
