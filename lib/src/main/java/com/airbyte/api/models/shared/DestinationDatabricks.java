package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationDatabricks {
    @JsonProperty("accept_terms")
    public Boolean acceptTerms;
    public DestinationDatabricks withAcceptTerms(Boolean acceptTerms) {
        this.acceptTerms = acceptTerms;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationDatabricksDatabricksEnum airbyteDestinationName;
    public DestinationDatabricks withAirbyteDestinationName(DestinationDatabricksDatabricksEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("data_source")
    public java.util.Map<String, Object> dataSource;
    public DestinationDatabricks withDataSource(java.util.Map<String, Object> dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("database_schema")
    public String databaseSchema;
    public DestinationDatabricks withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    
    @JsonProperty("databricks_http_path")
    public String databricksHttpPath;
    public DestinationDatabricks withDatabricksHttpPath(String databricksHttpPath) {
        this.databricksHttpPath = databricksHttpPath;
        return this;
    }
    
    @JsonProperty("databricks_personal_access_token")
    public String databricksPersonalAccessToken;
    public DestinationDatabricks withDatabricksPersonalAccessToken(String databricksPersonalAccessToken) {
        this.databricksPersonalAccessToken = databricksPersonalAccessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("databricks_port")
    public String databricksPort;
    public DestinationDatabricks withDatabricksPort(String databricksPort) {
        this.databricksPort = databricksPort;
        return this;
    }
    
    @JsonProperty("databricks_server_hostname")
    public String databricksServerHostname;
    public DestinationDatabricks withDatabricksServerHostname(String databricksServerHostname) {
        this.databricksServerHostname = databricksServerHostname;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purge_staging_data")
    public Boolean purgeStagingData;
    public DestinationDatabricks withPurgeStagingData(Boolean purgeStagingData) {
        this.purgeStagingData = purgeStagingData;
        return this;
    }
    
}
