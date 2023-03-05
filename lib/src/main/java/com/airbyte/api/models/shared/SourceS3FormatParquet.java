package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FormatParquet
 * This connector utilises <a href="https://arrow.apache.org/docs/python/generated/pyarrow.parquet.ParquetFile.html" target="_blank">PyArrow (Apache Arrow)</a> for Parquet parsing.
**/
public class SourceS3FormatParquet {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public Long batchSize;
    public SourceS3FormatParquet withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buffer_size")
    public Long bufferSize;
    public SourceS3FormatParquet withBufferSize(Long bufferSize) {
        this.bufferSize = bufferSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("columns")
    public String[] columns;
    public SourceS3FormatParquet withColumns(String[] columns) {
        this.columns = columns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FormatParquetFiletypeEnum filetype;
    public SourceS3FormatParquet withFiletype(SourceS3FormatParquetFiletypeEnum filetype) {
        this.filetype = filetype;
        return this;
    }
    
}
