package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceFileSecure {
    @JsonProperty("airbyte-source-name")
    public SourceFileSecureFileSecureEnum airbyteSourceName;
    public SourceFileSecure withAirbyteSourceName(SourceFileSecureFileSecureEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("dataset_name")
    public String datasetName;
    public SourceFileSecure withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    
    @JsonProperty("format")
    public SourceFileSecureFileFormatEnum format;
    public SourceFileSecure withFormat(SourceFileSecureFileFormatEnum format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("provider")
    public java.util.Map<String, Object> provider;
    public SourceFileSecure withProvider(java.util.Map<String, Object> provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reader_options")
    public String readerOptions;
    public SourceFileSecure withReaderOptions(String readerOptions) {
        this.readerOptions = readerOptions;
        return this;
    }
    
    @JsonProperty("url")
    public String url;
    public SourceFileSecure withUrl(String url) {
        this.url = url;
        return this;
    }
    
}
