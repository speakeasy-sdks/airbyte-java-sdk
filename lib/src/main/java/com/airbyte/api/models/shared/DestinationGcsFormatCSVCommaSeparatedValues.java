package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatCSVCommaSeparatedValues
 * Output data format. One of the following formats must be selected - <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro">AVRO</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas">PARQUET</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table">CSV</a> format, or <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table">JSONL</a> format.
**/
public class DestinationGcsFormatCSVCommaSeparatedValues {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationGcsFormatCSVCommaSeparatedValues withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flattening")
    public DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum flattening;
    public DestinationGcsFormatCSVCommaSeparatedValues withFlattening(DestinationGcsFormatCSVCommaSeparatedValuesNormalizationEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum formatType;
    public DestinationGcsFormatCSVCommaSeparatedValues withFormatType(DestinationGcsFormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
