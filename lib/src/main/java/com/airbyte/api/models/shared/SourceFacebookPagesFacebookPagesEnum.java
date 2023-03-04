package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceFacebookPagesFacebookPagesEnum {
    FACEBOOK_PAGES("facebook-pages");

    @JsonValue
    public final String value;

    private SourceFacebookPagesFacebookPagesEnum(String value) {
        this.value = value;
    }
}
