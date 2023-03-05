package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatParquetColumnarStorage
 * Format of the data output. See <a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema">here</a> for more details
**/
public class DestinationS3FormatParquetColumnarStorage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size_mb")
    public Long blockSizeMb;
    public DestinationS3FormatParquetColumnarStorage withBlockSizeMb(Long blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    public DestinationS3FormatParquetColumnarStorageCompressionCodecEnum compressionCodec;
    public DestinationS3FormatParquetColumnarStorage withCompressionCodec(DestinationS3FormatParquetColumnarStorageCompressionCodecEnum compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_encoding")
    public Boolean dictionaryEncoding;
    public DestinationS3FormatParquetColumnarStorage withDictionaryEncoding(Boolean dictionaryEncoding) {
        this.dictionaryEncoding = dictionaryEncoding;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_page_size_kb")
    public Long dictionaryPageSizeKb;
    public DestinationS3FormatParquetColumnarStorage withDictionaryPageSizeKb(Long dictionaryPageSizeKb) {
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatParquetColumnarStorageFormatTypeEnum formatType;
    public DestinationS3FormatParquetColumnarStorage withFormatType(DestinationS3FormatParquetColumnarStorageFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_padding_size_mb")
    public Long maxPaddingSizeMb;
    public DestinationS3FormatParquetColumnarStorage withMaxPaddingSizeMb(Long maxPaddingSizeMb) {
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_kb")
    public Long pageSizeKb;
    public DestinationS3FormatParquetColumnarStorage withPageSizeKb(Long pageSizeKb) {
        this.pageSizeKb = pageSizeKb;
        return this;
    }
    
}
