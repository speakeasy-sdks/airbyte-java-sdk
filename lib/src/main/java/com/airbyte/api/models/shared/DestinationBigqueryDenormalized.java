package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryDenormalized
 * The values required to configure the destination.
**/
public class DestinationBigqueryDenormalized {
    @JsonProperty("airbyte-destination-name")
    public DestinationBigqueryDenormalizedBigqueryDenormalizedEnum airbyteDestinationName;
    public DestinationBigqueryDenormalized withAirbyteDestinationName(DestinationBigqueryDenormalizedBigqueryDenormalizedEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("big_query_client_buffer_size_mb")
    public Long bigQueryClientBufferSizeMb;
    public DestinationBigqueryDenormalized withBigQueryClientBufferSizeMb(Long bigQueryClientBufferSizeMb) {
        this.bigQueryClientBufferSizeMb = bigQueryClientBufferSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationBigqueryDenormalized withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("dataset_id")
    public String datasetId;
    public DestinationBigqueryDenormalized withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataset_location")
    public DestinationBigqueryDenormalizedDatasetLocationEnum datasetLocation;
    public DestinationBigqueryDenormalized withDatasetLocation(DestinationBigqueryDenormalizedDatasetLocationEnum datasetLocation) {
        this.datasetLocation = datasetLocation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;
    public DestinationBigqueryDenormalized withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationBigqueryDenormalized withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
