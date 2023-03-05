package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryDenormalizedLoadingMethodGCSStaging
 * Loading method used to send select the way data will be uploaded to BigQuery. <br/><b>Standard Inserts</b> - Direct uploading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In almost all cases, you should use staging. <br/><b>GCS Staging</b> - Writes large batches of records to a file, uploads the file to GCS, then uses <b>COPY INTO table</b> to upload the file. Recommended for most workloads for better speed and scalability. Read more about GCS Staging <a href="https://docs.airbyte.com/integrations/destinations/bigquery#gcs-staging">here</a>.
**/
public class DestinationBigqueryDenormalizedLoadingMethodGCSStaging {
    @JsonProperty("credential")
    public Object credential;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withCredential(Object credential) {
        this.credential = credential;
        return this;
    }
    
    @JsonProperty("gcs_bucket_name")
    public String gcsBucketName;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withGcsBucketName(String gcsBucketName) {
        this.gcsBucketName = gcsBucketName;
        return this;
    }
    
    @JsonProperty("gcs_bucket_path")
    public String gcsBucketPath;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withGcsBucketPath(String gcsBucketPath) {
        this.gcsBucketPath = gcsBucketPath;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keep_files_in_gcs-bucket")
    public DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum keepFilesInGcsBucket;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withKeepFilesInGcsBucket(DestinationBigqueryDenormalizedLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum keepFilesInGcsBucket) {
        this.keepFilesInGcsBucket = keepFilesInGcsBucket;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum method;
    public DestinationBigqueryDenormalizedLoadingMethodGCSStaging withMethod(DestinationBigqueryDenormalizedLoadingMethodGCSStagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
