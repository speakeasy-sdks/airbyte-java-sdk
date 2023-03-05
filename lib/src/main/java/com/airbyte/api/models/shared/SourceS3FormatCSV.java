package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FormatCSV
 * This connector utilises <a href="https: // arrow.apache.org/docs/python/generated/pyarrow.csv.open_csv.html" target="_blank">PyArrow (Apache Arrow)</a> for CSV parsing.
**/
public class SourceS3FormatCSV {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_reader_options")
    public String additionalReaderOptions;
    public SourceS3FormatCSV withAdditionalReaderOptions(String additionalReaderOptions) {
        this.additionalReaderOptions = additionalReaderOptions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advanced_options")
    public String advancedOptions;
    public SourceS3FormatCSV withAdvancedOptions(String advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size")
    public Long blockSize;
    public SourceS3FormatCSV withBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delimiter")
    public String delimiter;
    public SourceS3FormatCSV withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("double_quote")
    public Boolean doubleQuote;
    public SourceS3FormatCSV withDoubleQuote(Boolean doubleQuote) {
        this.doubleQuote = doubleQuote;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encoding")
    public String encoding;
    public SourceS3FormatCSV withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("escape_char")
    public String escapeChar;
    public SourceS3FormatCSV withEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FormatCSVFiletypeEnum filetype;
    public SourceS3FormatCSV withFiletype(SourceS3FormatCSVFiletypeEnum filetype) {
        this.filetype = filetype;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("infer_datatypes")
    public Boolean inferDatatypes;
    public SourceS3FormatCSV withInferDatatypes(Boolean inferDatatypes) {
        this.inferDatatypes = inferDatatypes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("newlines_in_values")
    public Boolean newlinesInValues;
    public SourceS3FormatCSV withNewlinesInValues(Boolean newlinesInValues) {
        this.newlinesInValues = newlinesInValues;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quote_char")
    public String quoteChar;
    public SourceS3FormatCSV withQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }
    
}
