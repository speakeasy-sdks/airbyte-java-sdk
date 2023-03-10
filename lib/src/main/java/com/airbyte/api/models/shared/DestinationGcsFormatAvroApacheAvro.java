package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvro
 * Output data format. One of the following formats must be selected - <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro">AVRO</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas">PARQUET</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table">CSV</a> format, or <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table">JSONL</a> format.
**/
public class DestinationGcsFormatAvroApacheAvro {
    @JsonProperty("compression_codec")
    public Object compressionCodec;
    public DestinationGcsFormatAvroApacheAvro withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatAvroApacheAvroFormatTypeEnum formatType;
    public DestinationGcsFormatAvroApacheAvro withFormatType(DestinationGcsFormatAvroApacheAvroFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
