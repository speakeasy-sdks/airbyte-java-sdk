package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFirestore
 * The values required to configure the destination.
**/
public class DestinationFirestore {
    @JsonProperty("airbyte-destination-name")
    public DestinationFirestoreFirestoreEnum airbyteDestinationName;
    public DestinationFirestore withAirbyteDestinationName(DestinationFirestoreFirestoreEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationFirestore withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationFirestore withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
