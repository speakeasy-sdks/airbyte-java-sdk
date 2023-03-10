package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodSelectAnotherOption
 * Select another option
**/
public class DestinationSnowflakeLoadingMethodSelectAnotherOption {
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum method;
    public DestinationSnowflakeLoadingMethodSelectAnotherOption withMethod(DestinationSnowflakeLoadingMethodSelectAnotherOptionMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
