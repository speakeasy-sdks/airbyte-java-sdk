package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGnewsLanguageEnum {
    AR("ar"),
    ZH("zh"),
    NL("nl"),
    EN("en"),
    FR("fr"),
    DE("de"),
    EL("el"),
    HE("he"),
    HI("hi"),
    IT("it"),
    JA("ja"),
    ML("ml"),
    MR("mr"),
    NO("no"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    ES("es"),
    SV("sv"),
    TA("ta"),
    TE("te"),
    UK("uk");

    @JsonValue
    public final String value;

    private SourceGnewsLanguageEnum(String value) {
        this.value = value;
    }
}
