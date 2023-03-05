package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceAwsCloudtrail
 * The values required to configure the source.
**/
public class SourceAwsCloudtrail {
    @JsonProperty("airbyte-source-name")
    public SourceAwsCloudtrailAwsCloudtrailEnum airbyteSourceName;
    public SourceAwsCloudtrail withAirbyteSourceName(SourceAwsCloudtrailAwsCloudtrailEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("aws_key_id")
    public String awsKeyId;
    public SourceAwsCloudtrail withAwsKeyId(String awsKeyId) {
        this.awsKeyId = awsKeyId;
        return this;
    }
    
    @JsonProperty("aws_region_name")
    public String awsRegionName;
    public SourceAwsCloudtrail withAwsRegionName(String awsRegionName) {
        this.awsRegionName = awsRegionName;
        return this;
    }
    
    @JsonProperty("aws_secret_key")
    public String awsSecretKey;
    public SourceAwsCloudtrail withAwsSecretKey(String awsSecretKey) {
        this.awsSecretKey = awsSecretKey;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceAwsCloudtrail withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
