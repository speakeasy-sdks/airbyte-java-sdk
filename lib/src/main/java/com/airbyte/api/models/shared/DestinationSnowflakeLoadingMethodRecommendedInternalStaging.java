package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodRecommendedInternalStaging
 * Recommended for large production workloads for better speed and scalability.
**/
public class DestinationSnowflakeLoadingMethodRecommendedInternalStaging {
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodRecommendedInternalStagingMethodEnum method;
    public DestinationSnowflakeLoadingMethodRecommendedInternalStaging withMethod(DestinationSnowflakeLoadingMethodRecommendedInternalStagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
