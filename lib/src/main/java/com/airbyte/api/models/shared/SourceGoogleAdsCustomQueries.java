package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleAdsCustomQueries {
    @JsonProperty("query")
    public String query;
    public SourceGoogleAdsCustomQueries withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonProperty("table_name")
    public String tableName;
    public SourceGoogleAdsCustomQueries withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
}
