package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceOpenweatherLanguageEnum {
    AF("af"),
    AL("al"),
    AR("ar"),
    AZ("az"),
    BG("bg"),
    CA("ca"),
    CZ("cz"),
    DA("da"),
    DE("de"),
    EL("el"),
    EN("en"),
    EU("eu"),
    FA("fa"),
    FI("fi"),
    FR("fr"),
    GL("gl"),
    HE("he"),
    HI("hi"),
    HR("hr"),
    HU("hu"),
    ID("id"),
    IT("it"),
    JA("ja"),
    KR("kr"),
    LA("la"),
    LT("lt"),
    MK("mk"),
    NO("no"),
    NL("nl"),
    PL("pl"),
    PT("pt"),
    PT_BR("pt_br"),
    RO("ro"),
    RU("ru"),
    SV("sv"),
    SE("se"),
    SK("sk"),
    SL("sl"),
    SP("sp"),
    ES("es"),
    SR("sr"),
    TH("th"),
    TR("tr"),
    UA("ua"),
    UK("uk"),
    VI("vi"),
    ZH_CN("zh_cn"),
    ZH_TW("zh_tw"),
    ZU("zu");

    @JsonValue
    public final String value;

    private SourceOpenweatherLanguageEnum(String value) {
        this.value = value;
    }
}
