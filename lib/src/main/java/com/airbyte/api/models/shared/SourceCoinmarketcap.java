package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceCoinmarketcap
 * The values required to configure the source.
**/
public class SourceCoinmarketcap {
    @JsonProperty("airbyte-source-name")
    public SourceCoinmarketcapCoinmarketcapEnum airbyteSourceName;
    public SourceCoinmarketcap withAirbyteSourceName(SourceCoinmarketcapCoinmarketcapEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceCoinmarketcap withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("data_type")
    public SourceCoinmarketcapDataTypeEnum dataType;
    public SourceCoinmarketcap withDataType(SourceCoinmarketcapDataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("symbols")
    public String[] symbols;
    public SourceCoinmarketcap withSymbols(String[] symbols) {
        this.symbols = symbols;
        return this;
    }
    
}
