package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceClickupApi
 * The values required to configure the source.
**/
public class SourceClickupApi {
    @JsonProperty("airbyte-source-name")
    public SourceClickupApiClickupApiEnum airbyteSourceName;
    public SourceClickupApi withAirbyteSourceName(SourceClickupApiClickupApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceClickupApi withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_id")
    public String folderId;
    public SourceClickupApi withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_id")
    public String listId;
    public SourceClickupApi withListId(String listId) {
        this.listId = listId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_id")
    public String spaceId;
    public SourceClickupApi withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("team_id")
    public String teamId;
    public SourceClickupApi withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
}
