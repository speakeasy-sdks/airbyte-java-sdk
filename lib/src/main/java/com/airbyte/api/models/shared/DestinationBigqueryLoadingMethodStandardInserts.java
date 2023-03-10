package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryLoadingMethodStandardInserts
 * Loading method used to send select the way data will be uploaded to BigQuery. <br/><b>Standard Inserts</b> - Direct uploading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In almost all cases, you should use staging. <br/><b>GCS Staging</b> - Writes large batches of records to a file, uploads the file to GCS, then uses <b>COPY INTO table</b> to upload the file. Recommended for most workloads for better speed and scalability. Read more about GCS Staging <a href="https://docs.airbyte.com/integrations/destinations/bigquery#gcs-staging">here</a>.
**/
public class DestinationBigqueryLoadingMethodStandardInserts {
    @JsonProperty("method")
    public DestinationBigqueryLoadingMethodStandardInsertsMethodEnum method;
    public DestinationBigqueryLoadingMethodStandardInserts withMethod(DestinationBigqueryLoadingMethodStandardInsertsMethodEnum method) {
        this.method = method;
        return this;
    }
    
}
