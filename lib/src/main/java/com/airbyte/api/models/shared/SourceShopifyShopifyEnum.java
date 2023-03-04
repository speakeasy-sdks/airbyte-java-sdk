package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceShopifyShopifyEnum {
    SHOPIFY("shopify");

    @JsonValue
    public final String value;

    private SourceShopifyShopifyEnum(String value) {
        this.value = value;
    }
}
