package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsCountryEnum {
    AU("au"),
    BR("br"),
    CA("ca"),
    CN("cn"),
    EG("eg"),
    FR("fr"),
    DE("de"),
    GR("gr"),
    HK("hk"),
    IN("in"),
    IE("ie"),
    IL("il"),
    IT("it"),
    JP("jp"),
    NL("nl"),
    NO("no"),
    PK("pk"),
    PE("pe"),
    PH("ph"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    SG("sg"),
    ES("es"),
    SE("se"),
    CH("ch"),
    TW("tw"),
    UA("ua"),
    GB("gb"),
    US("us");

    @JsonValue
    public final String value;

    private SourceGnewsCountryEnum(String value) {
        this.value = value;
    }
}
