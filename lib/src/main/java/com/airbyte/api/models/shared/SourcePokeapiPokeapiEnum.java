package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePokeapiPokeapiEnum {
    POKEAPI("pokeapi");

    @JsonValue
    public final String value;

    private SourcePokeapiPokeapiEnum(String value) {
        this.value = value;
    }
}
