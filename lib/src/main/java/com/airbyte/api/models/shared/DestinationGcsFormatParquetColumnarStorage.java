package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatParquetColumnarStorage
 * Output data format. One of the following formats must be selected - <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro">AVRO</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas">PARQUET</a> format, <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table">CSV</a> format, or <a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table">JSONL</a> format.
**/
public class DestinationGcsFormatParquetColumnarStorage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size_mb")
    public Long blockSizeMb;
    public DestinationGcsFormatParquetColumnarStorage withBlockSizeMb(Long blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    public DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum compressionCodec;
    public DestinationGcsFormatParquetColumnarStorage withCompressionCodec(DestinationGcsFormatParquetColumnarStorageCompressionCodecEnum compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_encoding")
    public Boolean dictionaryEncoding;
    public DestinationGcsFormatParquetColumnarStorage withDictionaryEncoding(Boolean dictionaryEncoding) {
        this.dictionaryEncoding = dictionaryEncoding;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_page_size_kb")
    public Long dictionaryPageSizeKb;
    public DestinationGcsFormatParquetColumnarStorage withDictionaryPageSizeKb(Long dictionaryPageSizeKb) {
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatParquetColumnarStorageFormatTypeEnum formatType;
    public DestinationGcsFormatParquetColumnarStorage withFormatType(DestinationGcsFormatParquetColumnarStorageFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_padding_size_mb")
    public Long maxPaddingSizeMb;
    public DestinationGcsFormatParquetColumnarStorage withMaxPaddingSizeMb(Long maxPaddingSizeMb) {
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_kb")
    public Long pageSizeKb;
    public DestinationGcsFormatParquetColumnarStorage withPageSizeKb(Long pageSizeKb) {
        this.pageSizeKb = pageSizeKb;
        return this;
    }
    
}
