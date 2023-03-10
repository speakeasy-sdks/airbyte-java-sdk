package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshiftUploadingMethodStandard
 * The method how the data will be uploaded to the database.
**/
public class DestinationRedshiftUploadingMethodStandard {
    @JsonProperty("method")
    public DestinationRedshiftUploadingMethodStandardMethodEnum method;
    public DestinationRedshiftUploadingMethodStandard withMethod(DestinationRedshiftUploadingMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
