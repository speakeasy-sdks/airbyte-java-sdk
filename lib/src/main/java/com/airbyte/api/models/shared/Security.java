package com.airbyte.api.models.shared;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String bearerAuth;
    public Security withBearerAuth(String bearerAuth) {
        this.bearerAuth = bearerAuth;
        return this;
    }
    
}
