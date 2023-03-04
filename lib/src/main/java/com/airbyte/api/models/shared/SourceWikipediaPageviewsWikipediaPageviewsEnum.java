package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceWikipediaPageviewsWikipediaPageviewsEnum {
    WIKIPEDIA_PAGEVIEWS("wikipedia-pageviews");

    @JsonValue
    public final String value;

    private SourceWikipediaPageviewsWikipediaPageviewsEnum(String value) {
        this.value = value;
    }
}
