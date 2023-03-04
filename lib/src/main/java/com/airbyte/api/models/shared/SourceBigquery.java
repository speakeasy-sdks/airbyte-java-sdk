package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceBigquery {
    @JsonProperty("airbyte-source-name")
    public SourceBigqueryBigqueryEnum airbyteSourceName;
    public SourceBigquery withAirbyteSourceName(SourceBigqueryBigqueryEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public SourceBigquery withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataset_id")
    public String datasetId;
    public SourceBigquery withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public SourceBigquery withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
