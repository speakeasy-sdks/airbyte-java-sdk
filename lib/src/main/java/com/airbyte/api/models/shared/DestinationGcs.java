package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcs
 * The values required to configure the destination.
**/
public class DestinationGcs {
    @JsonProperty("airbyte-destination-name")
    public DestinationGcsGcsEnum airbyteDestinationName;
    public DestinationGcs withAirbyteDestinationName(DestinationGcsGcsEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("credential")
    public Object credential;
    public DestinationGcs withCredential(Object credential) {
        this.credential = credential;
        return this;
    }
    
    @JsonProperty("format")
    public Object format;
    public DestinationGcs withFormat(Object format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("gcs_bucket_name")
    public String gcsBucketName;
    public DestinationGcs withGcsBucketName(String gcsBucketName) {
        this.gcsBucketName = gcsBucketName;
        return this;
    }
    
    @JsonProperty("gcs_bucket_path")
    public String gcsBucketPath;
    public DestinationGcs withGcsBucketPath(String gcsBucketPath) {
        this.gcsBucketPath = gcsBucketPath;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gcs_bucket_region")
    public DestinationGCSGCSBucketRegionEnum gcsBucketRegion;
    public DestinationGcs withGcsBucketRegion(DestinationGCSGCSBucketRegionEnum gcsBucketRegion) {
        this.gcsBucketRegion = gcsBucketRegion;
        return this;
    }
    
}
