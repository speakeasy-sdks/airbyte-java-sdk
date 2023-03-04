package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceWoocommerceWoocommerceEnum {
    WOOCOMMERCE("woocommerce");

    @JsonValue
    public final String value;

    private SourceWoocommerceWoocommerceEnum(String value) {
        this.value = value;
    }
}
