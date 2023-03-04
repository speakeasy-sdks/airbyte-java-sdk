package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSftp {
    @JsonProperty("airbyte-source-name")
    public SourceSftpSftpEnum airbyteSourceName;
    public SourceSftp withAirbyteSourceName(SourceSftpSftpEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceSftp withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_pattern")
    public String filePattern;
    public SourceSftp withFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_types")
    public String fileTypes;
    public SourceSftp withFileTypes(String fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_path")
    public String folderPath;
    public SourceSftp withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceSftp withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceSftp withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("user")
    public String user;
    public SourceSftp withUser(String user) {
        this.user = user;
        return this;
    }
    
}
