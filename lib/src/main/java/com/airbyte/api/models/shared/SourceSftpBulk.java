package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceSftpBulk
 * The values required to configure the source.
**/
public class SourceSftpBulk {
    @JsonProperty("airbyte-source-name")
    public SourceSftpBulkSftpBulkEnum airbyteSourceName;
    public SourceSftpBulk withAirbyteSourceName(SourceSftpBulkSftpBulkEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_most_recent")
    public Boolean fileMostRecent;
    public SourceSftpBulk withFileMostRecent(Boolean fileMostRecent) {
        this.fileMostRecent = fileMostRecent;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_pattern")
    public String filePattern;
    public SourceSftpBulk withFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_type")
    public SourceSftpBulkFileTypeEnum fileType;
    public SourceSftpBulk withFileType(SourceSftpBulkFileTypeEnum fileType) {
        this.fileType = fileType;
        return this;
    }
    
    @JsonProperty("folder_path")
    public String folderPath;
    public SourceSftpBulk withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }
    
    @JsonProperty("host")
    public String host;
    public SourceSftpBulk withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceSftpBulk withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("port")
    public Long port;
    public SourceSftpBulk withPort(Long port) {
        this.port = port;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("private_key")
    public String privateKey;
    public SourceSftpBulk withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceSftpBulk withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("stream_name")
    public String streamName;
    public SourceSftpBulk withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceSftpBulk withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
