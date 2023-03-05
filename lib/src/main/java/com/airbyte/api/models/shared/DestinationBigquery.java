package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigquery
 * The values required to configure the destination.
**/
public class DestinationBigquery {
    @JsonProperty("airbyte-destination-name")
    public DestinationBigqueryBigqueryEnum airbyteDestinationName;
    public DestinationBigquery withAirbyteDestinationName(DestinationBigqueryBigqueryEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("big_query_client_buffer_size_mb")
    public Long bigQueryClientBufferSizeMb;
    public DestinationBigquery withBigQueryClientBufferSizeMb(Long bigQueryClientBufferSizeMb) {
        this.bigQueryClientBufferSizeMb = bigQueryClientBufferSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationBigquery withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("dataset_id")
    public String datasetId;
    public DestinationBigquery withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonProperty("dataset_location")
    public DestinationBigqueryDatasetLocationEnum datasetLocation;
    public DestinationBigquery withDatasetLocation(DestinationBigqueryDatasetLocationEnum datasetLocation) {
        this.datasetLocation = datasetLocation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;
    public DestinationBigquery withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationBigquery withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transformation_priority")
    public DestinationBigqueryTransformationQueryRunTypeEnum transformationPriority;
    public DestinationBigquery withTransformationPriority(DestinationBigqueryTransformationQueryRunTypeEnum transformationPriority) {
        this.transformationPriority = transformationPriority;
        return this;
    }
    
}
