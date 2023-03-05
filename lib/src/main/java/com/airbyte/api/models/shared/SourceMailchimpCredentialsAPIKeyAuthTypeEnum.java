package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMailchimpCredentialsAPIKeyAuthTypeEnum {
    APIKEY("apikey");

    @JsonValue
    public final String value;

    private SourceMailchimpCredentialsAPIKeyAuthTypeEnum(String value) {
        this.value = value;
    }
}
