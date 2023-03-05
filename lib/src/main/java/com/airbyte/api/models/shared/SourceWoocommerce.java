package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceWoocommerce
 * The values required to configure the source.
**/
public class SourceWoocommerce {
    @JsonProperty("airbyte-source-name")
    public SourceWoocommerceWoocommerceEnum airbyteSourceName;
    public SourceWoocommerce withAirbyteSourceName(SourceWoocommerceWoocommerceEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceWoocommerce withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("api_secret")
    public String apiSecret;
    public SourceWoocommerce withApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }
    
    @JsonProperty("shop")
    public String shop;
    public SourceWoocommerce withShop(String shop) {
        this.shop = shop;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceWoocommerce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
